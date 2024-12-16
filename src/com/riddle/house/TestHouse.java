package com.riddle.house;

public class TestHouse {
    public static void main(String[] args) {
        Room[] rooms1 = {
                new Room(true),
                new Room(false),
                new Room(false),
        };
//        rooms1[0].print();
        Room[] rooms2 = {
                new Room(false),
                new Room(true),
        };
        Flat[] flats = {
                new Flat(1, rooms1),
                new Flat(2, rooms2)
        };
//        flats[0].print();
        Floor[] floors = {
                new Floor(1, flats)
        };
//        floors[0].print();
        House house = new House(5, floors);

        printAllInfO(house);

    }

    public static void printAllInfO(House house) {
        house.print();
        for (Floor floor : house.getFloors()) {
            floor.print();
            for (Flat flat : floor.getFlats()) {
                flat.print();
            }
        }
    }
}
