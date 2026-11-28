import org.springframework.http.client.JdkClientHttpRequestFactory; // Client importations referenced below.
import am.ik.yfinance4j.YFinance;   
import am.ik.yfinance4j.Ticker; 
import am.ik.yfinance4j.quote.StockInfo;
import org.springframework.web.client.RestClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//"to run,     mvn exec:java -Dexec.mainClass=MarketRandomizer"

public class MarketRandomizer {
    public static void main(String[] args){
        RestClient restClient = RestClient.builder() // Client to request API information from yFinance (JSON parsed).
            .requestFactory(new JdkClientHttpRequestFactory())
            .defaultHeader("User-Agent", "Mozilla/5.0")
            .build();

        ArrayList<String> initialTickers = new ArrayList<>(List.of("SARO", "AIR", "LOAR", "DRS", "AVAV", 
        "FI", "BR", "VIAV", "LECO", "VMI", "CGNX", "WSO", "DAR", "URI", "GLDD", "ALH", "WLDN"));

        int randomNumberOne = 0;
        int randomNumberTwo = 0;
        int randomNumberThree = 0;

        

        Scanner reader = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to Market Randomizer!");
        System.out.println("");
        System.out.println("Please note that this system loops until you prompt 'no' during the next iteration.");
        System.out.println("");
        while (true){
            System.out.println("To begin, would you like to see the randomized selection of assets constructed (yes/no)?");
            System.out.println("");
            String input = reader.nextLine();
            if (input.equals("no")){
                break;
            }else if (input.equals("yes")){
                while (randomNumberOne == randomNumberTwo || randomNumberTwo == randomNumberThree || randomNumberOne == randomNumberThree){
                    randomNumberOne = (int)(Math.random() * initialTickers.size());
                    randomNumberTwo = (int)(Math.random() * initialTickers.size());
                    randomNumberThree = (int)(Math.random() * initialTickers.size());
                }
                YFinance request = new YFinance(restClient);
                Ticker firstStock = request.ticker(initialTickers.get(randomNumberOne));
                Ticker secondStock = request.ticker(initialTickers.get(randomNumberTwo));
                Ticker thirdStock = request.ticker(initialTickers.get(randomNumberThree));

                System.out.println("");
                System.out.println("Processing.");
                System.out.println("Processing..");
                System.out.println("Processing...");
                System.out.println("");
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Company:", firstStock.info().longName().orElse("N/A"), secondStock.info().longName().orElse("N/A"), thirdStock.info().longName().orElse("N/A"));
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Ticker:",firstStock.symbol(), secondStock.symbol(), thirdStock.symbol());
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Sector:", firstStock.info().sector().orElse("N/A"), secondStock.info().sector().orElse("N/A"), thirdStock.info().sector().orElse("N/A"));
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Industry:", firstStock.info().industry().orElse("N/A"), secondStock.info().industry().orElse("N/A"), thirdStock.info().industry().orElse("N/A"));
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Exchange:", firstStock.info().exchange().orElse("N/A"), secondStock.info().exchange().orElse("N/A"), thirdStock.info().exchange().orElse("N/A"));
                System.out.printf("%-12s" + "%-" + firstStock.info().longName().orElse("N/A").length() + "s | %-" + secondStock.info().longName().orElse("N/A").length() + "s | %-" + thirdStock.info().longName().orElse("N/A").length() + "s%n", "Price:", firstStock.info().currentPrice().orElse(null), secondStock.info().currentPrice().orElse(null), thirdStock.info().currentPrice().orElse(null));
                
            }else{
                System.out.println("Sorry, that command wasn't recognized, please either input 'yes'/'no'.");
            }

        }
        System.out.println("");
        System.out.println("Thanks for using this application, have a great day!");
        System.out.println("");

        reader.close();


    }

}