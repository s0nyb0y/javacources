package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Энтони Кидис",37));
        members1.add(new MusicArtist("Майкл Бэлзари",35));
        members1.add(new MusicArtist("Хиллел Словак",39));
        members1.add(new MusicArtist("Джек Айронс",36));
        MusicBand musicBand1 = new MusicBand("Red Hot Chili Peppers",1983,members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Ча́рльз Бе́ннингтон",33));
        members2.add(new MusicArtist("Майк Шинода",35));
        members2.add(new MusicArtist("Брэд Дэлсон",34));
        MusicBand musicBand2 = new MusicBand("Linkin Park",1996,members2);

        MusicBand.transferMembers(musicBand1,musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
