package core.validations;

import entities.concretes.Reservation;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PickUpReturnDateValidator {

    boolean isDigit;
    LocalDate temporalDate;

    public LocalDate getPickUpValidDate() {//reservasyon isleminde, müsterinin araci teslim alma tarihi, rezervasyon giris tarihinden eski olamaz!

        LocalDate date = null; //LocalDate.now();

        Scanner scanner = new Scanner(System.in);
        int gun, ay, yil;
        System.out.println("Lutfen araci teslim alacaginiz tarihinizi gun / ay / yil (31/01/2021) olacak sekilde giriniz");

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
        temporalDate = date;
        return date;
    }

    public LocalDate getReturnValidDate() {

        Reservation reservation = new Reservation();

        LocalDate returnDate = null;
        Scanner scanner = new Scanner(System.in);
        int gun, ay, yil;
        System.out.println("Lutfen araci teslim edeceginiz tarihinizi gun / ay / yil (31/01/2021) olacak sekilde giriniz");

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
                returnDate = LocalDate.of(yil, ay, gun);
            } catch (Exception e) {
                System.out.println(" Lutfen gecerli bir tarih giriniz.");
                isDigit = true;
            }

            try {
                if (temporalDate.isBefore(returnDate)) {
                    isDigit = false;
                }
            } catch (Exception e) {
                System.out.println("Teslim tarihi rezervasyon tarihinden önce olamaz!");
                isDigit = true;
            }

        } while (isDigit);

        return returnDate;
    }

//    public static void main(String[] args) {
//        getPickUpValidDate();
//        getReturnValidDate(getPickUpValidDate());
//    }
}
