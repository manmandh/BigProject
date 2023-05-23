package layout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class PlayerChangPassword extends javax.swing.JFrame {
    public PlayerChangPassword() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhauCu_DMK = new javax.swing.JPasswordField();
        txtMatKhauMoi_DMK = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtTenTaiKhoan_DMK = new javax.swing.JTextField();
        btDMK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ĐỔI MẬT KHẨU NGƯỜI CHƠI");
        setBackground(new java.awt.Color(255, 255, 102));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(430, 395));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tên tài khoản");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mật khẩu cũ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Mật khẩu mới");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 30));

        txtMatKhauCu_DMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtMatKhauCu_DMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 152, 30));

        txtMatKhauMoi_DMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtMatKhauMoi_DMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 152, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐỔI MẬT KHẨU");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, -1));

        txtTenTaiKhoan_DMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTaiKhoan_DMKActionPerformed(evt);
            }
        });
        getContentPane().add(txtTenTaiKhoan_DMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 152, 30));

        btDMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btDMK.setText("Đổi mật khẩu");
        btDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDMKActionPerformed(evt);
            }
        });
        getContentPane().add(btDMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenTaiKhoan_DMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTaiKhoan_DMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTaiKhoan_DMKActionPerformed
    
    private void Ghi_file(String[] split) throws Exception {
        BufferedWriter bufferedWriter = null;
        Writer writer = new FileWriter("ThongTinNguoiChoi.txt");
        bufferedWriter = new BufferedWriter(writer);
        int count = 0;
        for (int i = 0; i < split.length;   ) {
            if (count <= 2) {
                bufferedWriter.write(split[i] + " ");
                count += 1;
                ++i;
            }
            else if (count == 3) {
                bufferedWriter.write(split[i]);
                count += 1;
                ++i;
            }
            else {
                bufferedWriter.write("\n");
                count = 0;
            }
        }
        bufferedWriter.close();
        writer.close();
    }

    private void btDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDMKActionPerformed
        // TODO add your handling code here:
        try {
            Reader reader = new FileReader("ThongTinNguoiChoi.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String Str = "";
            boolean check = false;
            while (bufferedReader.ready()) {
                Str += bufferedReader.readLine() + " ";
            }
            String[] split = Str.split(" ");
            for (int i = 0; i < split.length; ++i) {
                if (split[i].equals(txtTenTaiKhoan_DMK.getText()) && split[i+1].equals(txtMatKhauCu_DMK.getText())) {
                    check = true;
                    split[i+1] = txtMatKhauMoi_DMK.getText();
                    break;
                }
            }
            if (check == true) {
                JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công.");
                Ghi_file(split);
            }
            else
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc Mật khẩu cũ không đúng.");
        } catch (Exception ex) {
            Logger.getLogger(PlayerChangPassword.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btDMKActionPerformed
   /*private void tDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDMKActionPerformed
     try {
        ResultSet check = PlayerDAO.checkLogin(txtTenTaiKhoan_DMK.getText(), txtMatKhauCu_DMK.getText());
        if (check != null && check.next()) {
            PlayerChangPassword a1 = new PlayerChangPassword();
            JOptionPane.showMessageDialog(rootPane, " Đổi mật khẩu thành công.");
            new PlayerChangPassword(check);
            a1.setVisible(true);
            dispose();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc mật khẩu không đúng.");
        }
    } catch (Exception ex) {
        Logger.getLogger(PlayerChangPassword.class.getName()).log(Level.SEVERE, null, ex);
    }
}*/

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
            java.util.logging.Logger.getLogger(PlayerChangPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerChangPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerChangPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerChangPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerChangPassword().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtMatKhauCu_DMK;
    private javax.swing.JPasswordField txtMatKhauMoi_DMK;
    private javax.swing.JTextField txtTenTaiKhoan_DMK;
    // End of variables declaration//GEN-END:variables
}
