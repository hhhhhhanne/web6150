/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airplane;
import Business.Flight;
import Business.Seat;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

/**
 *
 * @author zhaoxiaohan
 */
public class ViewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirlinerJPanel
     */
    private JPanel CardSequenceJPanel;
    private Flight flight;
    
    public ViewFlightJPanel(JPanel CardSequenceJPanel,Flight flight) {
    	//
    	this.flight = flight;//initǰ��ֵ
    	//
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        populateFlightDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }

    private void populateFlightDetails(){
        txtFlightID.setText(flight.getFlightID());
        
        txtTakeOffAirport.setText(flight.getTakeoffairport());
        
        txtArrivalAirport.setText(flight.getArriveairport());
        
        txtTakeOffDate.setText(flight.getTakeoffdate());
        
        txtTakeOffTime.setText(flight.getTakeofftime());
        
        txtSerialNum.setText(flight.getAirplane().getSerialNumber());
        
        txtModNum.setText(""+flight.getAirplane().getModelNumber());
        
        txtSeats.setText(""+flight.getAirplane().getSeatnum());
        
        txtManu.setText(flight.getAirplane().getManufacturer());
        
        txtManuYear.setText(""+flight.getAirplane().getManufacturedYear());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtFlightID = new javax.swing.JTextField();
        txtTakeOffAirport = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtArrivalAirport = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtSerialNum = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtModNum = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtManu = new javax.swing.JTextField();
        txtManuYear = new javax.swing.JTextField();
        txtTakeOffDate = new javax.swing.JTextField();
        txtTakeOffTime = new javax.swing.JTextField();

        jLabel5.setText("Take off time:");

        btnBack.setText("<back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtFlightID.setEnabled(false);

        txtTakeOffAirport.setEnabled(false);

        jLabel1.setText("FlightID: ");

        txtArrivalAirport.setEnabled(false);

        jLabel2.setText("Take off Airport:");

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Arrival Airport:");

        jLabel6.setText("View Flight Detail");

        jLabel4.setText("Take off date:");

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setText("serial number:");

        txtSerialNum.setEnabled(false);

        jLabel8.setText("model number:");

        jLabel9.setText("seats number:");

        jLabel10.setText("manufacturer:");

        jLabel11.setText("manufacture year:");

        txtModNum.setEnabled(false);

        txtSeats.setEnabled(false);

        txtManu.setEnabled(false);

        txtManuYear.setEnabled(false);

        txtTakeOffDate.setEnabled(false);

        txtTakeOffTime.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArrivalAirport, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(txtTakeOffAirport)
                            .addComponent(txtFlightID)
                            .addComponent(txtTakeOffDate)
                            .addComponent(txtTakeOffTime))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel11)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSerialNum)
                            .addComponent(txtModNum)
                            .addComponent(txtSeats)
                            .addComponent(txtManu)
                            .addComponent(txtManuYear, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnBack))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFlightID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTakeOffAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtModNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArrivalAirport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTakeOffDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(txtManuYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTakeOffTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents



	private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        Component[] componentArray = CardSequenceJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightScheduleJPanel manageFlightScheduleJPanel = (ManageFlightScheduleJPanel) component;
        manageFlightScheduleJPanel.refreshTable();
        CardLayout layout = (CardLayout) CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtFlightID.setEnabled(true);
        
        txtTakeOffAirport.setEnabled(true);
        
        txtArrivalAirport.setEnabled(true);
        
        txtTakeOffDate.setEnabled(true);
        
        txtTakeOffTime.setEnabled(true);
        
        txtSerialNum.setEnabled(true);
        
        txtModNum.setEnabled(true);
        
        txtSeats.setEnabled(true);
        
        txtManu.setEnabled(true);
       
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String flightID = txtFlightID.getText();
        String takeoffairport = txtTakeOffAirport.getText();
        String arrivalairport = txtArrivalAirport.getText();
        String takeoffdate = txtTakeOffDate.getText();
        String takeofftime = txtTakeOffTime.getText();
        String serialNum = txtSerialNum.getText();
        String modelNum = txtModNum.getText();
        String seatsNum = txtSeats.getText();
        String manufacturer = txtManu.getText();
        String manufactureYear = txtManuYear.getText();
        try{
            int number1 = Integer.parseInt(manufactureYear);
            int number2 = Integer.parseInt(seatsNum);
            int number3 = Integer.parseInt(modelNum);
            Date dateTime = new Date();
            SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
            dateTime = d1.parse(takeoffdate);
            SimpleDateFormat d2 = new SimpleDateFormat("HH:mm");
            Date timeTime = new Date();
            timeTime = d2.parse(takeofftime);
        }
        catch (ParseException e) { 
            JOptionPane.showMessageDialog(null, "date format:yyyy-MM-dd time format:HH:mm");
            return;
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "please enter with right format");
            return;
        }
        flight.setFlightID(flightID);
        flight.setTakeoffairport(takeoffairport);
        flight.setSerialNumber(serialNum);
        flight.setTakeoffdate(takeoffdate);
        flight.setArriveairport(arrivalairport);
        flight.setTakeofftime(takeofftime);
        flight.getAirplane().setManufacturer(manufacturer);
        flight.getAirplane().setModelNumber(Integer.parseInt(modelNum));
        flight.getAirplane().setSeatnum(Integer.parseInt(seatsNum));
        flight.getAirplane().setManufacturedYear(Integer.parseInt(manufactureYear));
        flight.getAirplane().setSerialNumber(serialNum);
        
        JOptionPane.showMessageDialog(null, "Flight updated");
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtArrivalAirport;
    private javax.swing.JTextField txtFlightID;
    private javax.swing.JTextField txtManu;
    private javax.swing.JTextField txtManuYear;
    private javax.swing.JTextField txtModNum;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNum;
    private javax.swing.JTextField txtTakeOffAirport;
    private javax.swing.JTextField txtTakeOffDate;
    private javax.swing.JTextField txtTakeOffTime;
    // End of variables declaration//GEN-END:variables
}