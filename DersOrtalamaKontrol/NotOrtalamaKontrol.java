package DersOrtalamaKontrol;

import java.util.Scanner;

public class NotOrtalamaKontrol {
    public static void main(String[] args) {
        String[] dersler = { "Matematik", "Fizik", "Türkçe", "Kimya", "Müzik" };

        int toplamNot = 0;
        int gecmeNotu = 55;
        int dersSayisi = dersler.length;

        Scanner scanner = new Scanner(System.in);

        for (String ders : dersler) {
            System.out.print(ders + " notunu girin: ");
            int not = scanner.nextInt();

            if (not >= 0 && not <= 100) {
                toplamNot += not;
            } else {
                System.out.println("Hatalı not girişi: " + ders + " notu hesaplamaya dahil edilmedi.");
                dersSayisi--;
            }
        }

        scanner.close();

        if (dersSayisi > 0) {
            int ortalama = toplamNot / dersSayisi;
            System.out.println("Derslerin Ortalaması: " + ortalama);

            if (ortalama >= gecmeNotu) {
                System.out.println("Geçtiniz!");
            } else {
                System.out.println("Kaldınız!");
            }
        }

        else {
            System.out.println("Hiç geçerli ders notu girilmedi.");
        }
    }
}
