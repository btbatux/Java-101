package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Mehmet", 2000, 45, 1985);

        employee.tax(); // vergi hesaplama metodu
        employee.bonus(); // çalışma saatine göre bonus hesaplama meetodu
        employee.raiseSalary(); // çalışma yılına göre bonus hesaplama
        employee.writeString(); // Tüm bilgileri yadır.

    }

}
