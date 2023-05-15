import java.util.Random;
import java.util.Scanner;

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

        String menu = """
                Type your option:
                                
                1 - See the balance
                2 - Deposit
                3 - Withdraw
                4 - Exit
                """;
        Scanner keyboardReader = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println(menu);
            option = keyboardReader.nextInt();
            switch (option) {
                case 4:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
