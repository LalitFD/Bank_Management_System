/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Login.deposite1;

public class deposite1 extends javax.swing.JFrame {

  private String loggedInUsername;  

    public deposite1(String username) {  
        this.loggedInUsername = username;  
        initComponents();  
    }  
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        depositeTextField = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(209, 233, 246));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("How Much Money Do You Want To Deposite ?");

        amountTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        amountTextField.setBorder(new javax.swing.border.MatteBorder(null));

        depositeTextField.setBackground(new java.awt.Color(0, 0, 0));
        depositeTextField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        depositeTextField.setForeground(new java.awt.Color(255, 255, 255));
        depositeTextField.setText("SUBMIT");
        depositeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\hand-shake12.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("                                      Deposite Money");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton3.setBackground(new java.awt.Color(206, 233, 246));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\bb.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(depositeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(depositeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeTextFieldActionPerformed

        String balance=amountTextField.getText();

        if(balance.isEmpty()){
            JOptionPane.showMessageDialog(this, "please enter an amount to deposite");
            return;
        }
        try{
            double amount=Double.parseDouble(balance);
            if(amount<=0){
                JOptionPane.showMessageDialog(this, "please enter an positive amount");
                return;
            }
            if(updateBalance(amount,loggedInUsername)){
                miniDepo(amount,loggedInUsername);
                JOptionPane.showMessageDialog(null, "Deposit successful!");

                this.dispose();
                new Afterlogin1(loggedInUsername).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Deposit failed. Please try again.");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Deposit failed. Please try again.");
        }
    }//GEN-LAST:event_depositeTextFieldActionPerformed

    
    
    
     public  boolean updateBalance(double amount ,String loggedInUsername){
         
          if (loggedInUsername == null || loggedInUsername.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Error: User is not logged in!");
        return false;
    }
          
          
         String select="select balance from users where username = ?";
         String update ="UPDATE users SET balance = ? WHERE username = ?";
         
          try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BMSG", "root", "root");
             PreparedStatement selectStmt = con.prepareStatement(select);
             PreparedStatement updateStmt = con.prepareStatement(update)) {

            selectStmt.setString(1, loggedInUsername);
            ResultSet rs = selectStmt.executeQuery();
            
            double currentBalance = 0;
            if (rs.next()) {
                currentBalance = rs.getDouble("balance");
            }

            double newBalance = currentBalance + amount;
            updateStmt.setDouble(1, newBalance);
            updateStmt.setString(2, loggedInUsername);

           int rowsAffected = updateStmt.executeUpdate();
        System.out.println("Rows Affected: " + rowsAffected); 

        return rowsAffected > 0;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            return false;
        }
     }
     
      public void miniDepo(double amount, String loggedInUsername) {
    String accnumber = null;
    String query = "SELECT account_number FROM users WHERE username = ?";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BMSG", "root", "root");
         PreparedStatement pst = con.prepareStatement(query)) {
        
        pst.setString(1, loggedInUsername);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            accnumber = rs.getString("account_number");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    if (accnumber == null) {
        System.out.println("Error: No account number found for username " + loggedInUsername);
        return;
    }

    // Correct SQL query using PreparedStatement
    String str = "INSERT INTO ministatement (diposit, username, account_number) VALUES (?, ?, ?)";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BMSG", "root", "root");
         PreparedStatement pst = con.prepareStatement(str)) {

        pst.setDouble(1, amount);
        pst.setString(2, loggedInUsername);
        pst.setString(3, accnumber);
        
        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            System.out.println("✅ Deposit recorded successfully in ministatement.");
        } else {
            System.out.println("❌ Failed to record deposit in ministatement.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
     
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Afterlogin1(loggedInUsername).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       String username=null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deposite1(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton depositeTextField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
