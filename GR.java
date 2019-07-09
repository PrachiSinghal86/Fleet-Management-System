
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 import java.lang.*;
public class GR extends javax.swing.JFrame {

    public GR() {
        initComponents();
        
    }
  static int p2=0,j=0;
  static long w1=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        grn1 = new javax.swing.JTextField();
        grn = new javax.swing.JTextField();
        frm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gdate = new javax.swing.JTextField();
        to1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ce = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cngst = new javax.swing.JTextField();
        cegst = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rem = new javax.swing.JTextField();
        inv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        eway = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        wght = new javax.swing.JTextField();
        val = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        typ = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        frght = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tpkg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("                                                                                        Gupta Transport Company");

        jLabel3.setText("G.R No.");

        jLabel5.setText("From");

        grn1.setEditable(false);
        grn1.setText("BALT 01");
        grn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grn1ActionPerformed(evt);
            }
        });

        grn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnActionPerformed(evt);
            }
        });
        grn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grnKeyReleased(evt);
            }
        });

        frm.setEditable(false);
        frm.setText("Balotra");
        frm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmActionPerformed(evt);
            }
        });

        jLabel6.setText("G.R. DATE");

        jLabel7.setText("TO");

        gdate.setText("00/00/00");
        gdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdateActionPerformed(evt);
            }
        });

        to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to1ActionPerformed(evt);
            }
        });

        jLabel8.setText("G.R. TYPE");

        jLabel10.setText("Consignor's Name");

        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cnKeyPressed(evt);
            }
        });

        jLabel11.setText("Consigneer's  Name");

        ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceActionPerformed(evt);
            }
        });
        ce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ceKeyPressed(evt);
            }
        });

        jLabel12.setText("Consignor's GSTIN No.");

        jLabel13.setText("Consignee's GSTIN No.");

        cngst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cngstActionPerformed(evt);
            }
        });
        cngst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cngstKeyReleased(evt);
            }
        });

        cegst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cegstActionPerformed(evt);
            }
        });
        cegst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cegstKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Method of Packing", "Said to Contain", "Pkgs", "Actual Wt."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel14.setText("Remarks");

        jLabel15.setText("Invoice No. ");

        jLabel16.setText("E-Way Bill No.");

        jLabel18.setText("Charged Weight");

        jLabel19.setText("Values of Goods");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setText("G.R.");

        typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To Pay", "Paid" }));

        jLabel17.setText("Freight");

        frght.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frghtActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Pkg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cngst, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(cegst))))
                .addGap(0, 695, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(527, 527, 527)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(ce)
                                                    .addGap(295, 295, 295))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(268, 268, 268)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(122, 122, 122)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(537, 537, 537)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(grn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(grn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(frm))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(gdate, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(to1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 732, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(304, 304, 304)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 910, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rem)
                                            .addComponent(inv)
                                            .addComponent(eway, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tpkg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(val, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(wght, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(frght, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(add)
                                                .addGap(32, 32, 32)))
                                        .addGap(3, 3, 3)
                                        .addComponent(del)
                                        .addGap(31, 31, 31)
                                        .addComponent(jButton4)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(gdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(to1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cngst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cegst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eway, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tpkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frght, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(del)
                    .addComponent(add))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cegstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cegstActionPerformed

    }//GEN-LAST:event_cegstActionPerformed

    private void ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceActionPerformed
      
    }//GEN-LAST:event_ceActionPerformed

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to1ActionPerformed

    private void gdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdateActionPerformed

    private void frmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmActionPerformed

    private void grnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grnActionPerformed

    private void grn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grn1ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String g1=grn1.getText()+grn.getText();
        String sta=typ.getSelectedItem().toString();
        int x1=Integer.parseInt(tpkg.getText());
        long x2=Long.parseLong(val.getText());
         long x3=Long.parseLong(frght.getText());
          int x4=Integer.parseInt(wght.getText());
          try{
              
        String query="Insert into gr values('"+g1+"',to_date('"+gdate.getText()+"','dd/mm/yy'),'"+frm.getText()+"','"+to1.getText()+"','"
                +sta+"','"+cngst.getText()+"','"+cegst.getText()+"','"+rem.getText()+"','"+inv.getText()+"','"
                +eway.getText()+"',"+x4+","+x2+","+x3+","+x1+")";
        stmt.executeUpdate(query);
          }catch(Exception e){
                        System.out.println(e);
                        }
         int i;
        try{
                for(i=0;i<jTable1.getRowCount();i++){
                    
                    String s1=jTable1.getValueAt(i,0).toString();
                    String a1=jTable1.getValueAt(i,1).toString();
                    String a2=jTable1.getValueAt(i,2).toString();
                    String a3=jTable1.getValueAt(i,3).toString();
                
                     
                    int p=Integer.parseInt(a2);
                    int p1=Integer.parseInt(a3);
                      
                String sql="Insert into mthd values('"+g1+"','"+s1+"','"+a1+"',"+p+","+p1+")";
                    stmt.executeUpdate(sql); }
        }catch(Exception e){
                        System.out.println(e);
                        }
        try{
        new GR().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
        }catch(Exception e)
        {  System.out.println(e);}
    }//GEN-LAST:event_addActionPerformed
    
    private void cngstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cngstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cngstActionPerformed

    
    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        
        try{
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String g1=grn1.getText()+grn.getText();
        String q1="delete from gr where grn='"+g1+"'";
        stmt.executeUpdate(q1);
        try{
        new GR().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
          }catch(Exception e){
                        System.out.println(e);
                        }
    }//GEN-LAST:event_delActionPerformed

    private void cnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnKeyPressed

    private void ceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ceKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceKeyPressed

    private void frghtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frghtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frghtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
        new mainf().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        
       
         String a2=jTable1.getValueAt(j,2).toString();
         String a3=jTable1.getValueAt(j,3).toString();
         long j3=Long.parseLong(a3);
         
         int j2=Integer.parseInt(a2);
         p2=p2+j2;
         w1=w1+(j3*j2);
         String j1=Integer.toString(p2);
         String j4=Long.toString(w1);
        tpkg.setText(j1);
        wght.setText(j4);
        j++;
        try{
                       ResultSet rs2=null;
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String query="Select *  from freight where to1='"+to1.getText()+"' and frm='"+frm.getText()+"'";
        
        rs2=stmt.executeQuery(query);
        while(rs2.next()){
            
            Long j6=rs2.getInt("frght")*w1;
            String j5=Long.toString(j6);
            frght.setText(j5);
        }
          }catch(Exception e){
                        System.out.println(e);
                        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void grnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnKeyReleased
        // TODO add your handling code here:
        try{
                       ResultSet rs2=null;
                       ResultSet rs=null;
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
       
        String sql1="Select * from gr where grn='"+grn1.getText()+grn.getText()+"'";
        
        rs2=stmt.executeQuery(sql1);
       
        
        if(rs2.next()){
              gdate.setText(rs2.getString("grd"));
              to1.setText(rs2.getString("to1"));
               cngst.setText(rs2.getString("cnsgnr"));
               cegst.setText(rs2.getString("cnsgne"));
               tpkg.setText(rs2.getString("pkg"));
               val.setText(rs2.getString("value"));
               wght.setText(rs2.getString("wght"));
               inv.setText(rs2.getString("inv"));
               rem.setText(rs2.getString("remark"));
                eway.setText(rs2.getString("eway"));
                frght.setText(rs2.getString("frght"));
                
        }
        else{
                   gdate.setText("00/00/00");
              to1.setText("");
               cngst.setText("");
               cegst.setText("");
               tpkg.setText("");
               val.setText("");
               wght.setText("");
               inv.setText("");
               rem.setText("");
                eway.setText("");
                frght.setText("");
        }
        Statement stmt1=con.createStatement();
        String sql2="Select * from mthd where grn='"+grn1.getText()+grn.getText()+"'";
         rs=stmt1.executeQuery(sql2);
         if(rs!=null){
            try{
        int i=0;
        while(rs.next()){
            jTable1.getModel().setValueAt(rs.getString("methd"),i,0);
            jTable1.getModel().setValueAt(rs.getString("pkg"),i,2);
            jTable1.getModel().setValueAt(rs.getString("wght"),i,3);
             jTable1.getModel().setValueAt(rs.getString("cntn"),i,1);
             i++;
        }}catch(Exception e){
                
                }}
                   }catch(Exception e){
                        System.out.println(e);
                        }
    }//GEN-LAST:event_grnKeyReleased

    private void cngstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cngstKeyReleased
        
        try{
                       ResultSet rs2=null;
                     
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
       
        String sql1="Select * from consgnr where gst='"+cngst.getText()+"'";
        
        rs2=stmt.executeQuery(sql1);
        if(rs2.next()){
            cn.setText(rs2.getString("name"));
        }
        }catch(Exception e){
                        System.out.println(e);
                        }
    }//GEN-LAST:event_cngstKeyReleased

    private void cegstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cegstKeyReleased
        // TODO add your handling code here:
         try{
                       ResultSet rs2=null;
                     
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");                        
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
       
        String sql1="Select * from consgnr where gst='"+cegst.getText()+"'";
        
        rs2=stmt.executeQuery(sql1);
        if(rs2.next()){
            ce.setText(rs2.getString("name"));
        }
        }catch(Exception e){
                        System.out.println(e);
                        }
    }//GEN-LAST:event_cegstKeyReleased

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField ce;
    private javax.swing.JTextField cegst;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cngst;
    private javax.swing.JButton del;
    private javax.swing.JTextField eway;
    private javax.swing.JTextField frght;
    private javax.swing.JTextField frm;
    private javax.swing.JTextField gdate;
    private javax.swing.JTextField grn;
    private javax.swing.JTextField grn1;
    private javax.swing.JTextField inv;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rem;
    private javax.swing.JTextField to1;
    private javax.swing.JTextField tpkg;
    private javax.swing.JComboBox<String> typ;
    private javax.swing.JTextField val;
    private javax.swing.JTextField wght;
    // End of variables declaration//GEN-END:variables
}
