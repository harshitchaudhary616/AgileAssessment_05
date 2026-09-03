package com.billing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Internet Data Usage Billing System =====");

        System.out.print("Enter number of customers: ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= count; i++) {

            System.out.println("\n----- Customer " + i + " -----");

            System.out.print("Enter customer name: ");
            String name = scanner.nextLine();

            System.out.print("Enter plan type (Basic/Standard/Premium): ");
            String plan = scanner.nextLine();

            System.out.print("Enter data usage in GB: ");
            double usage = Double.parseDouble(scanner.nextLine());

            DataUsageBill bill = new DataUsageBill(name, plan, usage);

            double amount = bill.calculateBill();

            System.out.println("\n----- Billing Result -----");
            System.out.println("Customer Name: " + bill.getCustomerName());
            System.out.println("Plan: " + bill.getPlanType());
            System.out.println("Data Usage: " + bill.getDataUsage() + " GB");

            if (amount == -1) {
                System.out.println("Invalid plan type.");
            } else {
                System.out.println("Monthly Bill: ₹" + amount);
            }
        }

        scanner.close();
    }
}
