/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.awt.Color;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudip_Maiti
 */
public class Add_service_popup extends javax.swing.JFrame {
String emp_Idcee;
String empcee;
 BigInteger emp_idcee =null;
 String Emp_idcee="";
    /**
     * Creates new form Add_service_popup
     */
    public Add_service_popup() {
        initComponents();
        
        hil.setVisible(false);
       
        hlnn.setVisible(false);
         
         table();
         id_createcee();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        serch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fName1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ttf = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        hil = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        hlnn = new javax.swing.JLabel();
        Close_bb = new javax.swing.JPanel();
        Close_b = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus Name", "Cus Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 182, 670, 270));

        serch.setBackground(new java.awt.Color(255, 255, 255));
        serch.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        serch.setForeground(new java.awt.Color(128, 128, 128));
        serch.setText("Serch Customer by Customer ID");
        serch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(47, 68, 187)));
        serch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serchFocusLost(evt);
            }
        });
        serch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchKeyReleased(evt);
            }
        });
        jPanel1.add(serch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 320, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/magnifying-glass.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(47, 68, 187)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 46, 40));

        fName1.setFont(new java.awt.Font("Consolas", 1, 21)); // NOI18N
        fName1.setForeground(new java.awt.Color(128, 128, 128));
        fName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fName1.setText("Serch Customer by Customer ID");
        jPanel1.add(fName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 30));

        ttf.setBackground(new java.awt.Color(255, 255, 255));
        ttf.setBorder(null);
        ttf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ttf.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(ttf);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 670, 220));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Add New Service !");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 400, -1));
        jPanel1.add(hil, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 84, -1, -1));

        jPanel2.setBackground(new java.awt.Color(47, 68, 187));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Save");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 715, 673, -1));
        jPanel1.add(hlnn, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 105, -1, -1));

        Close_bb.setBackground(new java.awt.Color(255, 255, 255));
        Close_bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Close_b.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        Close_b.setForeground(new java.awt.Color(255, 51, 0));
        Close_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close_b.setText("×");
        Close_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close_b.setPreferredSize(new java.awt.Dimension(40, 40));
        Close_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close_bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Close_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Close_bMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Close_bbLayout = new javax.swing.GroupLayout(Close_bb);
        Close_bb.setLayout(Close_bbLayout);
        Close_bbLayout.setHorizontalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Close_bbLayout.createSequentialGroup()
                .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Close_bbLayout.setVerticalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(Close_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(714, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void id_createcee(){
        
         try{
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement("select * from id_store");         
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
              //  mng_Id=rs.getString("MNG_ID");
               // System.out.println("MANAGER ID "+mng_Id);
                emp_Idcee=rs.getString("serv_id");
              //  System.out.println("EMPLOYEE ID "+emp_Id);
              //  Transaction_Id=rs.getString("TRANSACTION_ID");
              //  System.out.println("Transaction_Id "+Transaction_Id);
             //   Product_id=rs.getString("PRODUCT_ID");
               
                rs.close();
                ps.close();
            }else{
                JOptionPane.showMessageDialog(null, "NOTHING FOUND IN DATABASE!!!!!!");
            }
            con.close();
           }
        catch(Exception e){System.out.println(e);}
         
        emp_idcee = new BigInteger(emp_Idcee);
        BigInteger nxt = new BigInteger("1");
      //  System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!"+emp_Id);
      //  System.out.println("#################"+emp_id);
        emp_idcee = emp_idcee.add(nxt);
     //   System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+emp_id);
        empcee = "ERP_S"+emp_idcee.toString();
    //    System.out.println("%%%%%%%%%%%%%%%%%%%%%%"+emp);
     //   System.out.println("++++++++++++++++"+emp_id);
        Emp_idcee= empcee;
    }
    public void table() {
    try {
        
             //Data fetch from database
            String sql = "Select * From cus ";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           DefaultTableModel model =(DefaultTableModel)table.getModel(); 
           model.setRowCount(0);
           while (rs.next())
           {
               String name = rs.getString("cus_fname")+" "+rs.getString("cus_lname");
               Object o []={
                  name, rs.getString("cus_id") };
               model.addRow(o);
               
           }
            }catch(Exception e){
            System.out.println("error"+e);
        }
     }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:

        int i = table.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        // String aa=model.getValueAt(i,0).toString();
        String bb=model.getValueAt(i,1).toString();
       //  System.out.println("id"+bb +" name");
         try {
        
             //Data fetch from database
            String sql = "Select * From cus Where cus_id = '"+bb+"'";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
          //  ps.setString(1,"ERP_E1002");
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                String emp_id =rs.getString("cus_id");
                String f_name =rs.getString("cus_fname");
                // System.out.println("EMpppppp "+f_name);
                String l_name =rs.getString("cus_lname");
                // System.out.println("pppnnn "+l_name);
                String namee = f_name +""+l_name;
               hil.setText(emp_id);
                hlnn.setText(namee);
                
               // JOptionPane.showMessageDialog(this, "Product Found");
                
               
                rs.close();
                ps.close();
            }else{
               new Warning("Enter Correct Customer Id").setVisible(true);
               // System.out.println("Enter Correct Employee Id");
            }
        }catch(Exception e){
            System.out.println("error"+e);
        }

    }//GEN-LAST:event_tableMouseClicked

    private void serchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serchFocusGained
        if(serch.getText().equals("Serch Customer by Customer ID")){
            fName1.setVisible(true);
            serch.setText("");
            serch.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_serchFocusGained

    private void serchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serchFocusLost
        // TODO add your handling code here:
        if(serch.getText().equals("")){
            fName1.setVisible(false);
            serch.setText("Serch Customer by Customer ID");
            serch.setForeground(new Color(128,128,128));
        }else{
            fName1.setVisible(true);
        }
    }//GEN-LAST:event_serchFocusLost

    private void serchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchKeyReleased
        // TODO add your handling code here:

        String product_idee = serch.getText();
        try {

            //Data fetch from database
            String sql = "Select * From cus where cus_id like '%"+product_idee+"%' or cus_fname like '%"+product_idee+"%' or cus_lname like '%"+product_idee+"%' or cus_eml like '%"+product_idee+"%'";
            Connection con=DATABASE_CONNECTION.getConnection();
            PreparedStatement ps=con.prepareStatement(sql);
            // ps.setString(1,product_idee);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel model =(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            if(rs.next()){
                do
                {
                    String name = rs.getString("cus_fname")+" "+rs.getString("cus_lname");
                    Object o []={
                        name,rs.getString("cus_id") };
                    //   JOptionPane.showMessageDialog(this, "Product Found");
                    model.addRow(o);
                }while (rs.next());
            }else{
                new Error("Customer Not Found").setVisible(true);
                //   JOptionPane.showMessageDialog(this, "Product Not Found");
            }

        }catch(Exception e){
            System.out.println("error"+e);
        }
    }//GEN-LAST:event_serchKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        //        String em_id = serch.getText();
        //        try {
            //
            //            //Data fetch from database
            //            String sql = "Select * From emp Where emp_id = '"+em_id+"'";
            //            Connection con=DATABASE_CONNECTION.getConnection();
            //            PreparedStatement ps=con.prepareStatement(sql);
            //            //  ps.setString(1,"ERP_E1002");
            //            ResultSet rs=ps.executeQuery();
            //            if(rs.next()){
                //                String emp_id =rs.getString("emp_id");
                //                String f_name =rs.getString("emp_fname");
                //                // System.out.println("EMpppppp "+f_name);
                //                String l_name =rs.getString("emp_lname");
                //                // System.out.println("pppnnn "+l_name);
                //                String Phone =rs.getString("emp_phone");
                //
                //                String Email =rs.getString("emp_email");
                //                // System.out.println("emlllll "+l_name);
                //                String Address =rs.getString("emp_address");
                //
                ////                firstname.setText(f_name);
                ////
                ////                lastname.setText(l_name);
                ////
                ////                phone3.setText(Phone);
                ////                Emp_id.setText(emp_id);
                ////                email.setText(Email);
                ////                address.setText(Address);
                //
                //                // JOptionPane.showMessageDialog(this, "Product Found");
                //
                //                rs.close();
                //                ps.close();
                //            }else{
                //                new Warning("Enter Correct Employee Id").setVisible(true);
                //                // System.out.println("Enter Correct Employee Id");
                //            }
            //        }catch(Exception e){
            //            System.out.println("error"+e);
            //        }
            
            
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        String rea=hil.getText();
        String cnn=hlnn.getText();
        if (rea.equals("")){

            new Warning("Click Table row To Delete").setVisible(true);
            // JOptionPane.showMessageDialog(this, "Click Table row To Delete");
        }else {
            String tex= ttf.getText();
            if(!tex.equals("")){
                
                 try{
                   Connection con=DATABASE_CONNECTION.getConnection();  
                 //INSERT INTO `emp_works`(`serv_id`, `emp_id`,  ) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]','[value-9]') 
                     PreparedStatement ps=con.prepareStatement("INSERT INTO emp_works (`serv_id`, `emp_id`,`emp_name`,`cous_id`, `cous_name`, `date`, `time`, `service_dtl`, `status`) VALUES ('"+Emp_idcee+"','Null','Null','"+rea+"','"+cnn+"','Null','Null','"+tex+"','new')");
 
                     
                     int j = ID_STORE_FETCH.serv_id( emp_idcee.toString());               
                     int i = ps.executeUpdate();
                                      
                if(i>0&&j>0){
                    Index in = new Index();
                    in.relode("oky");
                    Succes su = new Succes();
                    su.ot("Add Service Succesfully!");
                    su.setVisible(true);
                    this.dispose();
                }
                   con.close();
              }catch(Exception e){
                  System.out.println(e);
              }
                 hil.setText("");
                hlnn.setText("");
            }else{
                new Warning("Input Service Decription.").setVisible(true);
            }
        }

    }//GEN-LAST:event_jPanel2MouseClicked

    private void Close_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseClicked
        // TODO add your handling code here:
       

            this.dispose();
       
    }//GEN-LAST:event_Close_bMouseClicked

    private void Close_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseEntered
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 0, 0));
        Close_b.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Close_bMouseEntered

    private void Close_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseExited
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 255, 255));
        Close_b.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Close_bMouseExited

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
            java.util.logging.Logger.getLogger(Add_service_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_service_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_service_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_service_popup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_service_popup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close_b;
    private javax.swing.JPanel Close_bb;
    private javax.swing.JLabel fName1;
    private javax.swing.JLabel hil;
    private javax.swing.JLabel hlnn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField serch;
    private javax.swing.JTable table;
    private javax.swing.JTextPane ttf;
    // End of variables declaration//GEN-END:variables
}