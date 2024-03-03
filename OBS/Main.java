package OBS;

public class Main {

    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ugur Teacher", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        mat.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacher();
        kimya.addTeacher(t3);
        kimya.printTeacher();

        Ogrenci s1 = new Ogrenci("Batuhan", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100, 50, 90);
        s1.addVerbalNote(100, 50, 60);

        s1.isPass();
        s1.printNote();
    }

}