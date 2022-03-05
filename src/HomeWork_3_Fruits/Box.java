package HomeWork_3_Fruits;

import java.util.ArrayList;

public class Box < Fruit extends HomeWork_3_Fruits.Fruit> {

    private ArrayList <Fruit> box = new ArrayList<>();

    private Class elementos;
    private Box anotherBox;

    public Box(){

    }
    public void add(Fruit fruit) {
        if (elementos == null) {
            elementos = fruit.getClass();
            System.out.println("This box is " + elementos.getName());
        }
        else if(elementos != fruit.getClass()){
            System.out.println("Can't add ");
            return;
        }

        box.add(fruit);

    }
    public float getWeight() {
        float a = 0;
        for (Fruit f:box) {
            a += f.weight;
        }
        return a;
    }
    public boolean compare(Box anotherBox) {
        this.anotherBox = anotherBox;
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;

    }

}
