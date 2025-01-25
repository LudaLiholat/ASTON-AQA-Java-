import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new ArrayList<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "123-456-789");
        phoneBook.add("Petrov", "234-567-890");
        phoneBook.add("Ivanov", "345-678-901");

        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Ivanov"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Petrov"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Sidorov"));
    }
}