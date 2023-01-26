package core.helpers;

import entities.concretes.Honda;

import java.util.Scanner;

public class GetCar {

    Scanner inp = new Scanner(System.in);


    public void getHonda (){
        Honda honda = new Honda();

        int flag = 0;
        String id;

        do {
            id = inp.nextLine();
            for (Honda w:honda.hondaList){

                if (w.getId().equals(id)){
                    System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
                    System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");
                    System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Honda",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
                    //reservationManager.reservertCars.add(w);
                    honda.hondaList.remove(w);
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

    public void getBmw(){

    }

    public void getAudi(){

    }

}
