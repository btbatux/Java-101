package FibonacciSerisi;

public class Main {

    public static void main(String[] args) {

        int maxNumber = 10, // 10 serili fibonacci
                previousNumber = 0, // Başlangıç değeri
                nextNumber = 1; // Bir sonraki değer

        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        int i = 1; // Döngü başlangıç değeri
        while (i <= maxNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}
