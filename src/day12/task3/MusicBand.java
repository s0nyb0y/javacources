package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
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

        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand band : list) {
            if (band.getYear() > 2000) {
                after2000.add(band);
                System.out.println(after2000);
            }
        }
        return after2000;
    }
}
//    public static void groupsAfter2000(List<MusicBand>list){
//        for (MusicBand band : list) {
//            if (band.getYear() > 2000) {
//                List<MusicBand>bands = new ArrayList<>();
//                bands.add(band);
//                System.out.println(bands);
//            }
//        }
//    }

