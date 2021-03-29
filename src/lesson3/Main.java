package lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = {"слово", "каждое", "здесь", "слова", "слово", "массив", "работа", "тд", "интерес", "работа"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
               map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        System.out.println("Уникальные слова: " + map.keySet());
        System.out.println("Количество уникальных слов: " + map.size());
    }
}
