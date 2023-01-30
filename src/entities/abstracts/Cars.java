package entities.abstracts;

import entities.concretes.Honda;

import java.util.List;

public abstract class Cars {

    private String id;
    private int modelYear;
    private boolean gear=false;
    private String fuelType;
    private double dailyPrice;
    private boolean isActive=true;
    private String model;

    private String brandName;


//    private String colour;
//    private int km;
//    private int seat;
//    private int door;
//    private String ac;
//    private boolean inMaintance=false;
public String getBrandName() {
    return brandName;
}

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isGear() {
        return gear;
    }

    public void setGear(boolean gear) {
        this.gear = gear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id='" + id + '\'' +
                ", brandName='" + brandName + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                ", gear=" + gear +
                ", fuelType='" + fuelType + '\'' +
                ", dailyPrice=" + dailyPrice +
                //", isActive =" + isActive +
                '}';
    }

    public abstract void showAvailableCars(boolean isActive);
    public abstract void showSelectedCar(boolean isActive);
    public abstract void showInactiveCars(boolean isActive);

}

