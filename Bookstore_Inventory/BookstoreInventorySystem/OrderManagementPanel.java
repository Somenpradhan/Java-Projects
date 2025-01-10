import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class OrderManagementPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable orderTable;
    private final BookManagementPanel bookPanel;

    public OrderManagementPanel(BookManagementPanel bookPanel) {
        this.bookPanel = bookPanel; // Dependency Injection
        setLayout(new BorderLayout());

        // Table setup
        tableModel = new DefaultTableModel(new Object[]{"Order ID", "Customer Name", "Book Title", "Quantity"}, 0);
        orderTable = new JTable(tableModel);
        add(new JScrollPane(orderTable), BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton addOrderButton = new JButton("Add Order");
        JButton deleteOrderButton = new JButton("Delete Order");

        buttonPanel.add(addOrderButton);
        buttonPanel.add(deleteOrderButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Button actions
        addOrderButton.addActionListener(e -> addOrder());
        deleteOrderButton.addActionListener(e -> deleteOrder());
    }

    private void addOrder() {
        String customerName = JOptionPane.showInputDialog(this, "Enter Customer Name:");
        String bookTitle = JOptionPane.showInputDialog(this, "Enter Book Title:");
        String quantityStr = JOptionPane.showInputDialog(this, "Enter Quantity:");

        try {
            int quantity = Integer.parseInt(quantityStr);

            if (bookPanel.getStock(bookTitle) < quantity || bookPanel.getStock(bookTitle) == -1) {
                JOptionPane.showMessageDialog(this, "Insufficient stock or book not found.");
            } else {
                int orderId = tableModel.getRowCount() + 1;
                tableModel.addRow(new Object[]{orderId, customerName, bookTitle, quantity});
                bookPanel.updateStock(bookTitle, quantity);
                JOptionPane.showMessageDialog(this, "Order placed successfully.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid quantity.");
        }
    }

    private void deleteOrder() {
        int selectedRow = orderTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Select an order to delete.");
        }
    }
}
