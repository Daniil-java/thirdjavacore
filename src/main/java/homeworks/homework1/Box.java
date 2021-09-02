package homeworks.homework1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private double weight = 0.0f;

    private List<T> arrayList = new ArrayList<>();

    public Box() {
    }

    public void addFruit(T fruit ) {
        arrayList.add(fruit);
        this.weight = this.weight + fruit.getWeight();
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean compare(Box<?> secondBox) {
        if (this.weight == secondBox.getWeight()) {
            System.out.println("Вес коробок - одинаковый");
            return true;
        } else {
            System.out.println("Вес коробок - разный");
            return false;
        }
    }

    public void dropBox() { //Обнуляет вес коробки, из которой мы будем пересыпать
        this.weight = 0.0f;
    }

    public void pourFrom(Box<T> secondBox) {
        this.weight = this.weight + secondBox.getWeight();
        secondBox.dropBox();
    }
}
