package application.console.concretes;

import business.concretes.CustomerManager;
import business.concretes.MenuManager;
import business.concretes.ReservationManager;


import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);

        MenuManager menuManager = new MenuManager();
        CustomerManager customerManager = new CustomerManager();
        ReservationManager reservationManager = new ReservationManager();

        int select;

        do {
            System.out.println("========== RENT A CAR UYGULAMAMIZA HOSGELDINIZ ==========\n");
            System.out.println("1-Araç Seçimi");
            System.out.println("2-Müşreti kayıt");
            System.out.println("3-Rezervasyonu onayla");
            //System.out.println("4-Müsteri Rezervasyon İptal");
           // System.out.println("5-Rezervasyon Listesi");
           // System.out.println("6-Arac Listesi");
            System.out.println("0-Çıkış");

            select = inp.nextInt();

            switch (select){
                case 1:
                    menuManager.getSelectionMenu();
                    break;
                case 2:
                    customerManager.register();
                    break;
                case 3:
                    reservationManager.reservationConfirmation();
                    break;
                case 4:
                    //rezervasyon iptal
                    break;
                case 5:
                    //rezervasyon listesi
                    break;
                case 6:
                    //arac listesi
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız!");
                    break;
            }



        }while(select != 0);

        System.out.println("İyi günler, tekrar bekleriz...");
    }

}
