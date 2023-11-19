package com.esra;

public class Runner_IliskisekOperatorler {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;

        // Eşitlik kontrolü
        boolean esitMi = (sayi1 == sayi2);
        System.out.println(sayi1 + " == " + sayi2 + ": " + esitMi);

        // Eşit değil kontrolü
        boolean esitDegilMi = (sayi1 != sayi2);
        System.out.println(sayi1 + " != " + sayi2 + ": " + esitDegilMi);

        // Büyüklük kontrolü
        boolean buyukMu = (sayi1 > sayi2);
        System.out.println(sayi1 + " > " + sayi2 + ": " + buyukMu);

        // Küçüklük kontrolü
        boolean kucukMu = (sayi1 < sayi2);
        System.out.println(sayi1 + " < " + sayi2 + ": " + kucukMu);

        // Büyük veya eşit kontrolü
        boolean buyukEsitMi = (sayi1 >= sayi2);
        System.out.println(sayi1 + " >= " + sayi2 + ": " + buyukEsitMi);

        // Küçük veya eşit kontrolü
        boolean kucukEsitMi = (sayi1 <= sayi2);
        System.out.println(sayi1 + " <= " + sayi2 + ": " + kucukEsitMi);

    }
}
