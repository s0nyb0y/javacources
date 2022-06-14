package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Петров Пётр Петрович","Математика");
        Student student = new Student("Иванов Иван Иванович");

        teacher.evolute(student);
    }
}
