package hw7.entities;

public enum Vegetables {

    CUCUMBER(1, "Cucumber"),
    TOMATO(2, "Tomato"),
    VEGETABLES(3, "Vegetables"),
    ONION(4, "Onion");

    private final int number;
    private final String name;

    Vegetables(int number, String name){
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
