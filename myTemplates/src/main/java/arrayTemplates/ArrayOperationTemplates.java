package arrayTemplates;

public class ArrayOperationTemplates {

    /*
     * Сортировка по возрастанию true
     */
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                String res = "Массив нихера не в порядке возрастания";
                System.out.println(res);
                return false;
            }
        }
        String rsl = "Массив отсортирован в порядке возрастания";
        System.out.println(rsl);
        return true;
    }

    /*
     * Поиск одинаковых элементов
     * TODO результат в консоль выводится дважды. (UPD Исправлено оператором "break")
     */
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            int rslI = left[i];
            for (int k = 0; k < right.length; k++) {
                int rslK = right[k];
                if (rslI == rslK) {
                    int result = rslK;
                    System.out.println("Найдены одинаковые элементы со значением: " + result);
                    break;
                }
            }
        }
    }

    /*
     * Даны два отсортированных по возрастанию массива. Как без сортировки их объединить в третий массив?
     * Сортировка слиянием (без сортировки по условиям задачи =))
     */
    public static int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int positionA = 0;
        int positionB = 0;

        for(int i = 0; i < array.length; i++) {
            if(positionA == left.length){
                array[i] = right[positionB];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionB++;
            } else if(positionB == right.length){
                array[i] = left[positionA];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionA++;
            } else if(left[positionA] < right[positionB]){
                array[i] = left[positionA];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionA++;
            } else {
                array[i] = right[positionB];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionB++;
            }
        }
        return array;
    }

    /*
    * Определить общий размер массива при объединении двух массивов
     */
    public static int combineSize(int[] arrayLengthA, int[] arrayLengthB) {
        int[] array = new int[arrayLengthA.length + arrayLengthB.length];
        String arrayLength = String.valueOf(array.length);
        System.out.println("Длинна двух массивов " + arrayLength);
        return array.length;
    }

    /*
    * Метод проверяет длинну массива
     */
    public static int getCountRow(int[][] array) {
        int count = array.length;
        return count;
    }

    /*
    * метод проверяет длинну ряда
     */
    public static int getCountCellInRow(int[][] array, int row) {
        int rsl = array[row].length;
        return rsl;
    }

    /*
    * проверяем является ли входящий двумерный массив квадратным
    * т.е. количество элементов в каждом ряду, должно совпадать с количеством рядов
     */
    public static boolean checkArray(int[][] array) {
        boolean rsl = true;
        int standard = array[0].length;
        for (int i = 0; i < array.length ; i++) {
            if ( array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    /*
    * распечатать все элементы массива за исключением первого элемента и последнего
     */
    public static int[] loopForArray (int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println("Печать без первого и последнего элементов: " + array[i]);
        }
        return array;
    }

    /*
    * распечатаем элементы массива, при этом он должен пропустить
    * в каждом ряду первый и последний элемент
     */
    public static int[][] loopForBoard (int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 1; j < doubleArray[i].length - 1; j++) {
                System.out.println(System.lineSeparator() + doubleArray[i][j]);
            }
        }
        return doubleArray;
    }

    public static void main(String[] args) {

        // Пример для сортировки по возрастанию
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayOperationTemplates main = new ArrayOperationTemplates();
        main.isSorted(array);

        //Пример для поиска одинаковых элементов
        int[] left = new int[]{1, 3, 3, 4, 5, 6, 7};
        int[] right = new int[]{2, 4, 10, 11, 12, 4, 3};
        ArrayOperationTemplates equalElements = new ArrayOperationTemplates();
        equalElements.printCrossEl(left, right);

        //Объединяем два отсортированных массивов в третий без сортировки
        int[] leftSide = new int[]{1, 3};
        int[] rightSide = new int[]{2, 4};
        ArrayOperationTemplates mergedArray = new ArrayOperationTemplates();
        mergedArray.merge(leftSide, rightSide);

        //Определяем общий размер массива при объединении двух массивов
        int[] arrayLengthA = new int[]{1, 3, 4};
        int[] arrayLengthB = new int[]{2, 4};
        ArrayOperationTemplates combineSizeArray = new ArrayOperationTemplates();
        combineSizeArray.combineSize(arrayLengthA, arrayLengthB);

        //Печатаем все элементы массива за исключением первого элемента и последнего
        main.loopForArray(array);

        // Распечатаем элементы массива, при этом он должен пропустить
        // в каждом ряду первый и последний элемент
        int[][] doubleArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        main.loopForBoard(doubleArray);
    }
}


