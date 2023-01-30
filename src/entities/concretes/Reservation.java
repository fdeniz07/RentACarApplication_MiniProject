package entities.concretes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private String reservationId;
    private String pickUpLocation;
    private String returnLocation;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private LocalDate returnDate;
    private LocalTime returnTime;

    public Reservation() {
    }

    public Reservation(String reservationId, String pickUpLocation, String returnLocation, LocalDate pickUpDate, LocalTime pickUpTime, LocalDate returnDate, LocalTime returnTime) {
        this.pickUpLocation = pickUpLocation;
        this.returnLocation = returnLocation;
        this.pickUpDate = pickUpDate;
        this.pickUpTime = pickUpTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.reservationId = reservationId;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
    }

    public LocalDate getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(LocalDate pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public LocalTime getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(LocalTime pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalTime returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "id=" + reservationId +
                ", pickUpLocation='" + pickUpLocation + '\'' +
                ", returnLocation='" + returnLocation + '\'' +
                ", pickUpDate=" + pickUpDate +
                ", pickUpTime=" + pickUpTime +
                ", returnDate=" + returnDate +
                ", returnTime=" + returnTime;
    }
}
