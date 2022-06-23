package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> memebers1 = new ArrayList<>();
        memebers1.add("Энтони Кидис");
        memebers1.add("Майкл Бэлзари");
        memebers1.add("Хиллел Словак");
        memebers1.add("Джек Айронс");
        MusicBand musicBand1 = new MusicBand("Red Hot Chili Peppers", 1983, memebers1);

        List<String> memebers2 = new ArrayList<>();
        memebers2.add("Ча́рльз Бе́ннингтон");
        memebers2.add("Майк Шинода");
        memebers2.add("Брэд Дэлсон");
        MusicBand musicBand2 = new MusicBand("Linkin Park", 1996, memebers2);

//        musicBand1.transfer(musicBand2);
//        musicBand1.printMembers();
//        musicBand2.printMembers();
//        смотрел разницу

        MusicBand.transferMembers(musicBand2,musicBand1);
        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
