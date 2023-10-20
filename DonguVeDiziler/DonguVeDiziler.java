import java.util.Arrays;
import java.util.Scanner;

public class DonguVeDiziler {
    public static void main(String[] args) {
        // Güncellendi
        try (Scanner input = new Scanner(System.in)) {
            int boyut;
            int sembol;

            System.out.println("Dizinin boyutunu gir : ");
            boyut = input.nextInt();

            int[] dizi = new int[boyut];

            System.out.println(boyut + " Uzunluğunda dizi oluşturuldu.");

            for (int i = 0; i < boyut; i++) {
                System.out.println((i + 1) + ". Sayıyı gir : ");
                dizi[i] = input.nextInt();

            }
            System.out.println("Küçükten Büyüğe Sıralamak İçin 1 'e Basınız Yoksa Herhangi Bir Sayıya Basınız : ");
            sembol = input.nextInt();

            if (sembol == 1) {
                Arrays.sort(dizi);
                for (int i = 0; i < dizi.length; i++) {
                    System.out.println((i + 1) + ". Sayı : " + dizi[i]);
                }
            } else if (sembol != 1) {
                for (int k : dizi) {
                    System.out.println(k);
                }
            }

        }

    }

}
