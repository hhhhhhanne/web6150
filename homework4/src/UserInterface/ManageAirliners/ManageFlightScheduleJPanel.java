/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airplane;
import Business.FlSchedule;
import Business.Flight;
import Business.MsSchedule;
import UserInterface.ManageAirliners.ViewFlightJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxiaohan
 */
public class ManageFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerFlightScheduleJPanel
     */
    private FlSchedule flschedule;
    private JPanel CardSequenceJPanel;
    private Flight flight;
    private Airplane airplane;
    private MsSchedule msschedule;

    public ManageFlightScheduleJPanel(JPanel CardSequenceJPanel, FlSchedule flschedule,String name,MsSchedule msschedule) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.flschedule = flschedule;
        this.msschedule = msschedule;

        populateTable();
    }

    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMs.getModel();
        dtm.setRowCount(0);
        
        //
//        if(flschedule.getFlschedule() == null || flschedule.getFlschedule().size() == 0){
//        	JOptionPane.showMessageDialog(null,"No flight has been created","Warning",JOptionPane.WARNING_MESSAGE );//若未创建flight应报错
//        	return;
//        }
        //
        
        for(Flight flight:flschedule.getFlschedule()){
            Object[] row = new Object[11];
            row[0] = flight.getSerialNumber();
            row[1] = flight.getAirplane().getModelNumber();
            row[2] = flight.getTakeoffdate();
            row[3] = flight.getTakeofftime();
            row[4] = flight.getAirplane().getManufacturer();
            row[5] = flight.getAirplane().getManufacturedYear();
            row[6] = flight.getTakeoffairport();
            row[7] = flight.getArriveairport();
            row[8] = flight.getAirplane().getSeatnum();
            row[9] = flight.getAirplane().getAirlinerName();
            row[10] = flight;
            dtm.addRow(row);
        }
    }
    
    public void refreshTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblMs.getModel();
        dtm.setRowCount(0);
        for(Flight flight:flschedule.getFlschedule()){
            Object[] row = new Object[11];
            row[0] = flight.getSerialNumber();
            row[1] = flight.getAirplane().getModelNumber();
            row[2] = flight.getTakeoffdate();
            row[3] = flight.getTakeofftime();
            row[4] = flight.getAirplane().getManufacturer();
            row[5] = flight.getAirplane().getManufacturedYear();
            row[6] = flight.getTakeoffairport();
            row[7] = flight.getArriveairport();
            row[8] = flight.getAirplane().getSeatnum();
            row[9] = flight.getAirplane().getAirlinerName();
            row[10] = flight;
            dtm.addRow(row);
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

        btnViewFlight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMs = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnViewFlight.setText("View flight detail");
        btnViewFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFlightActionPerformed(evt);
            }
        });

        tblMs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "serial number", "model number", "take off date", "take off time", "manufacturer", "manufactured year", "take off airport", "arrive airport", "seats number", "airliner name", "flightID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMs);

        btnDelete.setText("delete flight");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnViewFlight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewFlight)
                    .addComponent(btnDelete)
                    .addComponent(btnBack))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFlightActionPerformed
        // TODO add your handling code here:
    	int index = tblMs.getSelectedRow();
    	//
    	if(index==-1){
    		JOptionPane.showMessageDialog(null,"Please select a row","Warning",JOptionPane.WARNING_MESSAGE );//未选需报错
    		return;
    	}
    	flight = flschedule.getFlschedule().get(index);//flight置为选中的flight
    	//
        ViewFlightJPanel panel = new ViewFlightJPanel(CardSequenceJPanel,flight);
        CardSequenceJPanel.add("ViewFlightJPanel",panel);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnViewFlightActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMs.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "would you like to delete the flight?","Waring",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                String deflightID = tblMs.getValueAt(selectedRow, 10).toString();
                flschedule.deleteFlight(deflightID);
                msschedule.deleteFlight(deflightID);
                populateTable();
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row","Warning",JOptionPane.WARNING_MESSAGE );
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewFlight;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMs;
    // End of variables declaration//GEN-END:variables

}
