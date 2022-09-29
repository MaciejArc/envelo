package pl.nowak.envelo.dto;

public class QuoteDto {
    private String quote;

    public String getQuote() {
        return quote;
    }
    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "\"" +
                quote +
                "\"";
    }
}
