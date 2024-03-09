package Transpoze;

public class Main {
    public static void main(String[] args) {
        int[][] matris = { { 2, 3, 4 }, { 5, 6, 4 }, { 9, 7, 6 } };
        int[][] transpoze = new int[matris[0].length][matris.length];

        // Transpoze al ve yazdır
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                transpoze[j][i] = matris[i][j];
                System.out.print(transpoze[j][i] + (j == matris[i].length - 1 ? "\n" : "    "));
            }
            if (i == matris.length - 1) {
                System.out.println(); // Matrisler arası boşluk için
            }
        }
    }
}
