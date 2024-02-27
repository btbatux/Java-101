package EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1; // EBOB için başlangıç değeri
        int ekok; // EKOK için değişken tanımı
        int minSayi = Math.min(sayi1, sayi2);

        // EBOB'u bul
        for (int i = 1; i <= minSayi; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        // EKOK'u hesapla
        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB(" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK(" + sayi1 + ", " + sayi2 + ") = " + ekok);
    }
}
