package com.javaSwingProject;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CalculateBill extends javax.swing.JPanel {

    public CalculateBill() {
        initComponents();
        selectMeterNoFromDB();
        meterRentAutoAdd();
    }

    public void selectMeterNoFromDB() {
        //Add Meter No from Database in Form
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select meter_no From customers");
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                meterNo.addItem(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meterNo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        units = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        billPerUnit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        meterCharge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        meterType = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lastMonth = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        currentMonth = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        netBill = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculate Bill", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Meter No:");

        meterNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meterNoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Units Consumed:");

        units.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitsKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bill Per Unit:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Meter Rent Charge:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Meter Type:");

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tax:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Month:");

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Bill:");

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Last Month Units:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Current Month Units:");

        currentMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                currentMonthKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Net Bill:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Payment Status:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Calculate Bill For 30 Days");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(currentMonth, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(lastMonth)))
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address)
                            .addComponent(name)
                            .addComponent(meterType)
                            .addComponent(meterNo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 145, Short.MAX_VALUE))))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(payment)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(100, 100, 100)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(billPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(meterCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(netBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(171, 171, 171))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(netBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(meterCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(meterType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(currentMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(billPerUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(meterNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void meterNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meterNoItemStateChanged
        // Add Customer Details in form from Database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From customers Where meter_no = ?");
            pst.setString(1, meterNo.getSelectedItem().toString());
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                name.setText(res.getString(1));
                address.setText(res.getString(6));
                meterType.setText(res.getString(4));
                units.setText("");
                billPerUnit.setText("");
                tax.setText("");
                total.setText("");
                lastMonth.setText("");
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From bill_details Where meter_no = ?");
            pst.setString(1, meterNo.getSelectedItem().toString());
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                lastMonth.setText(res.getString(6));
                month.setSelectedItem(res.getString(12));
                currentMonth.setText("");
                netBill.setText("");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        meterRentAutoAdd();
    }//GEN-LAST:event_meterNoItemStateChanged
    public void meterRentAutoAdd() {
        Double meterRent;
        if (meterType.getText().equals("Residential")) {
            meterCharge.setText(String.valueOf(meterRent = 45.0));
            payment.setText("Not Paid");
        } else if (meterType.getText().equals("Business")) {
            meterCharge.setText(String.valueOf(meterRent = 75.0));
            payment.setText("Not Paid");
        } else {
            meterCharge.setText(String.valueOf(meterRent = 150.0));
            payment.setText("Not Paid");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (units.getText().isEmpty()) {
            total.setText("");
        } else {
            double total2 = Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()) + Double.parseDouble(meterCharge.getText()) + Double.parseDouble(tax.getText());
            total.setText(String.valueOf(Math.round(total2)));
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void unitsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitsKeyReleased

    }//GEN-LAST:event_unitsKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("INSERT INTO bill_details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(meterNo.getSelectedItem().toString()));
            pst.setString(2, name.getText());
            pst.setString(3, address.getText());
            pst.setString(4, meterType.getText());
            pst.setDouble(5, Double.parseDouble(lastMonth.getText()));
            pst.setDouble(6, Double.parseDouble(currentMonth.getText()));
            pst.setDouble(7, Double.parseDouble(units.getText()));
            pst.setDouble(8, Double.parseDouble(billPerUnit.getText()));
            pst.setDouble(9, Double.parseDouble(netBill.getText()));
            pst.setDouble(10, Double.parseDouble(meterCharge.getText()));
            pst.setDouble(11, Double.parseDouble(tax.getText()));
            pst.setString(12, month.getSelectedItem().toString());
            pst.setDouble(13, Double.parseDouble(total.getText()));
            pst.setString(14, payment.getText());
            pst.executeUpdate();
            
            
            PreparedStatement pst1 = con.prepareStatement("Select * From bill_details where meter_no = ?");
            pst1.setInt(1, Integer.parseInt(meterNo.getSelectedItem().toString()));
            ResultSet res = pst1.executeQuery();
            while(res.next()){
                lastMonth.setText(res.getString(6));
                currentMonth.setText("");
                units.setText("");
                billPerUnit.setText("");
                tax.setText("");
                netBill.setText("");
                total.setText("");
                
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void currentMonthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_currentMonthKeyReleased
        // TODO add your handling code here:
        if (currentMonth.getText().isEmpty()) {
            units.setText("");
        } else {
            double calculatUnits;
            calculatUnits = Double.parseDouble(currentMonth.getText()) - Double.parseDouble(lastMonth.getText());
            units.setText(String.valueOf(calculatUnits));
        }
        Double unitBill;
        Double unit;
        Double vat;

        if (units.getText().isEmpty() || (meterType.getText().equals("Residential") && Double.parseDouble(units.getText()) > 300 ||
                meterType.getText().equals("Business") && Double.parseDouble(units.getText()) > 300 || 
                meterType.getText().equals("Small Industrial") && Double.parseDouble(units.getText()) > 500)) {
                billPerUnit.setText("");
                netBill.setText("");
                tax.setText("");
                total.setText("");
        } else {

            if (meterType.getText().equals("Residential") && (Double.parseDouble(units.getText()) > 0 && Double.parseDouble(units.getText()) <= 75)) {
                billPerUnit.setText(String.valueOf(unitBill = 4.19));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.05;
                tax.setText(String.format("%.2f", tax2));
            } else if (meterType.getText().equals("Residential") && (Double.parseDouble(units.getText()) > 75 && Double.parseDouble(units.getText()) <= 200)) {
                billPerUnit.setText(String.valueOf(unitBill = 5.72));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.05;
                tax.setText(String.format("%.2f", tax2));
            } else if (meterType.getText().equals("Residential") && (Double.parseDouble(units.getText()) > 200 && Double.parseDouble(units.getText()) <= 300)) {
                billPerUnit.setText(String.valueOf(unitBill = 6.34));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.05;
                tax.setText(String.format("%.2f", tax2));

            } //Business Bill Calculate
            else if (meterType.getText().equals("Business") && Double.parseDouble(units.getText()) > 0 && Double.parseDouble(units.getText()) <= 75) {
                billPerUnit.setText(String.valueOf(unitBill = 7.70));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.07;
                tax.setText(String.format("%.2f", tax2));

            } else if (meterType.getText().equals("Business") && Double.parseDouble(units.getText()) > 75 && Double.parseDouble(units.getText()) <= 200) {
                billPerUnit.setText(String.valueOf(unitBill = 8.20));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.07;
                tax.setText(String.format("%.2f", tax2));
            } else if (meterType.getText().equals("Business") && Double.parseDouble(units.getText()) > 200 && Double.parseDouble(units.getText()) <= 300) {
                billPerUnit.setText(String.valueOf(unitBill = 9.20));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.07;
                tax.setText(String.format("%.2f", tax2));

            } //Small Industry Bill Calculate
            else if (meterType.getText().equals("Small Industrial") && Double.parseDouble(units.getText()) > 0 && Double.parseDouble(units.getText()) <= 150) {
                billPerUnit.setText(String.valueOf(unitBill = 8.53));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.10;
                tax.setText(String.format("%.2f", tax2));
            } else if (meterType.getText().equals("Small Industrial") && Double.parseDouble(units.getText()) > 150 && Double.parseDouble(units.getText()) <= 350) {
                billPerUnit.setText(String.valueOf(unitBill = 9.65));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.10;
                tax.setText(String.format("%.2f", tax2));
            } else if (meterType.getText().equals("Small Industrial") && Double.parseDouble(units.getText()) > 350 && Double.parseDouble(units.getText()) <= 500) {
                billPerUnit.setText(String.valueOf(unitBill = 12.15));
                double netBill2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText()));
                netBill.setText(String.format("%.2f", netBill2));
                double tax2 = (Double.parseDouble(units.getText()) * Double.parseDouble(billPerUnit.getText())) * 0.10;
                tax.setText(String.format("%.2f", tax2));
            }
        }


    }//GEN-LAST:event_currentMonthKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField billPerUnit;
    private javax.swing.JTextField currentMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastMonth;
    private javax.swing.JTextField meterCharge;
    private javax.swing.JComboBox<String> meterNo;
    private javax.swing.JTextField meterType;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField name;
    private javax.swing.JTextField netBill;
    private javax.swing.JTextField payment;
    private javax.swing.JTextField tax;
    private javax.swing.JTextField total;
    private javax.swing.JTextField units;
    // End of variables declaration//GEN-END:variables
}
