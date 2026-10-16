package models;
import memberships.Membership;

public class Customer {
    private String name;
    private int age;
    private Membership membership;

    public Customer(String name, int age, Membership membership) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Customer name cannot be empty."
            );
        }

        if (age <= 0) {
            throw new IllegalArgumentException(
                    "Age must be a positive integer."
            );
        }

        if (membership == null) {
            throw new IllegalArgumentException(
                    "Membership cannot be null."
            );
        }

        this.name = name;
        this.age = age;
        this.membership = membership;
    }

    public void printInfo() {
        System.out.println("------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Membership: "
                + membership.getClass().getSimpleName());
        System.out.printf("Price: %.2f €%n", membership.getPrice());

        membership.printBenefits();

        System.out.println("------------------------------");
    }
}
