package gui_quannet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Giao_Dien_Lich_Su_Mo_May extends javax.swing.JFrame {
    private DefaultTableModel dtmLichSuMoMay;
    public Giao_Dien_Lich_Su_Mo_May() throws IOException {
        initComponents();
        myInit();
        tbLichSuMoMay.setVisible(true);
        NapDuLieu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLichSuMoMay = new javax.swing.JTable();
        buttXoaLichSu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LỊCH SỬ MỞ MÁY");
        setMinimumSize(new java.awt.Dimension(585, 550));
        setPreferredSize(new java.awt.Dimension(595, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LỊCH SỬ MỞ MÁY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 590, 50));

        tbLichSuMoMay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên máy", "Giờ mở máy", "Giờ tắt máy"
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
        jScrollPane1.setViewportView(tbLichSuMoMay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 460, 320));

        buttXoaLichSu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttXoaLichSu.setText("Xóa lịch sử");
        buttXoaLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttXoaLichSuActionPerformed(evt);
            }
        });
        getContentPane().add(buttXoaLichSu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttXoaLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttXoaLichSuActionPerformed
        // TODO add your handling code here:
        File file = new File("LichSuMoMay.txt");
        file.delete();
        XoaDong();
        JOptionPane.showMessageDialog(rootPane, "Đã xóa lịch sử mở máy");
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttXoaLichSuActionPerformed

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
            java.util.logging.Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Giao_Dien_Lich_Su_Mo_May().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Giao_Dien_Lich_Su_Mo_May.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    private void myInit(){
        dtmLichSuMoMay = (DefaultTableModel)tbLichSuMoMay.getModel();
        tbLichSuMoMay.setModel(dtmLichSuMoMay);
        setLocationRelativeTo(null);
    }
    
    private void NapDuLieu() throws IOException {
        BufferedReader bufferedReader;
        Reader reader;
        reader = new FileReader("LichSuMoMay.txt");
        bufferedReader = new BufferedReader(reader);
        if (reader.ready()) {
            while (true) {
                String Str = bufferedReader.readLine();
                if (Str == null)
                    break;
                String[] split = Str.split(" ");
                dtmLichSuMoMay.addRow(new Object[]{
                    split[0] + " " + split[1],
                    split[2],
                    split[3]
                });
            }            
        }
//        else
//            XoaDong();
        bufferedReader.close();
        reader.close();
    }
    
    private void XoaDong() {
        while (dtmLichSuMoMay.getRowCount() > 0) {
            dtmLichSuMoMay.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttXoaLichSu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLichSuMoMay;
    // End of variables declaration//GEN-END:variables
}
