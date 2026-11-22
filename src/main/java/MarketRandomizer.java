import am.ik.yfinance4j.YFinance;   
import am.ik.yfinance4j.Ticker; 
import org.springframework.http.client.JdkClientHttpRequestFactory; // Client importations referenced below.
import org.springframework.web.client.RestClient;

public class MarketRandomizer {
    public static void main(String[] args){
        RestClient restClient = RestClient.builder() // Client to request API information from yFinance (JSON parsed).
            .requestFactory(new JdkClientHttpRequestFactory())
            .defaultHeader("User-Agent", "Mozilla/5.0")
            .build();
        YFinance firstIteration = new YFinance(restClient);
        Ticker anthropic = firstIteration.ticker("ANT");
        System.out.println(anthropic.info()); //printed 
    }

    
}