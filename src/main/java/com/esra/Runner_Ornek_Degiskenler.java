package com.esra;

public class Runner_Ornek_Degiskenler {
    public static void main(String[] args) {
        // Tam Sayılar
        byte byteDegisken = 127;         // 8 bit
        short shortDegisken = 32767;     // 16 bit
        int intDegisken = 2147483647;    // 32 bit
        long longDegisken = 9223372036854775807L;  // 64 bit

        // Ondalıklı Sayılar
        float floatDegisken = 3.14f;     // 32 bit
        double doubleDegisken = 3.14159; // 64 bit

        // Karakter
        char charDegisken = 'A';         // 16 bit

        // Mantıksal
        boolean booleanDegisken = true;

        // String (Sınıf)
        String stringDegisken = "Hello, World";

        // Değişken değerlerini ekrana yazdırma
        System.out.println("Byte Değişken: " + byteDegisken);
        System.out.println("Short Değişken: " + shortDegisken);
        System.out.println("Int Değişken: " + intDegisken);
        System.out.println("Long Değişken: " + longDegisken);
        System.out.println("Float Değişken: " + floatDegisken);
        System.out.println("Double Değişken: " + doubleDegisken);
        System.out.println("Char Değişken: " + charDegisken);
        System.out.println("Boolean Değişken: " + booleanDegisken);
        System.out.println("String Değişken: " + stringDegisken);
    }
    }
