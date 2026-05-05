package com.pluralsight;

import com.pluralsight.model.Employee;
import com.pluralsight.model.Hotel;
import com.pluralsight.model.Reservation;
import com.pluralsight.model.Room;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");

        Room room = new Room(2, 300, false, false, false);
        Reservation reservation = new Reservation("King", 4,  true);
        Employee employee = new Employee(39049, "Kendall", "Management", 23.75, 60);
        Hotel hotel = new Hotel("Hilton", 100, 30, 60, 25);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        String C = "\u001B[38;5;208m";
        String R = "\u001B[0m";

        System.out.println("Room Information:");
        System.out.println(C + "\tNumber of beds: " + R + room.getNumberOfBeds());
        System.out.println(C + "\tPrice: " + R + money.format(room.getPrice()));
        System.out.println(C + "\tOccupied?: " + R + room.isOccupied());
        System.out.println(C + "\tDirty?: " + R + room.isDirty());
        System.out.println(C + "\tAvailable?: " + R + room.isAvailable());

        System.out.println();
        System.out.println("Reservation Information:");
        System.out.println(C + "\tRoom type: " + R + reservation.getRoomType());
        System.out.println(C + "\tPrice per night: " + R + money.format(reservation.getPrice()));
        System.out.println(C + "\tNumber of nights: " + R + reservation.getNumberOfNights());
        System.out.println(C + "\tWeekend? " + R + reservation.isWeekend());
        System.out.println(C + "\tReservation total: " + R + money.format(reservation.getReservationTotal()));

        System.out.println();
        System.out.println(employee.getName() + "'s Pay:");
        System.out.println(C + "\tEmployee ID: " + R + employee.getEmployeeID());
        System.out.println(C + "\tDepartment: " + R + employee.getDepartment());
        System.out.println(C + "\tPay rate: " + R + employee.getPayRate());
        System.out.println(C + "\tHours worked: " + R + employee.getRegularHours());
        System.out.println(C + "\tOvertime Hours: " + R + employee.getOvertimeHours());
        System.out.println(C + "\tTotal Pay: " + R + employee.getTotalPay());


        System.out.println();
        System.out.println(hotel.getName() + " Information:");
        System.out.println(C + "\t Total Rooms: " + R + hotel.getNumberOfRooms());
        System.out.println(C + "\t Total Suites: " + R + hotel.getNumberOfSuites());
        System.out.println(C + "\t Available rooms: " + R + hotel.getAvailableRooms());
        System.out.println(C + "\t Available Suites: " + R + hotel.getAvailableSuites());


    }

}
