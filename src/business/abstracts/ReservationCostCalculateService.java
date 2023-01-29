package business.abstracts;

public interface ReservationCostCalculateService {

    //pickupdate ve returndate
    //dailyPrice
    //

    double getOneWeekPrice(int day, double dailyPrice);
    double getTwoWeeksPrice(int day, double dailyPrice);
    double getMoreThanTwoWeeksPrice(int day, double dailyPrice);
}
