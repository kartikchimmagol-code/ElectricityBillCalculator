package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ElectricityBillCalculatorTest {

    @Test
    void testFirstSlab() {
        assertEquals(125.0,
            ElectricityBillCalculator.calculateBill(50), 0.001);
    }

    @Test
    void testSlabBoundary() {
        assertEquals(200.0,
            ElectricityBillCalculator.calculateBill(100), 0.001);
    }

    @Test
    void testMultipleSlabs() {
        assertEquals(400.0,
            ElectricityBillCalculator.calculateBill(150), 0.001);
    }

    @Test
    void testZeroUnits() {
        assertEquals(50.0,
            ElectricityBillCalculator.calculateBill(0), 0.001);
    }

    @Test
    void testNegativeUnits() {
        assertThrows(IllegalArgumentException.class,
            () -> ElectricityBillCalculator.calculateBill(-1));
    }
}