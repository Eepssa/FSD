package StockManagement;


import java.util.ArrayList;
import java.util.Scanner;

public class StockManage implements StockOp {
  
    private ArrayList<Stock> stockList;
    private Scanner scanner;
  
    public StockManage() {
        stockList = new ArrayList<Stock>();
        scanner = new Scanner(System.in);
    }

    
    public void addStock(Stock stock) {
        stockList.add(stock);
         System.out.println("Stock added successfully.\n");
        }
    

    public Stock viewStock(String stockCode) {
       
        for (Stock stock : stockList) {
           if (stock.getStockCode().equals(stockCode)) {
                return stock;
            }}
       return null;
    }

   
    public void viewAllStocks() {
            for (Stock stock : stockList) {
                stock.displayStock();
                System.out.println();
            }
    }

    
    public void deleteStock(String stockCode) {
     Stock stock = viewStock(stockCode);
      stockList.remove(stock);
          System.out.println("Stock deleted successfully.");
        }
    

    
    public void editStockPrice(String stockCode, double newPrice) {
        Stock stock = viewStock(stockCode);
       stock.setPrice(newPrice);
          System.out.println("Stock price updated successfully.");
        
    }

  
    public void displayMenu() {
       
        System.out.println("Menu:\n");
        System.out.println("1. Add");
        System.out.println("2. View a stock");
        System.out.println("3. View all");
        System.out.println("4. Delete");
        System.out.println("5. Edit price");
        System.out.println("6. Exit\n");
    }

   
    public void executeMenu() {
 
        int choice;
        
        do {
           
            displayMenu();
           
            choice = scanner.nextInt();
          
            switch (choice) {
             
                case 1:
                    
                    System.out.print("Enter the stock code:");
                    String stockCode = scanner.next();
                    System.out.print("Enter the stock name:");
                    String stockName = scanner.next();
                    System.out.print("Enter the sector:");
                    String sector = scanner.next();
                    System.out.print("Enter the price:");
                    double price = scanner.nextDouble();
                   
                    Stock stock = new Stock(stockCode, stockName, sector, price);
                 
                    addStock(stock);
                    break;
               
                case 2:
                   
                    System.out.println("\nEnter the stock code:");
                    stockCode = scanner.next();
                 
                    stock = viewStock(stockCode);
                   
                    if (stock == null) {
                      
                        System.out.print("Stock code not found.");
                    } else {
                       
                        stock.displayStock();
                    }
                    break;
              
                case 3:
                 
                    viewAllStocks();
                    break;
                
                case 4:
                 
                    System.out.print("Enter the stock code:");
                    stockCode = scanner.next();
                  
                    deleteStock(stockCode);
                    break;
               
                case 5:
                   
                    System.out.print("Enter the stock code:");
                    stockCode = scanner.next();
                    System.out.print("Enter the new price:");
                    price = scanner.nextDouble();
                   
                    editStockPrice(stockCode, price);
                    break;
               
                case 6:
                  
                    System.exit(0);
                    break;
              
                default:
                 
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 6); 
    }

   
    public static void main(String[] args) {
       
        StockManage sm = new StockManage();
       
        sm.executeMenu();
    }
}





















