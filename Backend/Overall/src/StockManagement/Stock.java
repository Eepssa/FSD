package StockManagement;

public class Stock {
	private String stockCode;
    private String stockName;
    private String sector;
    private double price;

   
    public Stock(String stockCode, String stockName, String sector, double price) {
        this.stockCode = stockCode;
        this.stockName = stockName;
        this.sector = sector;
        this.price = price;
    }

  
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    public void displayStock() {
        System.out.println("Stock code: " + stockCode);
        System.out.println("Stock name: " + stockName);
        System.out.println("Sector: " + sector);
        System.out.println("Price: " + price);
    }
}








