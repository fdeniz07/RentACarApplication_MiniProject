package core.validations;

import java.util.Scanner;

public class NameValidator {

    Scanner scan = new Scanner(System.in);

    public String isValidFirstName() {
        String firstName = "";
        do {
            firstName = scan.nextLine().trim();
            String s = firstName.replaceAll("[a-zA-Z]", "");

            if (!s.isEmpty()) {
                System.out.println("Harf dışında bir karakter girilemez...");
                System.out.println("Tekrar deneyiniz: ");
            } else if (firstName.length() < 2 || firstName.length() > 20) {
                System.out.println("İsminiz en az 3 ve en fazla 20 harf içermelidir...");
                System.out.println("Tekrar deneyiniz: ");
            } else {
                firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                break;
            }
        } while (true);

        return firstName;

    }

    public String isValidLastName() {
        Scanner scan = new Scanner(System.in);

        String lastName = "";
        do {
            lastName = scan.nextLine().trim();
            String s = lastName.replaceAll("[a-zA-Z]", "");
            if (!s.isEmpty()) {
                System.out.println("Harf dışında bir karakter girilemez...");
                System.out.println("Tekrar deneyiniz: ");
            } else if (lastName.length() < 2 || lastName.length() > 30) {
                System.out.println("Soyadiniz en az 3 ve en fazla 30 harf içermelidir...");
                System.out.println("Tekrar deneyiniz: ");
            } else {
                lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                break;
            }


        } while (true);

        return lastName;

    }


}
