package com.riddle.house;

public class House {
    private int number;
    private Floor[] floors;

    public House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Номер дома: " + number + ", количество этажей: " + floors.length);
    }
}
