/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDAAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class FDAAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FDAAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    private Enterprise enterprise;
    private EcoSystem system;
    public FDAAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        this.enterprise = enterprise;
        this.system = system;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgBtn = new javax.swing.JButton();
        complaintBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        orgBtn.setBackground(new java.awt.Color(51, 51, 51));
        orgBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        orgBtn.setForeground(new java.awt.Color(255, 255, 255));
        orgBtn.setText("Manage Organization >>");
        orgBtn.setBorder(new javax.swing.border.MatteBorder(null));
        orgBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        complaintBtn.setBackground(new java.awt.Color(51, 51, 51));
        complaintBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        complaintBtn.setForeground(new java.awt.Color(255, 255, 255));
        complaintBtn.setText("View All Complaints >>");
        complaintBtn.setBorder(new javax.swing.border.MatteBorder(null));
        complaintBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        complaintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintBtnActionPerformed(evt);
            }
        });

        reportBtn.setBackground(new java.awt.Color(51, 51, 51));
        reportBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        reportBtn.setForeground(new java.awt.Color(255, 255, 255));
        reportBtn.setText("View Reports >>");
        reportBtn.setBorder(new javax.swing.border.MatteBorder(null));
        reportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Enterprise Name:");

        valueLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("FDA Admin Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(orgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(complaintBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valueLabel))
                .addGap(57, 57, 57)
                .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(complaintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orgBtnActionPerformed

    private void complaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintBtnActionPerformed
        ViewComplaintsJPanel viewComplaintsJPanel = new ViewComplaintsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ViewComplaintsJPanel", viewComplaintsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_complaintBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        ViewReportsJPanel viewReportsJPanel = new ViewReportsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("viewReportsJPanel", viewReportsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reportBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton complaintBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
