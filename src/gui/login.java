/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kontrol.kontrolUser;


/**
 *
 * @author Lenovo
 */
public class login extends javax.swing.JFrame {
    kontrolUser k;
    int x,y;
    Point point = new Point();
    
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        k = new kontrolUser();
        hi.setVisible(false);
        jLabel5.setVisible(false);
       
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        hi = new javax.swing.JLabel();
        target = new javax.swing.JLabel();
        keluar = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lblLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbkshow = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Sistem");
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        hi.setForeground(new java.awt.Color(255, 255, 255));
        panel.add(hi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 60, 20));

        target.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        target.setForeground(new java.awt.Color(255, 255, 255));
        target.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        target.setText("Resto Mania");
        target.setToolTipText("");
        panel.add(target, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 460, -1));

        keluar.setBackground(new java.awt.Color(255, 255, 255));
        keluar.setFont(new java.awt.Font("The Bold Font", 0, 36)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("X");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });
        panel.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, 10));

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuserKeyReleased(evt);
            }
        });
        panel.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 30));

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        panel.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 320, 30));

        lblLogin.setBackground(new java.awt.Color(195, 57, 15));
        lblLogin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Masuk");
        lblLogin.setOpaque(true);
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
        });
        lblLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblLoginKeyPressed(evt);
            }
        });
        panel.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username :");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        cbkshow.setBackground(new java.awt.Color(17, 17, 16));
        cbkshow.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        cbkshow.setForeground(new java.awt.Color(255, 255, 255));
        cbkshow.setText("  Show Password");
        cbkshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkshowActionPerformed(evt);
            }
        });
        panel.add(cbkshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 17, 16));
        jLabel5.setText("Lupa kata sandi ?");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bglogin.png"))); // NOI18N
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 480, 310));
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarMouseClicked

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        // TODO add your handling code here:
        //        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            //            login();
            //            this.dispose();
            //        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
        //        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            //            login();
            //            this.dispose();
            //        }
    }//GEN-LAST:event_txtpassKeyPressed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblLoginKeyPressed

        // TODO add your handling code here:
    }//GEN-LAST:event_lblLoginKeyPressed

    private void cbkshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkshowActionPerformed
        // TODO add your handling code here:
        showpass();
    }//GEN-LAST:event_cbkshowActionPerformed

    private void txtuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyReleased
        // TODO add your handling code here:
        hi.setVisible(false);
        
    }//GEN-LAST:event_txtuserKeyReleased

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        // TODO add your handling code here:
        hi.setVisible(true);
        
    }//GEN-LAST:event_txtpassKeyReleased

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        // TODO add your handling code here:
        lblLogin.setBackground(new java.awt.Color(195, 57, 15));
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        // TODO add your handling code here:
        lblLogin.setBackground(new java.awt.Color(252, 78, 25));
    }//GEN-LAST:event_lblLoginMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbkshow;
    private javax.swing.JLabel hi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel keluar;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel target;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables

private void login () {

    Utama u = new Utama();
    order o = new order(this, true);

    ResultSet rs;
    
    if(txtuser.getText().isEmpty() || txtpass.getText().isEmpty()) {
        JOptionPane.showMessageDialog(rootPane,"Username / Password harus diisi !","Peringatan",JOptionPane.WARNING_MESSAGE);
        txtuser.requestFocus();
    } else {
        
        String username = txtuser.getText();
        String password = txtpass.getText();
        
        try {
            rs = k.setlogin(username, password);
            if (rs.next()) {
                u.lblnamauser.setText(rs.getString("nama_user"));
                u.lbliduser.setText(rs.getString("id_user"));
                u.lblhakakses.setText(rs.getString("nama_level"));
                u.info.setText(u.lblhakakses.getText());
                if (rs.getString("id_level").equals("1")) {
                    u.setVisible(true);
                    this.dispose();
                }else if(rs.getString("id_level").equals("2")) {
                    u.setVisible(true);
                    u.menuentrydata.setVisible(false);
                    u.btnorder.setVisible(false);
                    o.txtiduser.setText(rs.getString("id_user"));
                } else if(rs.getString("id_level").equals("3")) {
                    u.btnadduser.setVisible(false);
                    u.menuentrydata.setVisible(false);
                    u.menutransaksi.setVisible(false);
                    u.btntransaksi.setVisible(false);
                    o.txtiduser.setText(rs.getString("id_user"));
                    o.setVisible(true);
               }
            }else{
                JOptionPane.showMessageDialog(rootPane,"Username / Password tidak terdaftar","Peringatan",JOptionPane.WARNING_MESSAGE);
                txtuser.setText(null);
                txtpass.setText(null);
                txtuser.requestFocus();
                hi.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

}


 private void showpass(){
    if(cbkshow.isSelected()){
            txtpass.setEchoChar((char)0);
        }else {
            txtpass.setEchoChar('*');
        }
    }
}

