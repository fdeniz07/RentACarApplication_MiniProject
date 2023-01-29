package business.concretes;

import business.abstracts.ReservationCostCalculateService;
import entities.concretes.DiscountRates;

public class ReservationCostCalculateManager implements ReservationCostCalculateService {
    @Override
    public double getOneWeekPrice(int day, double dailyPrice) {

        return day * dailyPrice * DiscountRates.getOneWeekPrice.getDiscountRate();
    }

    @Override
    public double getTwoWeeksPrice(int day, double dailyPrice) {

        return day * dailyPrice * DiscountRates.getOneWeekPrice.getDiscountRate();
    }

    @Override
    public double getMoreThanTwoWeeksPrice(int day, double dailyPrice) {
        return day * dailyPrice * DiscountRates.getOneWeekPrice.getDiscountRate();
    }
}
