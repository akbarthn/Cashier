/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */

import java.io.File;

public class hapus {

    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Acer\\Root");
        deleteFolder(folder);
    }

    public static void deleteFolder(File folder) {
        if (folder.exists()) {
            // Menghapus semua file dan subfolder di dalam folder
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // Rekursi untuk subfolder
                        deleteFolder(file);
                    } else {
                        // Menghapus file
                        file.delete();
                    }
                }
            }

            // Setelah semua file dan subfolder dihapus, hapus folder itu sendiri
            if (folder.delete()) {
                System.out.println("Folder berhasil dihapus");
            } else {
                System.out.println("Gagal menghapus folder");
            }
        } else {
            System.out.println("Folder tidak ditemukan");
        }
    }
}



