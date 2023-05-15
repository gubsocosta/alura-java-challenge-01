import java.util.Random;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String name = "Bruce Wayne";
        String accountType = "Savings";
        double balanceAmount = new Random().nextDouble(10000.0);

        System.out.println("**************************************");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Account type: %s%n", accountType);
        System.out.printf("Total balance amount: $ %.2f%n", balanceAmount);
        System.out.println("**************************************");

        String menu = """
                Menu:
                                
                1 - See the balance
                2 - Deposit
                3 - Withdraw
                4 - Exit
                                
                Choice the a option:\s
                """;
        Scanner keyboardReader = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.printf("%n%s", menu);
            option = keyboardReader.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Balance: $ %.2f%n", balanceAmount);
                    break;
                case 2:
                    double depositedAmount;
                    System.out.print("Enter the amount to be deposited: $ ");
                    depositedAmount = keyboardReader.nextDouble();
                    balanceAmount += depositedAmount;
                    System.out.printf("%nNew balance: $ %.2f%n", balanceAmount);
                    break;
                case 3:
                    double withdrawnAmount;
                    System.out.print("Enter the amount to be withdrawn: $ ");
                    withdrawnAmount = keyboardReader.nextDouble();
                    if(withdrawnAmount > balanceAmount) {
                        System.out.println("The amount to be withdrawn must not to be greater than the balance amount");
                    } else {
                        balanceAmount -= withdrawnAmount;
                        System.out.printf("%nNew balance: $ %.2f%n", balanceAmount);
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
