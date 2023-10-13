import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14, alan, cevre;
        int r;

        System.out.println("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);

    }

}
