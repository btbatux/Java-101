import java.util.Scanner;

public class DonguDizler {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int boyut;

            System.out.println("Dizinin boyutunu gir : ");
            boyut = input.nextInt();

            int[] dizi = new int[boyut];

            System.out.println(boyut + " Uzunluğunda dizi oluşturuldu.");

            for (int i = 0; i < boyut; i++) {
                System.out.println((i + 1) + ". Sayıyı gir : ");
                dizi[i] = input.nextInt();

            }
            for (int i = 0; i < dizi.length; i++) {
                System.out.println((i + 1) + ". Sayı " + dizi[i]);
            }
        }

    }

}
