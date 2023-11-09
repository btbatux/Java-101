package HesapMakinesi;

import java.util.ArrayList;
import java.util.Scanner;

public class DortIslem {

    public void toplama() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.println(i + ". Sayı: ");
            number = scan.nextInt();
            i++;

            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Toplama Sonucu: " + result);
        scan.close();
    }

    static void cikarma() {

        Scanner scan = new Scanner(System.in);
        int result = 0;
        boolean firstInput = true;

        while (true) {
            System.out.print("Bir sayı girin veya 0'a basın: ");
            int number = scan.nextInt();

            if (number == 0) {
                break;
            }

            {
                if (firstInput) {
                    result = number;
                    firstInput = false;
                } else {
                    result -= number;
                }
            }
        }

        System.out.println("Sonuç: " + result);
        scan.close();
    }

    public static int carpma(ArrayList<Integer> sayilar) {
        int result = 1;
        for (int num : sayilar) {
            result *= num;
        }
        return result;
    }

    static void bolme() {

        Scanner scan = new Scanner(System.in);
        double result = 0;
        boolean firstInput = true;

        while (true) {
            System.out.print("Bir sayı girin veya 0'a basın: ");
            double number = scan.nextInt();

            if (number == 0) {
                break;
            }

            {
                if (firstInput) {
                    result = number;
                    firstInput = false;
                } else {
                    result /= number;
                }
            }
        }

        System.out.println("Bolme Sonuç: " + result);
        scan.close();
    }
}
