/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
 import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 import java.lang.*;
public class Freight extends javax.swing.JFrame {

    /**
     * Creates new form Freight
     */
   
    public Freight() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        to2 = new javax.swing.JTextField();
        frm1 = new javax.swing.JTextField();
        frght1 = new javax.swing.JTextField();
        addtn = new javax.swing.JButton();
        modtn = new javax.swing.JButton();
        deltn = new javax.swing.JButton();
        extn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("           Freight ");

        jLabel2.setText("To");

        jLabel3.setText("From");

        jLabel4.setText("Freight");

        to2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to2ActionPerformed(evt);
            }
        });

        addtn.setText("Add");
        addtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtnActionPerformed(evt);
            }
        });

        modtn.setText("Modify");
        modtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modtnActionPerformed(evt);
            }
        });

        deltn.setText("Delete");
        deltn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltnActionPerformed(evt);
            }
        });

        extn.setText("Exit");
        extn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(to2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(frm1)
                                    .addComponent(frght1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(addtn)
                        .addGap(35, 35, 35)
                        .addComponent(modtn)
                        .addGap(30, 30, 30)
                        .addComponent(deltn)
                        .addGap(18, 18, 18)
                        .addComponent(extn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(to2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frght1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtn)
                    .addComponent(modtn)
                    .addComponent(deltn)
                    .addComponent(extn))
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtnActionPerformed
            // TODO add your handling code here:
           try{
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
       String n=to2.getText();
              String m=frm1.getText();
             int rs;
             float d;
             d=Float.parseFloat(frght1.getText());
         String sql="Insert into freight values('"+n+"','" +m+"'," +d + ")";
         
                Statement stmt=con.createStatement();
                rs=stmt.executeUpdate(sql);
                    
               frght1.setText(" ");
               frm1.setText(" ");
               to2.setText(" ");
        }catch(Exception e)
        {
            System.out.println("W");
        }
                    
    }//GEN-LAST:event_addtnActionPerformed

    private void to2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to2ActionPerformed

    private void modtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modtnActionPerformed
        // TODO add your handling code here:
        try{
                    ResultSet rs=null;   
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String s1=to2.getText();
         String s2=frm1.getText();
         try{
        String sql;
        sql="select * from freight where to1='"+s1+"' and frm='"+s2+"'";
        rs=stmt.executeQuery(sql);
         } catch(Exception e)
             
        {
            System.out.println(e);
        }
        
        if(rs.next()){
            try{
            String t1=rs.getString("to1");
            String t2=rs.getString("frm");
            String t3;
             t3 = rs.getString("frght");
             to2.setText(t1);
             frm1.setText(t2);
             addtn.setEnabled(true);
             deltn.setEnabled(true);
             modtn.setEnabled(true);
             extn.setEnabled(true);
             int ans=JOptionPane.showConfirmDialog(null,"Surely wanna modify record");
        if(ans==JOptionPane.YES_OPTION){
            try
            {    float a;
                 a=Float.parseFloat(frght1.getText());
                stmt=con.createStatement();
                String query= "UPdate freight set frght="+a+"where to1='"+to2.getText()+"'and frm='"+frm1.getText()+"'";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Successfully Inserted");
            }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in modifying");
           
        }}
            }
            catch(Exception e)
        {
            System.out.println("F");
        }
        }
             
        else
        {
            JOptionPane.showMessageDialog(null, "No such Record");
        }
        
        new Freight().setVisible(true);
        this.setVisible(false);
        
        
      }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_modtnActionPerformed

    private void extnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extnActionPerformed
        // TODO add your handling code here:
        new mainf().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_extnActionPerformed

    private void deltnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltnActionPerformed
        // TODO add your handling code here:
        try{
                    ResultSet rs=null;   
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String s1=to2.getText();
         String s2=frm1.getText();
         try{
        String sql;
        sql="select * from freight where to1='"+s1+"' and frm='"+s2+"'";
        rs=stmt.executeQuery(sql);
         } catch(Exception e)
             
        {
            System.out.println(e);
        }
        
        if(rs.next()){
            try{
            String t1=rs.getString("to1");
            String t2=rs.getString("frm");
            String t3;
             t3 = rs.getString("frght");
             to2.setText(t1);
             frm1.setText(t2);
             frght1.setText(t3);
             addtn.setEnabled(true);
             deltn.setEnabled(true);
             modtn.setEnabled(true);
             extn.setEnabled(true);
             int ans=JOptionPane.showConfirmDialog(null,"Surely wanna Delete record");
        if(ans==JOptionPane.YES_OPTION){
            try
            {    
                stmt=con.createStatement();
                String query= "delete from  freight where to1='"+to2.getText()+"'and frm='"+frm1.getText()+"'";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
            }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in Deleting");
           
        }}
            }
            catch(Exception e)
        {
            System.out.println("F");
        }
        }
             
        else
        {
            JOptionPane.showMessageDialog(null, "No such Record");
        }
        try{
        new Freight().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
      }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_deltnActionPerformed

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
            java.util.logging.Logger.getLogger(Freight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Freight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Freight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Freight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Freight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtn;
    private javax.swing.JButton deltn;
    private javax.swing.JButton extn;
    private javax.swing.JTextField frght1;
    private javax.swing.JTextField frm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton modtn;
    private javax.swing.JTextField to2;
    // End of variables declaration//GEN-END:variables
}
