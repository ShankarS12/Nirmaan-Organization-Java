import java.util.Scanner;

public class AxisBank {
    public static void main(String[] args) {
        Bank B = new Bank(1234, "Shankar", 20000, 1281);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PIN number");
        int pin = sc.nextInt();
        int choice;
        boolean isTrue = true;

        while(isTrue) {

            if (pin == B.getAccPIN()) {
                System.out.println("1. Set acc details");
                System.out.println("2. Deposit amount");
                System.out.println("3. Withdraw amount");
                System.out.println("4. Display account details");
                System.out.println(" 0 for exit");

                System.out.println("Enter the option");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Enter the acc number");
                    int number = sc.nextInt();
                    B.setAccNumber(number);

                    System.out.println("Enter the acc name");
                    String name = sc.nextLine();
                    B.setAccName(name);
                    sc.nextLine();

                    System.out.println("Enter the acc balance");
                    double balance = sc.nextDouble();
                    B.setAccBalance(balance);

                    System.out.println("Enter the Pin");
                    int PIN = sc.nextInt();
                    B.setAccPIN(PIN);
                }

                if (choice == 2) {
                    System.out.println("Enter the amount to deposit");
                    double deposit = sc.nextDouble();
                    B.setAccBalance(B.getAccBalance() + deposit);
                    System.out.println("Amount deposited");
                }

                if (choice == 3) {
                    System.out.println("Enter the pin");
                    int Pin = sc.nextInt();

                    if (Pin == B.getAccPIN()) {
                        System.out.println("Enter the amount to withdraw");
                        double withDraw = sc.nextDouble();
                        B.setAccBalance(B.getAccBalance() - withDraw);
                        System.out.println("Amount deducted");
                    }
                    else {
                        System.out.println("Enter the correct pin");
                    }
                }

                if (choice == 4) {
                    System.out.println("Display account details");
                    System.out.println(B);
                }

                if (choice == 0) {
                    isTrue = false;
                    System.out.println("program stopped");


                }
            } else {
                System.out.println("Enter the correct pin");
            }
        }
    }
}
