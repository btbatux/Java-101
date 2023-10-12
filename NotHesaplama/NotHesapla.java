import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double sonuc;
        String gectiMi;

        Scanner giris = new Scanner(System.in);

        System.out.println("Matematik Notu:");
        mat = giris.nextInt();

        System.out.println("Fizik Notu:");
        fizik = giris.nextInt();

        System.out.println("Kimya Notu:");
        kimya = giris.nextInt();

        System.out.println("Türkçe Notu:");
        turkce = giris.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = giris.nextInt();

        System.out.println("Muzik Notu: ");
        muzik = giris.nextInt();

        toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        sonuc = toplam / 6;

        gectiMi = sonuc < 60 ? "Geçtiniz" : "Kaldınız";

        System.out.println("Ortalamanız : " + sonuc);
        System.out.println("Geçme Durumunuz : " + gectiMi);

    }
}
