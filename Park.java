public class Park {
        private String name; // Название парка
        private Attraction[] attractions; // Массив аттракционов
        private int attractionCount; // Счетчик аттракционов

        // Конструктор класса Park
        public Park(String name, int maxAttractions) {
            this.name = name;
            this.attractions = new Attraction[maxAttractions];
            this.attractionCount = 0;
        }

        // Метод для добавления аттракциона
        public void addAttraction(String name, String workingHours, double price) {
            if (attractionCount < attractions.length) {
                attractions[attractionCount] = new Attraction(name, workingHours, price);
                attractionCount++;
            } else {
                System.out.println("Достигнуто максимальное количество аттракционов.");
            }
        }

        // Метод для вывода информации об аттракционах
        public void displayAttractions() {
            System.out.println("Аттракционы в парке " + name + ":");
            for (int i = 0; i < attractionCount; i++) {
                attractions[i].displayInfo();
            }
        }

        // Внутренний класс Attraction
        private class Attraction {
            private String name; // Название аттракциона
            private String workingHours; // Время работы аттракциона
            private double price; // Стоимость аттракциона

            // Конструктор внутреннего класса Attraction
            public Attraction(String name, String workingHours, double price) {
                this.name = name;
                this.workingHours = workingHours;
                this.price = price;
            }

            // Метод для вывода информации об аттракционе
            public void displayInfo() {
                System.out.println("Название: " + name);
                System.out.println("Время работы: " + workingHours);
                System.out.println("Стоимость: " + price + " руб.");
                System.out.println(); // Пустая строка для разделения
            }
        }

        // Метод main для тестирования класса
        public static void main(String[] args) {
            Park park = new Park("Семейный Парк", 5); // Создаем парк с максимальным количеством аттракционов 5

            // Добавляем аттракционы
            park.addAttraction("Американские горки", "10:00 - 22:00", 30);
            park.addAttraction("Колесо обозрения", "09:00 - 21:00", 20);
            park.addAttraction("Лабиринт", "11:00 - 20:00", 15);
            park.addAttraction("Поездка на поезде", "09:30 - 19:30", 25);
            park.addAttraction("Прыжок с парашютом", "12:00 - 18:00", 50);

            // Вывод информации об аттракционах
            park.displayAttractions();
        }
}
