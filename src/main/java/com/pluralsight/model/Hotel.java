package com.pluralsight.model;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    private int availableSuites;
    private int availableRooms;

    public Hotel(String name, int numberOfRooms, int numberOfSuites) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if(isSuite){
            if(this.availableSuites - numberOfRooms >= 0){
                this.availableRooms -= numberOfRooms;
                return true;
            } else {
                return false;
            }
        } else {
            if (this.availableRooms - numberOfRooms >= 0) {
                this.availableRooms -= numberOfRooms;
                return true;
            } else {
                return false;
            }
        }
    }

    public void getAvailableSuites() {
        this.availableSuites = this.numberOfSuites - this.bookedSuites;
    }

    public void getAvailableRooms(){
        this.availableRooms = this.numberOfRooms - this.bookedBasicRooms;
    }



}
