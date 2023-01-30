package business.concretes;

import application.console.concretes.Start;
import business.abstracts.CarService;
import core.helpers.GetCar;
import core.helpers.Slow;
import entities.concretes.Honda;


import java.util.Scanner;

public class HondaMenuManager extends MenuManager implements CarService {

    Scanner inp = new Scanner(System.in);
    Honda honda = new Honda(); //DI (Dependeny Injection) --> Don't repeat yourself (DRY)  - SOLID
    CustomerManager customerManager = new CustomerManager();
    GetCar getCar = new GetCar();

    public void hondaMenu() {
        String select;

        honda.fillHondaList();
        honda.showAvailableCars(true);

//        System.out.println("=================== InactiveCars ==============");
//        honda.showInactiveCars(false);

        System.out.println("================================== ARAC SECIMI =============================================\n");


        System.out.println("Rezervasyon işlemini bitirmek için 'Q', devam etmek için herhangi bir tuşa basınız");
        select = inp.nextLine();

        if (select.equalsIgnoreCase("Q")) {
            getSelectionMenu();
        }

        System.out.print("Lütfen kiralamak istediğiniz arabanın kodunu giriniz:");
        System.out.println();
        getCar.getHonda();

        System.out.println();
        String s = "==> Müşteri kayıt menüsüne yönlendiriliyorsunuz...\n\n";
        Slow.slowPrint(s, 30);
        customerManager.register();
    }

    @Override
    public void search() {
        int flag = 0;
        String id;

        do {
            id = inp.nextLine();
            for (Honda w : honda.hondaList) {

                if (w.getId().equals(id)) {
                    w.showAvailableCars(true);
                    flag++;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Girilen kodla eşleşen araç bulunamadı!");
            } else {
                System.out.println("Başarıyla kaydolmuştur");
                break;
            }
        } while (true);
    }


    public void hondaListMenu() {

        int select;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen görüntülemek istediginiz arac listesinin numarasini giriniz");
        System.out.println("1-Sadece müsait olan araclar");
        System.out.println("2-Sadece rezerve edilmis araclar");
        System.out.println("3-Tüm araclar");
        System.out.println("0-Ana menü");
        select = inp.nextInt();

        switch (select) {
            case 1:
                this.availableCarsList();
                break;
            case 2:
                this.reservedCarsList();
            case 3:
                this.allCarsList();
            case 0:
                Start.start();

        }


    }


    @Override
    public void availableCarsList() {
        honda.showAvailableCars(true);
    }

    @Override
    public void reservedCarsList() {
        honda.showInactiveCars(false);
    }

    @Override
    public void allCarsList() {
        honda.fillHondaList();
    }

    @Override
    public void unAvailableCarsList() {

    }
}
