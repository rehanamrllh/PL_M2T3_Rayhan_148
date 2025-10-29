package com;

public class Main {
    public static void main(String[] args) {
        orderProcess order1 = new orderProcess("Laptop Gaming", 1, 1000000.0, new customerInfo("Asep", "Jl. Tlogomas No. 10", "asepkurniawan@email.com"));
        orderProcess order2 = new orderProcess("Laptop Gaming", 1, 1000000.0, new customerInfo("Asep", "Jl. Tlogomas No. 10", "asepkurniawan@email.com"));

        order1.processOrder();
        order2.processOrder();
    }
}
