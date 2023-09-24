public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Get the cash value of RewardValue
    public double getCashValue() {
        return cashValue;
    }

    // Get the miles value of RewardValue
    public int getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage:
        RewardValue rewardInCash = new RewardValue(100.0);
        System.out.println("Cash Value: $" + rewardInCash.getCashValue());
        System.out.println("Miles Value: " + rewardInCash.getMilesValue() + " miles");

        RewardValue rewardInMiles = new RewardValue(5000);
        System.out.println("Cash Value: $" + rewardInMiles.getCashValue());
        System.out.println("Miles Value: " + rewardInMiles.getMilesValue() + " miles");
    }
}

