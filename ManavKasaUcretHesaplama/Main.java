package ManavKasaUcretHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double toplamTutar = 0;

        // Meyveleri bir dizide tuttum.
        String[] meyveler = { "Armut", "Elma", "Domates", "Muz", "Patlıcan" };
        // Her meyveye karşılık gelen fiyat tutarını da dizide tuttum.
        double[] fiyatlar = { 2.14, 3.67, 1.11, 0.95, 5.00 };

        // Alınan meyvelerin KG bilgileri diziye gönderilecek
        double[] kilolar = new double[5];

        // Meyve miktarı kadar dögü başlattım
        for (int i = 0; i < meyveler.length; i++) {
            while (true) {
                // Sıra sıra her meyveden kaç KG aldığını kullanıcıya sordum.
                System.out.print(meyveler[i] + " Kaç Kilo? : ");

                double kilo = scanner.nextDouble();
                // KG Bilgilerinin negatif girilme durumunu kontrol ettim
                // Eğer negatif bir değer girilirse While çalışmaya devam edecek ve tekrar KG
                // bilgisi istenecek

                if (kilo < 0) {
                    System.out.println("Negatif değer girilemez. Lütfen tekrar deneyin.");
                }

                else {
                    // Her bir meyveye karşılık gelen indekse KG bilgisi atandı.
                    // while döngüsünden çıkıldı fakat tekrar for döngüsü çalışacak ve sıradaki
                    // meyveden ne kadar alındığı sorulacak
                    kilolar[i] = kilo;
                    break;
                }
            }
            /*
             * Tüm meyveler girildikten sonra tutar hesaplandı
             */
            toplamTutar += kilolar[i] * fiyatlar[i];
        }

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        scanner.close();
    }
}
