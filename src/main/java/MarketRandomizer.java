import am.ik.yfinance4j.YFinance;   
import am.ik.yfinance4j.Ticker; 
import org.springframework.http.client.JdkClientHttpRequestFactory; // Client importations referenced below.
import org.springframework.web.client.RestClient;
import java.util.ArrayList;
import java.util.Scanner;

//"to run,     mvn exec:java -Dexec.mainClass=MarketRandomizer"

public class MarketRandomizer {
    public static void main(String[] args){
        RestClient restClient = RestClient.builder() // Client to request API information from yFinance (JSON parsed).
            .requestFactory(new JdkClientHttpRequestFactory())
            .defaultHeader("User-Agent", "Mozilla/5.0")
            .build();

        ArrayList<String> initialTickers = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("hi, this is a test: ");

        YFinance firstIteration = new YFinance(restClient);
        Ticker anthropic = firstIteration.ticker("ANT");
        YFinance secondIteration = new YFinance(restClient);
        Ticker apple = secondIteration.ticker("AAPL");
        YFinance thirdIteration = new YFinance(restClient);
        Ticker tesla = thirdIteration.ticker("TSLA");

        System.out.println(anthropic.info() + "\n"); //printed 
        System.out.println();
        System.out.println(apple.info() + "\n"); //printed 
        System.out.println(tesla.info()); //printed 
    }

}