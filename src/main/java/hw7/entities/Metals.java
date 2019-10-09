package hw7.entities;

public enum Metals {

    METALS(1, "Metals"),
    GOLD(2, "Gold"),
    SILVER(3, "Silver"),
    BRONZE(4, "Bronze"),
    SELEN(5, "Selen");

    private final int number;
    private final String name;

    Metals(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }
}
