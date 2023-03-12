import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Заполнить список 10 случайными числами
// Отсортировать список методом sort() и вывести его на экран

public class Task01 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arr.add(random.nextInt(10));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}