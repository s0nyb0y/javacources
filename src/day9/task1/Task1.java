package day9.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Вася","Учебная группа");
        Teacher teacher = new Teacher("Пётр","Информатика");

        student.printInfo();
        teacher.printInfo();
    }
}
