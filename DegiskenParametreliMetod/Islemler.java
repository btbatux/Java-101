package DegiskenParametreliMetod;

public class Islemler {

    double toplam = 0;

    public double ortalamaHesapla(double... sayilar) {

        for (double i : sayilar) {
            toplam += i;
        }
        return toplam / sayilar.length;

    }

}
