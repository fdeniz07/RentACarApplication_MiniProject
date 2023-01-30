package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Bmw extends Cars {

    public List<Bmw> bmwList = new ArrayList<>();

    //private String model;

    public Bmw() {
    }

    public Bmw(String brandName,String model, String id, int modelYear, boolean gear, String fuelType, double dailyPrice,boolean isActive) {
        super.setBrandName(brandName);
        super.setModel(model);
        super.setId(id);
        super.setModelYear(modelYear);
        super.setGear(gear);
        super.setFuelType(fuelType);
        super.setDailyPrice(dailyPrice);
        super.setActive(isActive);
    }


    @Override
    public String toString() {
        return
                "Id: " + getId() +
                        ", brandName='" + getBrandName() + '\'' +
                        ", Model: "+ getModel() +
                        ", Model Year: "+ getModelYear() +
                        ", Automatic Gear: "+ isGear() +
                        ", Fuel Type: " + getFuelType() +
                        ", Daily Price: " + getDailyPrice()+
                        ", Is Active: " + isActive()
                ;
    }


    public void fillBmwList(){
        Bmw bmw  = new Bmw("BMW","118","1182020100",2020,true,"gasoline",75.90,true);
        Bmw bmw2 = new Bmw("BMW","116","1162022101",2022,false,"electric",55.90,true);
        Bmw bmw3 = new Bmw("BMW","216","2162021100",2021,true,"diesel",65.90,true);
        Bmw bmw4 = new Bmw("BMW","218","2182022101",2022,true,"gasoline",65.90,true);
        Bmw bmw5 = new Bmw("BMW","320","3202022100",2022,false,"hybrid",75.90,true);
        Bmw bmw6 = new Bmw("BMW","520","5202023100",2023,true,"gasoline",95.90,true);
        Bmw bmw7 = new Bmw("BMW","X5D","X5D2021100",2021,true,"diesel",105.90,false);
        Bmw bmw8 = new Bmw("BMW","X6B","X6B2020100",2020,true,"electric",125.90,true);
        bmwList.add(bmw);
        bmwList.add(bmw2);
        bmwList.add(bmw3);
        bmwList.add(bmw4);
        bmwList.add(bmw5);
        bmwList.add(bmw6);
        bmwList.add(bmw7);
        bmwList.add(bmw8);

    }
    @Override
    public void showAvailableCars(boolean isActive){
        System.out.println();
        System.out.println("////////////////////////////////////// MÜSAIT ARACLARIMIZ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
        for (Bmw w :bmwList){

            if (w.isActive()==isActive){
                System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),w.getBrandName(),w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
            }
        }
        System.out.println();
    }

    @Override
    public void showSelectedCar(boolean isActive) {
        System.out.println();
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
        for (Bmw w :bmwList){

            if (w.isActive()==isActive){
                System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),w.getBrandName(),w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
            }
        }
        System.out.println();
    }


    public void showInactiveCars(boolean isActive){
        System.out.println();
        System.out.println("////////////////////////////////////// MÜSAIT OLMAYAN ARACLARIMIZ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ \n");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
        for (Bmw w :bmwList){

            if (!w.isActive()){
                System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",w.getId(),w.getBrandName(),w.getModel(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
            }
        }
    }

}
