package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import objects.bankGo.Exchange;
import org.junit.BeforeClass;
import org.junit.Test;
import rest.ApiRequest;

public class Test3 {
    static Exchange[] exchange;
    ObjectMapper om;
    @BeforeClass
    public static void bb() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        exchange=om.readValue(ApiRequest.getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"),Exchange[].class);
    }
    @Test
    public void test1(){
        System.out.println(exchange[0].cc);
    }
    @Test
    public void test2(){
        for (Exchange l: exchange){
            System.out.println(l.cc);
            System.out.println(l.exchangedate + " = " + l.vitaly);
        }
    }
}

