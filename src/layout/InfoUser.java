package layout;
import dao.PlayerDAO;
import entities.Player;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class InfoUser extends javax.swing.JFrame {
    private ListPlayer dsNguoiChoi;
    private DefaultTableModel dtmNguoiChoi;
    private Vector vTitle, vData;
    public InfoUser() {
        initComponents();
        dsNguoiChoi=new ListPlayer();
        myInit();
        tbQuanLiQuanNet.setVisible(true);
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        labelMatKhau = new javax.swing.JLabel();
        labelNapTien = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        txtNapTien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLiQuanNet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonThemMoi = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        butt_NapTien = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÔNG TIN NGƯỜI CHƠI");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin người chơi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        labelMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMatKhau.setText("Mật khẩu");

        labelNapTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNapTien.setText("Nạp tiền");

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNapTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNapTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtNapTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNapTien)
                    .addComponent(txtNapTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        vTitle = new Vector();
        vTitle.add("Id");
        vTitle.add("Username");
        vTitle.add("Password");
        vTitle.add("Money");

        vData = PlayerDAO.getData();

        tbQuanLiQuanNet.setModel(new javax.swing.table.DefaultTableModel(
                vData, vTitle
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };


         /* public Class getColumnClass(int columnIndex) {
              return  public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            } types [Integer.parseInt(null)];
          }*/

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbQuanLiQuanNet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {

                tbQuanLiQuanNetMouseClicked(evt);
            }
        });
        tbQuanLiQuanNet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbQuanLiQuanNetKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbQuanLiQuanNet);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH NGƯỜI CHƠI");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        buttonThemMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/az.png"))); // NOI18N
        buttonThemMoi.setText("Thêm mới");
        buttonThemMoi.setMaximumSize(new java.awt.Dimension(90, 25));
        buttonThemMoi.setPreferredSize(new java.awt.Dimension(85, 25));
        buttonThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThemMoiActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/azx.png"))); // NOI18N
        buttonDelete.setText("Xóa");
        buttonDelete.setPreferredSize(new java.awt.Dimension(85, 25));
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/up.png"))); // NOI18N
        buttonUpdate.setText("Cập nhật");
        buttonUpdate.setPreferredSize(new java.awt.Dimension(85, 25));
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        buttonRefresh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/rf.png"))); // NOI18N
        buttonRefresh.setText("Refresh");
        buttonRefresh.setPreferredSize(new java.awt.Dimension(85, 25));
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });



        butt_NapTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        butt_NapTien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/money.png"))); // NOI18N
        butt_NapTien.setText("Nạp tiền");
        butt_NapTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_NapTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butt_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(butt_NapTien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean Check(String name) throws Exception {
        BufferedReader bufferedReader = null;
        Reader reader = new FileReader("ThongTinNguoiChoi.txt");
        bufferedReader = new BufferedReader(reader);
        String Str = "";
        while (bufferedReader.ready()) {
            Str += bufferedReader.readLine() + " ";
        }
        String[] split = Str.split(" ");
        for (int i = 0; i < split.length; ++i) {
            if (split[i].equals(name)) {
                JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập này đã có.");
                return false;
            }
        }
        return true;
    }
    
    private void buttonThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThemMoiActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        String username = txtTen.getText();
        String password = txtMatKhau.getText();
        int money = Integer.parseInt(txtNapTien.getText());
        Player nguoi_choi = new Player(id, username, password, money);
        System.out.println(nguoi_choi);
        if(!PlayerDAO.addPlayer(nguoi_choi)){
            JOptionPane.showMessageDialog(rootPane, "Lỗi.");
        }
        this.updateTable();

    }//GEN-LAST:event_buttonThemMoiActionPerformed

    public void updateTable() {
        vData = PlayerDAO.getData();
        tbQuanLiQuanNet.setModel(new DefaultTableModel(vData, vTitle));
    }
    
    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtID.getText());
            PlayerDAO.delete(id);
            this.updateTable();
        } catch (Exception ex) {
//            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void Ghi_file(String[] split) throws Exception {
        BufferedWriter bufferedWriter = null;
        Writer writer = new FileWriter("ThongTinNguoiChoi.txt");
        bufferedWriter = new BufferedWriter(writer);
        int count = 0;
        for (int i = 0; i < split.length;   ) {
            if (split[i] == null) {
                ++i;
            }
            else {
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
        }
        bufferedWriter.close();
        writer.close();
    }
    
    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtID.getText());
        String username = txtTen.getText();
        String password = txtMatKhau.getText();
        int money =  Integer.parseInt(txtNapTien.getText());
        Player nguoi_choi = new Player(id, username, password, money);
        System.out.println(nguoi_choi);
        PlayerDAO.update(id, nguoi_choi);
        updateTable();

    }//GEN-LAST:event_buttonUpdateActionPerformed
    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed


    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        // TODO add your handling code here:
        Setvaluenull();
        this.updateTable();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void tbQuanLiQuanNetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbQuanLiQuanNetKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbQuanLiQuanNetKeyPressed

    private void tbQuanLiQuanNetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQuanLiQuanNetMouseClicked
        // TODO add your handling code here:
        int row = tbQuanLiQuanNet.getSelectedRow();
        Vector temp = (Vector) vData.get(row);
        txtID.setText(temp.get(0) + "");
        txtTen.setText(temp.get(1) + "");
        txtMatKhau.setText(temp.get(2) + "");
        txtNapTien.setText(temp.get(3) + "");

        
    }//GEN-LAST:event_tbQuanLiQuanNetMouseClicked

    private void butt_NapTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_NapTienActionPerformed
        // TODO add your handling code here:
        if (!txtNapTien.getText().isEmpty() && !txtID.getText().isEmpty()) {
            try {
                int Tien = Integer.parseInt(txtNapTien.getText());
                int id = Integer.parseInt(txtID.getText());
                if(PlayerDAO.napTien(id, Tien)){
                    JOptionPane.showMessageDialog(rootPane, "Nạp tiền thành công.");
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Nạp tiền không thành công.");
                }
                updateTable();
            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Nạp tiền không thành công.");
            }

        }
    }//GEN-LAST:event_butt_NapTienActionPerformed
    
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
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoUser().setVisible(true);
            }
        });
    }
    
    private void myInit(){
//        dtmNguoiChoi = (DefaultTableModel)tbQuanLiQuanNet.getModel();
//        tbQuanLiQuanNet.setModel(dtmNguoiChoi);
        setLocationRelativeTo(null);
        dsNguoiChoi= new ListPlayer();
    }
    
    private void XoaDuLieu(){
        while(dtmNguoiChoi.getRowCount()>0){
            dtmNguoiChoi.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butt_NapTien;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonThemMoi;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMatKhau;
    private javax.swing.JLabel labelNapTien;
    private javax.swing.JTable tbQuanLiQuanNet;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNapTien;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    private void Setvaluenull() {
        txtID.setText(null);
        txtTen.setText(null);
        txtNapTien.setText(null);
        txtMatKhau.setText(null);
    }
}
