package gym;

import memberships.BasicMembership;
import memberships.Membership;
import memberships.PremiumMembership;
import models.Customer;
import services.GymService;

public class Main {

    public static void main(String[] args) {

        // Print general gym rules
        Membership.printGymRules();

        // Create membershipsS
        Membership basic = new BasicMembership();
        Membership premium = new PremiumMembership();

        // Create customers
        Customer customer1 = new Customer(
                "Ivan", 25, basic
        );

        Customer customer2 = new Customer(
                "Maria", 30, premium
        );

        Customer customer3 = new Customer(
                "Georgi", 22, basic
        );

        Customer customer4 = new Customer(
              "Pesho", 18, premium
        );

        Customer customer5 = new Customer(
                "Vanya",42,basic
        );

        // Create gym service
        GymService gym = new GymService();

        // Add customers
        gym.addCustomer(customer1);
        gym.addCustomer(customer2);
        gym.addCustomer(customer3);
        gym.addCustomer(customer4);
        gym.addCustomer(customer5);

        // Print all customers
        gym.printAllCustomers();

        // Print customer count
        System.out.println(
                "\nTotal registered customers: "
                        + gym.getCustomerCount()
        );
    }
}

