package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double totalTax;
    int bonusSalary;
    double raiseBonusSalary = 0.0;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesapları
    public void tax() {
        if (salary < 1000) {
            System.out.println("Vergi yükümlülüğü yok.");
        }
        if (salary > 1000) {
            totalTax = salary * 0.03;
            salary -= totalTax;
            System.out.println("Toplam Vergi Tutarı: " + totalTax + " Net Maaş: " + salary);

        }
    }

    public void bonus() {
        if (workHours > 40) {
            bonusSalary = 30 * (workHours - 40);

            salary += bonusSalary; // Bonus + maaş
            System.out.println("Bonus: " + bonusSalary + " TL" + " Net Maaş: " + salary);

        }
    }

    public void raiseSalary() {
        int totalYear = 2021 - hireYear;

        if (totalYear < 10) {
            raiseBonusSalary += salary * 0.05;
            salary += raiseBonusSalary;

            System.out.println(
                    "Çalışılan Toplam Yıl " + totalYear + " Zam: " + salary * 0.05 + "TL (Toplam Maaş): " + salary);
        }
        if (totalYear > 9 && totalYear < 20) {
            raiseBonusSalary += salary * 0.10;
            salary += raiseBonusSalary;

            System.out.println(
                    "Çalışılan Toplam Yıl " + totalYear + " Zam: " + salary * 0.05 + "TL (Toplam Maaş): " + salary);
        }
        if (totalYear > 19) {
            raiseBonusSalary += salary * 0.15;
            salary += raiseBonusSalary;
            System.out.println(
                    "Çalışılan Toplam Yıl " + totalYear + " Zam: " + salary * 0.05 + "TL (Toplam Maaş): " + salary);
        }

    }

    public void writeString() {
        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary);
        System.out.println("Başlangıç Yılı " + hireYear);
        System.out.println("Vergi: " + totalTax);
        System.out.println("Bonus: " + bonusSalary);
        System.out.println("Maaş Artışı: " + raiseBonusSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salary);
    }
}
