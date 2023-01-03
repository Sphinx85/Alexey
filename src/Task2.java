import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Какие есть другие способы решения этого задания? Как можно упростить метод add?

public class Task2 {
    public Map<String, List<String>> phoneBook = new HashMap<>();
    public List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (phoneBook.containsKey(surname)) {
            phoneNumberList = phoneBook.get(surname);
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            phoneBook.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) { // Разъясни мне, пожалуйста, эту строчку? Почему мы перед методом ещё массив добавляем?
        return phoneBook.get(surname);
    }
}


//2) Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
// (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки телефонного справочника