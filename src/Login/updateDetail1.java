/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class updateDetail1 extends javax.swing.JFrame {

   private String loggedUsername;
   
    public updateDetail1(String username) {
        this.loggedUsername=username;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newValueField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fullNameCheckBox = new javax.swing.JCheckBox();
        dobCheckBox = new javax.swing.JCheckBox();
        emailCheckBox = new javax.swing.JCheckBox();
        aadharCheckBox = new javax.swing.JCheckBox();
        panCheckBox = new javax.swing.JCheckBox();
        addressCheckBox = new javax.swing.JCheckBox();
        accountCheckBox = new javax.swing.JCheckBox();
        religionCheckBox = new javax.swing.JCheckBox();
        serviceCheckBox = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 233, 246));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("                                                                     Update Details");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Who Want To Update ?");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Please Enter new Value ");

        newValueField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newValueField.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fullNameCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fullNameCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        fullNameCheckBox.setText("full_name");

        dobCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dobCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        dobCheckBox.setText("dob");

        emailCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        emailCheckBox.setText("email");

        aadharCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        aadharCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        aadharCheckBox.setText("aadhar_number");

        panCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        panCheckBox.setText("pan_number");

        addressCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        addressCheckBox.setText("address");

        accountCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        accountCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        accountCheckBox.setText("account_type");

        religionCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        religionCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        religionCheckBox.setText("religion");

        serviceCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        serviceCheckBox.setForeground(new java.awt.Color(0, 51, 204));
        serviceCheckBox.setText("service_required");

        jButton3.setBackground(new java.awt.Color(206, 233, 246));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\bb.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameCheckBox)
                            .addComponent(addressCheckBox)
                            .addComponent(accountCheckBox))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobCheckBox)
                                    .addComponent(panCheckBox))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailCheckBox)
                                    .addComponent(aadharCheckBox)
                                    .addComponent(serviceCheckBox)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(religionCheckBox)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newValueField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameCheckBox)
                            .addComponent(dobCheckBox)
                            .addComponent(emailCheckBox))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aadharCheckBox)
                            .addComponent(panCheckBox)
                            .addComponent(addressCheckBox)))
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceCheckBox)
                    .addComponent(religionCheckBox)
                    .addComponent(accountCheckBox))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String update=" ";
        if(fullNameCheckBox.isSelected()){
            update = "full_name";
        }
        else if(dobCheckBox.isSelected()){
            update ="dob";
        }
        else if(emailCheckBox.isSelected()){
            update="email";
        }
        else if(addressCheckBox.isSelected()){
            update="address";
        }
        else if(panCheckBox.isSelected()){
            update="pan_number";
        }
        else if(aadharCheckBox.isSelected()){
            update ="aadhar_number";
        }
        else if(accountCheckBox.isSelected()){
            update="account_type";
        }
        else if(religionCheckBox.isSelected()){
            update="religion";
        }
        else if(serviceCheckBox.isSelected()){
            update="service_required";
        }else{
            JOptionPane.showMessageDialog(this,"plese select a field to update ");
            return;
        }

        String newValue=newValueField.getText();

        if (newValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter a value!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/BMSG", "root", "root");
            String query="update users set " + update + " = ? where username=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, newValue);
            pst.setString(2, loggedUsername);

            int rowAffect=pst.executeUpdate();
            if(rowAffect>0){
                JOptionPane.showMessageDialog(this,"Update succesfully! ");
            }
            else{
                JOptionPane.showMessageDialog(this,"update failed! ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"database Error:" +e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String username=null;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDetail1(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aadharCheckBox;
    private javax.swing.JCheckBox accountCheckBox;
    private javax.swing.JCheckBox addressCheckBox;
    private javax.swing.JCheckBox dobCheckBox;
    private javax.swing.JCheckBox emailCheckBox;
    private javax.swing.JCheckBox fullNameCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newValueField;
    private javax.swing.JCheckBox panCheckBox;
    private javax.swing.JCheckBox religionCheckBox;
    private javax.swing.JCheckBox serviceCheckBox;
    // End of variables declaration//GEN-END:variables
}
