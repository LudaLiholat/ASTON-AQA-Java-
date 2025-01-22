
    public class Main {
        public static void main(String[] args) {

            String[][] validArray = {
                    {"1", "2", "3", "4"},
                    {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            String[][] invalidSizeArray = {
                    {"1", "2", "3"},
                    {"4", "5", "6"},
                    {"7", "8", "9"}
            };

            String[][] invalidDataArray = {
                    {"1", "2", "3", "4"},
                    {"5", "six", "7", "8"},
                    {"9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };

            try {
                int result = ArrayProcessor.processArray(validArray);
                System.out.println("Сумма элементов массива: " + result);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }

            try {
                ArrayProcessor.processArray(invalidSizeArray);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }

            try {
                ArrayProcessor.processArray(invalidDataArray);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }
