/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restrauntelayechi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class UpdateFood extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int food_id ;
    /**
     * Creates new form UpdateFood
     */
    public UpdateFood() {
        initComponents();
        conn = connect.connect();
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
        searchcategory = new javax.swing.JTextField();
        searchname = new javax.swing.JTextField();
        searchsub = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        getname = new javax.swing.JLabel();
        nameFood = new javax.swing.JTextField();
        getcategory = new javax.swing.JLabel();
        categoryFood = new javax.swing.JTextField();
        getsub = new javax.swing.JLabel();
        subFood = new javax.swing.JTextField();
        getprice = new javax.swing.JLabel();
        priceFood = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        searchcategory.setText("category..");
        searchcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcategoryActionPerformed(evt);
            }
        });

        searchname.setText("name..");
        searchname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchnameActionPerformed(evt);
            }
        });

        searchsub.setText("subcategory..");
        searchsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsubActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-search-24.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        getname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getname.setText("Name");

        nameFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFoodActionPerformed(evt);
            }
        });

        getcategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getcategory.setText("Category");

        categoryFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryFoodActionPerformed(evt);
            }
        });

        getsub.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getsub.setText("Subcategory");

        subFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subFoodActionPerformed(evt);
            }
        });

        getprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getprice.setText("Price");

        priceFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFoodActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(Update)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(getprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(getsub, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(getcategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(getname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nameFood, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(categoryFood))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(subFood))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(priceFood))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(searchsub, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchsub, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getname)
                    .addComponent(nameFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getcategory)
                    .addComponent(categoryFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getsub))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getprice)
                    .addComponent(priceFood, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back)
                    .addComponent(Update))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String name_food = nameFood.getText();
            String categ_food = categoryFood.getText();
            String sub_food = subFood.getText();
            String price = priceFood.getText();
            if (name_food.equals("") || categ_food.equals("") || sub_food.equals("") || price.equals("") ){
                 JOptionPane.showMessageDialog(this, "Please fill all fields to update the Meal");
            }else{
                String query="Update food set name=? , category = ?, subcategory = ?, price=? where food_id=?";
                pst=conn.prepareStatement(query);
                pst.setString(1,name_food);
                pst.setString(2,categ_food);
                pst.setString(3,sub_food);
                pst.setDouble(4,Double.parseDouble(price));
                pst.setInt(5,food_id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, name_food +" Updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminMenu obj =new AdminMenu();
        obj.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void searchcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchcategoryActionPerformed

    private void searchnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchnameActionPerformed

    private void searchsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchsubActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            // TODO add your handling code here:
            String name_food =searchname.getText();
            String categ_food =searchcategory.getText();
            String sub_food =searchsub.getText();
            String query="select * from food where name='"+name_food+"' and category = '"+categ_food+"' and subcategory = '"+sub_food+"'";
            pst=conn.prepareStatement(query);
            rs=pst.executeQuery();
            if (rs.next()){
                food_id=rs.getInt("food_id");
                String old_name=rs.getString("name");
                getname.setText(old_name);
                String categor=rs.getString("category");
                getcategory.setText(categor);
                String sub = rs.getString("subcategory");
                getsub.setText(sub);
                String price = rs.getString("price");
                getprice.setText(price);
            }else{
                JOptionPane.showMessageDialog(this, "Food Not found, please verify the name and category of the meal you are looking for");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void categoryFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryFoodActionPerformed

    private void nameFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFoodActionPerformed

    private void subFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subFoodActionPerformed

    private void priceFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFoodActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Update;
    private javax.swing.JTextField categoryFood;
    private javax.swing.JLabel getcategory;
    private javax.swing.JLabel getname;
    private javax.swing.JLabel getprice;
    private javax.swing.JLabel getsub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameFood;
    private javax.swing.JTextField priceFood;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchcategory;
    private javax.swing.JTextField searchname;
    private javax.swing.JTextField searchsub;
    private javax.swing.JTextField subFood;
    // End of variables declaration//GEN-END:variables
}
