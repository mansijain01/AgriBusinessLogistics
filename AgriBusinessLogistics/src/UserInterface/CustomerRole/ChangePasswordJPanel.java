/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ChangePasswordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChangePasswordJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
   
    public ChangePasswordJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        MyStringVerifier myStringVerifier = new MyStringVerifier();
        passwordTxtField.setInputVerifier(myStringVerifier);
        repassTxtField.setInputVerifier(myStringVerifier);
        newpassTxtField.setInputVerifier(myStringVerifier);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordBtn = new javax.swing.JButton();
        passwordTxtField = new javax.swing.JPasswordField();
        newpassTxtField = new javax.swing.JPasswordField();
        repassTxtField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Change Password");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Enter Old Password:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Enter New Password:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Re-enter New Password:");

        passwordBtn.setBackground(new java.awt.Color(51, 51, 51));
        passwordBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        passwordBtn.setForeground(new java.awt.Color(255, 255, 255));
        passwordBtn.setText("Change Password");
        passwordBtn.setBorder(new javax.swing.border.MatteBorder(null));
        passwordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordBtnActionPerformed(evt);
            }
        });

        passwordTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });

        newpassTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        repassTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(repassTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(newpassTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordTxtField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newpassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(repassTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(passwordBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.MatteBorder(null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(308, 308, 308))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordBtnActionPerformed
        try{
            char[] passwordCharArray = passwordTxtField.getPassword();
            String password = String.valueOf(passwordCharArray);
            
            char[] newpasswordCharArray = newpassTxtField.getPassword();
            String newpassword = String.valueOf(newpasswordCharArray);
            
            char[] repasswordCharArray = passwordTxtField.getPassword();
            String repassword = String.valueOf(repasswordCharArray);
            
            if(!password.isEmpty() && !newpassword.isEmpty() && !repassword.isEmpty()){
                if(password.equals(account.getPassword())){
                    if(newpassword.equals(repassword)){
                        account.setPassword(newpassword);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Passwords do not match");
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Old password does not match!");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Please enter appropriate values!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter appropriate values!");
        }
    }//GEN-LAST:event_passwordBtnActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpassTxtField;
    private javax.swing.JButton passwordBtn;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JPasswordField repassTxtField;
    // End of variables declaration//GEN-END:variables
}
