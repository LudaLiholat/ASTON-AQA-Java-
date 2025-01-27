public class main {
    public static void main(String[] args) {
        FamilyPhoneBook phoneBook = new FamilyPhoneBook();
        phoneBook.add("Ivanov", "123-456-789");
        phoneBook.add("Petrov", "234-567-890");
        phoneBook.add("Ivanov", "345-678-901");

        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Ivanov"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Petrov"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Sidorov"));
    }
}
