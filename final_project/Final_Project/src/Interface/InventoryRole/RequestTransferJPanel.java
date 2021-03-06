/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.InventoryRole;

import Business.Account.Account;
import Business.Business;
import Business.Enterprise.FoodBank;
import Business.Enterprise.Government;
import Business.Food.Food;
import Business.Request.FoodRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhaoxiaohan
 */
public class RequestTransferJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestTransferJPanel
     */
    private JPanel userProcessContainer;
    private FoodBank foodBank;
    private Account account;
    private Business business;
    private Government government;
    public RequestTransferJPanel(JPanel userProcessContainer,Account account,FoodBank foodBank,Business business, Government government) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.foodBank = foodBank;
        this.government = government;
        System.out.println("Government Hash from Request transfer:"+this.government.hashCode());
        populateComb();
    }

    public void populateComb(){
        foodComboBox.removeAllItems();
        for(Food food:this.business.getFoodCatalog()){
            foodComboBox.addItem(food);
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

        requestOrderJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        foodComboBox = new javax.swing.JComboBox();
        quanTextField = new javax.swing.JTextField();

        requestOrderJButton.setText("Request Transfer");
        requestOrderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestOrderJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Food name");

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backJButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(requestOrderJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quanTextField))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(foodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(quanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(requestOrderJButton))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestOrderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestOrderJButtonActionPerformed

            Food f = (Food)foodComboBox.getSelectedItem();
            String quantity = quanTextField.getText();
            if (quantity.equals("")) {
                JOptionPane.showMessageDialog(null, "please input real quantity");
                return;
            }
            try {
                int q = Integer.parseInt(quantity);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "please input real quantity");
                return;
            }
            if ((Integer.parseInt(quantity)) <= 0) {
                JOptionPane.showMessageDialog(null, "please input real quantity");
                return;
            }
            FoodRequest request = new FoodRequest();
            request.setFood(f);
            request.setQuantity(Integer.parseInt(quantity));
            request.setSender(account);
            request.setStatus("Sent");
            request.setEnterprise(foodBank);
            business.getFoodTransRequestList().addFoodRequest(request);

        JOptionPane.showMessageDialog(null, "request successfully");
    }//GEN-LAST:event_requestOrderJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TransferJPanel transferJPanel = (TransferJPanel) component;
        transferJPanel.populateFoodBankTransferRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox foodComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField quanTextField;
    private javax.swing.JButton requestOrderJButton;
    // End of variables declaration//GEN-END:variables
}
