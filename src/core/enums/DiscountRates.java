package core.enums;

public enum DiscountRates {

    getOneWeekPrice(1),
    getTwoWeeksPrice(0.9),
    getMoreThanTwoWeeksPrice(0.85);

    private final double discountRate;
    DiscountRates(double discounRate) {
        this.discountRate = discounRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
