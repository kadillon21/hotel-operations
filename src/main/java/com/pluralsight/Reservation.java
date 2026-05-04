package com.pluralsight;

public class Reservation {

    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;
    private int reservationTotal;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend, int reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
        this.reservationTotal = reservationTotal;
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

    public int getNumberOfNights() {
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

    public int getReservationTotal() {
        return reservationTotal;
    }
}
