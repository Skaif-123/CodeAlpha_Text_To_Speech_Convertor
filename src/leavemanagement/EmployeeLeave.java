package leavemanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmployeeLeave extends javax.swing.JFrame {

    public EmployeeLeave() {
        initComponents();
        AutoId();
    }
    Connection con;
    PreparedStatement pst;

    public void Connection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/leavemangement", "root", "");

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeLeave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AutoId() {
        Connection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select MAX(emono) from registration");
            rs.next();
           String maxEmpNo = rs.getString("MAX(emono)");

            
            
            
            if(maxEmpNo==null){
                jLabel5.setText("EM001");
            }
            else{
                long id=Long.parseLong(rs.getString("MAX(emono)").substring(2,rs.getString("MAX(emono)").length()));
                id++;
              jLabel5.setText("EM"+String.format("%03d", id));
           
                      
                      
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeLeave.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Employee No.");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Employee Name");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Category");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Salary");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setLabelFor(jLabel5);
        jLabel5.setText("hello");

        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextField3))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String empno=jLabel5.getText();        
String empname=jTextField1.getText();
String category=jTextField2.getText();
String salary=jTextField3.getText();

Connection();
try{
    pst=con.prepareStatement("insert into registration values(?,?,?,?)");
    pst.setString(1,empno);
    pst.setString(2,empname);
    pst.setString(3,category);
    pst.setString(4,salary);
    pst.executeUpdate();
    JOptionPane.showMessageDialog(this, "Employee Added!!!!!!!");
    
    
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField1.requestFocus();
    AutoId();
    
    
    
    
}
catch(Exception e){
    e.printStackTrace();
}
    
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new FrontButton().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                EmployeeLeave f=new EmployeeLeave();
                f.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
