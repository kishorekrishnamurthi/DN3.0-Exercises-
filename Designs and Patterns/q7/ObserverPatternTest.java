// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a stock market instance
        StockMarket stockMarket = new StockMarket("TechCorp", 150.00);

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change the stock price and notify observers
        stockMarket.setStockPrice(155.00);

        // Output:
        // MobileApp: Stock TechCorp has a new price: $155.00
        // WebApp: Stock TechCorp has a new price: $155.00
    }
}
