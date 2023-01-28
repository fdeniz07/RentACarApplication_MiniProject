package core.validations;

import core.helpers.Slow;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DriverLicenceValidator {

    public void driverLicenceEligibility(LocalDate birthday, LocalDate licenceDay) { //Ehliyet uygun mu



        //DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yy");//09-42 ös şimdiki saatin formatını değiştirdim

        int validBirthDate = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
        //System.out.println(validBirthDate);

        int validLicenceDate = (int) ChronoUnit.YEARS.between(licenceDay, LocalDate.now());
       // System.out.println(validLicenceDate);

        do {
            if (validBirthDate < 18 || validBirthDate > 100) {
                System.out.println("Lütfen geçerli bir yaş giriniz!");
                System.out.println("Tekar deneyiniz: ");
            } else if (validLicenceDate < 3) {
                System.out.println("Araç kiralamak için en az 3 yillik tecrübeye sahip olmalısınız!");
                System.out.println("Tekrar deneyiniz: ");
            } else {
                String message = "Araç kiralamak için ehliyetinizin süresi uygun görülmüstür.";
                Slow.slowPrint(message, 30);
                break;
            }

        } while (true);

    }
}
