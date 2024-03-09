package DizilerTekrarEdenSayilar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int boyut, counter = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu: ");
        boyut = input.nextInt();
        int[] dizi = new int[boyut];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i + " Elemanı Giriniz:");
            dizi[i] = input.nextInt();

        }

        for (int j = 0; j < dizi.length - 1; j++) {
            if (dizi[j] == dizi[j + 1]) {
                counter++;
            }
            if (counter > 1) {
                // Eğer sayacı 1'den büyükse, yani tekrar eden bir eleman varsa, bunu yazdır
                System.out.println(dizi[j] + " Sayısı " + counter + " kere tekrar ediyor.");
            }
            counter = 1; // Sayacı sıfırla
        }
    }

}
