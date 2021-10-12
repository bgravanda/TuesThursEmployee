package com.comp152;

public abstract class Employee {
    public final void fileW2Forms(){
    System.out.println("Now generating the W-2 form for this employee");
    }
    public abstract double calculateBiWeeklyPay();
    public  void withholdTaxes(){
        System.out.println("Now withholding "+calculateBiWeeklyPay()*.2+" in taxes");
    }
}
