/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erp;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Sudip_Maiti
 */
public class Add_Coustomer extends javax.swing.JFrame {

    /**
     * Creates new form Add_Employee
     */
    public Add_Coustomer() {
        initComponents();
        
          fName.setVisible(false);
        L_name.setVisible(false);
        Phone.setVisible(false);
        Email.setVisible(false);
      
        mng_name.setEditable(false);
        mng_id.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        crt_emp = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        L_name = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone3 = new javax.swing.JTextField();
        Emp_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        address1 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mng_name = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        mng_id = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(82, 0, 106));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 255)));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("Create New Customer !");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 30, 400, -1));

        fName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fName.setForeground(new java.awt.Color(128, 128, 128));
        fName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fName.setText("First Name");
        jPanel4.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 20));

        Phone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Phone.setForeground(new java.awt.Color(128, 128, 128));
        Phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Phone.setText("Phone");
        jPanel4.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 20));

        Email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(128, 128, 128));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email.setText("Email");
        jPanel4.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 280, 20));

        crt_emp.setBackground(new java.awt.Color(0, 102, 255));
        crt_emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Create Customer");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crt_empLayout = new javax.swing.GroupLayout(crt_emp);
        crt_emp.setLayout(crt_empLayout);
        crt_empLayout.setHorizontalGroup(
            crt_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        crt_empLayout.setVerticalGroup(
            crt_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.add(crt_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 560, 50));

        L_name.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        L_name.setForeground(new java.awt.Color(128, 128, 128));
        L_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L_name.setText("Last Name");
        jPanel4.add(L_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 220, 20));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(128, 128, 128));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Customer ID");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 20));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(128, 128, 128));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Address");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 20));

        firstname.setBackground(new java.awt.Color(255, 255, 255));
        firstname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(128, 128, 128));
        firstname.setText("First Name");
        firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstnameFocusLost(evt);
            }
        });
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 260, 30));

        lastname.setBackground(new java.awt.Color(255, 255, 255));
        lastname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(128, 128, 128));
        lastname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastname.setText("Last Name");
        lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 280, 30));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(128, 128, 128));
        email.setText("Email");
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 280, 30));

        phone3.setBackground(new java.awt.Color(255, 255, 255));
        phone3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        phone3.setForeground(new java.awt.Color(128, 128, 128));
        phone3.setText("Phone");
        phone3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        phone3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone3FocusLost(evt);
            }
        });
        jPanel4.add(phone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 30));

        Emp_id.setBackground(new java.awt.Color(255, 255, 255));
        Emp_id.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Emp_id.setForeground(new java.awt.Color(0, 0, 0));
        Emp_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Emp_id.setText("123456798");
        Emp_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 153, 204)));
        Emp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emp_idActionPerformed(evt);
            }
        });
        jPanel4.add(Emp_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 30));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setColumns(10);
        address.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setRows(5);
        address.setText("Address");
        address.setBorder(null);
        address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 560, -1));

        address1.setBackground(new java.awt.Color(255, 255, 255));
        address1.setColumns(10);
        address1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        address1.setForeground(new java.awt.Color(0, 0, 0));
        address1.setRows(5);
        address1.setText("Service Description");
        address1.setBorder(null);
        address1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        address1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                address1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                address1FocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(address1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 560, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(128, 128, 128));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Service Description");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 190, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add-group (3).png"))); // NOI18N

        mng_name.setBackground(new java.awt.Color(82, 0, 106));
        mng_name.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        mng_name.setForeground(new java.awt.Color(255, 255, 255));
        mng_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mng_name.setToolTipText("");
        mng_name.setBorder(null);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Georgia", 1, 30)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("<Html>ADD CUSTOMER</Html>");

        mng_id.setBackground(new java.awt.Color(82, 0, 106));
        mng_id.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        mng_id.setForeground(new java.awt.Color(255, 255, 255));
        mng_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mng_id.setToolTipText("");
        mng_id.setBorder(null);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Welcome !");
        jLabel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(mng_name, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(mng_id, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(622, 622, 622)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(mng_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(mng_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 112, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(47, 68, 187));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 376, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1100, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        String fName = firstname.getText();
        String lName = lastname.getText();
        String ph = phone3.getText();
        String mail = email.getText();

        String add = address.getText();

        //Date from Calender and set Format for date

        //  System.out.println("!@##%$$%$"+dob);
        //////////////

        if(fName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Fill up all field first");
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        // TODO add your handling code here:
        if(firstname.getText().equals("First Name")){
            fName.setVisible(true);
            firstname.setText("");
            firstname.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_firstnameFocusGained

    private void firstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusLost
        // TODO add your handling code here:
        if(firstname.getText().equals("")){
            fName.setVisible(false);
            firstname.setText("First Name");
            firstname.setForeground(new Color(128,128,128));
        }else{
            fName.setVisible(true);
        }
    }//GEN-LAST:event_firstnameFocusLost

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        // TODO add your handling code here:
        if(lastname.getText().equals("Last Name")){
            L_name.setVisible(true);
            lastname.setText("");
            lastname.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_lastnameFocusGained

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        // TODO add your handling code here:
        if(lastname.getText().equals("")){
            L_name.setVisible(false);
            lastname.setText("Last Name");
            lastname.setForeground(new Color(128,128,128));
        }else{
            L_name.setVisible(true);
        }
    }//GEN-LAST:event_lastnameFocusLost

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        if(email.getText().equals("Email")){
            Email.setVisible(true);
            email.setText("");
            email.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(email.getText().equals("")){
            Email.setVisible(false);
            email.setText("Email");
            email.setForeground(new Color(128,128,128));
        }else{
            Email.setVisible(true);
        }
    }//GEN-LAST:event_emailFocusLost

    private void phone3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone3FocusGained
        // TODO add your handling code here:
        if(phone3.getText().equals("Phone")){
            Phone.setVisible(true);
            phone3.setText("");
            phone3.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_phone3FocusGained

    private void phone3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone3FocusLost
        // TODO add your handling code here:
        if(phone3.getText().equals("")){
            Phone.setVisible(false);
            phone3.setText("Phone");
            phone3.setForeground(new Color(128,128,128));
        }else{
            Phone.setVisible(true);
        }
    }//GEN-LAST:event_phone3FocusLost

    private void Emp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emp_idActionPerformed

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
        if(address.getText().equals("Address")){
            //address.setVisible(true);
            address.setText("");
            address.setForeground(new Color(000,000,000));
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
        if(address.getText().equals("")){
            address.setText("Address");
            address.setForeground(new Color(128,128,128));
        }
    }//GEN-LAST:event_addressFocusLost

    private void address1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_address1FocusGained

    private void address1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_address1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_address1FocusLost

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
            java.util.logging.Logger.getLogger(Add_Coustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Coustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Coustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Coustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Coustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Emp_id;
    private javax.swing.JLabel L_name;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextArea address;
    private javax.swing.JTextArea address1;
    private javax.swing.JPanel crt_emp;
    private javax.swing.JTextField email;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mng_id;
    private javax.swing.JTextField mng_name;
    private javax.swing.JTextField phone3;
    // End of variables declaration//GEN-END:variables
}
