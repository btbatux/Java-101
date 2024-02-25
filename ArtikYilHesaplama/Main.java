package ArtikYilHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // user input.
        int year; // year number.

        System.out.print("Enter a year : ");
        year = input.nextInt(); // read the user's year input.

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a leap year.");

        else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
