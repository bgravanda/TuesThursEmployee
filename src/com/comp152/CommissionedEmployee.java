package com.comp152;

public class CommissionedEmployee extends Employee{
    private int numberOfSales;
    public final static double commissionAmount=100;

    @Override
    public double calculateBiWeeklyPay() {
        return 0;
    }
}
