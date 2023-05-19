/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.library;

import Connection.JavaDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author zaman
 */
public class Book extends javax.swing.JFrame {
   Connection conn;
    //object for connection with database 
    ResultSet rs;
    //to chech browse data on database
    PreparedStatement pst;
    // to send statement as sql to database and gives database values of user
    //note that hardu dana class la package java.sql dan..
    
    public Book() {
        super("New Book");
        initComponents();
                conn = JavaDatabase.connecrDp();  
Genid();

    }

    public void Genid(){
        Random id = new Random();
         jidField.setText("" + id.nextInt(1000+1));
         /*methody nextInt lanaw class e random da id generate dakat bapey +1 wata la 0 awa ta 1000
         dakre qabaray 1000 zyad kain ba pey zhmaray ktebakan , code aka means = set text wata danani text bo fieldy
         id pashan textaka = ba zhmara genereate krawakani naw methode next int*/
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PageField = new javax.swing.JTextField();
        jidField = new javax.swing.JTextField();
        jnameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AuthorField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PriceField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PageFieldActionPerformed(evt);
            }
        });

        jidField.setEditable(false);
        jidField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jidFieldActionPerformed(evt);
            }
        });

        jnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(168, 78, 47));
        jLabel1.setText("Book ID");

        AuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorFieldActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\icons8-left-arrow-50.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(168, 78, 47));
        jLabel2.setText("Name");

        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Documents\\NetBeansProjects\\LibraryManagmentSystem\\images\\add.png")); // NOI18N
        jButton1.setText("Add Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(168, 78, 47));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(168, 78, 47));
        jLabel5.setText("Pages");

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(168, 78, 47));
        jLabel3.setText("Author");

        jLabel6.setBackground(new java.awt.Color(0, 175, 146));
        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(168, 78, 47));
        jLabel6.setText("   Put Right informations here");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(196, 55, 29), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jidField)
                                .addComponent(jnameField)
                                .addComponent(AuthorField)
                                .addComponent(PriceField)
                                .addComponent(PageField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jidField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PageField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jidFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jidFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jidFieldActionPerformed

    private void jnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameFieldActionPerformed

    private void AuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFieldActionPerformed

    private void PriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceFieldActionPerformed

    private void PageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PageFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);
        Home HomePage = new Home();
        HomePage.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  String sql = "insert into Book (Book_Id , Name , Author , Price , Pages) values(?,?,?,?,?)"; 
    // bo danani datakan lanaw database drustkraw
    //dabe nawe table w filekan ba haman nawy naw database aka bn
        try {   
            pst = conn.prepareStatement(sql);
             pst.setString(1 , jidField.getText() );
    pst.setString(2 , jnameField.getText() );
    pst.setString(3 , AuthorField.getText() );
    pst.setString(4 ,PriceField.getText());
    pst.setString(5 , PageField.getText() );
pst.execute();
            JOptionPane.showMessageDialog(null , "New Book Added :> ");
            setVisible(false);
            Home Page = new Home();
            Page.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null , e);
        }

//1,2,3,4,5 zhmaray rizbandy field akana ka dabe ba pey rizbandi database bet
//preparestatment functioneka la classe connection e sql ka bapey table database datakan la file .java wa danereta .sqlite
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorField;
    private javax.swing.JTextField PageField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jidField;
    private javax.swing.JTextField jnameField;
    // End of variables declaration//GEN-END:variables
}
