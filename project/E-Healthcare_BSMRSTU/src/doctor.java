/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.codejava.e_health.E_health;
/**
 *
 * @author User
 */
public class doctor extends javax.swing.JFrame {

    /**
     * Creates new form doctor
     */
    public doctor() {
        initComponents();
        jLabel7.setVisible(false);
                jLabel6.setVisible(false);
                jLabel7.setVisible(false);
                jLabel8.setVisible(false);
                jLabel9.setVisible(false);
                jLabel10.setVisible(false);
                jLabel11.setVisible(false);
                jLabel12.setVisible(false);
                jLabel13.setVisible(false);
                jLabel14.setVisible(false);
                jLabel15.setVisible(false);
                jLabel16.setVisible(false);
                jLabel17.setVisible(false);
                jLabel18.setVisible(false);
                jLabel19.setVisible(false);

                jTextField2.setVisible(false);
                jTextField3.setVisible(false);
                jTextField4.setVisible(false);
                jTextField5.setVisible(false);
                jTextField6.setVisible(false);
                jTextField7.setVisible(false);
                jTextField8.setVisible(false);
                jTextField9.setVisible(false);
                jTextField10.setVisible(false);
                jTextField11.setVisible(false);
                jTextField12.setVisible(false);
                jTextField13.setVisible(false);
                jTextField14.setVisible(false);
                jTextField15.setVisible(false);

                jButton3.setVisible(true);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout big.png"))); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 560, 170, -1));

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 150, -1));

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 150, -1));

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 150, -1));

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 150, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 150, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Blood Group");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Student_ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Designation");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Contact No");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("District");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Donar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 150, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Weight");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Height");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 150, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Age");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Department");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 150, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 150, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 150, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 140, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Nurse", "Student" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("User Type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Input Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setText("Doctor");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back show big.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new doctor().setVisible(false);
        new login().setVisible(true);
         
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("null");
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
           
            
        //declare the parameter of connection
        String url = "jdbc:mysql://localhost:3307/bsmrstu_community";
        String user = "root";
        String password = "juwelmallick";
        Class.forName("com.mysql.cj.jdbc.Driver");
         
        //for a new connection with database
        Connection c  = DriverManager.getConnection(url,user, password);
        //Statement statement = c.createStatement();
        //String query1 = "SELECT * FROM bsmrstu_community.password";//WHERE username=? and password=? and usertype=?;
        Statement s1 = c.createStatement();
       
         
         if(jComboBox1.getSelectedIndex()==0)
             {
                 
               String q1 = "SELECT * FROM bsmrstu_community.teacher;";
               ResultSet r1= s1.executeQuery(q1);
               
                //String u1 = jTextField1.getText();
              
                 int n=0;
             while(r1.next())
             {
                //String name, us, pas, des, gen, bl, dis, dept, donar,con;
                String us;
                int age, height, weight;
                us = r1.getString("username");
                
                if(jTextField1.getText().equals(us))
                {
                //name = r1.getString("name");
                    //jTextField1.setText(us);
                jTextField2.setText(r1.getString("username"));
                jTextField3.setText(r1.getString("name"));
                jTextField4.setText(r1.getString("password"));
               jTextField5.setText(r1.getString("gender"));
                 jTextField6.setText(r1.getString("department"));
                //jTextField7.setText(r1.getString("age"));
                //jTextField8.setText(r1.getString("height"));
                //jTextField9.setText(r1.getString("weight"));
                jTextField10.setText(r1.getString("donar"));
                jTextField11.setText(r1.getString("blood"));
                //jTextField12.setText(r1.getString("student_ID"));
                jTextField13.setText(r1.getString("designation"));
                jTextField14.setText(r1.getString("contact"));
                jTextField15.setText(r1.getString("district"));
               /*  
                
                us = r1.getString("username");
                
                des = r1.getString("designation");
                gen = r1.getString("gender");
                bl = r1.getString("blood");
                dis = r1.getString("district");
                dept = r1.getString("department");
                donar = r1.getString("donar");
                con = r1.getString("contact");
               */
                age = r1.getInt("age");
                height = r1.getInt("height");
                weight = r1.getInt("weight");
                
                jTextField7.setText(Integer.toString(age));
                jTextField8.setText(Integer.toString(height));
                jTextField9.setText(Integer.toString(weight));

                    jLabel6.setVisible(true);
                    jLabel7.setVisible(true);
                    jLabel8.setVisible(false);
                    jLabel9.setVisible(true);
                    jLabel10.setVisible(true);
                    jLabel11.setVisible(true);
                    jLabel12.setVisible(true);
                    jLabel13.setVisible(true);
                    jLabel14.setVisible(true);
                    jLabel15.setVisible(true);
                    jLabel16.setVisible(false);
                    jLabel17.setVisible(true);
                    jLabel18.setVisible(true);
                    jLabel19.setVisible(true);
                    
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jTextField11.setVisible(true);
                    jTextField12.setVisible(false);
                    jTextField13.setVisible(true);
                    jTextField14.setVisible(true);
                    jTextField15.setVisible(true);
                    jButton3.setVisible(true);
                    n=1;
                    //JOptionPane.showMessageDialog(this, "ok");
                 break;
                } 
             } if(n==0)
                     {
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jLabel8.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                    jLabel17.setVisible(false);
                    jLabel18.setVisible(false);
                    jLabel19.setVisible(false);
                    jTextField15.setVisible(false);
                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jTextField13.setVisible(false);
                    jTextField14.setVisible(false);
                         JOptionPane.showMessageDialog(this, "Data doesn't exist on database");
                     }
             }
        
        else if(jComboBox1.getSelectedIndex()==1)
             {
                 
               String q1 = "SELECT * FROM bsmrstu_community.nurse;";
               ResultSet r1= s1.executeQuery(q1);
               
                //String u1 = jTextField1.getText();
              
                 int n=0;
             while(r1.next())
             {
                //String name, us, pas, des, gen, bl, dis, dept, donar,con;
                String us;
                int age, height, weight;
                us = r1.getString("username");
                
                if(jTextField1.getText().equals(us))
                {
                //name = r1.getString("name");
                    //jTextField1.setText(us);
                jTextField2.setText(r1.getString("username"));
                jTextField3.setText(r1.getString("name"));
                jTextField4.setText(r1.getString("password"));
//               jTextField5.setText(r1.getString("gender"));
//                 jTextField6.setText(r1.getString("department"));
//                //jTextField7.setText(r1.getString("age"));
//                //jTextField8.setText(r1.getString("height"));
//                //jTextField9.setText(r1.getString("weight"));
//                jTextField10.setText(r1.getString("donar"));
//                jTextField11.setText(r1.getString("blood"));
//                //jTextField12.setText(r1.getString("student_ID"));
//                jTextField13.setText(r1.getString("contact"));
//                jTextField14.setText(r1.getString("district"));
                
//                age = r1.getInt("age");
//                height = r1.getInt("height");
//                weight = r1.getInt("weight");
                
//                jTextField7.setText(Integer.toString(age));
//                jTextField8.setText(Integer.toString(height));
//                jTextField9.setText(Integer.toString(weight));

                    jLabel6.setVisible(true);
                    jLabel7.setVisible(true);
                    jLabel19.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                    jLabel17.setVisible(false);
                    jLabel18.setVisible(false);
                    jLabel19.setVisible(false);
                    jButton3.setVisible(false);
                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField15.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                   jTextField12.setVisible(false);
                    jTextField13.setVisible(false);
                    jTextField14.setVisible(false);
                    jTextField15.setVisible(false);
                    
                    jButton3.setVisible(true);
                  
                    n=1;
                    //JOptionPane.showMessageDialog(this, "ok");
                 break;
                } 
             } if(n==0)
                     {
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jLabel8.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                    jLabel17.setVisible(false);
                    jLabel18.setVisible(false);
                    jLabel19.setVisible(false);

                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jTextField13.setVisible(false);
                    jTextField14.setVisible(false);
                    jTextField15.setVisible(false);
                         JOptionPane.showMessageDialog(this, "Data doesn't exist on database");
                     }
             }
        else 
             {
                 
               String q1 = "SELECT * FROM bsmrstu_community.student;";
               ResultSet r1= s1.executeQuery(q1);
               
                //String u1 = jTextField1.getText();
              
                 int n=0;
             while(r1.next())
             {
                //String name, us, pas, des, gen, bl, dis, dept, donar,con;
                String us;
                int age, height, weight;
                us = r1.getString("username");
                
                if(jTextField1.getText().equals(us))
                {
                //name = r1.getString("name");
                    //jTextField1.setText(us);
                jTextField2.setText(r1.getString("username"));
                jTextField3.setText(r1.getString("name"));
                //jTextField4.setText(r1.getString("password"));
               jTextField5.setText(r1.getString("gender"));
                 jTextField6.setText(r1.getString("department"));
                jTextField7.setText(r1.getString("age"));
                jTextField8.setText(r1.getString("height"));
                jTextField9.setText(r1.getString("weight"));
                jTextField10.setText(r1.getString("donar"));
                jTextField11.setText(r1.getString("blood"));
                jTextField12.setText(r1.getString("id"));
                //jTextField13.setText(r1.getString("designation"));
                jTextField14.setText(r1.getString("contact"));
                jTextField15.setText(r1.getString("district"));
                
                age = r1.getInt("age");
                height = r1.getInt("height");
                weight = r1.getInt("weight");
                
                jTextField7.setText(Integer.toString(age));
                jTextField8.setText(Integer.toString(height));
                jTextField9.setText(Integer.toString(weight));

                    jLabel6.setVisible(true);
                    jLabel7.setVisible(true);
                    jLabel8.setVisible(false);
                    jLabel9.setVisible(true);
                    jLabel10.setVisible(true);
                    jLabel11.setVisible(true);
                    jLabel12.setVisible(true);
                    jLabel13.setVisible(true);
                    jLabel14.setVisible(true);
                    jLabel15.setVisible(true);
                    jLabel16.setVisible(true);
                    jLabel17.setVisible(false);
                    jLabel18.setVisible(true);
                    jLabel19.setVisible(true);

                    jTextField2.setVisible(true);
                    jTextField3.setVisible(true);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(true);
                    jTextField6.setVisible(true);
                    jTextField7.setVisible(true);
                    jTextField8.setVisible(true);
                    jTextField9.setVisible(true);
                    jTextField10.setVisible(true);
                    jTextField11.setVisible(true);
                    jTextField12.setVisible(true);
                    jTextField13.setVisible(false);
                    jTextField14.setVisible(true);
                    jTextField15.setVisible(true);
                  jButton3.setVisible(true);
                    n=1;
                    //JOptionPane.showMessageDialog(this, "ok");
                 break;
                } 
             } if(n==0)
                     {
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jLabel8.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel11.setVisible(false);
                    jLabel12.setVisible(false);
                    jLabel13.setVisible(false);
                    jLabel14.setVisible(false);
                    jLabel15.setVisible(false);
                    jLabel16.setVisible(false);
                    jLabel17.setVisible(false);
                    jLabel18.setVisible(false);
                    jLabel19.setVisible(false);

                    jTextField2.setVisible(false);
                    jTextField3.setVisible(false);
                    jTextField4.setVisible(false);
                    jTextField5.setVisible(false);
                    jTextField6.setVisible(false);
                    jTextField7.setVisible(false);
                    jTextField8.setVisible(false);
                    jTextField9.setVisible(false);
                    jTextField10.setVisible(false);
                    jTextField11.setVisible(false);
                    jTextField12.setVisible(false);
                    jTextField13.setVisible(false);
                    jTextField14.setVisible(false);
                    jTextField15.setVisible(false);
                         JOptionPane.showMessageDialog(this, "Data doesn't exist on database");
                     }
             }
        
        
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(E_health.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        // jTextField3.setVisible(false);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}