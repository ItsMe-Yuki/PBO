/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author user
 */
//BUKU
public class fasilitas {
 private Connection koneksi; 
 private String ReportPath="report/";
 public fasilitas() {
 koneksi = KoneksiDB.getKoneksi();
 }   
 public void insert(buku buku){
 PreparedStatement prepare = null;
 try {
 String sql ="INSERT INTO buku (kode,jenis,judul,pengarang,tahun,stok)VALUES(?,?,?,?,?,?)";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1,buku.getKode());
 prepare.setString(2,buku.getJenis());
 prepare.setString(3,buku.getJudul());
 prepare.setString(4,buku.getPengarang());
 prepare.setString(5,buku.getTahun());  
 prepare.setInt(6,buku.getStok());
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
public void update(buku buku){
 PreparedStatement prepare = null;
 try {
 String sql ="UPDATE buku SET jenis=?,judul=?,pengarang=?,tahun=?,stok=? WHERE kode=?";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1,buku.getKode());
 prepare.setString(2,buku.getJenis());
 prepare.setString(3,buku.getJudul());
 prepare.setString(4,buku.getPengarang());
 prepare.setString(5,buku.getTahun());  
 prepare.setInt(6,buku.getStok());
 prepare.executeUpdate();
System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statement berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 } 
 }
public void delete(String kode){
 PreparedStatement prepare = null;
 try {
 String sql ="DELETE FROM buku WHERE kode=?";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 prepare.setString(1, kode);
 prepare.executeUpdate();
 System.out.println("Prepare statement berhasil dibuat");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal dibuat"); 
 System.out.println("Pesan : " + ex.getMessage());
 }finally{
 if (prepare != null){
 try{
 prepare.close();
 System.out.println("Prepare statement berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Prepare statement gagal ditutup"); 
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
 String sql ="SELECT * FROM buku";
 prepare = (PreparedStatement) koneksi.prepareStatement(sql);
 result = prepare.executeQuery();
 while (result.next()){
 buku buku = new buku();
 buku.setKode(result.getString("kode"));
 buku.setJenis(result.getString("jenis"));
 buku.setJudul(result.getString("judul")); 
 buku.setPengarang(result.getString("pengarang"));
 buku.setTahun(result.getString("tahun"));
 buku.setStok(result.getInt("stok"));
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
 System.out.println("Result set berhasil ditutup");
 }catch(SQLException ex){
 System.out.println("Result set gagal ditutup"); 
 System.out.println("Pesan : " + ex.getMessage());
 }
 }
 }
 }
}