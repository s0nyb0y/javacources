package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String members : a.getMembers()) {
            b.getMembers().add(members);
        }
        a.getMembers().clear();
    }

    public void transfer(MusicBand b) {
        for (String member : getMembers()) {
            b.getMembers().add(member);
        }
        getMembers().clear();
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }
}
