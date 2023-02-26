package gui_quannet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Giao_Dien_Dang_Nhap_Nguoi_Dung extends javax.swing.JFrame {
    public static String TenDangNhapAdmin = "admin";
    public static String MatKhauAdmin;
    
    public Giao_Dien_Dang_Nhap_Nguoi_Dung(){
        initComponents();
    }
    
    public Giao_Dien_Dang_Nhap_Nguoi_Dung(String pass) {
        initComponents();
        setMatKhauAdmin(pass);
    }
    
    public String getTenDangNhapAdmin() {
        return TenDangNhapAdmin;
    }

    public void setTenDangNhapAdmin(String TenDangNhapAdmin) {
        Giao_Dien_Dang_Nhap_Nguoi_Dung.TenDangNhapAdmin = TenDangNhapAdmin;
    }

    public String getMatKhauAdmin() {
        return MatKhauAdmin;
    }

    private void setMatKhauAdmin(String MatKhauAdmin) {
        Giao_Dien_Dang_Nhap_Nguoi_Dung.MatKhauAdmin = MatKhauAdmin;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_TenDN = new javax.swing.JTextField();
        butt_DangNhap = new javax.swing.JButton();
        txtMk = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÍ QUÁN NET");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(470, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tentk.png"))); // NOI18N
        jLabel1.setText("Tên đăng nhập");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pas12.png"))); // NOI18N
        jLabel2.setText("Mật khẩu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 30));

        txt_TenDN.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_TenDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenDNActionPerformed(evt);
            }
        });
        getContentPane().add(txt_TenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 30));

        butt_DangNhap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        butt_DangNhap.setText("Đăng Nhập");
        butt_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_DangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(butt_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 250, -1, 40));

        txtMk.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMkActionPerformed(evt);
            }
        });
        txtMk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMkKeyPressed(evt);
            }
        });
        getContentPane().add(txtMk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");
        jLabel3.setPreferredSize(new java.awt.Dimension(900, 340));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 50));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 106));
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butt_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_DangNhapActionPerformed
        // TODO add your handling code here:
        try {
            setMK();
        } catch (Exception ex) {
            Logger.getLogger(Giao_Dien_Dang_Nhap_Nguoi_Dung.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (txt_TenDN.getText().isEmpty() || txtMk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chưa nhập Tên đăng nhập hoặc Mật khẩu.");
        }
        else {
            if(txt_TenDN.getText().equals(getTenDangNhapAdmin()) && txtMk.getText().equals(getMatKhauAdmin())){
                Giao_Dien_MoMay a= new Giao_Dien_MoMay();
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công.");
                a.setVisible(true);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc Mật khẩu không đúng.");
            }
        }
    }//GEN-LAST:event_butt_DangNhapActionPerformed
    private void txtMkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMkActionPerformed
        // TODO add your handling code here:
        butt_DangNhapActionPerformed(evt);
    }//GEN-LAST:event_txtMkActionPerformed
    private void txt_TenDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenDNActionPerformed
        // TODO add your handling code here:
        butt_DangNhapActionPerformed(evt);
    }//GEN-LAST:event_txt_TenDNActionPerformed
    private void txtMkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMkKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMkKeyPressed
    public void setMK() throws Exception {
        BufferedReader bufferedReader = null;
        Reader reader = new FileReader("DangNhap.txt");
        bufferedReader = new BufferedReader(reader);
        setMatKhauAdmin(bufferedReader.readLine());
        bufferedReader.close();
    }
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
            java.util.logging.Logger.getLogger(Giao_Dien_Dang_Nhap_Nguoi_Dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Dang_Nhap_Nguoi_Dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Dang_Nhap_Nguoi_Dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Dang_Nhap_Nguoi_Dung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giao_Dien_Dang_Nhap_Nguoi_Dung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt_DangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtMk;
    private javax.swing.JTextField txt_TenDN;
    // End of variables declaration//GEN-END:variables
}
