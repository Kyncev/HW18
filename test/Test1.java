package test;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import static rest.ApiRequest.*;

public class Test1 {
    @Test
    public void test1(){
        System.out.println(getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
    }
    @Test
    public void test2(){
        JSONArray bank = new JSONArray(getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
        JSONObject jsonObject =(JSONObject) bank.get(0);
        System.out.println(jsonObject.toString());
        System.out.println(("RATE = "+jsonObject.getDouble("rate")));
    }
    @Test
    public void test3(){
        JSONArray bank=new JSONArray(getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
        System.out.println(bank.get(0));
    }
    //берем из отдельно взятого по USD
    @Test
    public void test4(){
        JSONArray bank = new JSONArray(getRest( "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&json"));
        JSONObject jsonObject =(JSONObject) bank.get(0);
        System.out.println(jsonObject.toString());
        System.out.println(("RATE = "+jsonObject.getDouble("rate")));
    }
    //если берем из общего JSON
    @Test
    public void test5(){
        JSONArray bank = new JSONArray(getRest( "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
        JSONObject jsonObject =(JSONObject) bank.get(24);
        System.out.println(jsonObject.toString());
        System.out.println(("RATE = "+jsonObject.getDouble("rate")));
    }
}

