/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restrauntelayechi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class Order extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel model;
    String name;
    String category;
    String sub;
    String price ;
        
    /**
     * Creates new form Order
     */
    public Order() {
        initComponents();
        conn = connect.connect();
        
        int i = 0;
        try {
            String query="select * from food ";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()){
                i += 1;  
            }
            JButton[] btn = new JButton[i];
            int j  = 0;
            query="select * from food ";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()){
                name=rs.getString("name");
                category=rs.getString("category");
                sub = rs.getString("subcategory");
                price = rs.getString("price");
                btn[j] = new JButton();
                if (category.equals("Pizza")){
                    btn[j].setBackground(Color.yellow);
                    btn[j].setIcon(new ImageIcon(Class.class.getResource("/icons/pizza.png")));
                }else if (category.equals("Sandwich")){
                    btn[j].setBackground(Color.red);
                    btn[j].setIcon(new ImageIcon(Class.class.getResource("/icons/sandwich.png")));
                }else if (category.equals("Plat")){
                    btn[j].setBackground(Color.blue);
                    btn[j].setIcon(new ImageIcon(Class.class.getResource("/icons/plat.jpg")));
                }else if (category.equals("Dessert")){
                    btn[j].setBackground(Color.green);
                    btn[j].setIcon(new ImageIcon(Class.class.getResource("/icons/dessert.png")));
                }else if (category.equals("Beverage")){
                    btn[j].setBackground(Color.green);
                    btn[j].setIcon(new ImageIcon(Class.class.getResource("/icons/beverage.png")));
                }
                btn[j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        model = (DefaultTableModel) ticket.getModel();
                        Object source = e.getSource();
                        if (source instanceof JButton) {
                            JButton btn = (JButton)source;
                            String strin = btn.getText();
                            String[] parts = strin.split(",");
                            name = parts[0];
                            price = parts[1];
                        }
                        model.addRow(new Object[]{name, price});
                        Double addToTotal = Double.parseDouble(total.getText())+ Double.parseDouble(price);
                        total.setText(String.valueOf(addToTotal));
                        Double addToPoints = Double.parseDouble(points.getText())+ Double.parseDouble(price)/10; 
                        points.setText(String.valueOf(addToPoints));
                        ticket.revalidate();
                        ticket.repaint();
                        
                    }
                });
                btn[j].setText(name+","+price);
                btn[j].setSize(150, 200);
                btn[j].setFont(new java.awt.Font("Tahoma", 1, 12));
                if( j >19) {
                    jPanel6.add(btn[j]); 
                    btn[j].setVisible(true);
                    jPanel6.revalidate();
                    jPanel6.repaint();
                    
                }else if( j >14) {
                    jPanel5.add(btn[j]); 
                    btn[j].setVisible(true);
                    jPanel5.revalidate();
                    jPanel5.repaint();
                    
                }else if( j >9) {
                    jPanel4.add(btn[j]); 
                    btn[j].setVisible(true);
                    jPanel4.revalidate();
                    jPanel4.repaint();
                }else if( j >4) {
                    jPanel3.add(btn[j]); 
                    btn[j].setVisible(true);
                    jPanel3.revalidate();
                    jPanel3.repaint();
                    
                } else {
                    jPanel2.add(btn[j]); 
                    btn[j].setVisible(true);
                    jPanel2.revalidate();
                    jPanel2.repaint();
                    
                }
                j++ ;
            }   
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        customerPhone = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticket = new javax.swing.JTable();
        label5 = new javax.swing.JLabel();
        getname = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        getphone = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        points = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(150, 800));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jPanel6.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );

        customerPhone.setText("Customer Phone ...");

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-24.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Confirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        ticket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(ticket);

        label5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label5.setText("Name:");

        getname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getname.setText("Walk-in");

        label4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label4.setText("Total:");

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("0");

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setText("Phone:");

        getphone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText("Points:");

        points.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        points.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(495, 495, 495)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(81, 81, 81)
                                    .addComponent(getname))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addGap(86, 86, 86)
                                    .addComponent(total)))
                            .addGap(148, 148, 148)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(label1)
                                .addComponent(label2))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(points)
                                .addComponent(getphone)))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(getname)
                            .addComponent(label2)
                            .addComponent(getphone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(total)
                                    .addComponent(label1)
                                    .addComponent(points))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CashierMenu obj =new CashierMenu();
        obj.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        Date todays = new Date();
        int food_id = 0;
        java.sql.Date sqlDate = new java.sql.Date( todays.getTime() );
        try {
            String query="insert into customersales (phone,sales,date) values(?,?,?)"; 
            pst=conn.prepareStatement(query);
            String phone_buyer ;
            if (getphone.getText().equals("")){
                phone_buyer = "00000000";
            }else {
                phone_buyer = getphone.getText();
            }
            pst.setString(1, phone_buyer);
            pst.setString(2, total.getText());
            pst.setDate(3,sqlDate);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            model = (DefaultTableModel) ticket.getModel();
            for (int count = 0; count < model.getRowCount(); count++){
                String price_food_bought = model.getValueAt(count, 1).toString();
                String name_food_bought = model.getValueAt(count, 0).toString();
                String query="select food_id from food where name = ? and price = ?"; 
                pst=conn.prepareStatement(query);
                pst.setString(1, name_food_bought);
                pst.setString(2, price_food_bought);
                rs=pst.executeQuery();
                while(rs.next()){
                    food_id = rs.getInt("food_id");
                }
                query="insert into foodsales (food_id,price,date) values(?,?,?)"; 
                pst=conn.prepareStatement(query);
                pst.setInt(1, food_id);
                pst.setDouble(2, Double.parseDouble(price_food_bought));
                pst.setDate(3,sqlDate);
                pst.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String query="update customer set points = ? where phone = ?"; 
            pst=conn.prepareStatement(query);
            pst.setDouble(1,Double.parseDouble(points.getText()));
            pst.setString(2,getphone.getText());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PrintWriter outFile = new PrintWriter ("Receipt.txt");
            model = (DefaultTableModel) ticket.getModel();
            outFile.printf("%30s","Restaurant El Ayachi");
            outFile.println("");
            outFile.println("------------------------------------------------");
            outFile.printf("%-30s","cashier: ");
            outFile.printf("%-20s","Montassar Chihi");
            outFile.println("");
            outFile.println("------------------------------------------------");
            outFile.printf("%-30s","Customer: ");
            outFile.printf("%-20s",getname.getText());
            outFile.println("");
            outFile.println("------------------------------------------------");
            outFile.printf("%-30s","date: ");
            outFile.printf("%-20s",sqlDate);
            outFile.println("");
            outFile.println("------------------------------------------------");
            for (int count = 0; count < model.getRowCount(); count++){
                String price_food_bought = model.getValueAt(count, 1).toString();
                String name_food_bought = model.getValueAt(count, 0).toString();
                outFile.printf("%-20s",name_food_bought);
                outFile.printf("%20s",price_food_bought);
                outFile.println("");
            }
            outFile.println("------------------------------------------------");
            outFile.printf("%-20s","Total:");
            outFile.printf("%20s",total.getText());
            outFile.println("");
            outFile.println("------------------------------------------------");
            outFile.printf("%-40s","Adress: Earth, milky Way");
            outFile.println("");
            outFile.printf("%-40s","Visit Us again");
            outFile.println("");
            outFile.printf("%-40s","Visit Our Facebook page @RestoElAyechi");
            outFile.println("");
            outFile.printf("%-40s","Email: RestauElAyechi@business.tn");
            outFile.close();
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "Receipt.txt");
            try {
                pb.start();
            } catch (IOException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ConfirmActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String phone_number =customerPhone.getText();
            String query="select * from customer where phone='"+phone_number+"'";
            pst=conn.prepareStatement(query);
            rs=pst.executeQuery();
            if (rs.next()){
                getname.setText(rs.getString("name"));
                getphone.setText(rs.getString("phone"));
                Double addToPoints = Double.parseDouble(points.getText())+ Double.parseDouble(rs.getString("points"))/5; 
                points.setText(String.valueOf(addToPoints));

            }else{
                JOptionPane.showMessageDialog(this, "Customer Not found, please verify the phone number");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

   
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Confirm;
    private javax.swing.JTextField customerPhone;
    private javax.swing.JLabel getname;
    private javax.swing.JLabel getphone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel points;
    private javax.swing.JButton search;
    private javax.swing.JTable ticket;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
