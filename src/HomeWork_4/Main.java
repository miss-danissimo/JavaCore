package HomeWork_4;



public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "fig", "persimmon", "kiwi", "pomegranate", "lime", "grapefruit",
                "persimmon", "apricot", "mango", "persimmon", "fig", "pomegranate", "kiwi", "lime",
                "grapefruit", "lemon", "mango", "tangerine", "lime", "pomegranate", "persimmon"};

        for (int i = 0; i < fruits.length; i++) {
            String box = fruits[i];
            boolean frt = true;
            int a = 0;
            for (int f = 0; f < fruits.length; f++) {
                if (fruits[f] == box) {
                    a++;
                    if (f < i) {
                        frt = false;
                    }
                }
            }


            if (frt == true) {
                System.out.println(box + " " + a);
            }
        }

    }
}

