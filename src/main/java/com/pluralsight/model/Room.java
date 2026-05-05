package com.pluralsight.model;

public class Room {

    private int numberOfBeds;
    private int price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(int numberOfBeds, int price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }

    public void checkIn(){
        this.dirty = true;
        this.occupied = true;
    }

    public void checkOut(){
        this.occupied = false;
        cleanRoom();
    }

    public void cleanRoom(){
        this.dirty = false;
    }
}
