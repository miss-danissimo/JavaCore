package HomeWork_5;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Data {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        String[]header={
                "Value 1","Value 2","Value 3"};
        int [][]value = {
                {
                        100,200,123
                },
                {
                        300,400,500
                }
        };
        AppData data = new AppData(header,value);
        data.save("data.csv");
    }
}
