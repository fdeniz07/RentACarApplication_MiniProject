package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Bmw extends Cars {

    public List<Bmw> bmwList = new ArrayList<>();

    private String model;

    public Bmw() {
    }

    public Bmw(String model, String id, int modelYear, boolean gear, String fuelType, double dailyPrice) {
        this.model = model;
        super.setId(id);
        super.setModelYear(modelYear);
        super.setGear(gear);
        super.setFuelType(fuelType);
        super.setDailyPrice(dailyPrice);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "Id: " + getId() +
                        ", Model: "+ getModel() +
                        ", Model Year: "+ getModelYear() +
                        ", Automatic Gear: "+ isGear() +
                        ", Fuel Type: " + getFuelType() +
                        ", Daily Price: " + getDailyPrice()
                ;
    }

    public void fillBmwList(){
        Bmw bmw = new Bmw();
        Bmw bmw2 = new Bmw();
        Bmw bmw3 = new Bmw();
        Bmw bmw4 = new Bmw();
        Bmw bmw5 = new Bmw();
        Bmw bmw6 = new Bmw();
        Bmw bmw7 = new Bmw();
        Bmw bmw8 = new Bmw();
        bmwList.add(bmw);
        bmwList.add(bmw2);
        bmwList.add(bmw3);
        bmwList.add(bmw4);
        bmwList.add(bmw5);
        bmwList.add(bmw6);
        bmwList.add(bmw7);
        bmwList.add(bmw8);
    }

    public void showBmwCars(){

        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");
        for (Bmw w:bmwList){
            System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Bmw",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
        }

    }

}
