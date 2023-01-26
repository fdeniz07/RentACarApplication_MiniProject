package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Audi extends Cars {

    public List<Audi> audiList = new ArrayList<>();

    private String model;

    public Audi() {
    }

    public Audi(String model, String id, int modelYear, boolean gear, String fuelType, double dailyPrice) {
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

    @Override
    public void showAvailableCars(boolean isActive) {

    }

    @Override
    public void showInactiveCars(boolean isActive) {

    }

    public void fillAudiList(){
        Audi audi = new Audi();
        Audi audi2 = new Audi();
        Audi audi3 = new Audi();
        Audi audi4 = new Audi();
        Audi audi5 = new Audi();
        Audi audi6 = new Audi();
        Audi audi7 = new Audi();
        Audi audi8 = new Audi();
        audiList.add(audi);
        audiList.add(audi2);
        audiList.add(audi3);
        audiList.add(audi4);
        audiList.add(audi5);
        audiList.add(audi6);
        audiList.add(audi7);
        audiList.add(audi8);

    }

    public void showAudiCars(){

        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","Marka","Model","ID","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n","-----","-----","--","----------","--------------","----------","------------");
        for (Audi w:audiList){
            System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n","Audi",w.getModel(),w.getId(),w.getModelYear(),w.isGear(),w.getFuelType(),w.getDailyPrice());
        }

    }
}
