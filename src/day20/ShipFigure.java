package day20;

public enum ShipFigure {
    EMPTY("_ ",0),SHIP("o ",1),HIT("x ",2),MISS("* ",3);
    private String name;
    private int value;

    ShipFigure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
