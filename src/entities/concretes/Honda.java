package entities.concretes;

import entities.abstracts.Cars;

import java.util.ArrayList;
import java.util.List;

public class Honda extends Cars {

    private String model;

    public List<Honda> hondaList = new ArrayList<>();

    public Honda() {
    }

    public Honda(String model) {
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model, String id, int modelYear, String colour, int km, int seat, int door, int gear, String ac, String fuelType,double dailyPrice ) {
        this.model = model;
        super.setId(id);
        super.setModelYear(modelYear);
        super.setColour(colour);
        super.setKm(km);
        super.setSeat(seat);
        super.setDoor(door);
        super.setGear(gear);
        super.setAc(ac);
        super.setFuelType(fuelType);
        super.setDailyPrice(dailyPrice);
    }


    public List<Honda> getHondaList() {
        return hondaList;
    }

    public void setHondaList(List<Honda> hondaList) {
        this.hondaList = hondaList;
    }


//    public void fillHondaList() {
//        Honda honda = new Honda(this.model, super.getId(),super.getModelYear(),);
//        hondaList.add(honda);
//    }
}

//this.model,super.getId(),super.getModelYear(),super.getColour(),super.getKm(),super.getSeat(),super.getDoor(),super.getGear(),super.getAc()