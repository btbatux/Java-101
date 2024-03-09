package DizilerKucuktenBuyuge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boyut;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        boyut = input.nextInt();
        int[] dizi = new int[boyut];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i + " Elemanı Giriniz:");
            dizi[i] = input.nextInt();

        }

        Arrays.sort(dizi);

        for (int j = 0; j < dizi.length; j++) {
            System.out.print(dizi[j] + " ");
        }

    }

}
