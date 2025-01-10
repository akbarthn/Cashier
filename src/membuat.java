/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ACER
 */
public class membuat {
    public static void main(String[] args) throws IOException {
        // Tentukan path direktori root
        File rootDirectory = new File("C:\\Users\\ACER\\Root");

        // Cek apakah folder sudah ada, jika belum, buat folder
        if (!rootDirectory.exists()) {
            boolean isCreated = rootDirectory.mkdir(); // Membuat direktori
            if (isCreated) {
                System.out.println("Folder 'Root' berhasil dibuat di C:\\Users\\ACER\\");
            } else {
                System.out.println("Gagal membuat folder 'Root'.");
            }
        } else {
            System.out.println("Folder 'Root' sudah ada di C:\\Users\\ACER\\");
        }
        
        File project = new File(rootDirectory, "project.conf");
        project.createNewFile();
        
        File manifest = new File(rootDirectory, "manifest.mf");
        manifest.createNewFile();
        
        // Membuat sub direktori 'classes'
        File classes = new File(rootDirectory, "classes");
        classes.mkdir();
        
        // Membuat file di dalam direktori 'classes'
        File Test = new File(classes, "Test.java");
        Test.createNewFile(); 
        
        FileWriter FW = new FileWriter(Test);
        FW.write("public class test");
        
        Test.delete();
        
        File TestImpl = new File(classes, "TestImpl.java");
        TestImpl.createNewFile(); // Menggunakan createNewFile() untuk file
        
        // Membuat sub direktori 'template'
        File template = new File(rootDirectory, "template");
        template.mkdir();
        
        // Membuat file di dalam direktori 'template'
        File enter = new File(template, "enter.txt");
        enter.createNewFile(); // Menggunakan createNewFile() untuk file
        
        File exit = new File(template, "exit.txt");
        exit.createNewFile(); // Menggunakan createNewFile() untuk file
    }
}


