package business.concretes;

import business.abstracts.ReservationService;
import core.helpers.GetInvoice;
import core.helpers.GetReservation;
import core.helpers.IdMaker;
import core.helpers.Slow;
import core.validations.DateValidator;
import core.validations.PickUpReturnDateValidator;
import core.validations.TimeValidator;
import entities.abstracts.Cars;
import entities.abstracts.Users;
import entities.concretes.Reservation;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservationManager extends ReservationService implements IdMaker {

    //alinacak sehir, teslim edilecek sehir, alinacak gun ve saat,  teslim edilecek gun ve teslim saati
    //faturalandir

    public static int number = 1;
    Scanner scanner = new Scanner(System.in);

    Reservation reservation = new Reservation();

    ReservationCostCalculateManager costCalculateManager = new ReservationCostCalculateManager();
    DateValidator dateValidator = new DateValidator();
    PickUpReturnDateValidator pickUpDateValidator = new PickUpReturnDateValidator();
    TimeValidator timeValidator = new TimeValidator();
    GetReservation reservationCard = new GetReservation();
    GetInvoice getInvoice = new GetInvoice();

    public void reservationConfirmation() {
        System.out.println("================================== REZERVASYON ONAY =============================================\n");
        System.out.println("Rezervasyon onay bölümüne hoşgeldiniz !");
        System.out.println("=================================================================================================");

        System.out.println("Lütfen araci teslim alacaginiz sehir adini giriniz: ");
        reservation.setPickUpLocation(scanner.nextLine().toUpperCase());

        System.out.println("Lütfen araci teslim alacaginiz tarihi (Gun/Ay/Yil formatinda) giriniz: ");
        reservation.setPickUpDate(pickUpDateValidator.getPickUpValidDate());

        System.out.println("Lütfen araci teslim alacaginiz saati (Saat:Dakika formatinda) giriniz: ");
        reservation.setPickUpTime(timeValidator.getValidTime());
        //reservation.setPickUpTime(LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm")));

        System.out.println("Lütfen araci teslim edeceginiz sehir adini giriniz: ");
        reservation.setReturnLocation(scanner.nextLine().toUpperCase());

        System.out.println("Lütfen araci teslim edeceginiz tarihi (Gun/Ay/Yil formatinda) giriniz: ");
        reservation.setReturnDate(pickUpDateValidator.getReturnValidDate());

        System.out.println("Lütfen araci teslim alacaginiz saati (Saat:Dakika formatinda) giriniz: ");
        reservation.setReturnTime(timeValidator.getValidTime());
        //reservation.setReturnTime(LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm")));

        reservation.setReservationId(idMaker(String.valueOf(number)));
        number++;

        System.out.println("=========================================================================================================");
        String message = "Reservasyonunuz faturalandiriliyor! \n";
        Slow.slowPrint(message, 100);
        System.out.println();

        reservationCard.addReservationToList(reservation);

        getInvoice.Invoice();


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

    @Override
    public String idMaker(String number) {

        String suffix = "INVOICE-0";


        return suffix + number; //INVOICE-01231000
    }
}
