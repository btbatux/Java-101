package Start;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sembol = 10;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < sembol; j++) {
                System.out.print(" ");
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
            sembol--;

        }

    }
}
