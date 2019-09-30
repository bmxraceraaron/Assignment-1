import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args){
        float balance = 1000;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CIS-2348 Banking System!");
        System.out.println("Enter your option in a number: 1. Display Balance 2. Deposit Amount 3. Withdraw Amount");

        int i = input.nextInt();

        if (i == 1) {
            System.out.printf("Your current balance is $%.2f", balance);
        }
        else if (i == 2) {
            System.out.printf("Enter the amount you wish to deposit: ");
            float depositAmount = input.nextFloat();
            balance = balance + depositAmount;
            System.out.printf("You deposited %.2f. Your new account balance is %.2f", depositAmount, balance);
        }
        else if (i == 3){

            System.out.printf("Enter the amount you wish to withdraw: ");
            float withdrawAmount = input.nextFloat();

            if (withdrawAmount > balance) {
                System.out.printf("Insufficient funds. You currently have $%.2f in your account. ", balance);
                System.out.println();
            }
            else {
                balance = balance - withdrawAmount;
                System.out.printf("You withdrew %.2f. Your new account balance is %.2f", withdrawAmount, balance);
            }
        }

    }
}
