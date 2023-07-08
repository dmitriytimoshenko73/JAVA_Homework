// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию 
// числа телефонов.

package Homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static final PhoneBook b = null;

    private HashMap<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            List<String> phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    public void displayContacts() {
        // Создаем список записей телефонной книги
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(contacts.entrySet());

        // Сортируем список по убыванию числа телефонов
         Collections.sort(sortedList, (a, b) < b.getValue().size() - a.getValue().size());

        // Выводим отсортированный список
        for (Map.Entry<String, List<String>>entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private HashMap<String, List<String>> getValue() {
        return null;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "123456789");
        phoneBook.addContact("Петр", "987654321");
        phoneBook.addContact("Мария", "555555555");
        phoneBook.addContact("Иван", "999999999");
        phoneBook.addContact("Анна", "111111111");

        phoneBook.displayContacts();
    }
}
