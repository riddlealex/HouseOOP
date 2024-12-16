package com.riddle.house;

public class Flat {
    private int number;
    private Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Номер квартиры: " + number + ", количество комнат:" + rooms.length);
    }
}
