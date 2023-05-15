import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        String name = "Bruce Wayne";
        String accountType = "Savings";
        double balance = new Random().nextDouble(10000.0);

        System.out.println("**************************************");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Account type: %s%n", accountType);
        System.out.printf("Total account balance: $ %.2f%n", balance);
        System.out.println("**************************************");
    }
}
