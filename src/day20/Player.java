package day20;

import java.util.Scanner;

public class Player {
    private String name;
    private int count = 0;

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void userName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("как вас зовут?");
        name = scanner.nextLine();
        while (name.isEmpty()){
            System.out.println("это поле не может быть пустым");
            System.out.println("как вас зовут?");
            name = scanner.nextLine();
        }
        System.out.println("привет, " + name);
    }
    public void count(){
        count++;
    }
}
