import java.util.Random;

public class Challenge {
    public static void main(String[] args) {
        String name = "Bruce Wayne";
        String accountType = "Savings";
        double balance = new Random().nextDouble(10000.0);

        System.out.println("**************************************");
        System.out.println(String.format("Name: %s", name));
        System.out.println(String.format("Account type: %s", accountType));
        System.out.println(String.format("Total account balance: $ %.2f", balance));
        System.out.println("**************************************");
    }
}
