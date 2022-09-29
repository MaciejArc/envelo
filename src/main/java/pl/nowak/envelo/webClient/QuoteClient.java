package pl.nowak.envelo.webClient;

import org.springframework.web.client.RestTemplate;
import pl.nowak.envelo.dto.QuoteDto;

public class QuoteClient {
    private final String url = "https://api.kanye.rest";

    public QuoteDto getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(url, QuoteDto.class);
        } catch (Exception e) {
            QuoteDto quoteDto = new QuoteDto();
            quoteDto.setQuote("Coś poszło nie tak,tego nikt sie nie spodziewał");
            return quoteDto;
        }
    }
}
