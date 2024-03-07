package HarmonikOrtalama;

public class Main {
    public static void main(String[] args) {

        double[] dizi = { 1, 2, 3, 4, 5 };

        // Harmonik ortalama hesaplamak için metod
        double harmonikOrtalama = hesaplaHarmonikOrtalama(dizi);

        // Sonucu yazdır
        System.out.println("Dizideki sayıların harmonik ortalaması: " + harmonikOrtalama);
    }

    public static double hesaplaHarmonikOrtalama(double[] dizi) {
        double harmonikSeriToplami = 0;
        // Dizideki her bir eleman için döner
        for (double eleman : dizi) {
            // Harmonik seriyi hesapla (elemanların karşılıklarını topla)
            harmonikSeriToplami += 1 / eleman;
        }
        // Harmonik ortalama hesapla (eleman sayısını harmonik seri toplamına böl)
        return dizi.length / harmonikSeriToplami;
    }

}
