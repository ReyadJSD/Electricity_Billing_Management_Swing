/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaSwingProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author LENOVO X1 Carbon
 */
public class ReceiptGenerate extends javax.swing.JPanel {
    JpanelLoader loader;
    public ReceiptGenerate() {
        loader = new JpanelLoader();
        initComponents();
        selectMeterNoFromDB();
        selectMonthFromDB();
        selectEmployeeIdFromDB();
    }
   
    public void selectMeterNoFromDB() {
        //Add Meter No from Database in Form
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select meter_no From customers");
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                meterNo3.addItem(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void selectMonthFromDB() {
        //Add Meter No from Database in Form
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select month From payment_status Where meter_no = ?");
            pst.setInt(1, Integer.parseInt(meterNo3.getSelectedItem().toString()));
            if (month3.getItemCount() > 0) {
                month3.removeAllItems();
            }
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                month3.addItem(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void selectEmployeeIdFromDB() {
        //Add Meter No from Database in Form
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select user_id From admin");
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                receiverId.addItem(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPannel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        meterNo3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        month3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        receiverId = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Meter No:");

        meterNo3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meterNo3ItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Month:");

        jButton4.setText("Generate Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("----Click on Generate Bill Button---- ");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setText("To get bill of the selected meter no and month ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Bill Receiver Id:");

        javax.swing.GroupLayout mainPannelLayout = new javax.swing.GroupLayout(mainPannel);
        mainPannel.setLayout(mainPannelLayout);
        mainPannelLayout.setHorizontalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel15))
                    .addComponent(jLabel16))
                .addGap(48, 48, 48))
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(meterNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(month3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(receiverId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPannelLayout.setVerticalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(meterNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(month3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(receiverId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(817, 817, 817))
        );

        jScrollPane1.setViewportView(mainPannel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:  
        ReceiptGenerate2 rg2 = new ReceiptGenerate2(Integer.parseInt(meterNo3.getSelectedItem().toString()),month3.getSelectedItem().toString(),Integer.parseInt(receiverId.getSelectedItem().toString()));
        loader.jPanelLoader(mainPannel, rg2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void meterNo3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meterNo3ItemStateChanged
        // TODO add your handling code here:
        selectMonthFromDB();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From payment_status Where meter_no = ?");
            pst.setString(1, meterNo3.getSelectedItem().toString());
            ResultSet res = pst.executeQuery();
            while (res.next()) {
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_meterNo3ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JComboBox<String> meterNo3;
    private javax.swing.JComboBox<String> month3;
    private javax.swing.JComboBox<String> receiverId;
    // End of variables declaration//GEN-END:variables
}
