
import com.stripbandunk.jwidget.annotation.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class peminjaman {
       @TableColumn(number=1, name ="NIM")
 private String nim;
      @TableColumn(number=2, name ="Nama")
 private String nama;
       @TableColumn(number=3, name ="Kode")
 private String kode;
       @TableColumn(number=4, name ="Judul") 
 private String judul;
        @TableColumn(number=5, name ="Tgl_pinjam")
 private String tgl_pinjam;

    public String getNIM() {
        return nim;
    }

    public void setNIM(String NIM) {
        this.nim = nim;
    }
 public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = nama;
    }
    public String getKode() {
        return kode;
    }

    public void setKode(String Kode) {
        this.kode = kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String Judul) {
        this.judul = judul;
    }

    public String getTanggalPinjam() {
        return tgl_pinjam;
    }

    public void setTanggalPinjam(String Tgl_pinjam) {
        this.tgl_pinjam= tgl_pinjam;
    }

    
}
