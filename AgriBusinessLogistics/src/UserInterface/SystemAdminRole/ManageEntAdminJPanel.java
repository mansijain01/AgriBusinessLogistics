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
import Business.Person.Person;
import Business.Role.EnterpriseAdminRole;
import Business.Role.FDAAdminRole;
import Business.UserAccount.UserAccount;
import Business.Utils.MyNoWhiteSpaceVerifier;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageEntAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEntAdminJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;

    public ManageEntAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
        MyStringVerifier myStringVerifier = new MyStringVerifier();
        MyNoWhiteSpaceVerifier myNoWhiteSpaceVerifier = new MyNoWhiteSpaceVerifier();
        nameTxtField.setInputVerifier(myStringVerifier);
        usernameTxtField1.setInputVerifier(myNoWhiteSpaceVerifier);
        passwordTxtField.setInputVerifier(myStringVerifier);
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseComboBox.addItem(enterprise);
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
        enterpriseAdminJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        enterpriseComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTxtField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTxtField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        nameTxtField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        networkComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));

        enterpriseAdminJTable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        enterpriseAdminJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseAdminJTable);
        if (enterpriseAdminJTable.getColumnModel().getColumnCount() > 0) {
            enterpriseAdminJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Enterprise:");

        enterpriseComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Manage Enterprise Admin");

        usernameTxtField1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        usernameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Password:");

        passwordTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });

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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Name:");

        addBtn.setBackground(new java.awt.Color(51, 51, 51));
        addBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add New Admin");
        addBtn.setBorder(new javax.swing.border.MatteBorder(null));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Network:");

        networkComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel1))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTxtField)
                                        .addComponent(usernameTxtField1)
                                        .addComponent(passwordTxtField)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(enterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(usernameTxtField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passwordTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtField1ActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public boolean checkUsernameUnique(EcoSystem system, String userName) {
        boolean flag = false;
        flag = system.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        if (flag == false) {
            A:
            for (Network network : system.getNetworkList()) {
                flag = network.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                if (flag == true) {
                    break A;
                } else {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        flag = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                        if (flag == true) {
                            break A;
                        } else {
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                flag = enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
                                if (flag == true) {
                                    break A;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return flag;
        }
        return flag;

    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseComboBox.getSelectedItem();
        try {
            String username = usernameTxtField1.getText();
            String password = String.valueOf(passwordTxtField.getPassword());
            String name = nameTxtField.getText();
            if (!username.isEmpty() && !password.isEmpty() && !name.isEmpty()) {
                boolean check = checkUsernameUnique(system, username);

                if (check == false) {
                    Person person = enterprise.getPersonDirectory().createPerson(name);

                    if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.SupplyChain)) {
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new EnterpriseAdminRole());
                    } else if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.FDA)) {
                        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, person, new FDAAdminRole());
                    }
                    populateTable();
                    resetFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Username already exist. Please choose another.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter appropriate values.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter appropriate values.");
        }

    }//GEN-LAST:event_addBtnActionPerformed

    private void resetFields() {
        nameTxtField.setText("");
        usernameTxtField1.setText("");
        passwordTxtField.setText("");
    }
    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        Network network = (Network) networkComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable enterpriseAdminJTable;
    private javax.swing.JComboBox enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTextField usernameTxtField1;
    // End of variables declaration//GEN-END:variables
}
