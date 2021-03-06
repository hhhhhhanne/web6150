/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.GovernmentRole;

import Business.Account.Account;
import Business.Business;
import Business.Network.Network;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Interface.Monitor.MonitorBenefit;
import Interface.Monitor.MonitorInventory;
import Interface.Monitor.MonitorPlan;
import Interface.Monitor.MonitorTransfer;
import Interface.SystemAdmin.ManageNetworkJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chance
 */
public class MonitorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MonitorJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private Account account;
    private InventoryOrganization organization;
    private Network network = null;
    public MonitorJPanel(JPanel userProcessContainer, Account account, Organization organization, Business business, int index) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.organization = (InventoryOrganization)organization;
        
        for(Network ntw : this.business.getNetworkList()) {
            if(ntw.getStateAccount().getUsername().equals(account.getUsername()) &&
                    ntw.getStateAccount().getPassword().equals(account.getPassword())) {
                this.network = ntw;
                break;
            }
        }
        init();
        monitorTabbedPanel.setSelectedIndex(index);
    }
    
    public void init() {

        MonitorPlan mon1 = new MonitorPlan(userProcessContainer, account, organization, network, business);
        monitorTabbedPanel.addTab("Plan", null, mon1, "Plan");
              
        MonitorBenefit mon2 = new MonitorBenefit(userProcessContainer, account, organization, network, business);
        monitorTabbedPanel.addTab("Benefit", null, mon2, "Benefit");
        
        MonitorInventory mon3 = new MonitorInventory(userProcessContainer, account, organization, network, business);
        monitorTabbedPanel.addTab("Inventory", null, mon3, "Inventory");
        
        MonitorTransfer mon4 = new MonitorTransfer(userProcessContainer, account, organization, network, business);
        monitorTabbedPanel.addTab("Transfer", null, mon4, "Transfer");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        monitorTabbedPanel = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(monitorTabbedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(monitorTabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane monitorTabbedPanel;
    // End of variables declaration//GEN-END:variables
}
