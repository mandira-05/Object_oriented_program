import java.util.Scanner;

class Account implements Atm {

    static long availableBalance = 2000;
    private static int pin = 1010;
    Scanner scanner=new Scanner(System.in);

    @Override
    public long debit() {
        System.out.println("Enter amount");
        long debitAmount = scanner.nextLong();

        System.out.println("Enter pin");
        int pin=scanner.nextInt();

        if (pin==Account.pin) {
            if (availableBalance>=debitAmount) {
                availableBalance=availableBalance-debitAmount;
                System.out.println("Available balance is now :"+ availableBalance);
                return debitAmount;
            } else {
                System.out.println("Debit amount exceeded account balance.");
                System.out.println("Available balance is"+ availableBalance);
                return availableBalance;
            }
        } else {
            throw new RuntimeException("Invalid Pin");
        }

    }
}
