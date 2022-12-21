/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.stripbandunk.jwidget.annotation.TableColumn;
/**
 *
 * @author Yasmine
 */
public class buku {
      @TableColumn(number=2, name ="Kode Buku")
 private String kode;
       @TableColumn(number=3, name ="Jenis Buku")
 private String jenis;
       @TableColumn(number=4, name ="Judul Buku") 
 private String judul;
        @TableColumn(number=5, name ="Pengarang Buku")
 private String pengarang;
         @TableColumn(number=6, name ="Tahun Buku")
 private String tahun;
         @TableColumn(number=7, name ="Stok Buku")
 private int stok;

  
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
