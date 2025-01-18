
// Исключение для неверного размера массива
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

// Исключение для неверных данных в массиве
class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}

public class ArrayProcessor {

    public static

        int processArray (String[][]array) throws MyArraySizeException, MyArrayDataException {
            // Проверка размера массива
            if (array.length != 4 || array[0].length != 4) {
                throw new MyArraySizeException("Неверный размер массива. Ожидался размер 4x4.");
            }

            int sum = 0;

            // Проход по всем элементам массива
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        // Преобразование строки в целое число
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        // Если преобразование не удалось, выбрасываем исключение с указанием позиции
                        throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    }
                }
            }

            return sum;
        }

    }




