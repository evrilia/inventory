
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Evrilia Elsyabila
 */
public class Elektronik extends Barang {
    private String tipe;

    public Elektronik(String idBarang, String namaBarang, String merk, String garansi, int jumlahStok,
                      double hargaBeli, double hargaJual, ImageIcon gambar, String tipe) throws ValidasiInputException {
        super(idBarang, namaBarang, merk, garansi, jumlahStok, hargaBeli, hargaJual, gambar);

        if (tipe.isEmpty()) {
            throw new ValidasiInputException("Tipe tidak boleh kosong!");
        }
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }
}
