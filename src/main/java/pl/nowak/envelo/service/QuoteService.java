package pl.nowak.envelo.service;

import pl.nowak.envelo.dto.QuoteDto;
import pl.nowak.envelo.webClient.QuoteClient;
import java.util.*;

public class QuoteService {
    QuoteClient quoteClient = new QuoteClient();
    Set<QuoteDto> quoteSet = new HashSet<>();

    public QuoteDto nextQuote() {
        QuoteDto quote = quoteClient.getQuote();
        while (checkQuote(quote) && quoteSet.size() < 122) {
            nextQuote();
        }
        quoteSet.add(quote);
        return quote;
    }

    public boolean checkQuote(QuoteDto quote) {
        return quoteSet.stream().anyMatch(i -> i.equals(quote));
    }

}
