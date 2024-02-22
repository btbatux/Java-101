package SınıfıGeçmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int toplamNot = 0; // Girilen notların toplamı tutulacak
        int gecerliNotSayisi = 0; // Ortalamayı hesaplamak için geçerli not sayısı tutulacak

        String[] dersler = { "Matematik", "Fizik", "Türkçe", "Kimya", "Müzik" }; // Derleri dizide tuttum
        int[] notlar = new int[dersler.length]; // Ders sayısı kadar not dizisi oluşturdum

        for (int i = 0; i < dersler.length; i++) { // Ders sayısı uzunluğunda döngü başlattım
            System.out.print(dersler[i] + " notunu giriniz: "); // Her bir derse ait not istenildi
            int not = input.nextInt();

            if (not >= 0 && not <= 100) { // 0 ve 100 aralığında olma durumu kontrol edildi.
                notlar[i] = not; // Eğer geçerli notsa not dizisine ekledim
                toplamNot += not; // Toplam notuma da ekledim
                gecerliNotSayisi++; // Geçerli not varsayılan değeri artırttım
            } else {
                System.out
                        .println(dersler[i] + " notu 0 ile 100 arasında olmalıdır ve ortalamaya dahil edilmeyecektir.");
            }
        }

        if (gecerliNotSayisi > 0) { // Yukarıdaki koşullarda geçerli not var mı kontrol yapıldı
            double ortalama = toplamNot / (double) gecerliNotSayisi;

            System.out.println("Ortalama: " + ortalama);
            if (ortalama >= 55) {
                System.out.println("Tebrikler, derslerden geçtiniz.");
            } else {
                System.out.println("Maalesef, kaldınız.");
            }
        } else {
            System.out.println("Geçerli not girilmediği için ortalama hesaplanamadı.");
        }
    }

}
