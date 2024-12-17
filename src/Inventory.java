
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.sql.*;
/**
 *
 * @author Evrilia Elsyabila
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMerk = new javax.swing.JTextField();
        txtGaransi = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtBeli = new javax.swing.JTextField();
        txtJual = new javax.swing.JTextField();
        lblGambar = new javax.swing.JLabel();
        btnUnggah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblKeterangan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxTipe = new javax.swing.JComboBox<>();

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Garansi");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 206, 246));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nama Barang");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Merk");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Garansi");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Jumlah Stok");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Harga Beli");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Harga Jual");

        txtID.setBackground(new java.awt.Color(255, 255, 255));

        txtMerk.setBackground(new java.awt.Color(255, 255, 255));
        txtMerk.setToolTipText("");

        txtGaransi.setBackground(new java.awt.Color(255, 255, 255));

        txtStok.setBackground(new java.awt.Color(255, 255, 255));

        txtBeli.setBackground(new java.awt.Color(255, 255, 255));

        txtJual.setBackground(new java.awt.Color(255, 255, 255));

        lblGambar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUnggah.setText("Unggah");
        btnUnggah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnggahActionPerformed(evt);
            }
        });

        tblBarang.setBackground(new java.awt.Color(255, 255, 255));
        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Barang", "Tipe", "Nama Barang", "Merk", "Garansi", "Jumlah Stok", "Harga Beli", "Harga Jual", "Gambar"
            }
        ));
        tblBarang.setGridColor(new java.awt.Color(148, 230, 241));
        jScrollPane1.setViewportView(tblBarang);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setToolTipText("");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ID Barang");

        txtNama.setBackground(new java.awt.Color(255, 255, 255));

        lblKeterangan.setText("Keterangan");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tipe");

        boxTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektronik", "Non Elektronik", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGaransi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(txtMerk, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGambar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnggah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(boxTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUbah)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUnggah)))
                .addGap(7, 7, 7)
                .addComponent(lblKeterangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(467, Short.MAX_VALUE))
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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Connection conn = null;
        PreparedStatement pstBarang = null;
        PreparedStatement pstElektronik = null;

        try {
            String idBarang = txtID.getText();
            String namaBarang = txtNama.getText();
            String merk = txtMerk.getText();
            String garansi = txtGaransi.getText();
            double hargaBeli = Double.parseDouble(txtBeli.getText());
            double hargaJual = Double.parseDouble(txtJual.getText());
            int jumlahStok = Integer.parseInt(txtStok.getText());
            String tipe = (String) boxTipe.getSelectedItem();

            ImageIcon gambar = (ImageIcon) lblGambar.getIcon();
            if (gambar == null) {
                throw new Exception("Gambar tidak boleh kosong!");
            }
            String imagePath = "path/to/image.png"; // Simpan path gambar

            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            String sqlBarang = "INSERT INTO barang (id_barang, nama_barang, merk, garansi, harga_beli, harga_jual, jumlah_stok, gambar) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            pstBarang = conn.prepareStatement(sqlBarang);
            pstBarang.setString(1, idBarang);
            pstBarang.setString(2, namaBarang);
            pstBarang.setString(3, merk);
            pstBarang.setString(4, garansi);
            pstBarang.setDouble(5, hargaBeli);
            pstBarang.setDouble(6, hargaJual);
            pstBarang.setInt(7, jumlahStok);
            pstBarang.setString(8, imagePath);
            pstBarang.executeUpdate();

            if (tipe.equals("Elektronik")) {
                String sqlElektronik = "INSERT INTO elektronik (id_barang, tipe) VALUES (?, ?)";
                pstElektronik = conn.prepareStatement(sqlElektronik);
                pstElektronik.setString(1, idBarang);
                pstElektronik.setString(2, tipe);
                pstElektronik.executeUpdate();
            }

            conn.commit();
            lblKeterangan.setText("Data berhasil disimpan ke database!");
            lblKeterangan.setForeground(Color.BLACK);

            DefaultTableModel data = (DefaultTableModel) tblBarang.getModel();
            data.addRow(new Object[]{idBarang, tipe, namaBarang, merk, garansi, jumlahStok, hargaBeli, hargaJual, imagePath});

            clearFields();
        } catch (Exception e) {
            handleException(conn, e);
        } finally {
            closeConnections(pstBarang, pstElektronik, conn);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            int selectedRow = tblBarang.getSelectedRow();
            if (selectedRow == -1) {
                throw new Exception("Pilih baris yang ingin diubah!");
            }

            String idBarang = txtID.getText();
            String namaBarang = txtNama.getText();
            String merk = txtMerk.getText();
            String garansi = txtGaransi.getText();
            double hargaBeli = Double.parseDouble(txtBeli.getText());
            double hargaJual = Double.parseDouble(txtJual.getText());
            int jumlahStok = Integer.parseInt(txtStok.getText());
            String tipe = (String) boxTipe.getSelectedItem();

            ImageIcon gambar = (ImageIcon) lblGambar.getIcon();
            if (gambar == null) {
                throw new Exception("Gambar tidak boleh kosong!");
            }
            String imagePath = "path/to/image.png"; // Update with the correct image path

            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            String sql = "UPDATE barang SET nama_barang = ?, merk = ?, garansi = ?, harga_beli = ?, harga_jual = ?, jumlah_stok = ?, gambar = ? WHERE id_barang = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, namaBarang);
            pst.setString(2, merk);
            pst.setString(3, garansi);
            pst.setDouble(4, hargaBeli);
            pst.setDouble(5, hargaJual);
            pst.setInt(6, jumlahStok);
            pst.setString(7, imagePath);
            pst.setString(8, idBarang);
            pst.executeUpdate();

            if (tipe.equals("Elektronik")) {
                String sqlElektronik = "UPDATE elektronik SET tipe = ? WHERE id_barang = ?";
                PreparedStatement pstElektronik = conn.prepareStatement(sqlElektronik);
                pstElektronik.setString(1, tipe);
                pstElektronik.setString(2, idBarang);
                pstElektronik.executeUpdate();
                pstElektronik.close();
            }

            conn.commit();
            lblKeterangan.setText("Data Berhasil diubah!");
            lblKeterangan.setForeground(Color.BLACK);

            updateTable(selectedRow, idBarang, tipe, namaBarang, merk, garansi, jumlahStok, hargaBeli, hargaJual, imagePath);
        } catch (Exception e) {
            handleException(conn, e);
        } finally {
            closeConnections(pst, null, conn);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        Connection conn = null;
        PreparedStatement pstElektronik = null;
        PreparedStatement pstBarang = null;

        try {
            int selectedRow = tblBarang.getSelectedRow();
            if (selectedRow == -1) {
                throw new Exception("Pilih baris yang ingin dihapus!");
            }

            String idBarang = (String) tblBarang.getValueAt(selectedRow, 0);

            conn = DatabaseConnection.getConnection();
            conn.setAutoCommit(false);

            String sqlElektronik = "DELETE FROM elektronik WHERE id_barang = ?";
            pstElektronik = conn.prepareStatement(sqlElektronik);
            pstElektronik.setString(1, idBarang);
            pstElektronik.executeUpdate();

            String sqlBarang = "DELETE FROM barang WHERE id_barang = ?";
            pstBarang = conn.prepareStatement(sqlBarang);
            pstBarang.setString(1, idBarang);
            pstBarang.executeUpdate();

            conn.commit();
            lblKeterangan.setText("Data Berhasil dihapus!");
            lblKeterangan.setForeground(Color.BLACK);

            ((DefaultTableModel) tblBarang.getModel()).removeRow(selectedRow);
        } catch (Exception e) {
            handleException(conn, e);
        } finally {
            closeConnections(pstElektronik, pstBarang, conn);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUnggahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnggahActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Gambar");

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Gambar", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath(); // Store the image path

            ImageIcon imageIcon = new ImageIcon(imagePath);
            Image image = imageIcon.getImage();
            Image resizedImage = image.getScaledInstance(lblGambar.getWidth(), lblGambar.getHeight(), Image.SCALE_SMOOTH);
            lblGambar.setIcon(new ImageIcon(resizedImage));
        }
    }//GEN-LAST:event_btnUnggahActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipe;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUnggah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblKeterangan;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtBeli;
    private javax.swing.JTextField txtGaransi;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJual;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        DefaultTableModel model = (DefaultTableModel) tblBarang.getModel();
        model.setRowCount(0);  // Clear existing data

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT b.id_barang, e.tipe, b.nama_barang, b.merk, b.garansi, b.jumlah_stok, b.harga_beli, b.harga_jual, b.gambar FROM barang b LEFT JOIN elektronik e ON b.id_barang = e.id_barang")) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_barang"),
                    rs.getString("tipe"),
                    rs.getString("nama_barang"),
                    rs.getString("merk"),
                    rs.getString("garansi"),
                    rs.getInt("jumlah_stok"),
                    rs.getDouble("harga_beli"),
                    rs.getDouble("harga_jual"),
                    rs.getString("gambar")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data from database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        txtID.setText("");
        txtNama.setText("");
        txtMerk.setText("");
        txtGaransi.setText("");
        txtBeli.setText("");
        txtJual.setText("");
        txtStok.setText("");
        lblGambar.setIcon(null);
    }

    private void updateTable(int selectedRow, String idBarang, String tipe, String namaBarang, String merk, String garansi, int jumlahStok, double hargaBeli, double hargaJual, String imagePath) {
        DefaultTableModel data = (DefaultTableModel) tblBarang.getModel();
        data.setValueAt(idBarang, selectedRow, 0);
        data.setValueAt(tipe, selectedRow, 1);
        data.setValueAt(namaBarang, selectedRow, 2);
        data.setValueAt(merk, selectedRow, 3);
        data.setValueAt(garansi, selectedRow, 4);
        data.setValueAt(jumlahStok, selectedRow, 5);
        data.setValueAt(hargaBeli, selectedRow, 6);
        data.setValueAt(hargaJual, selectedRow, 7);
        data.setValueAt(imagePath, selectedRow, 8);
    }

    private void handleException(Connection conn, Exception e) {
        try {
            if (conn != null) {
                conn.rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        lblKeterangan.setText("Error: " + e.getMessage());
        lblKeterangan.setForeground(Color.RED);
    }

    private void closeConnections(PreparedStatement pstBarang, PreparedStatement pstElektronik, Connection conn) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> new Inventory().setVisible(true));
    }
}