package HomeWork_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {


    public static void main(String[] args) throws IOException {
        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=%09SVBMCQCvEnT1YUFGRdAE8emuKFKdnhrr&language=ru&details=false&metric=false");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        System.out.println(content);
    }
}