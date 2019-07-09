
import java.sql.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Truck extends javax.swing.JFrame {

    public Truck() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        truck1 = new javax.swing.JTextField();
        truck2 = new javax.swing.JTextField();
        regdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        owner = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pan = new javax.swing.JTextField();
        engine = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cap = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ins = new javax.swing.JTextField();
        insdate = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        chasis = new javax.swing.JTextField();
        addtn = new javax.swing.JButton();
        deltn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        extn = new javax.swing.JButton();
        modtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Addition of Truck ");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Truck No.");

        truck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truck1ActionPerformed(evt);
            }
        });

        truck2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                truck2MouseExited(evt);
            }
        });
        truck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truck2ActionPerformed(evt);
            }
        });
        truck2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                truck2KeyReleased(evt);
            }
        });

        regdate.setText("00/00/00");
        regdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Registration Date");

        jLabel4.setText("Owner's Name");

        owner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerActionPerformed(evt);
            }
        });

        jLabel5.setText("Company Name");

        comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compActionPerformed(evt);
            }
        });

        jLabel7.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel8.setText("Pin");

        jLabel9.setText("State");

        jLabel10.setText("City");

        jLabel11.setText("PAN No.");

        jLabel12.setText("Engine No.");

        jLabel13.setText("Capicity(ton)");

        jLabel14.setText("Insurance ");

        jLabel15.setText("Insurance Upto");

        insdate.setText("00/00/00");

        jLabel16.setText("Chasis No.");

        chasis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasisActionPerformed(evt);
            }
        });

        addtn.setText("ADD");
        addtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtnActionPerformed(evt);
            }
        });

        deltn.setText("DELETE");
        deltn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltnActionPerformed(evt);
            }
        });

        jLabel17.setText("Mobile");

        extn.setText("EXIT");
        extn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extnActionPerformed(evt);
            }
        });

        modtn.setText("MODIFY");
        modtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(truck1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(truck2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comp, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(engine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                        .addComponent(pan, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(ins, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(insdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(102, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(state, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(chasis)
                                            .addComponent(cap))
                                        .addGap(20, 20, 20))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(addtn)
                                .addGap(18, 18, 18)
                                .addComponent(modtn)
                                .addGap(18, 18, 18)
                                .addComponent(deltn)
                                .addGap(18, 18, 18)
                                .addComponent(extn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 210, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(truck1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(truck2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(owner)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(comp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(chasis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(engine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(ins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(insdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtn)
                    .addComponent(deltn)
                    .addComponent(modtn)
                    .addComponent(extn))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(449, 449, 449))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regdateActionPerformed

    private void truck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truck2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truck2ActionPerformed

    private void truck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_truck1ActionPerformed

    private void ownerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerActionPerformed

    private void compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_compActionPerformed

    private void chasisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasisActionPerformed

    private void addtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtnActionPerformed
        // TODO add your handling code here:
        try{
                       
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        int rs;
        long d,m;
        d=0;m=0;
        int c=0;
        String t;
        
        try{
        if(pin.getText()==null)
            d=0;
        else
        d=Long.parseLong(pin.getText());
        if(mobile.getText()==null)
            m=0;
        else
           m=Long.parseLong(mobile.getText());
           c=Integer.parseInt(cap.getText());
               }catch(Exception e)
        {  System.out.println(e);}
        try{   
     
                 t=truck1.getText()+truck2.getText();
        String sql="Insert into truck values('"+t+"',to_date('"+regdate.getText()+"','dd/mm/yy'),'"+owner.getText()+"','" +comp.getText()+"','"+address.getText()+"','"
                + city.getText()+ "',"+d+",'"+state.getText()+"',"+m+",'"+engine.getText()+"',"+c+",'"+pan.getText()+"','"
                +chasis.getText()+"','"+ins.getText()+"',to_date('"+insdate.getText()+"','dd/mm/yy'))";
            
                Statement stmt=con.createStatement();
                rs=stmt.executeUpdate(sql);
                truck1.setText(" "); truck2.setText(" ");regdate.setText("00/00/00"); owner.setText(" ");comp.setText(" ");
                address.setText(" "); city.setText(" "); ins.setText(" "); insdate.setText("00/00/00"); chasis.setText(" ");
                pan.setText(" "); engine.setText(" "); state.setText(" ");
        }
        catch(Exception e)
        {  System.out.println(e);}
        try{
        new Truck().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
    }catch(Exception e)
        {  System.out.println(e);}
    }//GEN-LAST:event_addtnActionPerformed

    private void extnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extnActionPerformed
       
        new mainf().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_extnActionPerformed

    private void deltnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltnActionPerformed
        // TODO add your handling code here:
      
                    
          String t1=truck1.getText()+truck2.getText();
         
             int ans=JOptionPane.showConfirmDialog(null,"Surely wanna Delete record");
        if(ans==JOptionPane.YES_OPTION){
            try
            {    
                 ResultSet rs=null;   
                    
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
    
               Statement stmt=con.createStatement();
                String query= "delete from  truck where num='"+t1+"'";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
            }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error in Deleting");
           
        }}
           
         try{
        new Truck().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
      
    }//GEN-LAST:event_deltnActionPerformed

    private void modtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modtnActionPerformed
        // TODO add your handling code here:
     int ans=JOptionPane.showConfirmDialog(null,"Surely wanna Modify record");
        if(ans==JOptionPane.YES_OPTION){
        try{
                    ResultSet rs=null;   
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
                String g1=truck1.getText()+truck2.getText();
                long d,m;
        d=0;m=0;
        int c=0;
          d=Long.parseLong(pin.getText());
         m=Long.parseLong(mobile.getText());
           c=Integer.parseInt(cap.getText());
                String query= "Update truck set  regdate=to_date('"+regdate.getText()+"','dd/mm/yy'),insdate= to_date('"+insdate.getText()+"','dd/mm/yy'),owner='"+owner.getText()
                        +"',comp='"+comp.getText()+"',address='" +address.getText()+"',city='"+city.getText()+"',state='"+state.getText()+"',engine='"+engine.getText()+"',pan='"+
                        pan.getText()+"',chasis='"+chasis.getText()+"',ins='"+ins.getText()+"',cap= "+c+",pin="+d+",mobile="+m+"   where num='"+g1+"'" ;
                stmt.executeUpdate(query);
        
        try{
        new Truck().setVisible(true);
        this.setVisible(false);}catch(Exception e){
            System.out.print(e);
        }
        }
    
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }//GEN-LAST:event_modtnActionPerformed

    private void truck2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_truck2KeyReleased
        // TODO add your handling code here:
        
          
    }//GEN-LAST:event_truck2KeyReleased

    private void truck2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_truck2MouseExited
        // TODO add your handling code here:
        try{
                    ResultSet rs=null;   
        Class.forName("oracle.jdbc.driver.OracleDriver");
                               
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123");
        if(con==null)
            System.out.println("k");
        Statement stmt=con.createStatement();
        String s1=truck1.getText()+truck2.getText();
         
         try{
        String sql;
        sql="select * from truck where num='"+s1+"'";
        rs=stmt.executeQuery(sql);
         } catch(Exception e)
             
        {
            System.out.println(e);
        }
         if(rs.next()){
            try{
            String t1=rs.getString("num");
            String t2=rs.getString("regdate");
            String t3;
             t3 = rs.getString("owner");
             comp.setText(rs.getString("comp"));
             regdate.setText(t2);
             owner.setText(t3);
             city.setText(rs.getString("city"));
             address.setText(rs.getString("address"));
             state.setText(rs.getString("state"));
             pin.setText(rs.getString("pin"));
             chasis.setText(rs.getString("chasis"));
             pan.setText(rs.getString("pan"));
             cap.setText(rs.getString("cap"));
             insdate.setText(rs.getString("insdate"));
             mobile.setText(rs.getString("mobile"));
             engine.setText(rs.getString("engine"));
             ins.setText(rs.getString("ins"));
             addtn.setEnabled(true);
             deltn.setEnabled(true);
             modtn.setEnabled(true);
             extn.setEnabled(true);
             }
            
            catch(Exception e)
        {
            System.out.println("F");
        }
        }
         else
         {
              cap.setText(" ");
             comp.setText("");
             regdate.setText("00/00/00");
             owner.setText("");
             city.setText("");
             address.setText("");
             state.setText("");
             pin.setText(" ");
             chasis.setText("");
             pan.setText("");
            
             insdate.setText("00/00/00");
             mobile.setText(" ");
             engine.setText("");
             ins.setText("");
         }
        }
         catch(Exception e)
        {
            System.out.println("F");
        }
    }//GEN-LAST:event_truck2MouseExited

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
            java.util.logging.Logger.getLogger(Truck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Truck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Truck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Truck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Truck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton addtn;
    private javax.swing.JTextField cap;
    private javax.swing.JTextField chasis;
    private javax.swing.JTextField city;
    private javax.swing.JTextField comp;
    private javax.swing.JButton deltn;
    private javax.swing.JTextField engine;
    private javax.swing.JButton extn;
    private javax.swing.JTextField ins;
    private javax.swing.JTextField insdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile;
    private javax.swing.JButton modtn;
    private javax.swing.JTextField owner;
    private javax.swing.JTextField pan;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField regdate;
    private javax.swing.JTextField state;
    private javax.swing.JTextField truck1;
    private javax.swing.JTextField truck2;
    // End of variables declaration//GEN-END:variables
}
