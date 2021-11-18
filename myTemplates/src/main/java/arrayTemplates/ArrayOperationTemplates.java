package arrayTemplates;

import java.util.Arrays;
import java.io.*;

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

        for (int i = 0; i < array.length; i++) {
            if (positionA == left.length) {
                array[i] = right[positionB];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionB++;
            } else if (positionB == right.length) {
                array[i] = left[positionA];
                System.out.println("Добавлен новый элемент: " + array[i]);
                positionA++;
            } else if (left[positionA] < right[positionB]) {
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
     * Метод проверяет длинну ряда
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
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != standard) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    /*
     * Выведем на консоль все элементы массива за исключением первого элемента и последнего
     */
    public static int[] loopForArray(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            System.out.println("Печать без первого и последнего элементов: " + array[i]);
        }
        return array;
    }

    /*
     * Выведем на консоль элементы массива, при этом он должен пропустить
     * в каждом ряду первый и последний элемент
     */
    public static int[][] loopForBoard(int[][] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 1; j < doubleArray[i].length - 1; j++) {
                System.out.println(doubleArray[i][j]);
            }
        }
        return doubleArray;
    }

    /*
     * Выведем на консоль элементы массива, которые имеют четные индексы
     */
    public static int[] arrayEvenIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
        return array;
    }

    /*
     * Заполним треугольную матрицу
     */
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int r = 1;
        int i = 0;
        int j = 0;
        for (i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = r++;
            }
            System.out.println(Arrays.toString(triangle[i]));
        }
        return triangle;
    }

    /*
     * Транспонируем матрицу
     */
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                result[k][i] = matrix[i][k];
                System.out.println(result[k][i]);
            }
        }
        return result;
    }

    /*
     * Формируем и выводим целочисленный массив размера n, первый элемент которого
     * равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих
     */
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        array[2] = a + b;
        for (int i = 3; i < n; i++) {
            array[i] = array[i - 1] * 2;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    /*
     * Выводим все содержащиеся в массиве нечетные числа
     * в порядке возрастания их индексов
     */
    public static void printNotEvenUpStream(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp % 2 != 0) {
                System.out.println("Индексы нечетных чисел: " + array[i]);
            }
        }
    }

    /*
     * Выводим все содержащиеся в массиве четные числа
     * в порядке возрастания их индексов
     */
    public static void printEvenUpStream(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp % 2 == 0) {
                System.out.println("Индексы четных чисел: " + array[i]);
            }
        }
    }

    /*
     * Тут выводим все содержащиеся в массиве четные числа в порядке убывания их индексов
     */
    public static void printEvenElDownStream(int[] array) {
        for (int i = array.length; i >= 1; i--) {
            int temp = array[i - 1];
            if (temp % 2 == 0) {
                System.out.println("Четные числа в порядке убывания: " + temp);
            }
        }
    }

    /* Метод, который возвращает индекс по количеству вхождений (indexOf()).
     * если ничего не найдено возвращаем -1
     * если число вхождений указано равное 1, то метод работает как обычный indexOf()
     */
    public static int indexOf(char[] string, char c, int number) {
        int found = new String(string).indexOf(c, number);
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                found = i;
            }
        }
        System.out.println("Индекс искомого знака: " + found);
        return found;
    }

    /*
     * Если последовательность элементов удовлетворяет условию Ak <= Ak+1 <= ... <= Ak+m
     * она называется неубывающей.
     * Длина последовательности это количество элементов, которые в нее входят.
     * В массиве таких последовательностей может быть несколько, вам нужно найти длину максимальной из них.
     */

    public static int maxLengthSeria(int[] array) {
        int last = 0;
        int lastMax = 0;
        int length = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < last) {
                lastMax = 0;
            }
            lastMax++;
            if(length < lastMax) {
                length = lastMax;
                last = array[i];
            }
        }
        System.out.println("Длинна наибольшей неубывающей последовательности: " + length);
        return length;
    }

    /*
     * Переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк
     */
    public static void swapMatrixLine(int[][] data, int src, int dst) {
        int row = data.length;
        int column = data[0].length;
        for (int i=0; i < column; i++) {
            int temp = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = temp;
            System.out.println("Элемент: " + data[dst][i]);
            System.out.println("меняем на элемент: " + data[src][i]);
        }
    }

    /*
     * переставить два столбца в квадратной матрице. src, dest это индексы столбцов
     */

    public static void swapColumns(int[][] data, int src, int dst) {
        int row = data.length;
        int column = data[0].length;
        for (int i=0; i < row; i++) {
            int temp = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = temp;
            System.out.println("Элемент: " + data[i][src]);
            System.out.println("меняем на элемент: " + data[i][dst]);
        }
    }

    /*
     * Объединить строки квадратного массива в один массив
     */
    public static int[] mergeTwoDimensArray(int[][] data) {
        int count = 0;
        int row = data.length;
        int column = data[0].length;
        int[] array = new int[row * column];
        for (int i = 0; i < column; i++) {
            for (int k = 0; k < row; k++) {
                array[count] = data[i][k];
                count++;
            }
        }
        System.out.print("Получен массив: " + Arrays.toString(array));
        return array;
    }

    /*
     *Вам дана квадратная матрица. Нужно получить правую диагональ.
     * Правая диагональ это диагональ матрицы, которая идет справа налево.
     */
    public static int[] matrixDiagonal(int[][] data) {
        int count = 0;
        int row = data.length;
        int column = data[0].length;
        int[] array = new int[row];
        for (int i = 0; i < row; i++) {
            for (int k = column - 1; k >= 0; k--) {
                array[count] = data[i][k];
                count++;
                column -= 1;
                break;
            }
        }
        System.out.print("Получен массив: " + Arrays.toString(array) + System.lineSeparator());
        return array;
    }

    /*
     * Создадим новую строку в массиве символов,
     * в которой все символы будут в верхнем регистре.
     * Если символ не является буквой, например цифрой или знаком, то добавляем в результат как есть.
     */
    public static char[] toUpperCase(char[] string) {
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                string[i] = Character.toUpperCase(string[i]);
            }
        }
        System.out.println(Arrays.toString(string));
        return string;
    }

    /*
     * Метод принимает 3 массива целочисленных значений, при этом каждый обладает следующими свойствами:

     * 1. Имеет произвольную длину массива.
     * 2. Массив всегда имеет нечетное число элементов.
     * 3. Массив имеет количество элементов на 1 больше, чем массив из пункта 2.

     * Необходимо реализовать метод, который объединит три массива в один.
     * При этом должны выполниться следующие условия:

     * 1. Из первого массива в результирующий массив
     * должны попасть только первый и последний элемент,
     * причем в результирующем массиве они должны находиться на первом и последнем месте, соответственно.
     * 2. Элементы с нечетными индексами из второго массива
     * должны находиться в результирующем массиве на местах с четными индексами.
     * 3. Элементы с четными индексами из третьего массива
     * должны находиться в результирующем массиве на местах с нечетными индексами.
     */
    public static int[] unionThreeArrays(int[] left, int[] middle, int[] right) {
        int count = 1;
        int middleSize = middle.length / 2;
        int rightSize = right.length / 2;
        int[] array = new int[2 + middleSize + rightSize];
        array[0] = left[0];
        array[array.length - 1] = left[left.length - 1];
        while ((middleSize % 2 == 0) || (rightSize == (middleSize + 1))) {
            for (int i = 0; i < middle.length; i++) {
                if (middle[i] % 2 != 0) {
                    array[count] = middle[i];
                    count++;
                }
                if (right[i] % 2 != 0) {
                    array[count] = right[i];
                    count++;
                }
            }
            break;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {

        // Пример для сортировки по возрастанию
        System.out.println(System.lineSeparator() + "isSorted: ");
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayOperationTemplates main = new ArrayOperationTemplates();
        main.isSorted(array);

        //Пример для поиска одинаковых элементов
        System.out.println(System.lineSeparator() + "printCrossEl: ");
        int[] left = new int[]{1, 3, 3, 4, 5, 6, 7};
        int[] right = new int[]{2, 4, 10, 11, 12, 4, 3};
        ArrayOperationTemplates equalElements = new ArrayOperationTemplates();
        equalElements.printCrossEl(left, right);

        //Объединяем два отсортированных массивов в третий без сортировки
        System.out.println(System.lineSeparator() + "merge: ");
        int[] leftSide = new int[]{1, 3};
        int[] rightSide = new int[]{2, 4};
        ArrayOperationTemplates mergedArray = new ArrayOperationTemplates();
        mergedArray.merge(leftSide, rightSide);

        //Определяем общий размер массива при объединении двух массивов
        System.out.println(System.lineSeparator() + "combineSize: ");
        int[] arrayLengthA = new int[]{1, 3, 4};
        int[] arrayLengthB = new int[]{2, 4};
        ArrayOperationTemplates combineSizeArray = new ArrayOperationTemplates();
        combineSizeArray.combineSize(arrayLengthA, arrayLengthB);

        //Выведем на консоль все элементы массива за исключением первого элемента и последнего
        System.out.println(System.lineSeparator() + "loopForArray: ");
        main.loopForArray(array);

        // Выведем на консоль элементы массива, при этом он должен пропустить
        // в каждом ряду первый и последний элемент
        System.out.println(System.lineSeparator() + "loopForBoard: ");
        int[][] doubleArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        main.loopForBoard(doubleArray);

        // Выведем на консоль элементы массива, которые имеют четные индексы
        System.out.println(System.lineSeparator() + "arrayEvenIndex: ");
        int[] arrayEven = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        main.arrayEvenIndex(arrayEven);

        //Заполним треугольную матрицу
        System.out.println(System.lineSeparator() + "rows: ");
        main.rows(5);

        // Транспонируем матрицу
        System.out.println(System.lineSeparator() + "transpose: ");
        int[][] transposeArray = {
                {1, 2, 3},
                {4, 5, 6}
        };
        main.transpose(transposeArray);

        // Формируем и выводим целочисленный массив размера n, первый элемент которого
        // равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих
        System.out.println(System.lineSeparator() + "calculate: ");
        main.calculate(1,2,5);

        // Выводим все содержащиеся в данном массиве нечетные числа в порядке возрастания их индексов
        System.out.println(System.lineSeparator() + "printNotEvenUpStream: ");
        int[] arrayPrintEvenAndNotEven = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        main.printNotEvenUpStream(arrayPrintEvenAndNotEven);

        // Выводим все содержащиеся в данном массиве четные числа в порядке возрастания их индексов
        System.out.println(System.lineSeparator() + "printEvenUpStream: ");
        main.printEvenUpStream(arrayPrintEvenAndNotEven);

        // Выводим выводим все содержащиеся в массиве четные числа в порядке убывания их индексов
        System.out.println(System.lineSeparator() + "printEvenElDownStream: ");
        main.printEvenElDownStream(arrayPrintEvenAndNotEven);

        // Метод, который возвращает индекс по количеству вхождений (indexOf()).
        // если ничего не найдено возвращаем -1
        // если число вхождений указано равное 1, то метод работает как обычный indexOf()
        char[] chArr = new char[] {'a', 'b', 'c', 'd'};
        System.out.println(System.lineSeparator() + "indexOf: ");
        main.indexOf(chArr, 'd', 1);

        // Найти длину максимальной из неубывающей последовательности
        System.out.println(System.lineSeparator() + "maxLengthSeria: ");
        int[] maxLengthSeriaArray = {1, 2, 1, 1, 2, 3};
        main.maxLengthSeria(maxLengthSeriaArray);

        // Переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк
        System.out.println(System.lineSeparator() + "swapMatrixLine: ");
        int[][] swapMatrixLineArray = {
                {1, 2, 3},
                {4, 5, 6}
        };
        main.swapMatrixLine(swapMatrixLineArray, 0, 1);

        // Переставить два столбца в квадратной матрице. src, dest это индексы строк
        System.out.println(System.lineSeparator() + "swapColumns: ");
        main.swapColumns(swapMatrixLineArray, 0, 2);

        // Объединить строки квадратного массива в один массив
        System.out.println(System.lineSeparator() + "mergeTwoDimensArray: ");
        int[][] squareArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        main.mergeTwoDimensArray(squareArray);

        // Вам дана квадратная матрица. Нужно получить правую диагональ.
        // Правая диагональ это диагональ матрицы, которая идет справа налево.
        System.out.println(System.lineSeparator() + "matrixDiagonal: ");
        main.matrixDiagonal(squareArray);

        // Создадим новую строку в массиве символов,
        // в которой все символы будут в верхнем регистре.
        // Если символ не является буквой, например цифрой или знаком, то добавляем в результат как есть.
        System.out.println(System.lineSeparator() + "toUpperCase: ");
        char[] charArray = new char[]{'w', 'o', 'l', 'f', '-', '1', '2', '3'};
        main.toUpperCase(charArray);

        // 3 массива в 1
        System.out.println(System.lineSeparator() + "unionThreeArrays: ");
        int[] arrayOne = {1, 2, 1, 1};
        int[] arrayTwo = {4, 75, 2, 1, 6, 5};
        int[] arrayThree = {3, 12, 23, 6, 8, 9, 1, 26};
        main.unionThreeArrays(arrayOne, arrayTwo, arrayThree);
    }
}


