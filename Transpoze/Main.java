package Transpoze;

public class Main {
    public static void main(String[] args) {
        // 3x3 boyutlarında bir matris tanımlanıyor.
        int[][] matris = { { 2, 3, 4 }, { 5, 6, 4 }, { 9, 7, 6 } };

        // Transpoze matrisi için matrisin sütun ve satır sayıları yer değiştirilerek
        // yeni bir matris oluşturuluyor.
        int[][] transpoze = new int[matris[0].length][matris.length];

        // Ana matrisin tüm elemanları üzerinden geçmek için dıştaki döngü satırları,
        // içteki döngü ise sütunları temsil ediyor.
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                // Transpoze işlemi yapılıyor: matrisin i'nci satır, j'nci sütunundaki eleman,
                // transpoze matrisinin j'nci satır, i'nci sütununa atanıyor.
                transpoze[j][i] = matris[i][j];

                // Transpoze matrisinin elemanları yazdırılıyor.
                // Son sütuna gelindiğinde yeni satıra geçiliyor, aksi halde elemanlar arasında
                // boşluk bırakılıyor.
                System.out.print(transpoze[j][i] + (j == matris[i].length - 1 ? "\n" : "    "));
            }
            // Matrisin son satırına gelindiğinde, iki matris arasında görsel bir boşluk
            // bırakmak için ekstra bir satır atlanıyor.
            if (i == matris.length - 1) {
                System.out.println();
            }
        }
    }
}
