package EnYakinSayilar;

public class Main {
    public static void main(String[] args) {
        int[] dizi = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int girilenSayi = 5;

        // en buyuk ve en kucuk sayiyi kıyaslamak için tanımlıyoruz
        int enYakinKucuk = Integer.MIN_VALUE;
        int enYakinBuyuk = Integer.MAX_VALUE;

        for (int eleman : dizi) {
            // Girilen sayıdan küçük ve en yakın sayıyı bul
            if (eleman < girilenSayi && eleman > enYakinKucuk) {
                enYakinKucuk = eleman;
            }
            // Girilen sayıdan büyük ve en yakın sayıyı bul
            if (eleman > girilenSayi && eleman < enYakinBuyuk) {
                enYakinBuyuk = eleman;
            }
        }

        // Sonuçları ekrana yazdır
        String sonucKucuk = (enYakinKucuk != Integer.MIN_VALUE) ? String.valueOf(enYakinKucuk) : "bulunamadı";
        String sonucBuyuk = (enYakinBuyuk != Integer.MAX_VALUE) ? String.valueOf(enYakinBuyuk) : "bulunamadı";

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + sonucKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + sonucBuyuk);
    }
}
