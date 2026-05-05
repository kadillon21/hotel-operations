package com.pluralsight.model;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public Hotel(String name, int numberOfRooms, int numberOfSuites, int bookedBasicRooms, int bookedSuites) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if(isSuite){
            if(this.bookedSuites + numberOfRooms >= this.numberOfSuites){
                this.bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.bookedBasicRooms + numberOfRooms >= this.numberOfRooms) {
                this.bookedSuites += numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms(){
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    public String getName() {
        return name;
    }
}
