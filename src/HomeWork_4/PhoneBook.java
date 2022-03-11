package HomeWork_4;
import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private static int num = 0;
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();

    public static void main(String[] args) {

        PhoneBook pb = new PhoneBook();

        pb.add("Apple", "8(888)888-88-88");
        pb.add("Mango", "8(495)444-44-44");
        pb.add("Pomegranate", "8(800)000-00-00");
        pb.add("Fig", "8(800)474-74-74");
        pb.add("Lime", "8(495)279-29-29");
        pb.add("Tangerine", "8(926)316-16-61");
        pb.add("Tangerine", "8(900)555-09-90");
        pb.add("Persimmon", "8(901)333-75-57");

        for (String x : pb.get("Tangerine")) {
            num++;
            System.out.println("Tangerine " + num + " phone number: " + x);
        }
    }


    public void add(String surname, String phone) {


        ArrayList<String> strings = phoneMap.get(surname);



        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }

    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}