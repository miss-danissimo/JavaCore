package HomeWork_3_Fruits;

public class Main {

    public static void main(String[] args) {

        Box b = new Box();
        Apple apple = new Apple();
        b.add(apple);

        Apple apple2= new Apple();

        Orange c = new Orange();
        b.add(apple2);

        System.out.println("This box weights = " + b.getWeight());
    }
}
