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

        Customers cus = GetReservation.reservedCustomers.get(index);
        Reservation res = GetReservation.reservations.get(index);
        Cars car = GetReservation.reservedCars.get(index);

        System.out.println("=============== MÜSTERI BILGILERI ================");
        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s \n", "Müsteri ID", "Isim", "Soyisim", "TC No", "Dogum Tarihi", "Ehliyet Verilis Tarihi");
        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s \n", "-----------", "--------------", "-------------", "-----------", "--------------", "--------------------------");
        System.out.printf("%-11s  %-15s  %-15s  %-11s  %-15s  %-25s\n", cus.getId(), cus.getFirstName(), cus.getLastName(), cus.getTcNo(), cus.getBirthDate(), cus.getDriverLicenceDate());
        System.out.println();

        System.out.println("============= REZERVASYON BILGILERI ==============");
        System.out.printf("%-17s  %-15s  %-13s  %-13s  %-15s  %-15s %-15s %-9s\n", "Rezervasyon ID", "Alis Yeri", "Alis Tarihi", "Alis Saati", "Teslim Yeri", "Teslim Tarihi","Teslim Saati", "Toplam Tutar");
        System.out.printf("%-17s  %-15s  %-13s  %-13s  %-15s  %-15s %-15s %-9s\n", "---------------", "---------------", "-------------", "-----------", "--------------", "--------------", "------------", "------------");
        System.out.printf("%-17s  %-15s  %-13s  %-13s  %-15s  %-15s %-15s $%-8s\n", res.getReservationId(), res.getPickUpLocation(), res.getPickUpDate(), res.getPickUpTime(), res.getReturnLocation(), res.getReturnDate(), res.getReturnTime(),priceCalculate());
        System.out.println();

        System.out.println("================= ARAC BILGILERI ==================");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","Arac Kodu","Marka","Model","Model Yılı","Otomatik Vites","Yakıt Tipi","Günlük Fiyat");
        System.out.printf("%-13s  %-10s  %-13s  %-10s  %-14s  %-12s %-15s\n","-----------","--------","---------","----------","--------------","----------","------------");
        System.out.printf("%-13s  %-10s  %-16s  %-10s  %-12s  %-12s $%-14s\n",car.getId(),car.getBrandName(),car.getModel(),car.getModelYear(),car.isGear(),car.getFuelType(),car.getDailyPrice());

        index++;
        System.out.println();
        System.out.println("Bizi tercih ettiginiz icin tesekkür ederiz.");
    }

    private double priceCalculate() {
        int day = calculateDay.calculate(GetReservation.reservations.get(index).getPickUpDate(), GetReservation.reservations.get(index).getReturnDate());
        
        double price= GetReservation.reservedCars.get(index).getDailyPrice();
        
        if (day<7){

           return rccm.getOneWeekPrice(day,price);

        } else if (day<15) {

            return rccm.getTwoWeeksPrice(day,price);

        }else{

            return rccm.getMoreThanTwoWeeksPrice(day,price);
        }

    }

}
