package core.helpers;

import business.abstracts.MenuService;
import business.concretes.MenuManager;

import java.util.Scanner;

public class Start {

    public static void start(){

        Scanner inp = new Scanner(System.in);

        MenuManager menuManager = new MenuManager();


        int select;

        do {
            System.out.println("========== RENT A CAR UYGULAMAMIZA HOSGELDINIZ ==========\n");
            System.out.println("1-Araç Seçimi");
            System.out.println("2-Müşreti kayıt");
            System.out.println("3-Rezervasyonu onayla");
            System.out.println("4-Arac Rezervasyon İptal");
            System.out.println("0-Çıkış");

            select = inp.nextInt();

            switch (select){
                case 1:
                    menuManager.getSelectionMenu();
                    break;
                case 2:
                    //müşreti kayıt
                    break;
                case 3:
                    //onay
                    break;
                case 4:
                    //rezervasyon
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
