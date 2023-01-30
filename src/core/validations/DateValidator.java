package core.validations;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DateValidator {

    public LocalDate getValidDate() {

        Scanner scanner = new Scanner(System.in);
        LocalDate date = null; //LocalDate.now();
        int gun, ay, yil;
        System.out.println("Lutfen tarihinizi gun / ay / yil (31/01/2021) olacak sekilde giriniz");
        boolean isDigit;
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
        } while (isDigit);

        return date;
    }
}
