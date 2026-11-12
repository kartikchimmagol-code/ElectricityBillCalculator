
package com.example;

public class ElectricityBillCalculator {

    public static double calculateBill(int units) {

        if (units < 0) {
            throw new IllegalArgumentException(
                "Units cannot be negative");
        }

        double bill = 0;

        if (units <= 100) {
            bill = units * 1.50;
        }
        else if (units <= 200) {
            bill = (100 * 1.50)
                 + (units - 100) * 2.50;
        }
        else if (units <= 500) {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + (units - 200) * 4.00;
        }
        else {
            bill = (100 * 1.50)
                 + (100 * 2.50)
                 + (300 * 4.00)
                 + (units - 500) * 6.00;
        }

        return bill + 50;
    }

    public static void main(String[] args) {

        int units = 150;

        double total = calculateBill(units);

        System.out.println("Electricity Units: " + units);
        System.out.println("Total Bill: Rs. " + total);
    }
}
