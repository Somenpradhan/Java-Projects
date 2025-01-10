import javax.swing.*;

public class BookstoreApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Bookstore Inventory Management");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JTabbedPane tabbedPane = new JTabbedPane();

            BookManagementPanel bookPanel = new BookManagementPanel(); // Create book panel
            OrderManagementPanel orderPanel = new OrderManagementPanel(bookPanel); // Pass book panel to order panel

            tabbedPane.addTab("Manage Books", bookPanel);
            tabbedPane.addTab("Manage Orders", orderPanel);

            frame.add(tabbedPane);
            frame.setVisible(true);
        });
    }
}
