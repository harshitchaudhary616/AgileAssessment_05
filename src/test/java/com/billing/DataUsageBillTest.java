package com.billing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataUsageBillTest {

    @Test
    public void testBasicPlanWithinLimit() {
        DataUsageBill bill = new DataUsageBill("Rahul", "Basic", 8);
        assertEquals(299, bill.calculateBill());
    }

    @Test
    public void testBasicPlanExceedsLimit() {
        DataUsageBill bill = new DataUsageBill("Rahul", "Basic", 15);
        assertEquals(399, bill.calculateBill());
    }

    @Test
    public void testStandardPlanExceedsLimit() {
        DataUsageBill bill = new DataUsageBill("Priya", "Standard", 30);
        assertEquals(574, bill.calculateBill());
    }

    @Test
    public void testPremiumPlanWithinLimit() {
        DataUsageBill bill = new DataUsageBill("Amit", "Premium", 40);
        assertEquals(799, bill.calculateBill());
    }

    @Test
    public void testInvalidPlan() {
        DataUsageBill bill = new DataUsageBill("John", "Gold", 20);
        assertEquals(-1, bill.calculateBill());
    }
}
