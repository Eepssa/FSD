package StockManagement;

public interface StockOp {

    public void addStock(Stock stock);

  
    public Stock viewStock(String stockCode);

   
    public void viewAllStocks();

   
    public void deleteStock(String stockCode);

    
    public void editStockPrice(String stockCode, double newPrice);

}
