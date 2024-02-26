package DortVeBesinKuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in
         * kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */

        Scanner input = new Scanner(System.in); // sayı girişi
        int sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt(); // girilen sayıyı al

        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri:");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i);
        }

    }

}
