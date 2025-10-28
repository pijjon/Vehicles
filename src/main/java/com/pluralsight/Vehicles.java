package com.pluralsight;

public class Vehicles {
    public static void main(String[] args) {
        Moped moped = new Moped("blue", 1, 1, 2);
        Car car = new Car("black", 5, 5, 12);
        Semitruck semitruck = new Semitruck("white", 3, 200, 50);
        Hovercraft hovercraft = new Hovercraft("red", 8, 30, 15);

        moped.setColor("green");
    }
}
