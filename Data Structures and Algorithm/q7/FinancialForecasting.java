public class FinancialForecasting {

    // Recursive method to calculate the future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base Case: If years is 0, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive Case: Apply growth rate and reduce the number of years
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0; // Starting amount
        double growthRate = 5.0; // Growth rate (5%)
        int years = 100; // Number of years to forecast

        double futureValue = calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: $" + String.format("%.2f", futureValue));
    }
}
