// MobileApp.java
public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("MobileApp: Stock " + stockName + " has a new price: $" + stockPrice);
    }
}


