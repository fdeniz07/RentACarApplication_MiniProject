package core.validations;

import java.util.Scanner;

public class TcNoValidator {

    public String getValidTcNumber() {

        Scanner scanner = new Scanner(System.in);
        String tcNo = "";

        do {
            tcNo = scanner.next();
            String x = tcNo.replaceAll("[\\d]", "");

            if (!x.isEmpty()) {
                System.out.println("Sayi disinda karakter girmeyiniz!");
                System.out.println("Tekrar deneyiniz");
            }

            else if (tcNo.length() != 11) {
                System.out.println("TC kimlik numarasi 11 karakterden olusmalidir");
                System.out.println("Tekrar deneyiniz");
            }
            else{
                break;
            }


        } while (true);

        return tcNo;
    }

}
