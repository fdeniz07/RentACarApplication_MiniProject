package core.validations;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeValidator {

    public LocalTime getValidTime() {

        Scanner scanner = new Scanner(System.in);
        LocalTime time = null;
        int saat,dakika;
        int saniye=0;
        System.out.println("Lutfen zaman bilgisini saat / dakika (10:00) olacak sekilde giriniz");
        boolean isDigit;
        do {
            isDigit = false;
            System.out.print(" saat: ");
            try {
                saat = scanner.nextInt();
                System.out.print(" dakika : ");
                dakika = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Girdiginiz degerler rakam olmalidir.");
                scanner.nextLine();
                isDigit = true;
                continue;
            }
            try {
                time = LocalTime.of(saat, dakika, saniye);
            } catch (Exception e) {
                System.out.println(" Lutfen gecerli bir saat giriniz.");
                isDigit = true;
            }
        } while (isDigit);

        return time;
    }
}
