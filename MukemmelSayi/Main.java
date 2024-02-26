package MukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.println("Sayı Giriniz: ");
        sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;

            }
        }

        if (sayi == toplam) { // sayı kendisini bölen sayılara eşit mi
            System.out.println("Mükemmel Sayı:" + sayi);
        } else
            System.out.println("Mükemmel Sayı Değildir.");
    }

}
