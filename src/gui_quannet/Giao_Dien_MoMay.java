package gui_quannet;
import Model.May_tinh;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Giao_Dien_MoMay extends javax.swing.JFrame {
    private DS_Maytinh dsmaytinh;
    private DefaultTableModel dtmMayTinh;
    private DefaultTableModel dtmLichSuMayTinh;
    SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    SimpleDateFormat tb = new SimpleDateFormat("dd/MM/yyyy");
    May_tinh n1 = new May_tinh();
    May_tinh n2 = new May_tinh();
    May_tinh n3 = new May_tinh();
    May_tinh n4 = new May_tinh();
    May_tinh n5 = new May_tinh();
    May_tinh n6 = new May_tinh();
    boolean m1 = false, m2 = false, m3 = false, m4 = false, m5 = false, m6 = false;
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
    
    public Giao_Dien_MoMay() {
        initComponents();
        dsmaytinh=new DS_Maytinh();
        myInit();
        tb_momay.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butt_may5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_momay = new javax.swing.JTable();
        butt_may2 = new javax.swing.JButton();
        butt_may3 = new javax.swing.JButton();
        butt_tinhtien = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_TongTien = new javax.swing.JTextField();
        txt_timeRa = new javax.swing.JTextField();
        txt_TenMay = new javax.swing.JTextField();
        txt_TimeVao = new javax.swing.JTextField();
        butt_may1 = new javax.swing.JButton();
        butt_may6 = new javax.swing.JButton();
        butt_may4 = new javax.swing.JButton();
        buttLSMM = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_DoiMatKhau = new javax.swing.JMenu();
        MENU_LichSuMoMay = new javax.swing.JMenuItem();
        MENU_DoiMatKhau = new javax.swing.JMenuItem();
        MENU_DangXuat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("GIAO DIỆN MỞ MÁY");

        butt_may5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may5.setText("MÁY 5");
        butt_may5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may5ActionPerformed(evt);
            }
        });

        tb_momay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên máy", "Thời gian vào", "Thời gian ra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_momay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_momayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_momay);

        butt_may2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may2.setText("MÁY 2");
        butt_may2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may2ActionPerformed(evt);
            }
        });

        butt_may3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may3.setText("MÁY 3");
        butt_may3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may3ActionPerformed(evt);
            }
        });

        butt_tinhtien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        butt_tinhtien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/money2.png"))); // NOI18N
        butt_tinhtien.setText("Tính tiền");
        butt_tinhtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_tinhtienActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("GIAO DIỆN MỞ MÁY");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Thời gian vào");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Tổng tiền");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Tên máy");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Thời gian ra");

        txt_TongTien.setEditable(false);
        txt_TongTien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_TongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TongTienActionPerformed(evt);
            }
        });

        txt_timeRa.setEditable(false);
        txt_timeRa.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txt_TenMay.setEditable(false);
        txt_TenMay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txt_TimeVao.setEditable(false);
        txt_TimeVao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_TimeVao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimeVaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_timeRa, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TimeVao, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenMay, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TimeVao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_timeRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        butt_may1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may1.setText("MÁY 1");
        butt_may1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may1ActionPerformed(evt);
            }
        });

        butt_may6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may6.setText("MÁY 6");
        butt_may6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may6ActionPerformed(evt);
            }
        });

        butt_may4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        butt_may4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/comp.png"))); // NOI18N
        butt_may4.setText("MÁY 4");
        butt_may4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butt_may4ActionPerformed(evt);
            }
        });

        buttLSMM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttLSMM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lsmomay.png"))); // NOI18N
        buttLSMM.setText("Lịch sử mở máy");
        buttLSMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttLSMMActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dánhachhoivien.png"))); // NOI18N
        jButton1.setText("Danh sách người chơi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Menu_DoiMatKhau.setText("MENU");

        MENU_LichSuMoMay.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_LichSuMoMay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MENU_LichSuMoMay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lsmomay.png"))); // NOI18N
        MENU_LichSuMoMay.setText("Lịch sử mở máy");
        MENU_LichSuMoMay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_LichSuMoMayActionPerformed(evt);
            }
        });
        Menu_DoiMatKhau.add(MENU_LichSuMoMay);

        MENU_DoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MENU_DoiMatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MENU_DoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pas12.png"))); // NOI18N
        MENU_DoiMatKhau.setText("Đổi mật khẩu");
        MENU_DoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_DoiMatKhauActionPerformed(evt);
            }
        });
        Menu_DoiMatKhau.add(MENU_DoiMatKhau);

        MENU_DangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MENU_DangXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MENU_DangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/out.png"))); // NOI18N
        MENU_DangXuat.setText("Đăng xuất");
        MENU_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENU_DangXuatActionPerformed(evt);
            }
        });
        Menu_DoiMatKhau.add(MENU_DangXuat);

        jMenuBar1.add(Menu_DoiMatKhau);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butt_may1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butt_may2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butt_may3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butt_may4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butt_may6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butt_may5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttLSMM)
                                .addGap(43, 43, 43)
                                .addComponent(butt_tinhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt_may1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt_may4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt_may2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt_may5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butt_may3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butt_may6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttLSMM)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butt_tinhtien))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void butt_may5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may5ActionPerformed
        // TODO add your handling code here:
        n5.setTen_may("May 5");
        if (count5 != 2) {
            if(evt.getSource() == butt_may5 && m5 == false){
                n5.setTimeVao(new Date());
                n5.setTimeRa(null);
                dsmaytinh.Them(n5);
                NapDuLieu();           
                m5 = true;
                count5 += 1;
            }
            else if(evt.getSource() == butt_may5 && m5 == true){
                n5.setTimeVao(n5.getTimeVao());
                n5.setTimeRa(new Date());
                m5 = false;
                count5 += 1;
                dsmaytinh.Sua(n5);
                NapDuLieu();
            }
        }
    }//GEN-LAST:event_butt_may5ActionPerformed

    private void txt_TimeVaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimeVaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TimeVaoActionPerformed

    private void tb_momayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_momayMouseClicked
        // TODO add your handling code here:
        int row = tb_momay.rowAtPoint(evt.getPoint());
        May_tinh nv = dsmaytinh.Tim(String.valueOf(tb_momay.getValueAt(row, 0)).trim());
        txt_TenMay.setText(nv.getTen_may());
        txt_TimeVao.setText(df.format(nv.getTimeVao()));
        try {
            txt_timeRa.setText(df.format(nv.getTimeRa()));
            Date date1=df.parse(txt_TimeVao.getText());
            Date date2=df.parse(txt_timeRa.getText());
            txt_TongTien.setText(String.valueOf(Math.round((date2.getTime()-date1.getTime())*1.0/3600000 * 10000)));
        } catch (ParseException ex) {
            Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_momayMouseClicked
    
    private void Ghi_file() throws IOException {
        BufferedWriter bufferedWriter = null;
        Writer writer = new FileWriter("LichSuMoMay.txt", true);
        bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(txt_TenMay.getText() + " ");
        bufferedWriter.write(txt_TimeVao.getText() + " ");
        bufferedWriter.write(txt_timeRa.getText() + "\n");
        bufferedWriter.close();
        writer.close();
    }
    private void butt_tinhtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_tinhtienActionPerformed
        // TODO add your handling code here:
        if (!txt_TongTien.getText().isEmpty()) {
            try {
                Ghi_file();
                this.dsmaytinh.Xoa(txt_TenMay.getText());
                JOptionPane.showMessageDialog(rootPane, "Đã thanh toán.");
                NapDuLieu();
                Setvaluenull();
                if (count1 == 2)
                    count1 = 0;
                if (count2 == 2)
                    count2 = 0;
                if (count3 == 2)
                    count3 = 0;
                if (count4 == 2)
                    count4 = 0;
                if (count5 == 2)
                    count5 = 0;
                if (count6 == 2)
                    count6 =0;
            } catch (IOException ex) {
                Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_butt_tinhtienActionPerformed

    private void butt_may2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may2ActionPerformed
        // TODO add your handling code here:
        n2.setTen_may("May 2");
        if (count2 != 2) {
            if(evt.getSource() == butt_may2 && m2 == false){
                n2.setTimeVao(new Date());
                n2.setTimeRa(null);
                dsmaytinh.Them(n2);
                NapDuLieu();           
                m2 = true;
                count2 += 1;
            }
            else if(evt.getSource() == butt_may2 && m2 == true){
                n2.setTimeVao(n2.getTimeVao());
                n2.setTimeRa(new Date());
                dsmaytinh.Sua(n2);
                NapDuLieu();
                m2 = false;
                count2 += 1;
            }
        }
    }//GEN-LAST:event_butt_may2ActionPerformed
    private void butt_may3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may3ActionPerformed
        // TODO add your handling code here:
        n3.setTen_may("May 3");
        if (count3 != 2) {
            if(evt.getSource() == butt_may3 && m3 == false){
                n3.setTimeVao(new Date());
                n3.setTimeRa(null);
                dsmaytinh.Them(n3);
                NapDuLieu();           
                m3 = true;
                count3 += 1;
            }
            else if(evt.getSource() == butt_may3 && m3 == true){
                n3.setTimeVao(n3.getTimeVao());
                n3.setTimeRa(new Date());
                dsmaytinh.Sua(n3);
                NapDuLieu();
                m3 = false;
                count3 += 1;
            }
        }
    }//GEN-LAST:event_butt_may3ActionPerformed
    private void txt_TongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TongTienActionPerformed

    private void butt_may1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may1ActionPerformed
        // TODO add your handling code here:
        n1.setTen_may("May 1");
        if (count1 != 2) {
            if(evt.getSource() == butt_may1 && m1 == false){
                n1.setTimeVao(new Date());
                n1.setTimeRa(null);
                dsmaytinh.Them(n1);
                NapDuLieu();           
                m1 = true;
                count1 += 1;
            }
            else if(evt.getSource() == butt_may1 && m1 == true){
                n1.setTimeVao(n1.getTimeVao());
                n1.setTimeRa(new Date());
                dsmaytinh.Sua(n1);
                NapDuLieu();
                m1 = false;
                count1 += 1;
            }
        }
    }//GEN-LAST:event_butt_may1ActionPerformed
    private void butt_may6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may6ActionPerformed
        // TODO add your handling code here:
        n6.setTen_may("May 6");
        if (count6 != 2) {
            if(evt.getSource() == butt_may6 && m6 == false){
                n6.setTimeVao(new Date());
                n6.setTimeRa(null);
                dsmaytinh.Them(n6);
                NapDuLieu();           
                m6 = true;
                count6 += 1;
            }
            else if(evt.getSource() == butt_may6 && m6 == true){
                n6.setTimeVao(n6.getTimeVao());
                n6.setTimeRa(new Date());
                dsmaytinh.Sua(n6);
                NapDuLieu();
                m6 = false;
                count6 += 1;
            }
        }
    }//GEN-LAST:event_butt_may6ActionPerformed
    private void butt_may4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butt_may4ActionPerformed
        // TODO add your handling code here:
        n4.setTen_may("May 4");
        if (count4 != 2) {
            if(evt.getSource() == butt_may4 && m4 == false){
                n4.setTimeVao(new Date());
                n4.setTimeRa(null);
                dsmaytinh.Them(n4);
                NapDuLieu();           
                m4 = true;
                count4 += 1;
            }
            else if(evt.getSource() == butt_may4 && m4 == true){
                n4.setTimeVao(n4.getTimeVao());
                n4.setTimeRa(new Date());
                dsmaytinh.Sua(n4);
                NapDuLieu();
                m4 = false;
                count4 += 1;
            }
        }
    }//GEN-LAST:event_butt_may4ActionPerformed
    private void buttLSMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLSMMActionPerformed
        // TODO add your handling code here:
        try {
            Giao_Dien_Lich_Su_Mo_May G = new Giao_Dien_Lich_Su_Mo_May();
            G.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttLSMMActionPerformed

    private void MENU_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_DangXuatActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == MENU_DangXuat) {
            int a = JOptionPane.showOptionDialog(rootPane, "Bạn có muốn đăng xuất?", "ĐĂNG XUẤT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE , null, null, EXIT_ON_CLOSE);
            if (a == 0) {
                Giao_Dien_Dang_Nhap_Nguoi_Dung N = new Giao_Dien_Dang_Nhap_Nguoi_Dung();
                N.setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_MENU_DangXuatActionPerformed

    private void MENU_LichSuMoMayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_LichSuMoMayActionPerformed
        // TODO add your handling code here:
        buttLSMMActionPerformed(evt);
    }//GEN-LAST:event_MENU_LichSuMoMayActionPerformed

    private void MENU_DoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENU_DoiMatKhauActionPerformed
        // TODO add your handling code here:
        new Giao_Dien_Doi_Mat_Khau_Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_MENU_DoiMatKhauActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Giao_Dien_Quan_Li_Thong_Tin_Nguoi_Choi().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_MoMay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giao_Dien_MoMay().setVisible(true);
            }
        });
    }
    
    private void myInit(){
        dtmMayTinh = (DefaultTableModel)tb_momay.getModel();
        tb_momay.setModel(dtmMayTinh);
        setLocationRelativeTo(null);
        dsmaytinh=new DS_Maytinh();
    }
    
    private void XoaDuLieu(){
        while(dtmMayTinh.getRowCount()>0){
            dtmMayTinh.removeRow(0);
        }
    }
    
    private void ThemMotDong(May_tinh nv){
        dtmMayTinh.addRow(new Object[]{
            nv.getTen_may(),
            nv.getTimeVao(),
            nv.getTimeRa(),
            nv.getTongTien()
        });
    }
    
    private void NapDuLieu(){
        XoaDuLieu();
        for(May_tinh nv : dsmaytinh.getDS()){
            ThemMotDong(nv);
        }
    }
    
    private void Setvaluenull() {
        txt_TenMay.setText(null);
        txt_TimeVao.setText(null);
        txt_timeRa.setText(null);
        txt_TongTien.setText(null);      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MENU_DangXuat;
    private javax.swing.JMenuItem MENU_DoiMatKhau;
    private javax.swing.JMenuItem MENU_LichSuMoMay;
    private javax.swing.JMenu Menu_DoiMatKhau;
    private javax.swing.JButton buttLSMM;
    private javax.swing.JButton butt_may1;
    private javax.swing.JButton butt_may2;
    private javax.swing.JButton butt_may3;
    private javax.swing.JButton butt_may4;
    private javax.swing.JButton butt_may5;
    private javax.swing.JButton butt_may6;
    private javax.swing.JButton butt_tinhtien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_momay;
    private javax.swing.JTextField txt_TenMay;
    private javax.swing.JTextField txt_TimeVao;
    private javax.swing.JTextField txt_TongTien;
    private javax.swing.JTextField txt_timeRa;
    // End of variables declaration//GEN-END:variables
}
