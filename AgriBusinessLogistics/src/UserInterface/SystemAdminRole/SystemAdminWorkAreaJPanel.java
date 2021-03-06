/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author user
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;

        populateTree();
    }

    public void populateTree() {

        DefaultTreeModel model = (DefaultTreeModel) JTree.getModel();      
        
        ArrayList<Network> networkList = business.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        manageNetworkBtn = new javax.swing.JButton();
        mngEnterpriseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedNodeJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manageEnterpriseAdminBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JTree.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("System");
        JTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JTreevalueChangedAction(evt);
            }
        });
        jScrollPane1.setViewportView(JTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        manageNetworkBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageNetworkBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        manageNetworkBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageNetworkBtn.setText("Manage Network");
        manageNetworkBtn.setBorder(new javax.swing.border.MatteBorder(null));
        manageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkBtnActionPerformed(evt);
            }
        });

        mngEnterpriseBtn.setBackground(new java.awt.Color(51, 51, 51));
        mngEnterpriseBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        mngEnterpriseBtn.setForeground(new java.awt.Color(255, 255, 255));
        mngEnterpriseBtn.setText("Manage Enterprise");
        mngEnterpriseBtn.setBorder(new javax.swing.border.MatteBorder(null));
        mngEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngEnterpriseBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Selected Node:");

        selectedNodeJLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        selectedNodeJLabel.setText("System");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Work Area - System Administrator");

        manageEnterpriseAdminBtn.setBackground(new java.awt.Color(51, 51, 51));
        manageEnterpriseAdminBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        manageEnterpriseAdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageEnterpriseAdminBtn.setText("Manage Enterprise Admin");
        manageEnterpriseAdminBtn.setBorder(new javax.swing.border.MatteBorder(null));
        manageEnterpriseAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminRole/sysadmin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectedNodeJLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mngEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(135, 135, 135))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectedNodeJLabel)
                            .addComponent(jLabel1))
                        .addGap(32, 32, 32)
                        .addComponent(manageNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(mngEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(manageEnterpriseAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTreevalueChangedAction(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JTreevalueChangedAction
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) JTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeJLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_JTreevalueChangedAction

    private void mngEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngEnterpriseBtnActionPerformed
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, business);
        userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngEnterpriseBtnActionPerformed

    private void manageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkBtnActionPerformed
        ManageNetworkJPanel manageEnterpriseJPanel = new ManageNetworkJPanel(userProcessContainer, business);
        userProcessContainer.add("manageNetworkJPanel", manageEnterpriseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworkBtnActionPerformed

    private void manageEnterpriseAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminBtnActionPerformed
        ManageEntAdminJPanel manageEnterpriseadJPanel = new ManageEntAdminJPanel(userProcessContainer, business);
        userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseadJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseAdminBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageEnterpriseAdminBtn;
    private javax.swing.JButton manageNetworkBtn;
    private javax.swing.JButton mngEnterpriseBtn;
    private javax.swing.JLabel selectedNodeJLabel;
    // End of variables declaration//GEN-END:variables
}
