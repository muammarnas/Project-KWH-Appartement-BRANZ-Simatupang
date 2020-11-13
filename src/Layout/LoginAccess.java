/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layout;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import koneksi.New_ConnectDB;

/**
 *
 * @author user
 */
public class LoginAccess extends javax.swing.JFrame {
    private New_ConnectDB conn = new New_ConnectDB();

    /**
     * Creates new form LoginAccess
     */
    public LoginAccess() {
        initComponents();
        setLocationRelativeTo(this);
        tf_username.requestFocus();
    }
    
    protected void kosong(){
        tf_username.setText("");
        pf_password.setText("");
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
        IkonWindow = new javax.swing.JPanel();
        btn_Min = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_Close = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_Max = new javax.swing.JPanel();
        branding = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(57, 121, 255));
        setMinimumSize(new java.awt.Dimension(145, 200));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(38, 127, 226));
        jPanel1.setPreferredSize(new java.awt.Dimension(1071, 559));
        jPanel1.setLayout(null);

        IkonWindow.setBackground(new java.awt.Color(56, 94, 245));
        IkonWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Min.setBackground(new java.awt.Color(38, 127, 226));
        btn_Min.setLayout(new java.awt.BorderLayout());

        jLabel5.setBackground(new java.awt.Color(38, 127, 226));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Min.add(jLabel5, java.awt.BorderLayout.CENTER);

        IkonWindow.add(btn_Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 45));

        btn_Close.setBackground(new java.awt.Color(38, 127, 226));
        btn_Close.setLayout(new java.awt.BorderLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_IMG/Icon/delete_32px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        btn_Close.add(jLabel6, java.awt.BorderLayout.CENTER);

        IkonWindow.add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 45, 45));

        btn_Max.setBackground(new java.awt.Color(38, 127, 226));
        btn_Max.setLayout(new java.awt.BorderLayout());
        IkonWindow.add(btn_Max, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 0, 45, 45));

        jPanel1.add(IkonWindow);
        IkonWindow.setBounds(940, 0, 135, 45);

        branding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_IMG/logo-white.png"))); // NOI18N
        jPanel1.add(branding);
        branding.setBounds(20, 15, 138, 56);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_IMG/Transparant.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, -1, 520, 560);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 127, 226));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(650, 300, 80, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 127, 226));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(650, 345, 80, 17);

        tf_username.setBackground(new java.awt.Color(38, 127, 226));
        tf_username.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        tf_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_usernameKeyPressed(evt);
            }
        });
        jPanel1.add(tf_username);
        tf_username.setBounds(740, 300, 190, 25);

        pf_password.setBackground(new java.awt.Color(38, 127, 226));
        pf_password.setFont(new java.awt.Font("Trajan Pro", 0, 11)); // NOI18N
        pf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(pf_password);
        pf_password.setBounds(740, 340, 190, 25);

        jPanel2.setBackground(java.awt.Color.lightGray);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(38, 127, 226));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_IMG/Icon/unlock-icon_black.png"))); // NOI18N
        jLabel4.setText("Submit");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(630, 280, 320, 150);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    private void tf_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            pf_password.requestFocus();
        }
    }//GEN-LAST:event_tf_usernameKeyPressed

    private void pf_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == evt.VK_ENTER){
            conn.connect();
            try {
                String sql = "select * from master_access where Username = '" + tf_username.getText() + "' and Password = '" + pf_password.getText() + "'";
                Statement stat = conn.connect().createStatement();
                ResultSet rsLogin = stat.executeQuery(sql);

                rsLogin.next();
                rsLogin.last(); //mengecek jumlah baris pada hasil query
                if (rsLogin.getRow()==1){
                    JOptionPane.showMessageDialog(null, "Login Berhasil!");
                    dispose();
                    new Dashboard().setVisible(true);
                    dispose();//<-- BILA MAU DIARAHKAN KE Frame Menu Utama
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, Username / Password anda salah!");
                    kosong();
                    tf_username.requestFocus();
                }
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_pf_passwordKeyPressed

    private void jLabel4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4AncestorAdded

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
            conn.connect();
            try {
                String sql = "select * from master_access where Username = '" + tf_username.getText() + "' and Password = '" + pf_password.getText() + "'";
                Statement stat = conn.connect().createStatement();
                ResultSet rsLogin = stat.executeQuery(sql);

                rsLogin.next();
                rsLogin.last(); //mengecek jumlah baris pada hasil query
                if (rsLogin.getRow()==1){
                    JOptionPane.showMessageDialog(null, "Login Berhasil!");
                    dispose();
                    new Dashboard().setVisible(true);
                    //<-- BILA MAU DIARAHKAN KE Frame Menu Utama
                } else {
                    JOptionPane.showMessageDialog(null, "Maaf, Username / Password anda salah!");
                    kosong();
                    tf_username.requestFocus();
                }
            } catch (SQLException e) {
            }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        changecolor(btn_Close, new Color(25, 29, 74));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        changecolor(btn_Close, new Color(38,127,226));
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(LoginAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAccess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IkonWindow;
    private javax.swing.JLabel background;
    private javax.swing.JLabel branding;
    private javax.swing.JPanel btn_Close;
    private javax.swing.JPanel btn_Max;
    private javax.swing.JPanel btn_Min;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}