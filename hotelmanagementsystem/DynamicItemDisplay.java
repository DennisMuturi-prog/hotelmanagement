/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author dennis
 */
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DynamicItemDisplay {
    private static JButton foodCartButton;
    private static int itemsInCart = 0; 
    static ArrayList<Item> foodsList = new ArrayList<Item>(); 
    public static void main(String[] args) {
        showItems("guest");
    }
    public static void showItems(String name){
        JFrame frame = new JFrame("Dynamic Item Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(new FlowLayout());
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel welcomeLabel = new JLabel("Welcome, ");
        JLabel customerNameLabel = new JLabel(name); // You can set the customer name dynamically
        foodCartButton = new JButton("Food Cart (0)");
        foodCartButton.addActionListener(e -> {
             for (Item item : foodsList) {
            System.out.println(item.getName());
        }
                
                
            });
        topPanel.add(welcomeLabel);
        topPanel.add(customerNameLabel);
        topPanel.add(foodCartButton);
        JPanel itemContainer = new JPanel();
        itemContainer.setLayout(new GridLayout(0, 2, 10, 10));
        JScrollPane scrollPane = new JScrollPane(itemContainer);
        scrollPane.setPreferredSize(new Dimension(600, 600));
        ArrayList<Item> items = fetchItemsFromDatabase(); // Fetch items from the database
        displayItems(itemContainer, items);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static ArrayList<Item> fetchItemsFromDatabase() {
        ArrayList<Item> items = new ArrayList<>();

        // Replace with your database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/customer";
        String username = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            // Replace with your actual query
            String query = "SELECT FoodName, Price, image_path FROM menuitems";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("FoodName");
                double price = resultSet.getDouble("Price");
                String imagePath = resultSet.getString("image_path");
                items.add(new Item(name, price, imagePath));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return items;
    }
    

 
    public static void displayItems(JPanel itemContainer, ArrayList<Item> items) {
        itemContainer.removeAll(); // Clear the existing items

        for (Item item : items) {
             JPanel itemPanel = new JPanel(new GridBagLayout());
            itemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            itemPanel.setPreferredSize(new Dimension(200, 300)); // Adjust the width and height as needed

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(0, 0, 10, 0); // Spacing below image
            gbc.fill = GridBagConstraints.HORIZONTAL;

            ImageIcon itemImage = new ImageIcon(item.getImagePath());
            JLabel imageLabel = new JLabel(itemImage);
            imageLabel.setHorizontalAlignment(JLabel.CENTER);

            itemPanel.add(imageLabel, gbc);

            gbc.gridy = 1;
            gbc.insets = new Insets(0, 0, 0, 0); // No spacing below text
            gbc.anchor = GridBagConstraints.CENTER;

            JLabel nameLabel = new JLabel(item.getName());
            JLabel priceLabel = new JLabel("$" + item.getPrice());

            itemPanel.add(nameLabel, gbc);
            gbc.gridy++;
            itemPanel.add(priceLabel, gbc);

            JButton itemButton = new JButton("Buy");
            itemButton.addActionListener(e -> {
                // Handle button click (e.g., add to cart)
                // Optionally, you can display a confirmation message
                foodsList.add(item);
                updateCartLabel();
                JOptionPane.showMessageDialog(null, ""+item.getName()+" added to the food cart.");
                itemButton.setEnabled(false); 
                itemButton.setBackground(Color.LIGHT_GRAY); // Change the background color
                itemButton.setText("added to cart");
                
            });

            gbc.gridy++;
            itemPanel.add(itemButton, gbc);

            itemContainer.add(itemPanel);
        }

        // Repaint and revalidate the container to reflect the changes
        itemContainer.revalidate();
        itemContainer.repaint();
    }
     private static void updateCartLabel() {
         itemsInCart++;
        foodCartButton.setText("Food Cart (" + itemsInCart + ")");
    }

    // Item class to represent item details
    static class Item {
        private String name;
        private double price;
        private String imagePath;

        public Item(String name, double price, String imagePath) {
            this.name = name;
            this.price = price;
            this.imagePath = imagePath;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getImagePath() {
            return imagePath;
        }
    }
}

