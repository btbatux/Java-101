package SifreKontrol;

import java.util.Scanner;

public class GirisYap {

    private String kullaniciAdi = "patika";
    private String sifre = "java123";
    private int girisHakki = 3;

    public void girisKontrol(String girilenKullaniciAdi, String girilenSifre) {
        if (kullaniciAdi.equals(girilenKullaniciAdi) && sifre.equals(girilenSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            girisHakki--;
            if (girisHakki > 0) {
                System.out.println("Giriş başarısız. Kalan giriş hakkı: " + girisHakki);
                girisYap();
            } else {
                System.out.println("Giriş hakkınız tükendi. Şifre sıfırlama işlemi yapılıyor...");
                sifreSifirla();
            }
        }
    }

    public void girisYap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        String girilenKullaniciAdi = scanner.nextLine();
        System.out.print("Şifre: ");
        String girilenSifre = scanner.nextLine();
        girisKontrol(girilenKullaniciAdi, girilenSifre);
    }

    public void sifreSifirla() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yeni Şifre: ");
        String yeniSifre = scanner.nextLine();
        this.sifre = yeniSifre;
        System.out.println("Şifre başarıyla sıfırlandı.");
        girisYap();
    }
}
