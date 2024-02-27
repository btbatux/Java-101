package TersUcgenYapimi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int basamakSayisi;

        System.out.print("Ters üçgen basamak sayısını girin: ");
        basamakSayisi = input.nextInt();

        for (int i = 0; i < basamakSayisi; i++) { // Basamakları döner
            // Print stars
            for (int j = 0; j < (basamakSayisi - i) * 2 - 1; j++) { // Her bir basamak için yıldızları yazar.
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
