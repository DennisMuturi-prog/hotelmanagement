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
public class testmenu {
   

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dynamic Item Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        JPanel itemContainer = new JPanel();
        itemContainer.setLayout(new BoxLayout(itemContainer, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(itemContainer);
         scrollPane.setPreferredSize(new Dimension(380, 300));
         frame.add(scrollPane);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        addItem(itemContainer);
        
        
        frame.setVisible(true);
    }

    private static void addItem(JPanel itemContainer) {
        JPanel itemPanel = new JPanel();
        itemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        itemPanel.setPreferredSize(new Dimension(300, 100));
 // Replace with your image file
        JLabel nameLabel = new JLabel("Item Name");
        JLabel priceLabel = new JLabel("$19.99"); // Replace with the actual price
        ImageIcon itemImage = new ImageIcon("C:\\Users\\dennis\\Documents\\NetBeansProjects\\HotelManagementSystem\\src\\hotelmanagementsystem\\hotelImages\\chapobeans.jpeg");
        itemPanel.add(new JLabel(itemImage));

       
        itemPanel.add(nameLabel);
        itemPanel.add(priceLabel);

        itemContainer.add(itemPanel);

        // Repaint and revalidate the container to reflect the changes
        itemContainer.revalidate();
        itemContainer.repaint();
    }
}

    

