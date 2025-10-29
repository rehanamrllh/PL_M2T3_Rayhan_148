package com;

/**
 * Record ini digunakan untuk menyimpan informasi dasar pelanggan.
 * Record ini secara otomatis menyediakan konstruktor, aksesor, hashCode(), equals(), dan toString().
 *
 * @param custName Nama lengkap pelanggan.
 * @param custAddress Alamat pengiriman pelanggan.
 * @param custEmail Alamat email pelanggan untuk konfirmasi.
 */
public record customerInfo(String custName, String custAddress, String custEmail) {
    // Record body dapat kosong atau berisi metode tambahan/validasi jika diperlukan.
}