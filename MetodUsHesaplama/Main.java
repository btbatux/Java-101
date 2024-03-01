package MetodUsHesaplama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int base, exponent;
        Scanner input = new Scanner(System.in);

        System.out.println("Taban: ");
        base = input.nextInt();
        System.out.println("Üs: ");
        exponent = input.nextInt();

        int result = pow(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }

    public static int pow(int base, int exponent) {
        // Üs sıfır ise sonuç 1'dir.
        if (exponent == 0) {
            return 1;

        } else {
            // Üs 1'den büyükse, taban değeri ile recursive olarak kendini çağır.
            return base * pow(base, exponent - 1);
        }
    }
}
