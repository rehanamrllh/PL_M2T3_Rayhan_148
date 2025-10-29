package com;

/**
 * Merepresentasikan proses pemesanan suatu produk.
 * Kelas ini bertanggung jawab untuk menghitung total biaya,
 * menerapkan diskon jika memenuhi syarat, dan mencetak detail proses pesanan.
 */
class orderProcess {

    /**
     * Batasan pembelian minimum (dalam Rupiah) untuk mendapatkan diskon.
     * Saat ini bernilai {@value #MIN_PURCHASE_DISCOUNT}.
     */
    public static final int MIN_PURCHASE_DISCOUNT = 200000;

    /**
     * Tingkat diskon yang diterapkan (dalam bentuk desimal).
     * Saat ini bernilai {@value #DISCOUNT_RATE} (10%).
     */
    public static final double DISCOUNT_RATE = 0.1;

    private String productName;
    private int quantity;
    private double price;

    private String custName;
    private String custAddress;
    private String custEmail;

    /**
     * Konstruktor untuk membuat objek {@code orderProcess} baru.
     * Mengambil detail produk dan informasi pelanggan.
     *
     * @param productName Nama produk yang dipesan.
     * @param quantity Jumlah produk yang dipesan.
     * @param price Harga satuan produk.
     * @param customerInfo Objek record yang berisi detail nama, alamat, dan email pelanggan.
     */
    public orderProcess(String productName, int quantity, double price, customerInfo customerInfo) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.custName = customerInfo.custName();
        this.custAddress = customerInfo.custAddress();
        this.custEmail = customerInfo.custEmail();
    }

    /**
     * Mengembalikan nama produk yang dipesan.
     *
     * @return Nama produk.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Mengembalikan jumlah (kuantitas) produk yang dipesan.
     *
     * @return Kuantitas produk.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Mengembalikan harga satuan produk.
     *
     * @return Harga satuan produk.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Memproses pesanan.
     * Metode ini menghitung subtotal, memeriksa apakah memenuhi syarat diskon,
     * menghitung total akhir, dan mencetak detail proses pesanan (termasuk konfirmasi ke email/alamat).
     */
    public void processOrder() {
        System.out.println("Nama: " + getProductName());
        boolean stockAvailable = false; // Asumsi stok tersedia

        double total = 0;
        if (stockAvailable) {
            double subtotal = getQuantity() * getPrice();
            if (subtotal > MIN_PURCHASE_DISCOUNT) {
                total = calculateTotal(subtotal);
            } else {
                total = subtotal;
            }
        }
        System.out.println("Total biaya: Rp" + total);

        System.out.println("Mengirim email konfirmasi ke " + custEmail);
        System.out.println("Pesanan atas nama " + custName + " akan dikirim ke " + custAddress);
        System.out.println("Pesanan berhasil diproses!");
        System.out.println("===================================================================");
    }

    /**
     * Menghitung total biaya setelah menerapkan diskon.
     * Diskon diterapkan berdasarkan konstanta {@code DISCOUNT_RATE}.
     *
     * @param subtotal Total biaya sebelum diskon.
     * @return Total biaya setelah diskon.
     */
    private static double calculateTotal(double subtotal) {
        double total;
        total = subtotal - (subtotal * DISCOUNT_RATE);
        return total;
    }
}