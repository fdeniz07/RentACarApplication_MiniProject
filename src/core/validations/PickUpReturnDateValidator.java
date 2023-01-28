package core.validations;

import entities.concretes.Reservation;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PickUpReturnDateValidator {

//    public static void main(String[] args) {
//        System.out.println(getValidDate());
//    }

    Reservation reservation = new Reservation();

    Scanner scanner = new Scanner(System.in);

    boolean isDigit;

    public LocalDate getPickUpValidDate() {//reservasyon isleminde, müsterinin araci teslim alma tarihi, rezervasyon giris tarihinden eski olamaz!

        LocalDate date = null; //LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        int gun, ay, yil;
        System.out.println("Lutfen tarihinizi gun / ay / yil (31/01/2021) olacak sekilde giriniz");

        do {
            isDigit = false;

            System.out.print(" gun: ");
            try {
                gun = scanner.nextInt();
                System.out.print(" ay : ");
                ay = scanner.nextInt();
                System.out.print(" yil: ");
                yil = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Girdiginiz degerler rakam olmalidir.");
                scanner.nextLine();
                isDigit = true;
                continue;
            }
            try {
                date = LocalDate.of(yil, ay, gun);
            } catch (Exception e) {
                System.out.println(" Lutfen gecerli bir tarih giriniz.");
                isDigit = true;
            }

            if (date.isBefore(LocalDate.now())) {
                System.out.println("Rezervasyon tarihi bugünden önce olamaz!");
                isDigit = true;
            }

        } while (isDigit);

        return date;
    }

    public LocalDate getReturnValidDate() {

        LocalDate pickUpDate = reservation.getPickUpDate();

        LocalDate date = null; //LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        int gun, ay, yil;
        System.out.println("Lutfen tarihinizi gun / ay / yil (31/01/2021) olacak sekilde giriniz");

        do {
            isDigit = false;

            System.out.print(" gun: ");
            try {
                gun = scanner.nextInt();
                System.out.print(" ay : ");
                ay = scanner.nextInt();
                System.out.print(" yil: ");
                yil = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Girdiginiz degerler rakam olmalidir.");
                scanner.nextLine();
                isDigit = true;
                continue;
            }
            try {
                date = LocalDate.of(yil, ay, gun);
            } catch (Exception e) {
                System.out.println(" Lutfen gecerli bir tarih giriniz.");
                isDigit = true;
            }

            if (date.isBefore(pickUpDate)) {
                System.out.println("Teslim tarihi rezervasyon tarihi bugünden önce olamaz!");
                isDigit = true;
            }

        } while (isDigit);

        return date;

    }
}
