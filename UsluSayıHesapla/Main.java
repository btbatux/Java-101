package UsluSayıHesapla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int taban, us, total = 1;

        System.out.print("Tabanı Giriniz: "); // Taban sayisi
        taban = input.nextInt();
        System.out.print("Üssü Giriniz: "); // Üs sayisi
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            total *= taban; // Hesaplama
        }

        System.out.println("Cevap : " + total);
    }

}
