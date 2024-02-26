package CiftSayılarıBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplam = 0, sayi, count = 0;
        double ortalama = 0.0;

        System.out.println("Girilen sayıya kadar 3 ve 4'e tam bölününen sayıların ortalaması alınacaktır");
        System.out.println("Döngüyü sonlandırmak için 0 giriniz.");

        while (true) {

            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();

            if (sayi == 0) { // 0 Girilmişse sayı istemeyi sonlandır.
                break;
            }

            if (sayi % 3 == 0 && sayi % 4 == 0) { // 3'e ve 4'e tam bölünebilen sayılar
                toplam += sayi; // şartı sağlayan sayıalrı topla
                count++; // şartı sağyalan sayıalrın adedi
            }
        }

        ortalama = toplam / count;
        System.out.println("Ortalama: " + ortalama);
    }
}
