package com.billing;

public class DataUsageBill {

    private String customerName;
    private String planType;
    private double dataUsage;

    public DataUsageBill(String customerName, String planType, double dataUsage) {
        this.customerName = customerName;
        this.planType = planType;
        this.dataUsage = dataUsage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPlanType() {
        return planType;
    }

    public double getDataUsage() {
        return dataUsage;
    }

    public double calculateBill() {

        double basePrice;
        double dataLimit;
        double extraCharge;

        if (planType.equalsIgnoreCase("Basic")) {
            basePrice = 299;
            dataLimit = 10;
            extraCharge = 20;
        } else if (planType.equalsIgnoreCase("Standard")) {
            basePrice = 499;
            dataLimit = 25;
            extraCharge = 15;
        } else if (planType.equalsIgnoreCase("Premium")) {
            basePrice = 799;
            dataLimit = 50;
            extraCharge = 10;
        } else {
            return -1;
        }

        if (dataUsage > dataLimit) {
            double extraData = dataUsage - dataLimit;
            return basePrice + (extraData * extraCharge);
        }

        return basePrice;
    }
}
