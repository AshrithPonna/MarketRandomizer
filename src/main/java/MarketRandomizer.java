import yahoofinance.YahooFinance;
import yahoofinance.Stock;
import java.io.IOException;

public class MarketRandomizer {
    public static void main(String[] args){
        try{
            Stock firstTrial = YahooFinance.get("AAPL");
            firstTrial.print();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    
}