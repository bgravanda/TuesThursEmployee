package com.comp152;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        var allEmployees = new ArrayList<Employee>();
        Employee newEmployee = new CommissionedEmployee();
        allEmployees.add(newEmployee);
        newEmployee = new SalariedEmployee(55000);
        allEmployees.add(newEmployee);
        for (var emp:allEmployees){
            System.out.println("paying a "+emp.getClass().getName()+" $"+emp.calculateBiWeeklyPay());
        }
	//WeekDay deliveryDay = WeekDay.Friday;
    //Selects a random value from enum
    //var picker = new Random();
    //var choice = picker.nextInt(WeekDay.values().length);
    //deliveryDay = WeekDay.values()[choice];
    //System.out.println("It will arrive on "+deliveryDay);
    }
}
