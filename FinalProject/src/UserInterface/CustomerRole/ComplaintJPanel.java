/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ComplaintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ComplaintJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    public ComplaintJPanel(JPanel userProcessContainer, UserAccount account, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        statusBtn = new javax.swing.JButton();
        newComplaintBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Manage Complaints Here");

        statusBtn.setText("Check Status");
        statusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBtnActionPerformed(evt);
            }
        });

        newComplaintBtn.setText("Lodge New Complaint");
        newComplaintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newComplaintBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(statusBtn)
                        .addGap(135, 135, 135)
                        .addComponent(newComplaintBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusBtn)
                    .addComponent(newComplaintBtn))
                .addGap(80, 80, 80)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void statusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBtnActionPerformed
        StatusJPanel statusCustJPanel = new StatusJPanel(userProcessContainer, account, network);
        userProcessContainer.add("statusCustJPanel", statusCustJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_statusBtnActionPerformed

    private void newComplaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newComplaintBtnActionPerformed
        LodgeComplaintJPanel newComplaintCustJPanel = new LodgeComplaintJPanel(userProcessContainer, account, network);
        userProcessContainer.add("newComplaintCustJPanel", newComplaintCustJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newComplaintBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newComplaintBtn;
    private javax.swing.JButton statusBtn;
    // End of variables declaration//GEN-END:variables
}