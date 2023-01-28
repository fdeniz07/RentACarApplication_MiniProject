package business.concretes;

import business.abstracts.ReservationService;
import core.validations.DateValidator;
import core.validations.PickUpReturnDateValidator;
import entities.abstracts.Cars;
import entities.abstracts.Users;
import entities.concretes.Reservation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservationManager extends ReservationService {

    //alinacak sehir, teslim edilecek sehir, alinacak gun ve saat,  teslim edilecek gun ve teslim saati
    //faturalandir

    public static int counter = 1;
    Scanner scanner = new Scanner(System.in);

    Reservation reservation = new Reservation();
    DateValidator dateValidator = new DateValidator();
    PickUpReturnDateValidator pickUpDateValidator = new PickUpReturnDateValidator();

    public void reservationConfirmation() {

        System.out.println("Rezervasyon onay bölümüne hoşgeldiniz !");
        System.out.println("====================================");

        System.out.println("Lütfen araci teslim alacaginiz sehir adini giriniz: ");
        reservation.setPickUpLocation(scanner.nextLine());

        System.out.println("Lütfen araci teslim alacaginiz tarihi (Gun/Ay/Yil formatinda) giriniz: ");
        reservation.setPickUpDate(pickUpDateValidator.getPickUpValidDate());

        System.out.println("Lütfen araci teslim alacaginiz saati (Saat:Dakika formatinda) giriniz: ");
        reservation.setPickUpTime(LocalTime.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println("Lütfen araci teslim edeceginiz sehir adini giriniz: ");
        reservation.setPickUpLocation(scanner.nextLine());

        System.out.println("Lütfen araci teslim edeceginiz tarihi (Gun/Ay/Yil formatinda) giriniz: ");
        reservation.setPickUpDate(pickUpDateValidator.getReturnValidDate(reservation.getPickUpDate()));

        System.out.println("Lütfen araci teslim alacaginiz saati (Saat:Dakika formatinda) giriniz: ");
        reservation.setPickUpTime(LocalTime.parse(scanner.nextLine(),DateTimeFormatter.ofPattern("HH:mm")));



        //customer.setFirstName(nameValidator.isValidFirstName());
    }

    @Override
    public Cars car() {
        return null;
    }

    @Override
    public Users user() {
        return null;
    }
}
