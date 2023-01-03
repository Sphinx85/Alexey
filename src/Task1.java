import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> arr = Arrays.asList("один", "два", "три", "три", "три", "три", "четыре", "пять", "пять",
                "шесть", "семь", "восемь", "восемь", "восемь", "девять", "сто сорок четыре");
        System.out.println("Исходный список: " + arr);

        Set<String> arr1Unique = new HashSet<>(arr);
        System.out.println("\nБез повторов: " + arr1Unique);

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : arr) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1); // вот это я не понял, нужно пояснение?
        }
        System.out.println("\nСводка: " + wordsCount);
    }
}

//1) Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз
// встречается каждое слово.