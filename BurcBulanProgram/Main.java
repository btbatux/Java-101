package BurcBulanProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int month, day; // Ay ve Gün değişkeni
        String burc = ""; // Burçların tutulduğu değişken
        Boolean isError = false; // Hatalı ay veya gün girildiğinde uyarı vermek için bir boolean kontrolu.

        System.out.println("Doğduğunuz Ay: ");
        month = input.nextInt();

        System.out.println("Doğduğunuz Gün: ");
        day = input.nextInt();

        if (month == 1) { // 1. Ay
            if (day >= 1 && day <= 31) { // 1 Ocak - 31 Ocak aralığında mı?
                if (day < 22) {
                    System.out.println("Oğlak Burcu.");
                } else {
                    System.out.println("Kova Burcu.");
                }
            } else {
                isError = true;
            }
        }

        if (month == 2) { // 2. Ay
            if (day >= 1 && day <= 28) {
                if (day < 20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu.");
                }
            } else {
                isError = true;
            }
        }

        if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu.");
                }
            } else {
                isError = true;
            }
        }

        if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç Burcu";
                } else {
                    burc = "Boğa Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa Burcu";
                } else {
                    burc = "İkizler Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "İkizler Burcu";
                } else {
                    burc = "Yengeç Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç Burcu";
                } else {
                    burc = "Aslan Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan Burcu";
                } else {
                    burc = "Başak Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day < 23) {
                    burc = "Başak Burcu";
                } else {
                    burc = "Terazi Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi Burcu";
                } else {
                    burc = "Akrep Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day < 22) {
                    burc = "Akrep Burcu";
                } else {
                    burc = "Yay Burcu";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay Burcu";
                } else {
                    burc = "Oğlak Burcu";
                }
            } else {
                isError = true;
            }
        } else {
            // Eğer ay 1 ile 12 arasında değilse, bu da bir hata oluşturur.
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı bir gün veya ay girdiniz. Lütfen tekrar deneyin.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }

    }
}