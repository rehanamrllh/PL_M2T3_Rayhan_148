package com;

/**
 * Kelas utama yang berisi metode {@code main} untuk menjalankan aplikasi pemrosesan pesanan.
 * Kelas ini mendemonstrasikan cara membuat dan memproses objek pesanan.
 */
public class Main {
    /**
     * Titik masuk utama aplikasi.
     * Membuat dua objek pesanan dan memprosesnya.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        // Membuat objek customerInfo untuk menyimpan data pelanggan
        customerInfo customer = new customerInfo("Asep", "Jl. Tlogomas No. 10", "asepkurniawan@email.com");

        // Membuat dan memproses pesanan pertama (subtotal = 1.000.000, kena diskon)
        orderProcess order1 = new orderProcess("Laptop Gaming", 1, 1000000.0, customer);

        // Membuat dan memproses pesanan kedua (subtotal = 100.000, tidak kena diskon, misal ganti produk)
        orderProcess order2 = new orderProcess("Mouse Gaming", 1, 100000.0, customer);


        System.out.println("--- Memproses Pesanan 1 ---");
        order1.processOrder();
        System.out.println("\n--- Memproses Pesanan 2 ---");
        order2.processOrder();
    }
}