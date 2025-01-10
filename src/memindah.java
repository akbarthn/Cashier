/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
/**
 *
 * @author ACER
 */
public class memindah {
    public static void main(String[] args) {
        File source = new File("C:\\Users\\ACER\\Root\\project.conf");
        File dest = new File("C:\\Users\\ACER\\Root\\template\\project.conf");
            
        // Pastikan folder tujuan ada, jika belum, buat folder 'template'
        File destDirectory = new File("C:\\Users\\ACER\\Root\\template");
        if (!destDirectory.exists()) {
            destDirectory.mkdir();  // Membuat folder 'template' jika belum ada
        }
   
        boolean success = source.renameTo(dest);
        
        if (success){
            System.out.println("File Berhasil di Pindah");
        }else{
            System.out.println("Gagal memindah File");
        }
        
        File fileToDelete = new File("C:\\Users\\ACER\\Root\\classes\\Test.java");

        // Cek apakah file ada, jika ada, hapus file
        if (fileToDelete.exists()) {
            boolean isDeleted = fileToDelete.delete(); // Menghapus file
            if (isDeleted) {
                System.out.println("File 'Test.java' berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus file 'Test.java'.");
            }
        } else {
            System.out.println("File 'Test.java' tidak ditemukan di folder 'classes'.");
        }
        
        
    }
}
