package core.helpers;

import business.concretes.ReservationCostCalculateManager;
import entities.abstracts.Cars;
import entities.concretes.Customers;
import entities.concretes.Reservation;

public class GetInvoice {

    GetReservation reservationCard = new GetReservation();

    public static int index = 0;
    CalculateDay calculateDay = new CalculateDay();
    
    ReservationCostCalculateManager rccm = new ReservationCostCalculateManager();

    public void Invoice() {

        Customers c = reservationCard.reservedCustomers.get(index);
        Reservation r = reservationCard.reservations.get(index);
        Cars car = reservationCard.reservedCars.get(index);


        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s \n", "Müsteri ID", "Isim", "Soyisim", "TC No", "Dogum Tarihi", "Ehliyet Verilis Tarihi");
        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s \n", "-----------", "--------------", "-------------", "-----------", "--------------", "----------", "------------");
        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s\n", c.getId(), c.getFirstName(), c.getLastName(), c.getTcNo(), c.getBirthDate(), c.getDriverLicenceDate());
        System.out.println();

        System.out.printf("%-15s  %-15s  %-11s  %-11s  %-15s  %-11s %-9s\n", "Rezervasyon ID", "Alis Yeri", "Alis Tarihi", "Alis Saati", "Teslim Yeri", "Teslim Saati", "Toplam");
        System.out.printf("%-15s  %-15s  %-11s  %-11s  %-15s  %-11s %-9s\n", "-----", "-----", "--", "----------", "--------------", "----------", "------------");
        System.out.printf("%-15s  %-15s  %-11s  %-11s  %-15s  %-11s $%-8s\n", r.getReservationId(), r.getPickUpLocation(), r.getPickUpDate(), r.getPickUpTime(), r.getReturnLocation(), r.getReturnDate(), r.getReturtime(),priceCalculate());

        System.out.println();
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n", "Marka", "Model", "ID", "Model Yılı", "Otomatik Vites", "Yakıt Tipi", "Günlük Fiyat");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s %-15s\n", "-----", "-----", "--", "----------", "--------------", "----------", "------------");
        System.out.printf("%-7s  %-10s  %-10s  %-10s  %-14s  %-10s $%-14s\n", "Honda", car.getModel(), car.getId(), car.getModelYear(), car.isGear(), car.getFuelType(), car.getDailyPrice());

        index++;
        System.out.println();
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz.");
    }

    private double priceCalculate() {
        int day = calculateDay.calculate(reservationCard.reservations.get(index).getPickUpDate(), reservationCard.reservations.get(index).getReturnDate());
        
        double price= reservationCard.reservedCars.get(index).getDailyPrice();
        
        if (day<7){

           return rccm.getOneWeekPrice(day,price);

        } else if (day<15) {

            return rccm.getTwoWeeksPrice(day,price);

        }else{

            return rccm.getMoreThanTwoWeeksPrice(day,price);
        }

    }

}
