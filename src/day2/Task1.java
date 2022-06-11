package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("сколько этажей: ");
        int level = scanner.nextInt();
        if (level<=0){
            System.out.println("Подвал и цокальные этажи не интересуют");
        }else {
            if (level<=4){
                System.out.println("Малоэтажный дом");
            } else if (level<=8) {
                System.out.println("Средне этажный дом");
            }else {
                System.out.println("Многоэтажный дом");
            }
        }
        scanner.close();

    }
}
