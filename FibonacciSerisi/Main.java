package FibonacciSerisi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int maxNumber, // Fibonacci serisi
                previousNumber = 0, // Başlangıç değeri
                nextNumber = 1; // Bir sonraki değer

        System.out.print(" Fibonacci Serisini Giriniz: ");
        maxNumber = input.nextInt();
        System.out.print(" Fibonacci Series of " + maxNumber + " numbers: ");

        int i = 1; // Döngü başlangıç değeri
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}
