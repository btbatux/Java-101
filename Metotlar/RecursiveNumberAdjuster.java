
package Metotlar;

import java.util.Scanner;

public class RecursiveNumberAdjuster {

    /*
     * Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü
     * kullanmadan bir "Recursive" metot yazın.
     * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5
     * rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
     * Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme
     * işleminde sayının son değerini ekrana yazdırın.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        kuralaUyanDongu(n); // parametreyi gönderdik
    }

    static void kuralaUyanDongu(int sayi) {
        System.out.print(sayi + " "); // ilk değeri yazdırdık

        if (sayi > 0) { // sıfırdan büyük oldugu sürece 5 azalttık
            kuralaUyanDongu(sayi - 5); // sıfıra veya negatife ulaşırsa tekrar ilk haline kadar dönecek
        }
        System.out.print(sayi + " ");
    }

}