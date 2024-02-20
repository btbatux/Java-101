package AritmetikİşlemlerVeİşlemÖnceliği;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, result; // Değişkenler

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        a = input.nextInt(); // a sayısı kullanıcıdan alında
        System.out.print("İkinci sayıyı giriniz:");
        b = input.nextInt(); // b sayısı kullanıcıdan alında
        System.out.print("Üçüncü sayıyı giriniz:");
        c = input.nextInt(); // c sayısı kullanıcıdan alında

        result = a + b * c - b; // işlem önceliğinegöre hesaplandı

        System.out.println("Sonuç: " + result);

    }

}
