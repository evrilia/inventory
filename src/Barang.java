
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Evrilia Elsyabila
 */
public class Barang {
    protected String idBarang;
    protected String namaBarang;
    protected String merk;
    protected String garansi;
    protected int jumlahStok;
    protected double hargaBeli;
    protected double hargaJual;
    protected ImageIcon gambar;

    public Barang(String idBarang, String namaBarang, String merk, String garansi, int jumlahStok, double hargaBeli, double hargaJual, ImageIcon gambar) throws ValidasiInputException {
        if (idBarang.isEmpty()) {
            throw new ValidasiInputException("ID Barang tidak boleh kosong!");
        }
        if (namaBarang.isEmpty()) {
            throw new ValidasiInputException("Nama Barang tidak boleh kosong!");
        }
        if (merk.isEmpty()) {
            throw new ValidasiInputException("Merk tidak boleh kosong!");
        }
        if (garansi.isEmpty()) {
            throw new ValidasiInputException("Garansi tidak boleh kosong!");
        }
        if (jumlahStok < 0) {
            throw new ValidasiInputException("Jumlah stok tidak boleh negatif!");
        }
        if (hargaBeli <= 0) {
            throw new ValidasiInputException("Harga beli harus positif!");
        }
        if (hargaJual <= 0) {
            throw new ValidasiInputException("Harga jual harus positif!");
        }

        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.merk = merk;
        this.garansi = garansi;
        this.jumlahStok = jumlahStok;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
        this.gambar = gambar;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getMerk() {
        return merk;
    }

    public String getGaransi() {
        return garansi;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public ImageIcon getGambar() {
        return gambar;
    }

    // Method displayDetails
    public String tampilInfo() {
        return "Barang{" +
            "idBarang='" + idBarang + '\'' +
            ", namaBarang='" + namaBarang + '\'' +
            ", merk='" + merk + '\'' +
            ", garansi='" + garansi + '\'' +
            ", jumlahStok=" + jumlahStok +
            ", hargaBeli=" + hargaBeli +
            ", hargaJual=" + hargaJual +
            ", gambar=" + gambar +
            '}';
    }
}
