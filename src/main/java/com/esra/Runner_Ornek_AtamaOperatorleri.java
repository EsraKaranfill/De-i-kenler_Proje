package com.esra;

public class Runner_Ornek_AtamaOperatorleri {
    public static void main(String[] args) {
        // Atama operatörü: =
        int x = 5;
        System.out.println("x: " + x);

        // Toplama ve atama operatörü: +=
        x += 3;  // x = x + 3;
        System.out.println("x += 3: " + x);

        // Çıkarma ve atama operatörü: -=
        x -= 2;  // x = x - 2;
        System.out.println("x -= 2: " + x);

        // Çarpma ve atama operatörü: *=
        x *= 4;  // x = x * 4;
        System.out.println("x *= 4: " + x);

        // Bölme ve atama operatörü: /=
        x /= 2;  // x = x / 2;
        System.out.println("x /= 2: " + x);

        // Mod alma ve atama operatörü: %=
        x %= 3;  // x = x % 3;
        System.out.println("x %= 3: " + x);
    }
}
