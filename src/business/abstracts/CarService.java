package business.abstracts;

import entities.abstracts.Cars;

import java.util.List;

public interface CarService {

    void availableCarsList(); //Uygun araclar

    void reservedCarsList(); //Kirada olan araclar

    void  allCarsList();

    void unAvailableCarsList(); //Ileride bakima giden araclar buraya eklenecek


}
