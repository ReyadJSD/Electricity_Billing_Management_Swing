package com.javaSwingProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class CustomerDetails extends javax.swing.JPanel {

    DefaultTableModel dtm;
    String meter = "";

    public CustomerDetails() {
        initComponents();
        dtm = new DefaultTableModel(new String[]{"Name", "Gender", "MeterNo", "MeterTyp", "IsuDate", "Address", "City", "Email", "Phone"}, 0);
        customerDetails.setModel(dtm);
        customerDetails.setShowGrid(true);
        showDatabaseDataInTable();
        selectMeterNoFromDB();
    }

    public void showDatabaseDataInTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From customers");
            ResultSet res = pst.executeQuery();
            dtm.setRowCount(0);
            while (res.next()) {
                Object[] data = {res.getString(1), res.getString(2), res.getInt(3), res.getString(4), res.getDate(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                dtm.addRow(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void selectMeterNoFromDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select meter_no From customers");
            ResultSet res = pst.executeQuery();
            while (res.next()) {
                search.addItem(res.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerDetails = new javax.swing.JTable();
        search = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Details");

        customerDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        customerDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerDetails);

        jButton2.setText("Search");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)))
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From customers Where meter_no = ?");
            pst.setString(1, search.getSelectedItem().toString());
            ResultSet res = pst.executeQuery();
            dtm.setRowCount(0);
            while (res.next()) {
                Object[] data = {res.getString(1), res.getString(2), res.getInt(3), res.getString(4), res.getDate(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                dtm.addRow(data);

            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void customerDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerDetailsMouseClicked
        // TODO add your handling code here:

        meter = customerDetails.getModel().getValueAt(customerDetails.getSelectedRow(), 2).toString();
    }//GEN-LAST:event_customerDetailsMouseClicked
    public void refrash() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("Select * From customers");
            ResultSet res = pst.executeQuery();
            dtm.setRowCount(0);
            while (res.next()) {
                Object[] data = {res.getString(1), res.getString(2), res.getInt(3), res.getString(4), res.getDate(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)};
                dtm.addRow(data);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "nh123456");
            PreparedStatement pst = con.prepareStatement("DELETE FROM customers WHERE meter_no = ?");
            pst.setInt(1, Integer.parseInt(meter));
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        refrash();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> search;
    // End of variables declaration//GEN-END:variables
}
