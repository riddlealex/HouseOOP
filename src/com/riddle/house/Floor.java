package com.riddle.house;

public class Floor {
    private int number;
    private Flat[] flats;

    public Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public int getNumber() {
        return number;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void print() {
        System.out.println("Номер этажа: " + number + ", количество квартир: " + flats.length);
    }
}
