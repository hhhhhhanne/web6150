/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SubAdminRole;

import Business.EcoSystem;
import Business.Organization.Inventory;
import Business.Organization.InventoryOrganization;
import static Business.Organization.Organization.Type.Inventory;
import Business.Vaccine.Vaccine;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxiaohan
 */
public class ManageSubInvJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSubInvJPanel
     */
    private JPanel userProcessContainer;
    private InventoryOrganization inventoryOrganization;
    private EcoSystem system;
    public ManageSubInvJPanel(JPanel userProcessContainer,InventoryOrganization inventoryOrganization,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.inventoryOrganization = inventoryOrganization;
        populateComb();
    }

    public void populateComb(){
        vacComboBox.removeAllItems();
        for(Vaccine vaccine : system.getVaccineCatalog()){
            vacComboBox.addItem(vaccine);
        }
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tbIn.getModel();
        
        model.setRowCount(0);
        
        for(Inventory inventory : inventoryOrganization.getInventoryList()){
            Object[] row = new Object[2];
            row[0] = inventory;
            row[1] = inventory.getNum();
            
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
        tbIn = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtQuan = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        vacComboBox = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();

        tbIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "vaccine name", "quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbIn);

        jLabel1.setText("quantity:");

        btnAdd.setText("add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Vaccine");

        vacComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vacComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please input quantity");
            return;
        }
        try{
            Integer.parseInt(txtQuan.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "please input a number");
        }
        if(Integer.parseInt(txtQuan.getText())<=0){
            JOptionPane.showMessageDialog(null, "please input an integer number>0");
        }
        Inventory in = new Inventory();
        Vaccine vac = (Vaccine) vacComboBox.getSelectedItem();
        in.setVaccine(vac);
        in.setNum(Integer.parseInt(txtQuan.getText()));
        int addNum = in.getNum();
        int oldNum = inventoryOrganization.searchInventory(vac).getNum();
        if(inventoryOrganization.searchInventory(vac)==null){
            inventoryOrganization.addInventory(in);
        }
        else{
            inventoryOrganization.searchInventory(vac).setNum(addNum+oldNum);
        }
        populateTable();
        txtQuan.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbIn.getSelectedRow();
        if (selectedRow<0) {
            return;
        }
        Inventory in = (Inventory)tbIn.getValueAt(selectedRow, 1);
        if(txtQuan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please input quantity");
            return;
        }
        try{
            Integer.parseInt(txtQuan.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "please input a number");
        }
        if(Integer.parseInt(txtQuan.getText())<=0){
            JOptionPane.showMessageDialog(null, "please input an integer number>0");
        }
        in.setNum(Integer.parseInt(txtQuan.getText()));
        txtQuan.setText("");
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbIn;
    private javax.swing.JFormattedTextField txtQuan;
    private javax.swing.JComboBox vacComboBox;
    // End of variables declaration//GEN-END:variables
}
