package gui_quannet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Giao_Dien_Doi_Mat_Khau_Admin extends javax.swing.JFrame {

    public Giao_Dien_Doi_Mat_Khau_Admin() {
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
        setTitle("ĐỔI MẬT KHẨU ADMIN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Tên tài khoản");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Mật khẩu cũ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Mật khẩu mới");

        txtMatKhauCu_DMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtMatKhauMoi_DMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐỔI MẬT KHẨU");

        txtTenTaiKhoan_DMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTenTaiKhoan_DMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTaiKhoan_DMKActionPerformed(evt);
            }
        });

        btDMK.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btDMK.setText("Đổi mật khẩu");
        btDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btDMK)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenTaiKhoan_DMK)
                            .addComponent(txtMatKhauCu_DMK)
                            .addComponent(txtMatKhauMoi_DMK, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenTaiKhoan_DMK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMatKhauCu_DMK)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhauMoi_DMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btDMK)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenTaiKhoan_DMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTaiKhoan_DMKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTaiKhoan_DMKActionPerformed
    
    private void Ghi_file(String pass) throws Exception {
        BufferedWriter bufferedWriter = null;
        Writer writer = new FileWriter("DangNhap.txt");
        bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(pass);
        bufferedWriter.close();
        writer.close();
    }
    
    private void btDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDMKActionPerformed
        // TODO add your handling code here:
        Giao_Dien_Dang_Nhap_Nguoi_Dung ND = new Giao_Dien_Dang_Nhap_Nguoi_Dung();
        BufferedReader bufferedReader = null;
        try {
            Reader reader = new FileReader("DangNhap.txt");
            bufferedReader = new BufferedReader(reader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String mkAd = null;
        try {
            mkAd = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException ex) {
            Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (txtTenTaiKhoan_DMK.getText().equals(ND.getTenDangNhapAdmin()) && txtMatKhauCu_DMK.getText().equals(mkAd)) {
            try {
                Ghi_file(txtMatKhauMoi_DMK.getText());
            } catch (Exception ex) {
                Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Đổi mật khẩu thành công.");
            dispose();
            new Giao_Dien_Dang_Nhap_Nguoi_Dung(txtMatKhauMoi_DMK.getText()).setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc Mật khẩu cũ không đúng!");
        }
    }//GEN-LAST:event_btDMKActionPerformed

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
            java.util.logging.Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Doi_Mat_Khau_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giao_Dien_Doi_Mat_Khau_Admin().setVisible(true);
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
