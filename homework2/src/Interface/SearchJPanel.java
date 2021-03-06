/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Airline.Airliner;
import Airline.Airplane;
import java.awt.Dialog;
import java.util.Arrays;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxiaohan
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FilterJPanel
     */
    private Airliner al;
    private Airliner temp;
    JFrame secFrame = new JFrame();
    boolean first;
    public SearchJPanel(Airliner al, boolean first) {
        initComponents();
        this.al = al;
        this.first = first;
        
        jButton1.setVisible(first);
    }
    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblAllAp.getModel();
        dtm.setRowCount(0);
        
        for(Airplane airp:this.temp.getAirliner()){
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

        btgsea = new javax.swing.ButtonGroup();
        myTxt = new javax.swing.JTextField();
        minTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maxTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        serTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        modTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        portTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        firR = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        curR = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        boeR = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        amR = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        myR = new javax.swing.JRadioButton();
        seatsR = new javax.swing.JRadioButton();
        serR = new javax.swing.JRadioButton();
        modR = new javax.swing.JRadioButton();
        portR = new javax.swing.JRadioButton();
        cerR = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAllAp = new javax.swing.JTable();
        ansLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(659, 700));

        jLabel1.setText("manufactured year");

        jLabel2.setText("min seats");

        jLabel3.setText("max seats");

        jLabel4.setText("serial number");

        jLabel5.setText("model number");

        jLabel6.setText("airport(search for available)");

        jLabel7.setText("have expired maintenance certificate");

        searchBtn.setText("search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        btgsea.add(firR);

        jLabel8.setText("first available");

        btgsea.add(curR);

        jLabel9.setText("current available");

        btgsea.add(boeR);

        jLabel10.setText("Boeing made");

        btgsea.add(amR);

        jLabel11.setText("how many manufacturers? (answer will display in the answer label)");

        btgsea.add(myR);

        btgsea.add(seatsR);

        btgsea.add(serR);

        btgsea.add(modR);

        btgsea.add(portR);

        btgsea.add(cerR);

        jButton1.setText("need a secondary filter? search from the results!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        ansLbl.setBackground(new java.awt.Color(255, 255, 255));
        ansLbl.setText("answer label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(curR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boeR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(amR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(seatsR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(myR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(myTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(maxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(serR)
                                        .addComponent(modR))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ansLbl)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(searchBtn))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(modTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(serTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(cerR)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel7))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(portR)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(6, 6, 6)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(firR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(amR)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(curR)
                        .addComponent(jLabel9))
                    .addComponent(myR)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(myTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boeR)
                            .addComponent(jLabel10))
                        .addComponent(seatsR))
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(maxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portR)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(serTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(modTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerR)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBtn)
                    .addComponent(ansLbl))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {firR, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {curR, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {boeR, jLabel10});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amR, jLabel11});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, myR});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3, maxTxt, minTxt, seatsR});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, serR, serTxt});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, modR, modTxt});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel6, portR, portTxt});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cerR, jLabel7});

    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tblAllAp.getModel();
        dtm.setRowCount(0);
        if(firR.isSelected()) //search for the first available airplane
        {
            Airplane tempa = al.getAirliner().get(0);
            for(Airplane airp:al.getAirliner()){
                if(tempa.getTakeOffTime().after(airp.getTakeOffTime()))
                {
                    tempa = airp;
                }
            }
            temp = new Airliner();
            temp.addAirplane(tempa);
            populateTable();
        }
        else if(curR.isSelected())  //search all the current available airplanes
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.isAvailability())
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(boeR.isSelected())  //search for all airplanes made by Boeing
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.getManufacturer().equals("Boeing"))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(serR.isSelected())  //search a given serial number
        {
            
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.getSerialNumber() == (Integer.parseInt(serTxt.getText())))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(modR.isSelected())  //search a given model number
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.getModelNumber() == (Integer.parseInt(modTxt.getText())))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(amR.isSelected())  //how many manufactures
        {
            String[] am = new String[100];
            String[] amtemp = new String[100];
            for(int i = 0 ; i < al.getAirliner().size();i++){
                am[i] = al.getAirliner().get(i).getManufacturer();  
            }
            int j = 0;
            for(int i = 0; i< am.length; i++){
                String strtemp = am[i];
                if(Arrays.asList(amtemp).indexOf(strtemp)<0){  
                    amtemp[j]=strtemp;
                    j++;
                }
            }
            if(j-1>0){
            ansLbl.setText("there are " + String.valueOf(j-1) + "manufacturers");}
        }
        else if(myR.isSelected()) //search for a given the manufactruing year
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.getManufacturedYear() == (Integer.parseInt(myTxt.getText())))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(seatsR.isSelected())  //search for a given range of seats
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if((airp.getSeats() > (Integer.parseInt(minTxt.getText()))) && (airp.getSeats() < (Integer.parseInt(maxTxt.getText()))))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else if(portR.isSelected())  //search airplanes for an available airport
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if((airp.getAirport().equalsIgnoreCase(portTxt.getText())) && (airp.isAvailability()))
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                    System.out.println(tempa.getAirport());
                }
            }
            populateTable();
        }
        else if(cerR.isSelected())  //search for airplanes have expired maintenance certificates
        {
            Airplane tempa =null;
            temp = new Airliner();
            for(Airplane airp:al.getAirliner()){
                if(airp.isCertificate())
                {
                    tempa = airp;
                    temp.addAirplane(tempa);
                }
            }
            populateTable();
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"please select a search option");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        JDialog jd = new JDialog((JFrame)SwingUtilities.getWindowAncestor(this), Dialog.ModalityType.APPLICATION_MODAL);
        SearchJPanel secondSearch = new SearchJPanel(temp, false);
        jd.add(secondSearch);
        jd.pack();
        jd.setLocationRelativeTo(this);
        jd.setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton amR;
    private javax.swing.JLabel ansLbl;
    private javax.swing.JRadioButton boeR;
    private javax.swing.ButtonGroup btgsea;
    private javax.swing.JRadioButton cerR;
    private javax.swing.JRadioButton curR;
    private javax.swing.JRadioButton firR;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxTxt;
    private javax.swing.JTextField minTxt;
    private javax.swing.JRadioButton modR;
    private javax.swing.JTextField modTxt;
    private javax.swing.JRadioButton myR;
    private javax.swing.JTextField myTxt;
    private javax.swing.JRadioButton portR;
    private javax.swing.JTextField portTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JRadioButton seatsR;
    private javax.swing.JRadioButton serR;
    private javax.swing.JTextField serTxt;
    private javax.swing.JTable tblAllAp;
    // End of variables declaration//GEN-END:variables
}
