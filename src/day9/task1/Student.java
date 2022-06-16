package day9.task1;

import day9.task1.Human;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name, groupName);
        this.name = name;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с " + groupName + " с именем " + name);
    }
}
