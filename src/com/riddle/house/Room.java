package com.riddle.house;

public class Room {
    private boolean isPassage;

    public Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public void print() {
        System.out.println(isPassage ? "Комната проходная" : "Комната не проходная");
    }
}
