package com.pluralsight.models;

public class Reservation {

    private String roomType;
    private double price;
    private double numberOfNights;
    private boolean weekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;

        if (roomType.equalsIgnoreCase("king")){
            this.price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124;
        }

        if (this.weekend){
            this.price *= 1.1;
        }

    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public double getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeek(boolean isWeekend){
        this.weekend = isWeekend;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }
}
