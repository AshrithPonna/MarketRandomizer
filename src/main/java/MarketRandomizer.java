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

        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Market Randomizer!");
        System.out.println("");
        System.out.println("Please note that this system loops until you prompt 'N' during the next iteration.");
        System.out.println("");
        System.out.println("To begin, would you like to see the randomized selection of assets constructed (Y/N)?");
        String input = reader.nextLine();
        while (input.equals("Y")){

        }
        System.out.println("Thanks for using this application, have a great day!");
        reader.close();

        YFinance firstIteration = new YFinance(restClient);
        Ticker anthropic = firstIteration.ticker("ANT");
        YFinance secondIteration = new YFinance(restClient);
        Ticker apple = secondIteration.ticker("AAPL");
        YFinance thirdIteration = new YFinance(restClient);
        Ticker tesla = thirdIteration.ticker("TSLA");

        //System.out.println(anthropic.info() + "\n"); //printed 
        //System.out.println();
        //System.out.println(apple.info() + "\n"); //printed 
        //System.out.println(tesla.info()); //printed 
    }

}