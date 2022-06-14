package day6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }
    public void evolute(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4)+2;
        String evolution = "";
        switch (randomValue){
            case 2:
                evolution = "неудовлетворительно";
                break;
            case 3:
                evolution = "удовлетворительно";
                break;
            case 4:
                evolution = "хорошо";
                break;
            case 5:
                evolution = "отлично";
        }
        System.out.println("Преподаватель "+this.fio+" оценил студента с именем "+student.getFio()+" по предмету "+subject+
                " на оценку "+evolution);
    }
}
