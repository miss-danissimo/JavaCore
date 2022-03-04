package HomeWork_2;

public class Main {

    public static void main(String[] args) throws MyArraySizeException {
        String[][] values = {{"1", "2", "3", "4"}, {"4", "3", "2", "1"}, {"5", "@", "7", "8"}, {"8", "7", "6", "5"}};
        try {
            try {
                int result = method(values);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Array size exceeded");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Incorrect value");
            System.out.println("Cell error: " + e.i + "x" + e.j);
        }
    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int sum = Integer.parseInt(arr[i][j]);
                    count += sum;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}