package org.example.Middle.Stones;

public class Player {
    private String name;
    private int counter;

    public Player(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
