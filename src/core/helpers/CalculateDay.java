package core.helpers;

import business.concretes.ReservationCostCalculateManager;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateDay {

    public int calculate(LocalDate pickUpDate, LocalDate returnDate) {

        return (int) ChronoUnit.DAYS.between(pickUpDate, returnDate);
    }
}

