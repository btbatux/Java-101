package TekrarEdenCiftSayilar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = { 2, 5, 31, 6, 12, 4, 7, 8, 2, 6, 33, 4, 13, 14, 44, 4 };
        // Diziyi sırala
        Arrays.sort(numbers);
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }

        // Tekrar eden çift sayıları bul
        for (int i = 0; i < numbers.length - 1; i++) {
            // Ardışık elemanlar eşit ve çift sayı ise
            if (numbers[i] == numbers[i + 1] && numbers[i] % 2 == 0) {
                // Tekrar eden çift sayıyı yazdır
                System.out.println("Tekrar eden çift sayı: " + numbers[i]);
                // Aynı sayıyı tekrar yazdırmamak için, i'yi atla
            }
        }
    }
}
