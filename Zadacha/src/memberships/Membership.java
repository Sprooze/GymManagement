package memberships;

public interface  Membership {
    double getPrice();

    default void printBenefits() {
        System.out.println("Benefits: Access to fitness equipment.");
    }

    static void printGymRules() {
        System.out.println("===== GYM RULES =====");
        System.out.println("1. Every customer must have a membership.");
        System.out.println("2. Customers must follow the gym rules.");
        System.out.println("3. Maximum capacity: 10 customers.");
        System.out.println("4. Premium members have access to the sauna.");
        System.out.println("=====================");
    }
}
