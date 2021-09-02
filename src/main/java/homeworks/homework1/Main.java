package homeworks.homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4", "5", "6"};  //Проверка задания 1
        swapElements(arr, 2, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(createArrayList(arr)); //Проверка задания 2


        Box<Orange> orangeBox = new Box<>();    //Создаём коробки для апельсина и яблока
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        Apple apple = new Apple();      //Создаём яблоко и апельсин
        Apple apple1 = new Apple();
        Orange orange = new Orange();

        orangeBox.addFruit(orange);     //Добавляем фрукты в соответсвующие коробки
        appleBox.addFruit(apple);
        appleBox1.addFruit(apple);

        //Делаем проверку веса коробок
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight() + " \nВес коробки с яблоками: " + appleBox.getWeight());

        //Сравниваем коробки
        orangeBox.compare(appleBox);

        //Перекладываем фрукты из коробки appleBox1 в коробку appleBox
        appleBox.pourFrom(appleBox1);
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());

    }

    public static <T>void swapElements(T[] array, int first, int second) { //Меняет два элемента массива местами
        T temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static <T>List createArrayList(T[] array) { // преобразует массив в ArrayList
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
