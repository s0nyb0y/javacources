package day20;

public enum ShipsFigure {
    EMPTY("_ ",0),SHIP("o ",1),HIT("x ",2),MISS("* ",3);
    final String name;
    final int value;

    ShipsFigure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
