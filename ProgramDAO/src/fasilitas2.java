
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class fasilitas2 {
    private Connection koneksi; 
 public fasilitas2() {
 koneksi = KoneksiDB.getKoneksi();
 }   
 public void insert(peminjaman peminjaman){
 PreparedStatement prepare = null;
 try {
 String sql ="INSERT INTO peminjaman (NIM,Nama,Kode,Judul,Tgl_pinjam)VALUES(?,?,?,?,?)";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1,peminjaman.getNIM());
 prepare.setString(2,peminjaman.getNama());
 prepare.setString(3,peminjaman.getKode());
 prepare.setString(4,peminjaman.getJudul());
 prepare.setString(5,peminjaman.getTanggalPinjam());
 prepare.executeUpdate();
 System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 }
 }
public void update(peminjaman peminjaman){
 PreparedStatement prepare = null;
 try {
 String sql ="UPDATE peminjaman SET NIM=?,Nama=?,Kode=?,Judul=?,Tgl_pinjam=? WHERE NIM=?";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1,peminjaman.getNIM());
 prepare.setString(2,peminjaman.getNama());
 prepare.setString(3,peminjaman.getKode());
 prepare.setString(4,peminjaman.getJudul());
 prepare.setString(5,peminjaman.getTanggalPinjam());
 prepare.executeUpdate();
System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 } 
 }
public void delete(String kode, String nim){
 PreparedStatement prepare = null;
 try {
 String sql ="DELETE FROM peminjaman WHERE NIM=?";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1, nim);
 prepare.executeUpdate();
 System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
}
}
public List<buku> selectAll(){
 PreparedStatement prepare = null;
 ResultSet result = null;
 List<buku> list = new ArrayList<>();
 try {
 String sql ="SELECT * FROM peminjaman";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 result = prepare.executeQuery();
 while (result.next()){
 buku buku = new buku();
 buku.setKode(result.getString("NIM"));
 buku.setJenis(result.getString("Nama"));
 buku.setJudul(result.getString("Kode")); 
 buku.setPengarang(result.getString("Judul"));
 buku.setTahun(result.getString("Tgl_pinjam"));
 list.add(buku);
 }
System.out.println("Prepare statement berhasil dibuat");
return list; 
}catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 return list;
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statemen berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statemen gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 if (result != null){
try{
 result.close();
 System.out.println("Resultset berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Resultset gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 }
 }
}
