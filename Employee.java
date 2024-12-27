    public class Employee {
        private String fullName; // ФИО
        private String position;  // Должность
        private String email;     // Email
        private String phone;     // Телефон
        private double salary;    // Зарплата
        private int age;         // Возраст

        // Конструктор класса
        public Employee(String fullName, String position, String email, String phone, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        // Метод для вывода информации об объекте
        public void displayInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phone);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
        }

        // Метод main для тестирования класса
        public static void main(String[] args) {
            Employee employee = new Employee("Иванов Иван Иванович", "Менеджер",
                    "ivanov@example.com", "+3754437850", 3000, 30);
            employee.displayInfo(); // Вывод информации о сотруднике
        }

        // Массив из 5 сотрудников
        public static void persArraymain(String[] args) {
            Employee[] persArray = new Employee[5];
            persArray[0] = new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@mailbox.com", "+3754437850", 30000, 30);
            persArray[1] = new Employee("Петров Петр Петрович", "Инженер", "petrov@mailbox.com", "+3752956900", 40000, 35);
            persArray[2] = new Employee("Сидоров Сидор Сидорович", "Директор", "sidorov@mailbox.com", "+3754457855", 60000, 40);
            persArray[3] = new Employee("Кузнецов Николай Николаевич", "Аналитик", "kuznetsov@mailbox.com", "+3754430059", 45000, 28);
            persArray[4] = new Employee("Смирнова Анна Андреевна", "Разработчик", "smirnova@mailbox.com", "+3752937777", 50000, 25);

            // Вывод информации о каждом сотруднике

            for (Employee employee : persArray) {
                employee.displayInfo();
            }

        }
    }
