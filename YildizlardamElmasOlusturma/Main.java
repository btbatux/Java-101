package YildizlardamElmasOlusturma;

public class Main {

    public static void main(String[] args) {
        int satirSayisi = 4;

        for (int i = 0; i <= satirSayisi; i++) {
            for (int j = 0; j < (satirSayisi - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // Alt kısmı oluştur
        for (int i = satirSayisi - 1; i >= 0; i--) {
            for (int j = 0; j < satirSayisi - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
