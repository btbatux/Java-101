package KucuktenBuyugeSiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuluyor

        // Kullanıcıdan üç sayı girmesini iste.
        System.out.println("Lütfen üç sayı giriniz:");
        int sayi1 = scanner.nextInt(); // İlk sayıyı oku.
        int sayi2 = scanner.nextInt(); // İkinci sayıyı oku.
        int sayi3 = scanner.nextInt(); // Üçüncü sayıyı oku.

        // sayi1 ve sayi2'yi karşılaştır ve gerekirse yerlerini değiştir
        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        // sayi2 ve sayi3'ü karşılaştır ve gerekirse yerlerini değiştir
        if (sayi2 > sayi3) {
            int temp = sayi2;
            sayi2 = sayi3;
            sayi3 = temp;
        }

        // Yer değiştirme işlemleri sonrasında sayi1 ve sayi2'nin sıralamasını tekrar
        // kontrol et
        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        // Sıralanmış sayıları ekrana yazdır.
        System.out.println("Sayılar küçükten büyüğe sıralanmıştır: " + sayi1 + ", " + sayi2 + ", " + sayi3);
    }
}
