package model;

public class UsaInterestService implements InterestService{

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getInterestRate() {
        return 1.0;
    }

    @Override
    public double getPaymentAmount(double amount, double months) {
        return InterestService.super.getPaymentAmount(amount, months);
    }
}
