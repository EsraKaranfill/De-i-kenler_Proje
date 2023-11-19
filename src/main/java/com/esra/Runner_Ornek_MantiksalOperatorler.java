package com.esra;

public class Runner_Ornek_MantiksalOperatorler {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;
        int sayi3 = 15;

        // && (ve - and) operatörü
        boolean veSonucu = (sayi1 > sayi2) && (sayi2 < sayi3);
        System.out.println("(sayi1 > sayi2) && (sayi2 < sayi3): " + veSonucu);

        // || (veya - or) operatörü
        boolean veyaSonucu = (sayi1 > sayi2) || (sayi2 > sayi3);
        System.out.println("(sayi1 > sayi2) || (sayi2 > sayi3): " + veyaSonucu);

    }
}
