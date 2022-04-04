package HomeWork_5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AppData {
    private String[] header;
    private int[][] data;

    AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }
    public void save(String fileName) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        for (String h:header
        ) {writer.print(h+";");

        }writer.println("");
        for (int[] h:data) {
            for (int x : h) {
                writer.print(x+";");
            }writer.println();
        }writer.close();
    }
}
