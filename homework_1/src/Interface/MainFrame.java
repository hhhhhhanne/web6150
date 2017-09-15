/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Profile.Account;
import Profile.Address;
import Profile.CreditCard;
import Profile.FinancialAccount;
import Profile.License;
import Profile.Person;
import javax.swing.JFrame;

/**
 *
 * @author zhaoxiaohan
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private Person person;
    private Address address;
    private License license;
    private CreditCard creditCard;
    private FinancialAccount financialAccount;
    private Account account;
    JFrame spouseFrame = new JFrame();
    JFrame viewSpouseFrame = new JFrame();

    private Person spouse;
    private Address saddress;
    private License slicense;
    private CreditCard screditCard;
    private FinancialAccount sfinancialAccount;
    private Account saccount;
    
    public MainFrame() {
        initComponents();
        person = new Person();
        address = new Address();
        person.setAddress(address);
        license = new License();
        person.setLicense(license);
        creditCard = new CreditCard();
        person.setCreditCard(creditCard);
        account = new Account();
        financialAccount = new FinancialAccount();
        person.setFinancialAccount(financialAccount);
        person.financialAccount.setChecking(account);
        person.financialAccount.setSaving(account);
        
        spouse = new Person();
        address = new Address();
        spouse.setAddress(address);
        license = new License();
        spouse.setLicense(license);
        creditCard = new CreditCard();
        spouse.setCreditCard(creditCard);
        account = new Account();
        financialAccount = new FinancialAccount();
        spouse.setFinancialAccount(financialAccount);
        spouse.financialAccount.setChecking(account);
        spouse.financialAccount.setSaving(account);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        spouseBtn = new javax.swing.JButton();
        viewSpouseBtn = new javax.swing.JButton();
        displayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPanel.setDividerLocation(50);
        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        titleLbl.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        titleLbl.setText("Person Profile");

        createBtn.setText("create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        viewBtn.setText("view");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        spouseBtn.setText("spouse");
        spouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseBtnActionPerformed(evt);
            }
        });

        viewSpouseBtn.setText("view spouse");
        viewSpouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSpouseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spouseBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewSpouseBtn)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLbl)
                    .addComponent(createBtn)
                    .addComponent(viewBtn)
                    .addComponent(spouseBtn)
                    .addComponent(viewSpouseBtn))
                .addGap(6, 6, 6))
        );

        splitPanel.setTopComponent(controlPanel);

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displayPanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        CreatePanel createPanel = new CreatePanel(person,address,license,creditCard,financialAccount,account);        // TODO add your handling code here:
        splitPanel.setBottomComponent(createPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(person,address,license,creditCard,financialAccount,account);
        splitPanel.setBottomComponent(viewPanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void spouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseBtnActionPerformed
        // TODO add your handling code here:
        CreatePanel createPanel = new CreatePanel(spouse,saddress,slicense,screditCard,sfinancialAccount,saccount); 
        splitPanel.setBottomComponent(createPanel);
        if(spouseFrame.isVisible()){
            spouseFrame.setVisible(true);
            spouseFrame.setContentPane(createPanel);
        }
        else{
            spouseFrame.setVisible(false);
        }
    }//GEN-LAST:event_spouseBtnActionPerformed

    private void viewSpouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSpouseBtnActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(spouse,saddress,slicense,screditCard,sfinancialAccount,saccount);
        splitPanel.setBottomComponent(viewPanel);
        if(viewSpouseFrame.isVisible()){
            viewSpouseFrame.setVisible(true);
            viewSpouseFrame.setContentPane(viewPanel);
        }
        else{
            viewSpouseFrame.setVisible(false);
        }
    }//GEN-LAST:event_viewSpouseBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton spouseBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewSpouseBtn;
    // End of variables declaration//GEN-END:variables
}
