package DegiskenParametreliMetod;

public class IslemlerMain {

    public static void main(String[] args) {

        Islemler ort = new Islemler();

        double sonuc = ort.ortalamaHesapla(10, 5, 20, 1, 30, 9);

        System.out.println("Ortalama:  " + sonuc);

    }

}
