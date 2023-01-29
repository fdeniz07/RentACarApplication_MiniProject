package core.helpers;

import entities.abstracts.Cars;
import entities.concretes.Customers;
import entities.concretes.Reservation;

import java.util.ArrayList;
import java.util.List;

public class GetReservation {
    public static List<Cars> reservedCars = new ArrayList<>();
    public static List<Customers> reservedCustomers = new ArrayList<>();
    public static List<Reservation> reservations = new ArrayList<>();


    public void addCarToList(Cars car) {
        reservedCars.add(car);
    }

    public void addCustomerToList(Customers customer) {

        reservedCustomers.add(customer);
    }

    public void addReservationToList(Reservation reservation) {

        reservations.add(reservation);
    }



}
