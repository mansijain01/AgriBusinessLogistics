/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplyChainEnterprise;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Order.MasterOrderCatalog;
import Business.Order.Order;
import Business.Order.OrderItem;
import Business.Organization.Organization;
import Business.Organization.RetailerOrganization;
import Business.Sensors.RFID;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class NewPurchaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewPurchaseJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Network network;
    boolean isCheckedOut = false;
    private MasterOrderCatalog masterOrderCatalog;
    private EcoSystem business;
    Order order;

    public NewPurchaseJPanel(JPanel userProcessContainer, UserAccount account, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.network = network;
        this.business = business;
        populateRetailerComboBox();

    }

    public void populateRetailerComboBox() {
        retailerComboBox.removeAllItems();
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (ent instanceof SupplyChainEnterprise) {
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof RetailerOrganization) {
                        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                            retailerComboBox.addItem(ua);
                        }
                    }
                }
            }
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        retailerProductTable = new javax.swing.JTable();
        retailerComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        buyBtn = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Make A New Purchase");

        retailerProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(retailerProductTable);
        if (retailerProductTable.getColumnModel().getColumnCount() > 0) {
            retailerProductTable.getColumnModel().getColumn(0).setResizable(false);
            retailerProductTable.getColumnModel().getColumn(1).setResizable(false);
        }

        retailerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retailerComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Retailer:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Quantity:");

        backBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        buyBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 12)); // NOI18N
        buyBtn.setText("Make Purchase");
        buyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(170, 170, 170)
                                .addComponent(buyBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(retailerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(287, 287, 287))))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(retailerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyBtn))
                .addGap(42, 42, 42)
                .addComponent(backBtn)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void retailerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retailerComboBoxActionPerformed
        populateProductTable();
    }//GEN-LAST:event_retailerComboBoxActionPerformed

    private void buyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyBtnActionPerformed
        int selectedRow = retailerProductTable.getSelectedRow();
        UserAccount retailer = (UserAccount) retailerComboBox.getSelectedItem();
        InventoryItem selectedProduct;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            selectedProduct = (InventoryItem) retailerProductTable.getValueAt(selectedRow, 0);
        }
        int fetchedQty = (Integer) quantitySpinner.getValue();
        if (fetchedQty <= 0) {
            JOptionPane.showMessageDialog(this, "Selected at least 1 quantity", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (fetchedQty > selectedProduct.getQuantity()) {
            JOptionPane.showMessageDialog(this, "Quantity > Availability!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Order order = new Order();
            order.setBuyer(account);
            order.setSeller(retailer);
            order.setType("c2r");
            //network.getMasterOrderCatalog().addOrder(order);

            for (InventoryItem rii : retailer.getInventory().getInventoryList()) {
                if (rii.getProduct().getName().equals(selectedProduct.getProduct().getName())) {
                    OrderItem oi = order.addOrderItem(selectedProduct.getProduct(), fetchedQty);
                    for(int i = 0; i < fetchedQty; i++){
                        oi.getRfid().add(rii.getRfid().remove());
                    }
                    rii.setQuantity(rii.getRfid().size());
                }
            }
            network.getMasterOrderCatalog().addOrder(order);
            refreshOrderTable();
        }    }

    public void refreshOrderTable() {
        populateProductTable();
    }//GEN-LAST:event_buyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton buyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox retailerComboBox;
    private javax.swing.JTable retailerProductTable;
    // End of variables declaration//GEN-END:variables

    private void populateProductTable() {
        DefaultTableModel dtm = (DefaultTableModel) retailerProductTable.getModel();
        UserAccount ua = (UserAccount) retailerComboBox.getSelectedItem();
        dtm.setRowCount(0);
        if (ua != null) {
            for (InventoryItem ii : ua.getInventory().getInventoryList()) {
                Object row[] = new Object[2];
                row[0] = ii;
                row[1] = ii.getQuantity();
                dtm.addRow(row);
            }
        }
    }
}
