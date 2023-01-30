package core.helpers;

import entities.concretes.Audi;
import entities.concretes.Bmw;
import entities.concretes.Honda;
import java.util.Scanner;

public class GetCar {

    Scanner inp = new Scanner(System.in);
    GetReservation reservationCard = new GetReservation();

    public void getHonda() {
        Honda honda = new Honda();
        int flag = 0;
        String id;

        do {
            id = inp.nextLine().trim();
            honda.fillHondaList();
            for (Honda w : honda.hondaList) {

                if (w.getId().equals(id)) {
                    System.out.println();
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
                    System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),"Honda",w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
                    reservationCard.addCarToList(w);
                    w.setActive(false);
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println();
                System.out.println("Girilen kodla eşleşen araç bulunamadı!");
            } else {
                System.out.println();
                System.out.println("Arac secme islemi başarıyla gerceklesmistir");
                break;
            }
        } while (true);
    }

    public void getBmw() {
        Bmw bmw = new Bmw();
        int flag = 0;
        String id;

        do {
            id = inp.nextLine().trim();
            bmw.fillBmwList();
            for (Bmw w : bmw.bmwList) {

                if (w.getId().equals(id)) {
                    System.out.println();
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
                    System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),"BMW",w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
                    reservationCard.addCarToList(w);
                    w.setActive(false);
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println();
                System.out.println("Girilen kodla eşleşen araç bulunamadı!");
            } else {
                System.out.println();
                System.out.println("Arac secme islemi başarıyla gerceklesmistir");
                break;
            }
        } while (true);
    }

    public void getAudi() {

        Audi audi = new Audi();
        int flag = 0;
        String id;

        do {
            id = inp.nextLine().trim();
            audi.fillAudiList();
            for (Audi w : audi.audiList) {

                if (w.getId().equals(id)) {
                    System.out.println();
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
                    System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
                    System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),"AUDI",w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
                    reservationCard.addCarToList(w);
                    w.setActive(false);
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println();
                System.out.println("Girilen kodla eşleşen araç bulunamadı!");
            } else {
                System.out.println();
                System.out.println("Arac secme islemi başarıyla gerceklesmistir");
                break;
            }
        } while (true);
    }

}
