public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        strategy = getClass(income);
        return strategy.calculate(income);
    }

    private InsuranceStrategy getClass(double income) {
        if (isLowIncome(income)) {
            return new InsuranceStrategyLow();
        } if (isMediumIncome(income)) {
            return new InsuranceStrategyMedium();
        } if (isHighIncome(income)) {
            return new InsuranceStrategyHigh();
        }
        return new InsuranceStrategyVeryHigh();
    }

    private boolean isHighIncome(double income) {
        return income <= 60000;
    }

    private boolean isMediumIncome(double income) {
        return income <= 30000;
    }

    private boolean isLowIncome(double income) {
        return income <= 10000;
    }
}
