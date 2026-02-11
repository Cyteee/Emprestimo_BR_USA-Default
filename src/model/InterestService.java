package model;

import java.security.InvalidParameterException;

public interface InterestService{

    double getInterestRate();

    default double getPaymentAmount(double amount, int months){
        if (amount < 1){
            throw new InvalidParameterException("");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
