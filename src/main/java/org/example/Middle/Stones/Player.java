package org.example.Middle.Stones;

public class Player {
    private String name;
    private int counter;

    public Player(String name) {
        this.name = name;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void addToCounter(int points) {
        counter += points;
    }
}
