/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Transaksi extends javax.swing.JFrame {
    DefaultTableModel model;
    private int barisTerpilih;
    /**
     * Creates new form Transaksi
     */
    public Transaksi() {
        initComponents();

        String[] judul = {"idTransaksi", "idObjekWisata", "Tanggal", "JumlahTiket", "TotalTransaksi"};
        model = new DefaultTableModel(judul, 0);
        TableTransaksi.setModel(model);
        tampilkan();
        TableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            tabelMouseClicked(evt);
        }

            private void tabelMouseClicked(MouseEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTransaksi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfTiket = new javax.swing.JTextField();
        cbWisata = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        Cari = new javax.swing.JButton();
        tfCari = new javax.swing.JTextField();
        Isi = new javax.swing.JButton();
        Simpan = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Transaksi Wisata"));

        TableTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTransaksi);

        jLabel1.setText("Wisata");

        jLabel2.setText("Tanggal");

        jLabel3.setText("Jumlah Tiket");

        cbWisata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "7", "8", "9" }));

        jLabel4.setText("Harga");

        Cari.setText("Cari");
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        Isi.setText("Isi");
        Isi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cari)
                        .addGap(18, 18, 18)
                        .addComponent(tfCari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Kembali))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Keluar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Isi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reset)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbWisata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Keluar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kembali)
                    .addComponent(tfTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Isi)
                    .addComponent(Simpan)
                    .addComponent(Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cari)
                    .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiActionPerformed
        // TODO add your handling code here:
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dbObjek_wisata", "root", "");

        String sql = "INSERT INTO transaksi (idObjekWisata, Tanggal, JumlahTiket, TotalTransaksi) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            String idObjekWisata = cbWisata.getSelectedItem().toString();
            String tanggal = tfDate.getText();
            String jumlahTiket = tfTiket.getText();
            
            int harga = Integer.parseInt(tfHarga.getText());
            int jumlah = Integer.parseInt(jumlahTiket);
            int total = harga * jumlah;

            ps.setString(1, idObjekWisata);
            ps.setString(2, tanggal);
            ps.setString(3, jumlahTiket);
            ps.setInt(4, total);

            ps.executeUpdate();

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int id = generatedKeys.getInt(1);

                String[] data = {String.valueOf(id), idObjekWisata, tanggal, jumlahTiket, String.valueOf(total)};
                model.addRow(data);

                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan ke dalam tabel.");

                resetForm();
            }
        }

        cn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + ex.getMessage());
        Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_IsiActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                String fileFormat = getFileExtension(selectedFile);

                FileWriter out = new FileWriter(selectedFile, true);
                for (int row = 0; row < model.getRowCount(); row++) {
                    String idTransaksi = model.getValueAt(row, 0).toString();
                    String idObjekWisata = model.getValueAt(row, 1).toString();
                    String tanggal = model.getValueAt(row, 2).toString();
                    String jumlahTiket = model.getValueAt(row, 3).toString();
                    String total = model.getValueAt(row, 4).toString();

                    if ("txt".equalsIgnoreCase(fileFormat)) {
                        out.write(idTransaksi + "\t" + idObjekWisata + "\t" + tanggal + "\t" + jumlahTiket + "\t" + total);
                        out.write(System.getProperty("line.separator"));
                    } else if ("csv".equalsIgnoreCase(fileFormat)) {
                        out.write(idTransaksi + "," + idObjekWisata + "," + tanggal + "," + jumlahTiket + "," + total);
                        out.write(System.getProperty("line.separator"));
                    }
                }

                out.close();

                JOptionPane.showMessageDialog(this, "Data dalam tabel berhasil disimpan", "Export Success",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Data dalam table gagal disimpan", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_ResetActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
        try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dbObjek_wisata", "root", "");
        String keyword = tfCari.getText();
        String sql = "SELECT * FROM transaksi WHERE idObjekWisata LIKE ? OR IdTransaksi LIKE ?";

        try (PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();
            model.setRowCount(0); // Clear the table before adding search results

            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        }

        cn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + ex.getMessage());
        Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_CariActionPerformed

    private void TableTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTransaksiMouseClicked
        // TODO add your handling code here:
    int barisTerpilih = TableTransaksi.getSelectedRow();
    if (barisTerpilih != -1) {
        cbWisata.setSelectedItem(TableTransaksi.getValueAt(barisTerpilih, 1).toString());
        tfDate.setText(TableTransaksi.getValueAt(barisTerpilih, 2).toString());
        tfTiket.setText(TableTransaksi.getValueAt(barisTerpilih, 3).toString());
        tfHarga.setText(TableTransaksi.getValueAt(barisTerpilih, 4).toString());
    }
    }//GEN-LAST:event_TableTransaksiMouseClicked
    
    private void tampilkan() {
    int row = model.getRowCount();
    for (int a = 0; a < row; a++) {
        model.removeRow(0);
    }
 
    try {
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dbObjek_wisata", "root", "");
        ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM transaksi");

        while (rs.next()) {
            String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
            model.addRow(data);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Koneksi ke database gagal: " + ex.getMessage());
        Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
    private void resetForm() {
    cbWisata.setSelectedIndex(0); // Set to default value or choose a default index
    tfDate.setText("");
    tfTiket.setText("");
    tfHarga.setText("");
    barisTerpilih = -1;
}
    
    private String getFileExtension(File file) {
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf(".");
        if (lastDotIndex > 0 && lastDotIndex < fileName.length() - 1) {
            return fileName.substring(lastDotIndex + 1).toLowerCase();
        }
        return "";
    }
    
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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton Isi;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable TableTransaksi;
    private javax.swing.JComboBox<String> cbWisata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfTiket;
    // End of variables declaration//GEN-END:variables
}
