/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package GUI;

import Controller.ControllerSiswa;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import Model.Database;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

public class guiSiswa extends javax.swing.JFrame {

    /**
     * Creates new form guiSis
     */
    public guiSiswa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneDaftarSiswa = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrameNilai = new javax.swing.JInternalFrame();
        jLSiswa = new javax.swing.JLabel();
        jLabelNIS = new javax.swing.JLabel();
        jTextFieldNIS = new javax.swing.JTextField();
        jBSearch = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelWaliKelas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSiswa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelWaliKelas1 = new javax.swing.JLabel();
        jInternalFrameDaftarSiswa = new javax.swing.JInternalFrame();
        jLabelNamaSiswa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameNilai.setVisible(true);
        jInternalFrameNilai.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSiswa.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLSiswa.setText("SISWA");
        jInternalFrameNilai.getContentPane().add(jLSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, -1, -1));

        jLabelNIS.setText("NIS                    :");
        jInternalFrameNilai.getContentPane().add(jLabelNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 93, -1, 39));
        jInternalFrameNilai.getContentPane().add(jTextFieldNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 97, 149, 31));

        jBSearch.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        jBSearch.setText("Search");
        jBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSearchActionPerformed(evt);
            }
        });
        jInternalFrameNilai.getContentPane().add(jBSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 101, -1, -1));

        btn_back.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_back.setText("Back");
        jInternalFrameNilai.getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 26));

        jLabel1.setText("NAMA                :");
        jInternalFrameNilai.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 159, -1, -1));

        jLabelWaliKelas.setText("KELAS                :");
        jInternalFrameNilai.getContentPane().add(jLabelWaliKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jTableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MATA PELAJARAN", "TASK", "NILAI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTableSiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane3.setViewportView(jTableSiswa);

        jInternalFrameNilai.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 272, 475, 338));
        jInternalFrameNilai.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 159, -1, -1));
        jInternalFrameNilai.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 188, -1, -1));
        jInternalFrameNilai.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 217, -1, -1));

        jLabelWaliKelas1.setText("WALI KELAS      :");
        jInternalFrameNilai.getContentPane().add(jLabelWaliKelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jInternalFrameNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameNilai)
        );

        jTabbedPaneDaftarSiswa.addTab("NILAI", jPanel1);

        jInternalFrameDaftarSiswa.setVisible(true);

        jLabelNamaSiswa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNamaSiswa.setText("LIST NAMA SISWA");

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jInternalFrameDaftarSiswaLayout = new javax.swing.GroupLayout(jInternalFrameDaftarSiswa.getContentPane());
        jInternalFrameDaftarSiswa.getContentPane().setLayout(jInternalFrameDaftarSiswaLayout);
        jInternalFrameDaftarSiswaLayout.setHorizontalGroup(
            jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                .addGroup(jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabelNamaSiswa))
                    .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jInternalFrameDaftarSiswaLayout.setVerticalGroup(
            jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelNamaSiswa)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jTabbedPaneDaftarSiswa.addTab("DAFTAR SISWA", jInternalFrameDaftarSiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPaneDaftarSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPaneDaftarSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSearchActionPerformed

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
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSiswa().setVisible(true);
            }
        });
    }
    
    public JButton getButtonBack(){
        return btn_back;
    }
    
    public JTable getjTableSiswa() {
        return jTableSiswa;
    }
    
    public JTextField getjTextFieldNIS() {
        return jTextFieldNIS;
    }
    
    public JList getDaftarSiswa(){
        return jList1;
    }
    
    public JList daftarsiswa(){
        return jList1;
    }
    
    public JButton getBtnCariNIS(){
        return jBSearch;
    }
    
    public JLabel getNama(){
        return jLabel5;
    }
    
    public JLabel getAngkatan(){
        return jLabel6;
    }
    
    public JLabel getStatusSiswa(){
        return jLabel7;
    }
    
    public void setNIS(){
        this.jTextFieldNIS = jTextFieldNIS;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton jBSearch;
    private javax.swing.JInternalFrame jInternalFrameDaftarSiswa;
    private javax.swing.JInternalFrame jInternalFrameNilai;
    private javax.swing.JLabel jLSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNIS;
    private javax.swing.JLabel jLabelNamaSiswa;
    private javax.swing.JLabel jLabelWaliKelas;
    private javax.swing.JLabel jLabelWaliKelas1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneDaftarSiswa;
    private javax.swing.JTable jTableSiswa;
    private javax.swing.JTextField jTextFieldNIS;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ControllerSiswa e) {
        jBSearch.addActionListener(e);
        btn_back.addActionListener(e);
    }

    public void resetTable() {
        int rowCount = jTableSiswa.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            setTabel("", "", "", "", i);
        }
    }
    
    
    public void setTabel(String nama_kelas, String nama_mapel, String aktivitas, String nis, int j){
        jTableSiswa.setValueAt(nama_kelas, j, 0);
        jTableSiswa.setValueAt(nama_mapel, j, 1);
        jTableSiswa.setValueAt(aktivitas, j, 2);   
        jTableSiswa.setValueAt(nis, j, 3);   
    }
    

}
