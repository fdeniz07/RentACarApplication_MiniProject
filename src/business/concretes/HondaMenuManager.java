package business.concretes;

import core.helpers.GetCar;
import core.helpers.GetReservation;
import core.helpers.Slow;
import entities.concretes.Honda;

import java.util.Scanner;

public class HondaMenuManager extends MenuManager {

    Scanner inp= new Scanner(System.in);

    Honda honda = new Honda(); //DI (Dependeny Injection) --> Don't repeat yourself (DRY)  - SOLID

    CustomerManager customerManager = new CustomerManager();
    GetCar getCar = new GetCar();
    GetReservation reservationCard = new GetReservation();

    public void hondaMenu(){

        honda.fillHondaList();

        String select;

        honda.showAvailableCars(true);

//        System.out.println("=================== InactiveCars ==============");
//        honda.showInactiveCars(false);

        System.out.println("================================== ARAC SECIMI =============================================\n");
        System.out.println("Rezervasyon işlemini bitirmek için 'Q', devam etmek için herhangi bir tuşa basınız");
        select = inp.nextLine();

        if (select.equalsIgnoreCase("Q")){
            getSelectionMenu();
        }

        System.out.println("Lütfen kiralamak istediğiniz arabanın kodunu giriniz");
        getCar.getHonda();


        String s ="Müşteri kayıt menüsüne yönlendiriliyorsunuz...\n";
        Slow.slowPrint(s,30);
        customerManager.register();

    }

    @Override
    public void search() {
        int flag = 0;
        String id;

        do {
            id = inp.nextLine();
            for (Honda w:honda.hondaList){

                if (w.getId().equals(id)){
                    w.showAvailableCars(true);
                    flag++;
                    break;
                }
            }

            if (flag==0){
                System.out.println("Girilen kodla eşleşen araç bulunamadı!");
            }else {
                System.out.println("Başarıyla kaydolmuştur");
                break;
            }
        }while (true);
    }
}
