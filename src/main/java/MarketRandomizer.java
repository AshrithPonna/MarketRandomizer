import am.ik.yfinance4j.YFinance;   
import am.ik.yfinance4j.Ticker; 
import org.springframework.http.client.JdkClientHttpRequestFactory; // Client importations referenced below.
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

        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Market Randomizer!");
        System.out.println("");
        System.out.println("Please note that this system loops until you prompt 'no' during the next iteration.");
        System.out.println("");
        System.out.println("To begin, would you like to see the randomized selection of assets constructed (yes/no)?");
        while (true){
            String input = reader.nextLine();
            if (input.equals("no")){
                break;
            }else if (input.equals("yes")){
                int randomNumberOne = (int)(Math.random() * initialTickers.size());
                int randomNumberTwo = (int)(Math.random() * initialTickers.size());
                int randomNumberThree = (int)(Math.random() * initialTickers.size());
                


            }else{
                System.out.println("Sorry, that command wasn't recognized, please either input 'yes'/'no'.");
            }

        }
        System.out.println("Thanks for using this application, have a great day!");
        reader.close();


    }

}