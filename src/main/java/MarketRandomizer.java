import am.ik.yahoofinance4j.Stock;
import am.ik.yahoofinance4j.YahooFinance;

public class MarketRandomizer {
    public static void main(String[] args){
        RestClient restClient = RestClient.builder()
            .requestFactory(new JdkClientHttpRequestFactory())
            .defaultHeader("User-Agent", "Mozilla/5.0")
            .build();
        YahooFinance firstIteration = new YahooFinance();
        Stock anthropic = firstIteration.get("ANT");
        System.out.println(anthropic.info());

    }

    
}