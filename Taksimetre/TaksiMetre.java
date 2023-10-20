import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {

        double toplam, km, kmBasiUcret = 2.20, acilisUcreti = 10.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen Km'yi Giriniz:");

        km = input.nextInt();
        toplam = km * kmBasiUcret;
        toplam += acilisUcreti;

        if (toplam < 20) {
            toplam = 20;
            System.out.println("Tutar:" + toplam);

        } else {
            System.out.println("Tutar: " + toplam);
        }
        input.close();

    }

}
