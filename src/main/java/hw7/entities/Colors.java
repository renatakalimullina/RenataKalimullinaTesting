package hw7.entities;

public enum Colors {

    COLORS(1, "Colors"),
    RED(2, "Red"),
    GREEN(3, "Green"),
    BLUE(4, "Blue"),
    YELLOW(5, "Yellow");

    private final int number;
    private final String name;


    Colors(int number, String name) {
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }
}
