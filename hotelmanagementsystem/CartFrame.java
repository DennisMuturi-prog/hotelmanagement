/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author dennis
 */
public class CartFrame extends javax.swing.JFrame {

    /**
     * Creates new form CartFrame
     */
    public CartFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        example = new javax.swing.JLabel();
        foodname1 = new javax.swing.JLabel();
        foodname2 = new javax.swing.JLabel();
        foodname3 = new javax.swing.JLabel();
        foodname4 = new javax.swing.JLabel();
        foodname5 = new javax.swing.JLabel();
        quantity1 = new javax.swing.JLabel();
        quantity2 = new javax.swing.JLabel();
        quantity3 = new javax.swing.JLabel();
        quantity4 = new javax.swing.JLabel();
        quantity5 = new javax.swing.JLabel();
        plus1 = new javax.swing.JButton();
        plus2 = new javax.swing.JButton();
        plus3 = new javax.swing.JButton();
        plus4 = new javax.swing.JButton();
        plus5 = new javax.swing.JButton();
        minus1 = new javax.swing.JButton();
        minus2 = new javax.swing.JButton();
        minus3 = new javax.swing.JButton();
        minus4 = new javax.swing.JButton();
        minus5 = new javax.swing.JButton();
        placeOrder = new javax.swing.JButton();
        price1 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        price4 = new javax.swing.JLabel();
        price5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        example.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        example.setText("My food order");

        foodname1.setText("jk");

        foodname2.setText("jLabel3");

        foodname3.setText("jLabel4");

        foodname4.setText("jLabel2");

        foodname5.setText("jLabel5");

        quantity1.setText("jLabel6");

        quantity2.setText("jLabel7");

        quantity3.setText("jLabel8");

        quantity4.setText("jLabel9");

        quantity5.setText("jLabel10");

        plus1.setText("+");
        plus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus1ActionPerformed(evt);
            }
        });

        plus2.setText("+");
        plus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus2ActionPerformed(evt);
            }
        });

        plus3.setText("+");
        plus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus3ActionPerformed(evt);
            }
        });

        plus4.setText("+");
        plus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus4ActionPerformed(evt);
            }
        });

        plus5.setText("+");
        plus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus5ActionPerformed(evt);
            }
        });

        minus1.setText("-");
        minus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus1ActionPerformed(evt);
            }
        });

        minus2.setText("-");
        minus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus2ActionPerformed(evt);
            }
        });

        minus3.setText("-");
        minus3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus3ActionPerformed(evt);
            }
        });

        minus4.setText("-");
        minus4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus4ActionPerformed(evt);
            }
        });

        minus5.setText("-");
        minus5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus5ActionPerformed(evt);
            }
        });

        placeOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        placeOrder.setText("Place order");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        price1.setText("jLabel1");

        price2.setText("jLabel2");

        price3.setText("jLabel3");

        price4.setText("jLabel4");

        price5.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Foodname");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setText("Total");

        totalPrice.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(example)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(foodname2)
                    .addComponent(foodname1)
                    .addComponent(foodname3)
                    .addComponent(foodname4)
                    .addComponent(foodname5))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantity3)
                                    .addComponent(quantity2)
                                    .addComponent(quantity1)
                                    .addComponent(quantity4)
                                    .addComponent(quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(price4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jLabel3))
                                                    .addComponent(price1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(76, 76, 76)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(plus1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(plus2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(plus3, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(plus4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalPrice)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(price5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(plus5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 124, Short.MAX_VALUE)
                                .addComponent(placeOrder)
                                .addGap(93, 93, 93)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minus4)
                            .addComponent(minus5)
                            .addComponent(minus3)
                            .addComponent(minus2)
                            .addComponent(minus1))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(example)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(foodname1)
                        .addComponent(plus1)
                        .addComponent(minus1)
                        .addComponent(quantity1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodname2)
                    .addComponent(quantity2)
                    .addComponent(plus2)
                    .addComponent(minus2)
                    .addComponent(price2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodname3)
                    .addComponent(quantity3)
                    .addComponent(plus3)
                    .addComponent(minus3)
                    .addComponent(price3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodname4)
                    .addComponent(quantity4)
                    .addComponent(plus4)
                    .addComponent(minus4)
                    .addComponent(price4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodname5)
                    .addComponent(plus5)
                    .addComponent(minus5)
                    .addComponent(price5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(placeOrder)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus1ActionPerformed
        // TODO add your handling code here:
        
         int numberCart=Integer.parseInt(quantity1.getText());
        String foodName=foodname1.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price1.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart++;
        m.foodsQuantity.set(0,numberCart);
        price*=numberCart;
        difference=price-temPrice;
        newTotalPrice+=difference;
        quantity1.setText(Integer.toString(numberCart)); 
        price1.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
    }//GEN-LAST:event_plus1ActionPerformed

    private void minus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus1ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity1.getText());
        if(numberCart>0){
        String foodName=foodname1.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price1.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart--;
        m.foodsQuantity.set(0,numberCart);
        price*=numberCart;
        difference=temPrice-price;
        newTotalPrice-=difference;
        quantity1.setText(Integer.toString(numberCart));
        price1.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        }
    }//GEN-LAST:event_minus1ActionPerformed

    private void plus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus2ActionPerformed
        // TODO add your handling code here:
         int numberCart=Integer.parseInt(quantity2.getText());
        String foodName=foodname2.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price2.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart++;
        m.foodsQuantity.set(1,numberCart);
        price*=numberCart;
        difference=price-temPrice;
        newTotalPrice+=difference;
        quantity2.setText(Integer.toString(numberCart)); 
        price2.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
    }//GEN-LAST:event_plus2ActionPerformed

    private void minus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus2ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity2.getText());
        if(numberCart>0){
        String foodName=foodname2.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price2.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart--;
        m.foodsQuantity.set(1,numberCart);
        price*=numberCart;
        difference=temPrice-price;
        newTotalPrice-=difference;
        quantity2.setText(Integer.toString(numberCart));
        price2.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        }
    }//GEN-LAST:event_minus2ActionPerformed

    private void plus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus3ActionPerformed
        // TODO add your handling code here:
         int numberCart=Integer.parseInt(quantity3.getText());
        String foodName=foodname3.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price3.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart++;
        m.foodsQuantity.set(2,numberCart);
        price*=numberCart;
        difference=price-temPrice;
        newTotalPrice+=difference;
        quantity3.setText(Integer.toString(numberCart)); 
        price3.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        
    }//GEN-LAST:event_plus3ActionPerformed

    private void minus3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus3ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity3.getText());
        if(numberCart>0){
        String foodName=foodname3.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price3.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart--;
        m.foodsQuantity.set(2,numberCart);
        price*=numberCart;
        difference=temPrice-price;
        newTotalPrice-=difference;
        quantity3.setText(Integer.toString(numberCart));
        price3.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        }
    }//GEN-LAST:event_minus3ActionPerformed

    private void plus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus4ActionPerformed
        // TODO add your handling code here:
         int numberCart=Integer.parseInt(quantity4.getText());
        String foodName=foodname4.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price4.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart++;
        m.foodsQuantity.set(3,numberCart);
        price*=numberCart;
        difference=price-temPrice;
        newTotalPrice+=difference;
        quantity4.setText(Integer.toString(numberCart)); 
        price4.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
    }//GEN-LAST:event_plus4ActionPerformed

    private void minus4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus4ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity4.getText());
        if(numberCart>0){
        String foodName=foodname4.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price4.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart--;
        m.foodsQuantity.set(3,numberCart);
        price*=numberCart;
        difference=temPrice-price;
        newTotalPrice-=difference;
        quantity4.setText(Integer.toString(numberCart));
        price4.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        }
        
    }//GEN-LAST:event_minus4ActionPerformed

    private void plus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plus5ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity5.getText());
        String foodName=foodname5.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price5.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart++;
        m.foodsQuantity.set(4,numberCart);
        price*=numberCart;
        difference=price-temPrice;
        newTotalPrice+=difference;
        quantity5.setText(Integer.toString(numberCart)); 
        price5.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
    }//GEN-LAST:event_plus5ActionPerformed

    private void minus5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minus5ActionPerformed
        // TODO add your handling code here:
        int numberCart=Integer.parseInt(quantity5.getText());
        if(numberCart>0){
        String foodName=foodname5.getText();
        Menu_page m=new Menu_page();
        int price=m.foods.get(foodName);
        int temPrice=Integer.parseInt(price5.getText());
        int difference;
        int newTotalPrice=Integer.parseInt(totalPrice.getText());
        numberCart--;
        m.foodsQuantity.set(4,numberCart);
        price*=numberCart;
        difference=temPrice-price;
        newTotalPrice-=difference;
        quantity5.setText(Integer.toString(numberCart));
        price5.setText(Integer.toString(price));
        totalPrice.setText(Integer.toString(newTotalPrice));
        }
    }//GEN-LAST:event_minus5ActionPerformed

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderActionPerformed
        // TODO add your handling code here:
        Menu_page m=new Menu_page();
        int customerId=0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?useSSL=false","root","");
            Statement stm = con.createStatement();
            Login_page l=new Login_page();
            String customername=l.customername;
            if(customername==null){
            customername=m.customerName.getText();
              }
            System.out.println(customername);
            String sql="select customerID from restaurantcustomers where Customername='"+customername+"' ";
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()) {
             customerId=rs.getInt("customerID");
            } 
            con.close();     
        }catch(Exception e){
            System.out.println(e.getMessage());}
        for(int i=0;i<m.foodsList.size();i++){
            int Id=0;
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?useSSL=false","root","");
            Statement stm = con.createStatement();
            String foodname=m.foodsList.get(i);
            String sql="select FoodID from menuitems where FoodName='"+foodname+"' ";
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()) {
             Id=rs.getInt("FoodID");
            } 
            con.close();     
        }catch(Exception e){
            System.out.println(e.getMessage());}
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?useSSL=false","root","");
            Statement stm = con.createStatement();
            int foodQuantity=m.foodsQuantity.get(i);
            String sql="insert into foodorders(FoodQuantity,IDFOOD,IDCustomer) values("+foodQuantity+","+Id+","+customerId+") ";
            stm.executeUpdate(sql);
            con.close();     
        }catch(Exception e){
            System.out.println(e.getMessage());}    
        }
        
        
       
        
        
    }//GEN-LAST:event_placeOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartFrame().setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel example;
    public javax.swing.JLabel foodname1;
    public javax.swing.JLabel foodname2;
    public javax.swing.JLabel foodname3;
    public javax.swing.JLabel foodname4;
    public javax.swing.JLabel foodname5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JButton minus1;
    public javax.swing.JButton minus2;
    public javax.swing.JButton minus3;
    public javax.swing.JButton minus4;
    public javax.swing.JButton minus5;
    private javax.swing.JButton placeOrder;
    public javax.swing.JButton plus1;
    public javax.swing.JButton plus2;
    public javax.swing.JButton plus3;
    public javax.swing.JButton plus4;
    public javax.swing.JButton plus5;
    public javax.swing.JLabel price1;
    public javax.swing.JLabel price2;
    public javax.swing.JLabel price3;
    public javax.swing.JLabel price4;
    public javax.swing.JLabel price5;
    public javax.swing.JLabel quantity1;
    public javax.swing.JLabel quantity2;
    public javax.swing.JLabel quantity3;
    public javax.swing.JLabel quantity4;
    public javax.swing.JLabel quantity5;
    public javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
