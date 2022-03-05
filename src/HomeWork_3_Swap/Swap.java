package HomeWork_3_Swap;


import java.util.ArrayList;


public class Swap {

        public static void main (String[] args) {
            ArrayList arr = new ArrayList();

            for (int i = 0; i < 10; i++) {
                arr.add(i);
            }
            System.out.println("Array before swapping " + arr);
            swap(arr ,5, 8);

        }

    static void swap(ArrayList arr, int i1, int i2){
        Object j1 = arr.get(i1);
        Object j2 = arr.get(i2);
        arr.set(i1,j2);
        arr.set(i2,j1);
        System.out.println("Array after swapping " + arr);
     }
}

