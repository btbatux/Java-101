package VucutKitleIndeksi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double result, kg, height;

        while (true) {

            System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
            height = input.nextDouble(); // Boy bilgisini aldık

            System.out.println("Kilonuzu giriniz: ");
            kg = input.nextDouble(); // Kilo bilgisini aldık

            if (height > 0 && kg > 0) { // Negatif değer girişini kontrol ettik

                result = kg / (height * height); // Vucüt kitle indeksini hesapla
                System.out.println("Vücud kitle indeksiniz: " + result);
                // Doğru giriş yapıldıysa, döngüyü kırılır
                break;

            } else {
                System.out.println("Geçerli bir değer girmelisiniz.");
                // Yanlış giriş yapıldıysa, döngü tekrar çalışır
            }
        }

    }
}
