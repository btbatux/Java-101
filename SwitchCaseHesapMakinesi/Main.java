package SwitchCaseHesapMakinesi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 4 işlem seçimi ve işlem yapılacak değişkenler tanımlandı.
        int select, n1, n2;
        // Veri girişi tanımı
        Scanner input = new Scanner(System.in);
        boolean isCompleted = false; // Yanlış seçim girilmesi durumunda döngüyeü sürdürmek için kullanılacak

        // Başlangıçta kullanıcıdan alınacak bilgiler ilk burası çalışır
        System.out.print(" İlk Sayıyı Griniz: ");
        n1 = input.nextInt(); // İlk sayı alındı.
        System.out.print(" İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt(); // İkinci sayı alındı.

        do {
            System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme ");
            System.out.print("Seçim: ");
            select = input.nextInt(); // Yapılmak istenen işlemin numarası.

            switch (select) {
                case 1:
                    System.out.println("Toplama Sonucu: " + (n1 + n2)); // Toplama İşlemi
                    isCompleted = true;
                    break;

                case 2:
                    System.out.println("Çıkartma Sonucu: " + (n1 - n2)); // Çıkartma İşlemi
                    isCompleted = true;
                    break;

                case 3:
                    System.out.println("Çarpma Sonucu: " + (n1 * n2)); // Çarpma İşlemi
                    isCompleted = true;
                    break;

                case 4:
                    System.out.println("Bölme Sonucu: " + (n1 / n2)); // Bölme İşlemi
                    isCompleted = true;
                    break;

                default:
                    System.out.println("************************************");
                    System.out.println("Yanlış seçim yaptınız Tekrar Deneyin"); // Yanlış seçimde çalışır.
                    break;
            }

            // Yanlış seçim yapılırsa tekrar seçim yapmasını sağlar
        } while (!isCompleted);
    }

}
