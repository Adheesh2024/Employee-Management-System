package bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        ChatBot bot = new ChatBot();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        acc.name = sc.nextLine();

        acc.balance = 0;

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Chat with AI Bot");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 3:
                    acc.display();
                    break;

                case 4:
                    System.out.print("Ask something: ");
                    String msg = sc.nextLine();
                    bot.reply(msg);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}