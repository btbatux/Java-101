package NbesAzaltbesArttır;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // veri girişi

        System.out.println("Sayı Giriniz: "); // sayı al
        int number = input.nextInt(); // sayıyı tut
        if (number == 0 || number < 0) { // 0 veya negatifse sonlandır
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            azaltveArttir(number); // sayıyı metoda gönder
        }
    }

    private static void azaltveArttir(int number) {

        int firstNumber = number;

        while (true) {
            number -= 5; // sıfır veya negatif olana kadar 5 azalt
            System.out.println(number);

            if (number == 0 || number < 0) {
                break;
            }
        }

        while (true) {
            number += 5;
            System.out.println(number);
            if (firstNumber == number) // kendisine eşit olana kadar 5 ekle ve karşılaştır
                break;
        }

    }

}
