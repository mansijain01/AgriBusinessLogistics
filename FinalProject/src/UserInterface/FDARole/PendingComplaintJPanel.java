/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FDARole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PendingComplaintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PendingComplaintJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Network network;
    public PendingComplaintJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        populateComplaintTable();
    }
    
    public void populateComplaintTable(){
        DefaultTableModel model = (DefaultTableModel) complaintTable.getModel();

        model.setRowCount(0);
        
                for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                    CustomerWorkRequest custWorkRequest = (CustomerWorkRequest)request;
                    Object[] row = new Object[4];
                    row[0] = custWorkRequest;
                    row[1] = custWorkRequest.getRfid();
                    row[2] = request.getRequestDate();
                    row[3] = request.getSender();

                    model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        complaintTable = new javax.swing.JTable();
        trackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        retailerTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        retSoldTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        supplierTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        suppSoldTxtField = new javax.swing.JTextField();
        farmerTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        farSoldTxtField = new javax.swing.JTextField();
        resolveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        retailerBtn = new javax.swing.JButton();
        supplierBtn = new javax.swing.JButton();
        farmerBtn = new javax.swing.JButton();

        complaintTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "RFID", "Request Date", "Customer", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(complaintTable);

        trackBtn.setText("Track This Item");
        trackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Retailer:");

        retailerTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retailerTxtFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Supplier:");

        jLabel3.setText("Farmer:");

        jLabel4.setText("Sold by Retailer On:");

        jLabel5.setText("Sold by Supplier On:");

        suppSoldTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppSoldTxtFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Sold by Farmer On:");

        resolveBtn.setText("Resolve This Issue >>");
        resolveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        retailerBtn.setText("Retailer Details");
        retailerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retailerBtnActionPerformed(evt);
            }
        });

        supplierBtn.setText("Supplier Details");

        farmerBtn.setText("Farmer Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backBtn)
                        .addGap(117, 117, 117)
                        .addComponent(resolveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trackBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(retSoldTxtField)
                                    .addComponent(retailerTxtField)
                                    .addComponent(supplierTxtField)
                                    .addComponent(suppSoldTxtField)
                                    .addComponent(farmerTxtField)
                                    .addComponent(farSoldTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retailerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(supplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(farmerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trackBtn)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(retailerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retailerBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retSoldTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(supplierTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(supplierBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(suppSoldTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(farmerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(farmerBtn)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(farSoldTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(resolveBtn)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void trackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackBtnActionPerformed
        int selectedRow = complaintTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CustomerWorkRequest request = (CustomerWorkRequest)complaintTable.getValueAt(selectedRow, 0);
     
        retailerTxtField.setText(request.getRfid().getRetailer().getPerson().getName());
        retSoldTxtField.setText(String.valueOf(request.getRfid().getProductSoldDate()));
        supplierTxtField.setText(request.getRfid().getSupplier().getPerson().getName());
        supplierTxtField.setText(String.valueOf(request.getRfid().getSupplierShippingDate()));
        farmerTxtField.setText(request.getRfid().getFarmer().getPerson().getName());
        farSoldTxtField.setText(String.valueOf(request.getRfid().getFarmerShippingDate()));
               
        
    }//GEN-LAST:event_trackBtnActionPerformed

    private void retailerTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retailerTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retailerTxtFieldActionPerformed

    private void suppSoldTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppSoldTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suppSoldTxtFieldActionPerformed

    private void resolveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolveBtnActionPerformed
        int selectedRow = complaintTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        CustomerWorkRequest request = (CustomerWorkRequest)complaintTable.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        
        ResolveComplaintJPanel resolveComplaintFDAJPanel = new ResolveComplaintJPanel(userProcessContainer, account, network, request, this);
        userProcessContainer.add("resolveComplaintFDAJPanel", resolveComplaintFDAJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_resolveBtnActionPerformed

    private void retailerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retailerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retailerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable complaintTable;
    private javax.swing.JTextField farSoldTxtField;
    private javax.swing.JButton farmerBtn;
    private javax.swing.JTextField farmerTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resolveBtn;
    private javax.swing.JTextField retSoldTxtField;
    private javax.swing.JButton retailerBtn;
    private javax.swing.JTextField retailerTxtField;
    private javax.swing.JTextField suppSoldTxtField;
    private javax.swing.JButton supplierBtn;
    private javax.swing.JTextField supplierTxtField;
    private javax.swing.JButton trackBtn;
    // End of variables declaration//GEN-END:variables
}
