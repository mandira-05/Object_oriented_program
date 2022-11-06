import java.util.Scanner;

public class StockOperations {
    public static Scanner scanner = new Scanner(System.in);

    public Stock addStock() {
        Stock stock = new Stock();

        System.out.println("Enter stock name: ");
        stock.setStockName(scanner.next());

        System.out.println("Enter the price of stock share: ");
        stock.setPrice(scanner.nextInt());

        System.out.println("Enter the number of shares: ");
        stock.setnumberOfShare(scanner.nextInt());
        //System.out.println(stock);
        return stock;

    }

    //method to calculate each stock value
    public void calculateStockValue(Stock[] stockArray) {

        for (int eachStock=0;eachStock<stockArray.length;eachStock++) {
            if (stockArray[eachStock]!=null) {
                Stock stock = stockArray[eachStock];
                int value = stock.getPrice()*stock.getnumberOfShare();
                System.out.println("The Value of " +stock.getStockName()+ " is: " +value);

            }
        }

    }

    //method to calculate all stock total value
    public void calculateTotalValue(Stock[] stockArray) {
        int total=0;
        for (int eachStock=0;eachStock<stockArray.length;eachStock++) {
            if (stockArray[eachStock]!=null) {
                Stock stock = stockArray[eachStock];
                total = total + (stock.getPrice() * stock.getnumberOfShare());

            }
        }
        System.out.println("Total value of all Stock is: " +total);

    }


}
