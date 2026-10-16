package services;

import models.Customer;

public class GymService {
    private static final int MAX_CAPACITY = 10;

    private Customer[] customers;
    private int customerCount;

    public GymService() {
        customers = new Customer[MAX_CAPACITY];
        customerCount = 0;
    }

    public boolean addCustomer(Customer customer) {
        if (customer == null) {
            System.out.println("Cannot add a null customer.");
            return false;
        }

        if (customerCount >= MAX_CAPACITY) {
            System.out.println("Gym capacity is full!");
            return false;
        }

        customers[customerCount] = customer;
        customerCount++;

        System.out.println("Customer added successfully.");

        return true;
    }

    public void printAllCustomers() {
        if (customerCount == 0) {
            System.out.println("There are no registered customers.");
            return;
        }

        System.out.println("\n===== ALL CUSTOMERS =====");

        for (int i = 0; i < customerCount; i++) {
            customers[i].printInfo();
        }
    }

    public int getCustomerCount() {
        return customerCount;
    }
}
