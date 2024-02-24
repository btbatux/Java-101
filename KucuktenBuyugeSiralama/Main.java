package KucuktenBuyugeSiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen üç sayı giriniz:");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        if (sayi1 > sayi2) { // ilk sa
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        if (sayi2 > sayi3) {
            int temp = sayi2;
            sayi2 = sayi3;
            sayi3 = temp;
        }

        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        System.out.println("Sayılar küçükten büyüğe sıralanmıştır: " + sayi1 + ", " + sayi2 + ", " + sayi3);
    }
}
