package business.concretes;

import business.abstracts.ReservationCostCalculateService;
import core.enums.DiscountRates;

public class ReservationCostCalculateManager implements ReservationCostCalculateService {
    @Override
    public double getOneWeekPrice(int day, double dailyPrice) {

        return day * dailyPrice * DiscountRates.getOneWeekPrice.getDiscountRate();
    }

    @Override
    public double getTwoWeeksPrice(int day, double dailyPrice) {

        return day * dailyPrice * DiscountRates.getTwoWeeksPrice.getDiscountRate();
    }

    @Override
    public double getMoreThanTwoWeeksPrice(int day, double dailyPrice) {
        return day * dailyPrice * DiscountRates.getMoreThanTwoWeeksPrice.getDiscountRate();
    }
}
