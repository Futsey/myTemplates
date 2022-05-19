package petProjects.combineByAsc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class CombineByAsc {

    private static Long[] longArray = new Long[1000];
    private static LinkedList<Integer> upperList = new LinkedList<>();
    private static LinkedList<Integer> lowerList = new LinkedList<>();

    private static int check(int first, int second) {
        return Math.min(first, second);
    }

    private static int[] sorter(LinkedList<Integer> upperList, LinkedList<Integer> lowerList) {
        int[] qtyList = new int[lowerList.size()];
        int[] tmp = new int[lowerList.size() * upperList.size()];
        int count = 0;
        int upperCount = 0;
        int lowerCount = 0;
        for(int i = 0; i < upperList.size(); i++) {
            if (count == 0) {
                tmp[upperCount] = upperList.getFirst();
                upperCount++;
                count++;
            } else {
                for(int k = 0; k < lowerList.size(); k++) {
                    if(lowerList.get(k) < upperList.get(i) && lowerCount < upperCount) {
                        tmp[lowerCount] = k;
                        lowerCount++;
                    } else if (upperList.get(i) < lowerList.get(k)) {
                        tmp[upperCount] = i;
                        upperCount++;
                    }
                }
            }
        }
        return tmp;
    }



    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < longArray.length; i++ ) {
            int firstRandomDecision= random.nextInt(100);
            int secondRandomDecision=random.nextInt(2);
            if (firstRandomDecision > 95) {
                if (secondRandomDecision >= 1 && upperCount <= lowerCount) {
                    upperList.add(check(i, lowerList.getLast()));
                    System.out.println("В ВЕРХНИЙ массив ушло: "
                            + i);
                    upperCount++;
                } else {
                    lowerList.add(i);
                    System.out.println("В нижний массив ушло: "
                            + i);
                    lowerCount++;
                }
                count++;
            }

        }
        System.out.println("_____________________________");
        System.out.println("ВЕРХНИЙ массив. Всего элементов: " + upperCount);
        System.out.println("Нижний массив Всего элементов: " + lowerCount);
        System.out.println("Всего нужных комбинаций выпало: " + count);
        System.out.println("_____________________________");
        System.out.println("Сортировка: " + Arrays.toString(sorter(upperList, lowerList)));
    }
}
