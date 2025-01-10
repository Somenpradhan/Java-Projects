import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class BookManagementPanel extends JPanel {
    private DefaultTableModel tableModel;
    private JTable bookTable;

    public BookManagementPanel() {
        setLayout(new BorderLayout());

        // Table setup
        tableModel = new DefaultTableModel(new Object[]{"ID", "Title", "Author", "Stock"}, 0);
        bookTable = new JTable(tableModel);
        add(new JScrollPane(bookTable), BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel();
        JButton addBookButton = new JButton("Add Book");
        JButton updateStockButton = new JButton("Update Stock");
        JButton deleteBookButton = new JButton("Delete Book");

        buttonPanel.add(addBookButton);
        buttonPanel.add(updateStockButton);
        buttonPanel.add(deleteBookButton);

        add(buttonPanel, BorderLayout.SOUTH);

        // Button actions
        addBookButton.addActionListener(e -> addBook());
        updateStockButton.addActionListener(e -> updateStock());
        deleteBookButton.addActionListener(e -> deleteBook());
    }

    private void addBook() {
        String title = JOptionPane.showInputDialog(this, "Enter Book Title:");
        String author = JOptionPane.showInputDialog(this, "Enter Author:");
        String stockStr = JOptionPane.showInputDialog(this, "Enter Stock Quantity:");

        try {
            int stock = Integer.parseInt(stockStr);
            int bookId = tableModel.getRowCount() + 1;
            tableModel.addRow(new Object[]{bookId, title, author, stock});
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid stock value.");
        }
    }

    private void updateStock() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow != -1) {
            String stockStr = JOptionPane.showInputDialog(this, "Enter New Stock Quantity:");
            try {
                int stock = Integer.parseInt(stockStr);
                tableModel.setValueAt(stock, selectedRow, 3);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid stock value.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a book to update stock.");
        }
    }

    private void deleteBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Select a book to delete.");
        }
    }

    public int getStock(String title) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 1).equals(title)) {
                return (int) tableModel.getValueAt(i, 3);
            }
        }
        return -1; // Book not found
    }

    public boolean updateStock(String title, int quantity) {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.getValueAt(i, 1).equals(title)) {
                int currentStock = (int) tableModel.getValueAt(i, 3);
                if (currentStock >= quantity) {
                    tableModel.setValueAt(currentStock - quantity, i, 3);
                    return true;
                }
            }
        }
        return false; // Book not found or insufficient stock
    }
}
