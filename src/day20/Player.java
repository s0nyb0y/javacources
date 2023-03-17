package day20;

import java.util.Scanner;

public class Player {
    private String name;
    private int count;

    public Player() {
        userName();
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
    public void userName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("как вас зовут?");
        name = scanner.nextLine();
        while (name.isEmpty()){
            System.out.println("это поле не может быть пустым\nкак вас зовут?");
            name = scanner.nextLine();
        }
        System.out.println("привет, " + name);
    }
    public void countPlayer(){
        count++;
    }
}
