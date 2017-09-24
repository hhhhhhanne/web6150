/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airline.Airliner;
import Airline.Airplane;
import Airline.Utl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxiaohan
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    private Airliner al;
    public ViewJPanel(Airliner al) {
        initComponents();
        this.al=al;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblAllAp.getModel();
        dtm.setRowCount(0);
        
        for(Airplane airp:al.getAirliner()){
            Object row[] = new Object[10];
            row[0] = airp;
            row[1] = airp.getModelNumber();
            row[2] = airp.getTakeOffTime();
            row[3] = airp.getManufacturer();
            row[4] = airp.getAirport();
            row[5] = airp.isAvailability();
            row[6] = airp.getSeats();
            row[7] = airp.isCertificate();
            row[8] = airp.getManufacturedYear();
            row[9] = airp.getUpdateTime();
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

        btgcer = new javax.swing.ButtonGroup();
        btgava = new javax.swing.ButtonGroup();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        modNumTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        manYearTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        takTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        updTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        portTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        avaRadio = new javax.swing.JRadioButton();
        yesRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        unaRadio = new javax.swing.JRadioButton();
        noRadio = new javax.swing.JRadioButton();
        serNumTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        seatsTxt = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllAp = new javax.swing.JTable();

        jButton14.setText("update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("delete");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel2.setText("model number:");

        jLabel3.setText("manufacturer:");

        jLabel4.setText("seats:");

        jLabel5.setText("expired maintenance certificate:");

        jLabel6.setText("availability:");

        jLabel7.setText("manufactured year:");

        updTxt.setEditable(false);
        updTxt.setText("set automatically");

        jLabel8.setText("take-off time:");

        jLabel9.setText("airport:");

        btgava.add(avaRadio);
        avaRadio.setText("available");

        btgcer.add(yesRadio);
        yesRadio.setText("yes");

        jLabel10.setText("catalog updated time:");

        btgava.add(unaRadio);
        unaRadio.setText("unavailable");

        btgcer.add(noRadio);
        noRadio.setText("no");

        jLabel1.setText("serial number:");

        jButton10.setText("detail");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tblAllAp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "serial number", "model number", "take-off time", "manufacturer", "airport", "availability", "seats", "certificate", "manufactured year", "update time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAllAp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(manYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(takTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(avaRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(unaRadio))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yesRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(noRadio))
                                .addComponent(manTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(serNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(275, 275, 275)
                            .addComponent(jButton14))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15)
                    .addComponent(jButton10))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(manTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(seatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yesRadio)
                    .addComponent(noRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(avaRadio)
                    .addComponent(unaRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(manYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(takTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(updTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {avaRadio, jLabel1, jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, manTxt, manYearTxt, modNumTxt, noRadio, portTxt, seatsTxt, serNumTxt, takTxt, unaRadio, updTxt, yesRadio});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        int selectedrow = tblAllAp.getSelectedRow();
        
        if(selectedrow >=0)
        {
            Airplane airp = new Airplane();
            airp = (Airplane)tblAllAp.getValueAt(selectedrow, 0);
            serNumTxt.setText(String.valueOf(airp.getSerialNumber()));
            modNumTxt.setText(String.valueOf(airp.getModelNumber()));
            portTxt.setText(String.valueOf(airp.getAirport()));
            seatsTxt.setText(String.valueOf(airp.getSeats()));
            manTxt.setText(String.valueOf(airp.getManufacturer()));
            manYearTxt.setText(String.valueOf(airp.getManufacturedYear()));
            updTxt.setText(sdf.format(airp.getUpdateTime()));
            takTxt.setText(sdf.format(airp.getTakeOffTime()));
            if(airp.isAvailability()){
                avaRadio.setSelected(true);
            }
            else{
                unaRadio.setSelected(true);
            }
            if(airp.isCertificate()){
                yesRadio.setSelected(true);
            }
            else{
                noRadio.setSelected(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblAllAp.getSelectedRow();
        
        if(selectedrow >=0)
        {
            Airplane airp = (Airplane)tblAllAp.getValueAt(selectedrow, 0);
            al.deteleAirplane(airp);
            JOptionPane.showMessageDialog(null,"Airplane has been deleted ");
            populateTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select any row");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat d1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Utl utl = new Utl();
        Airplane ap = al.addAirplane();
        int selectedrow = tblAllAp.getSelectedRow();
        Airplane old = (Airplane)tblAllAp.getValueAt(selectedrow, 0);
        al.deteleAirplane(old);
        Date updateTime = new Date();
        Date takeOffTime = utl.getStringtoDate(takTxt.getText(), "take-off time date format should be yyyy-MM-dd HH:mm");
        int serialNumber = utl.getStringtoInt(serNumTxt.getText(),"(serial number)please input number");
        int modelNumber = utl.getStringtoInt(modNumTxt.getText(),"(model number)please input number");
        String manufacturer = manTxt.getText();
        String airport = portTxt.getText();
        int seats = utl.getStringtoInt(seatsTxt.getText(),"(seats)please input number");
        int manufacturedYear = utl.getStringtoInt(manYearTxt.getText(),"(manufactured year)please input number");
        if(!((yesRadio.isSelected())||(noRadio.isSelected())))
        {
            JOptionPane.showMessageDialog(null,"please select certificate condition");
        }
            else if(yesRadio.isSelected()){
            boolean certificate = true;
            ap.setCertificate(certificate);
        }
        else{
            boolean certificate = false;
            ap.setCertificate(certificate);
        }
        if(!((avaRadio.isSelected())||(unaRadio.isSelected()))){
            JOptionPane.showMessageDialog(null,"please select availability condition");
        }
        if(avaRadio.isSelected()){
            boolean availability = true;
            ap.setAvailability(availability);
        }
        else{
            boolean availability = false;
            ap.setAvailability(availability);
        }
        ap.setAirport(airport);
        ap.setManufacturedYear(manufacturedYear);
        ap.setManufacturer(manufacturer);
        ap.setModelNumber(modelNumber);
        ap.setSeats(seats);
        ap.setSerialNumber(serialNumber);
        ap.setTakeOffTime(takeOffTime);
        ap.setUpdateTime(updateTime);
        if( (ap.getAirport() == null) || (ap.getSerialNumber() == 0) || (ap.getModelNumber() == 0) || (ap.getManufacturer() == null) || 
                (ap.getManufacturedYear() == 0) || !(avaRadio.isSelected()||unaRadio.isSelected()) || !(yesRadio.isSelected()||noRadio.isSelected())
                || ap.getTakeOffTime().equals(d1.format(new Date())) )
        {
            al.deteleAirplane(ap);
        }else
        {
            JOptionPane.showMessageDialog(null, "Airplane Added successfully");
        }
        updTxt.setText("");
        takTxt.setText("");
        serNumTxt.setText("");
        modNumTxt.setText("");
        manTxt.setText("");
        portTxt.setText("");
        seatsTxt.setText("");
        manYearTxt.setText("");
        btgava.clearSelection();
        btgcer.clearSelection();
        populateTable();
    }//GEN-LAST:event_jButton14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton avaRadio;
    private javax.swing.ButtonGroup btgava;
    private javax.swing.ButtonGroup btgcer;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manTxt;
    private javax.swing.JTextField manYearTxt;
    private javax.swing.JTextField modNumTxt;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JTextField portTxt;
    private javax.swing.JTextField seatsTxt;
    private javax.swing.JTextField serNumTxt;
    private javax.swing.JTextField takTxt;
    private javax.swing.JTable tblAllAp;
    private javax.swing.JRadioButton unaRadio;
    private javax.swing.JTextField updTxt;
    private javax.swing.JRadioButton yesRadio;
    // End of variables declaration//GEN-END:variables
}
