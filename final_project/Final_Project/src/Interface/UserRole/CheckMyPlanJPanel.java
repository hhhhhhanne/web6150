/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.UserRole;

import Business.Account.Account;
import Business.Account.Account.AccountStatus;
import Business.Business;
import Business.Network.Network;
import Business.Person.BenefitPerson;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhaoxiaohan
 */
public class CheckMyPlanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MyPlanJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private Account account;
    private Network network;
    public CheckMyPlanJPanel(JPanel userProcessContainer, Business business, Network network, Account account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.network = network;
        BenefitPerson bp =(BenefitPerson) account.getPerson();
        txtPlan.setText(bp.getPlanAssign().getName());
        txtLimit.setText(String.valueOf(bp.getPlanAssign().getBenefit()));
        txtBa.setText(String.valueOf(bp.getBalance()));
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
        jLabel2 = new javax.swing.JLabel();
        txtLimit = new javax.swing.JTextField();
        txtBa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlan = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRevoke = new javax.swing.JButton();

        jLabel1.setText("Balance:");

        jLabel2.setText("Limit:");

        txtLimit.setEnabled(false);

        txtBa.setEnabled(false);

        jLabel3.setText("Plan:");

        txtPlan.setEnabled(false);

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRevoke.setText("Revoke this plan");
        btnRevoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRevokeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(62, 62, 62)
                        .addComponent(btnRevoke))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(22, 22, 22)
                            .addComponent(txtBa, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPlan, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(txtLimit)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRevoke))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRevokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRevokeActionPerformed
        // TODO add your handling code here:
        account.setStatus(AccountStatus.Registered);
        JOptionPane.showMessageDialog(null, "revoke successfully, you can apply a plan again");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UserWorkArea userWorkArea = (UserWorkArea) component;
        userWorkArea.showStatus();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnRevokeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRevoke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBa;
    private javax.swing.JTextField txtLimit;
    private javax.swing.JTextField txtPlan;
    // End of variables declaration//GEN-END:variables
}
