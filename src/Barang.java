
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
    protected String tipeElektronik;

    // Constructor dengan validasi input
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
        this.tipeElektronik = tipeElektronik;
    }

    // Getter methods
    public String idBarang() {
        return idBarang;
    }

    public String namaBarang() {
        return namaBarang;
    }

    public String merk() {
        return merk;
    }

    public String garansi() {
        return garansi;
    }

    public int jumlahStok() {
        return jumlahStok;
    }

    public double hargaBeli() {
        return hargaBeli;
    }

    public double hargaJual() {
        return hargaJual;
    }

    public ImageIcon gambar() {
        return gambar;
    }
    
    public String tipeElektronik() {
        return tipeElektronik;
    }
}
