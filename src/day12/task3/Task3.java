package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("System of a Down", 1992));
        list.add(new MusicBand("Linkin Park", 1996));
        list.add(new MusicBand("Red Hot Chili Peppers", 1984));
        list.add(new MusicBand("Nickel back", 1995));
        list.add(new MusicBand("Thirty Seconds to Mars", 1998));
        list.add(new MusicBand("Evanescence", 1995));
        list.add(new MusicBand("Fall Out Boy", 2001));
        list.add(new MusicBand("One Direction", 2010));
        list.add(new MusicBand("Radio head", 1985));
        list.add(new MusicBand("Foo Fighters", 1994));
//        System.out.println(list);
        Collections.shuffle(list);
//        MusicBand.groupsAfter2000(list);

//        List<MusicBand> after2000 = new ArrayList<>();
//        for (MusicBand band : list) {
//            if (band.getYear() > 2000) {
//                after2000.add(band);
//            }
//        }
//        System.out.println(list);
//        System.out.println();
//        System.out.println("Группы созданные после 2000: " + after2000);
//
//   }
        MusicBand.groupsAfter2000(list);

    }
}
