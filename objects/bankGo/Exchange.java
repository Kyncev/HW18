package objects.bankGo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exchange {
    @JsonProperty("r030")
    public int vitaly;

    public String txt;
    public double rate;
    public String cc;
    public String exchangedate;
}
