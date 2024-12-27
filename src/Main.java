public class Main {
    public static void main(String[] args) {
        // задание 1
        printThreeWords();
        // задание 2
        checkSumSign();
        // задание 3
        printColor();
        // задание 4
        compareNumbers();
       // задание 5
        checkSumSign2();
        // задание 6
        checkNumberMain();
        // задание 7
        checkSumSignMain();
        // задание 8
        printStringMultipleTimes("Hello, world!", 5);
        // задание 9
        isLeapYearMain();
        // задание 10
        printArrayMain();
        // задание 11
         printArrayMain2();
        // задание 12
        printArrayMain3();
        // задание 13
        printArray4Main();

    }

    // задание 1
    public static void printThreeWords() {
        System.out.println("задание 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // задание 2
    public static void checkSumSign() {
        System.out.println("задание 2:");
        int a = 3;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");}
        else {
            System.out.println("Сумма отрицательная");}
    }

    // задание 3
    public static void printColor() {
        System.out.println("задание 3:");
        int value = 50; // Задайте любое значение для переменной value

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // задание 4
    public static void compareNumbers() {
        System.out.println("задание 4:");

        int a = 7;
        int b = 4;
        if (a >= b) {
            System.out.println("а >= b");}
        else {
            System.out.println("а < b");}


    }
    // задание 5
    public static void checkSumSign2() {
        System.out.println("задание 5:");

        int a = 3;
        int b = 6;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");}
        else {
            System.out.println("false");}


    }
    // задание 6
    public static void checkNumberMain()
    {
        System.out.println("задание 6:");
        checkNumber(9);   // Пример вызова метода с положительным числом
        checkNumber(-1);  // Пример вызова метода с отрицательным числом
        checkNumber(0);   // Пример вызова метода с нулем
    }
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    // задание 7
    public static void checkSumSignMain() {
        System.out.println("задание 7:");
        checkSumSign(9);   // Пример вызова метода с положительным числом
        checkSumSign(-1);  // Пример вызова метода с отрицательным числом
        checkSumSign(0);   // Пример вызова метода с нулем
    }
    public static void checkSumSign(int number) {

        if (number <= 0 ) {
            System.out.println("true");}
        else {
            System.out.println("false");}

    }
    // задание 8
    public static void printStringMultipleTimes(String str, int times) {
        System.out.println("задание 8:");
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }
    // задание 9
    public static void isLeapYearMain()
    {
        System.out.println("задание 9:");
        System.out.println(isLeapYear(2020)); // true (високосный)
        System.out.println(isLeapYear(1900)); // false (не високосный)
        System.out.println(isLeapYear(2000)); // true (високосный)
        System.out.println(isLeapYear(2021)); // false (не високосный)
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Если год делится на 400, то он високосный
            }
            return true; // Если год делится на 4, но не на 100, то он високосный
        }
        return false; // Если год не делится на 4, то он не високосный
    }

    // задание 10
    public static void printArrayMain() {
        System.out.println("задание 10:");

        // Исходный массив
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        printArray(binaryArray);

        // Замена 0 на 1 и 1 на 0
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 0) {
                binaryArray[i] = 1; // Заменяем 0 на 1
            } else {
                binaryArray[i] = 0; // Заменяем 1 на 0
            }
        }

        // Вывод измененного массива
        System.out.println("Измененный массив:");
        printArray(binaryArray);
    }

    // Метод для вывода массива
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Перевод строки
    }
    // задание 11
    public static void printArrayMain2() {
        System.out.println("задание 11:");

        // Создаем пустой массив длиной 100
        int[] array = new int[100];
        // Заполняем массив значениями от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Заполняем элемент массива значением i + 1
        }
        // Выводим заполненный массив
        System.out.println("Заполненный массив:");
        printArray2(array);
    }
    // Метод для вывода массива
    private static void printArray2(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Перевод строки
    }
    // задание 12
    public static void printArrayMain3() {
        System.out.println("задание 12:");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проходим по массиву и умножаем числа меньшие 6 на 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2; // Умножаем на 2
            }
        }

        // Выводим измененный массив
        System.out.println("Измененный массив:");
        printArray3(array);
    }

    // Метод для вывода массива
    private static void printArray3(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // Перевод строки
    }
    // задание 13
    public static void printArray4Main() {
        System.out.println("задание 13:");
        int n = 5; // Размерность массива (количество строк и столбцов)
        int[][] array = new int[n][n]; // Создаем квадратный массив

        // Заполняем диагональные элементы единицами
        for (int i = 0; i < n; i++) {
            array[i][i] = 1; // Заполняем элемент на диагонали
        }

        // Выводим массив
        System.out.println("Массив с диагональными элементами:");
        printArray4(array);
    }

    // Метод для вывода двумерного массива
    private static void printArray4(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Перевод строки после каждой строки массива
        }
    }

}
