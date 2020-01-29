import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChuckNorrisQuotes {

    private List<String> quotes;

    public ChuckNorrisQuotes() {

        quotes = new ArrayList<>(123);
        quotes.add("Chuck Norris cannot love,he can only not kill");
        quotes.add("All browsers support the hex definitions #chuck amd #norris for the colors black and blue.");
        quotes.add("Chuck Norris can install a 64 bit OS on 32 bit machines");
        quotes.add("Chuck Norris played Russian Roulette with a fully loaded gun and won");
    }

    public String getRandomQuote() {
        return quotes.get(ThreadLocalRandom.current().nextInt(1, quotes.size()));
    }
}
