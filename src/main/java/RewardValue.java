public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method which returns the cash value of the RewardValue.
    public double getCashValue() {
        return this.cashValue;
    }

    // Method which returns how many miles the RewardValue is worth.
    public double getMilesValue() {
        return this.milesValue;
    }
}
