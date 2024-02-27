import java.util.Scanner;

public class KombinasyonHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;

        System.out.print("n değerini giriniz: ");
        n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        r = scanner.nextInt();

        int kombinasyon = kombinasyonHesapla(n, r);
        System.out.println(n + "'in " + r + "'li kombinasyonu: C(" + n + "," + r + ") = " + kombinasyon);
    }

    // Faktöriyel hesaplayan metod
    public static int faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }

    // Kombinasyon hesaplayan metod
    public static int kombinasyonHesapla(int n, int r) {
        int nFaktoriyel = faktoriyel(n);
        int rFaktoriyel = faktoriyel(r);
        int nEksiRFaktoriyel = faktoriyel(n - r);

        return nFaktoriyel / (rFaktoriyel * nEksiRFaktoriyel);
    }
}
