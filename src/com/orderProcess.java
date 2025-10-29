package com;

class orderProcess {
    public static final int MIN_PURCHASE_DISCOUNT = 200000;
    public static final double DISCOUNT_RATE = 0.1;

    private String productName;
    private int quantity;
    private double price;

    private String custName;
    private String custAddress;
    private String custEmail;

    public orderProcess(String productName, int quantity, double price, customerInfo customerInfo) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.custName = customerInfo.custName();
        this.custAddress = customerInfo.custAddress();
        this.custEmail = customerInfo.custEmail();
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }


    public void processOrder() {
        System.out.println("Nama: " + getProductName());
        boolean stockAvailable = true;

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

    private static double calculateTotal(double subtotal) {
        double total;
        total = subtotal - (subtotal * DISCOUNT_RATE);
        return total;
    }


}