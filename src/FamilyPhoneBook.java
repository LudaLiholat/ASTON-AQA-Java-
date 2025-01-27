import java.util.*;

public class FamilyPhoneBook {
    private Map<String, Set<String>> phoneBook;

    public FamilyPhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        for (Set<String> numbers : phoneBook.values()) {
            if (numbers.contains(phoneNumber)) {
                System.out.println("Этот номер уже записан у другого человека.");
                return;
            }
        }

        if (!phoneBook.containsKey(surname)) {
            phoneBook.put(surname, new HashSet<>());
        }
        phoneBook.get(surname).add(phoneNumber);
    }

    public Set<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new HashSet<>());
    }
}