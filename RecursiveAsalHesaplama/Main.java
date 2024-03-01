package RecursiveAsalHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num, prime;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pozitif bir sayi giriniz : ");
        num = scanner.nextInt();

        if (num == 1)

        {
            System.out.println("1 sayisi asal değildir");
            return;
        }

        prime = isPrime(num, num / 2); // sayıyı parametre olarak gönderdik

        if (prime == 1) {
            System.out.println(num + " sayisi asaldir");
        } else {
            System.out.println(num + " sayisi asal değildir");
        }
    }

    // Asal sayı hesaplayan isPrime Metodu..
    private static int isPrime(int num, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (num % i == 0) {
                return 0;
            } else
                return isPrime(num, i - 1);
        }
    }
}
