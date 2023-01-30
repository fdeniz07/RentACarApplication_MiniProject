package business.abstracts;

import entities.abstracts.Cars;
import entities.abstracts.Users;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class ReservationService {

    public abstract Cars car();

    public abstract Users user();

}
