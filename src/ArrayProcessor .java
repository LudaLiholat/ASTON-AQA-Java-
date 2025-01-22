
class ArrayProcessor {

    public static

        int processArray (String[][]array) throws MyArraySizeException, MyArrayDataException {

            if (array.length != 4 ) {
                throw new MyArraySizeException("Неверный размер массива. Ожидался размер 4x4.");
            }

            int sum = 0;


            for (int i = 0; i < array.length; i++) {
                if ( array[i].length != 4) {
                    throw new MyArraySizeException("Неверный размер массива. Ожидался размер 4x4.");
                }
                for (int j = 0; j < array[i].length; j++) {
                    try {
                      boolean b = !(array[i].length == 4);
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {

                        throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    }
                }
            }

            return sum;
        }



}




