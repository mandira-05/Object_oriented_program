import java.util.Scanner;

public class StockManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stock[] stockArray = new Stock[3];
        int arrayIndex = 0;
        //Stock stockObject = new Stock();
        Stock stockObject;
        new Stock();

        StockOperations operations = new StockOperations();

        do {
            System.out.println("1. Add Stock \n2. Total Value of stock\n3. Overall Total Value of all stock");
            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    stockObject=operations.addStock();
                    stockArray[arrayIndex]=stockObject;
                    arrayIndex++;
                    break;
                case 2:
                    operations.calculateStockValue(stockArray);
                    break;
                case 3:
                    operations.calculateTotalValue(stockArray);
                    break;
            }
            System.out.println("if you want to perform more operation enter true or to exit enter false");


        } while (scanner.nextBoolean()); //used, if user wants to perfrom operation, give false if want to exit

        scanner.close();

    }
}
