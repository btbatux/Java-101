package DegiskenParametreliMetod.AsırıYuklemeMetod;

public class MatematikselHesaplama {

    public void topla(double sayi1, double sayi2) {
        System.out.println("Sonuç:  " + (sayi1 + sayi2));
    }

    public void topla(int sayi1, double sayi2, String isim) {
        System.out.println("Sonuç:  " + (sayi1 + sayi2) + " " + isim);
    }

    public void topla(double sayi1, int sayi2, boolean tr) {
        System.out.println("Sonuç:  " + (sayi1 + sayi2) + " " + tr);
    }

    public void topla(int sayi1, int sayi2, char c) {
        System.out.println("Sonuç:  " + (sayi1 + sayi2) + " " + c);
    }

}
