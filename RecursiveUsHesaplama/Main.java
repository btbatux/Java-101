package RecursiveUsHesaplama;

public class Main {
    public static void main(String[] args) {

        System.out.println(power(3, 3)); // Taban 3 Üs 3 oalrak parametre gönderildi.
    }

    static int power(int base, int exponent) {
        if (exponent == 0) { // üs 0 ise sonuc 1 olarak return et.
            return 1;
        } else {

            return base * power(base, exponent - 1); // Tabanı üs miktarınca
        }
    }
}
