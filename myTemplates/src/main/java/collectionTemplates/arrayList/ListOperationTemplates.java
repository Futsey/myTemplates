package collectionTemplates.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListOperationTemplates {

    /* Необходимо реализовать метод, который будет возвращать первую строку из коллекции строк,
    * но прежде чем получить результат - необходимо проверить содержатся ли элементы в списке.
    * Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции
     */
    public static String checkerAndGetter(List<String> list) {

        return !list.isEmpty() ? list.get(0) : "";
    }

    /* Необходимо реализовать метод, который добавляет элемент в список и сообщает нам удалось это или нет,
    * т.е. метод должен вернуть булево значение. Не используйте в методе то, что метод возвращает true или false.
    * Для этого на входе в метод мы копируем список в новый список, добавляем в тот список,
    * который пришел в методе и в конце сравниваем их размеры - если изменился, значит элемент добавился
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.add(str);
        return check.size() != list.size();
    }

    /* необходимо реализовать метод, который добавляет элемент в список по индексу,
    * при этом он должен добавлять элемент только в том случае, если этого элемента еще нет в коллекции.
    * При этом метод должен вернуть булево значение.
    * Для этого необходимо сравнить размер дубликата списка и списка в который мы добавляем элемент.
    * Используйте методы contains(E e), add(int index, E e), size().
     */
    public static boolean addIndexElement(List<String> list, int index, String str) {
        List<String> check = new ArrayList<>(list);
        if (!list.contains(str)) {
            list.add(index, str);
            return list.size() > check.size();
        }
        return false;
    }

    /* Необходимо определить, является ли этот элемент уникальным в этом списке.
    * Для это необходимо найти первый и последний индекс вхождения элемента.
    * Если равны - значит элемент уникальный. Необходимо предусмотреть ситуацию,
    * что такого элемента нет вообще в коллекции, в этом случае также нужно вернуть false.
     */
    public static boolean uniqueElement(List<String> list, String str) {
        return list.contains(str) && list.indexOf(str) == list.lastIndexOf(str);
    }

    /* в методе вам нужно заполнить коллекцию значениями от first до fifth с помощь фабричного метода of().
    * После этого с помощью цикла for() с индексами и метода get() вывести все элементы.
     */
    public static void factoryAddMethod() {
        List<String> list = List.of("first", "second", "third", "fourth", "fifth");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /* Метод принимает в качестве параметров список и индекс элемента который необходимо заменить.
    * Необходимо дописать метод так, чтобы сначала удалялся последний элемент в списке,
    * а потом этим элементом заменить элемент по индексу, который пришел в параметрах метода.
    * Необходимо учесть, что извне могут передать индекс, который превышает значение размера списка.
    * Чтобы этого избежать - необходимо добавить проверку валидности входных параметров.
     */
    public static List<String> repositionElement(List<String> list, int index) {
        String el = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if (index <= list.size()) {
            list.set(index, el);
        }
        return list;
    }

    /* Метод принимает 2 списка и элемент, который возможно содержится в этих списках.
    * Вам необходимо проверить оба списка, содержат ли они одновременно этот элемент,
    * если содержит - необходимо удалить элемент из первого списка. Потом второй список нужно добавить в первый.
    * Метод должен вернуть индекс элемента, который пришел в параметрах метода из общего списка.
     */
    public static int addAllElementsList(List<String> left, List<String> right, String str) {
        int index = left.indexOf(str);
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
            index = left.indexOf(str);
        }
        return index;
    }

    /* Метод принимает 3 списка элементов:
    * 1. Общий список элементов;
    * 2. Список важных элементов, но не обязательных;
    * 3. Список элементов, которые обязательно должны отсутствовать в результирующем списке.
    * Необходимо реализовать метод, который вернет список, основой которого будет первый,
    * присутствовать элементы из второго и точно отсутствовать элементы из третьего.
     */
    public static List<String> splitterList(List<String> left, List<String> middle, List<String> right) {
        left.removeAll(right);
        left.retainAll(middle);
        return left;
    }

    /* Метод принимает два параметра - список и элемент, который предполагается, что содержится в этом списке.
    * Необходимо реализовать метод, чтобы он возвращал результаты следующим образом:
    * 1. Элемента нет в списке - возвращает пустой список.
    * 2. Элемент в списке встречается 1 раз - возвращает пустой список.
    * 3. Элемент встречается более одного - возвращается список, начиная с первого вхождения элемента и заканчивая
    *  предшествующим последнему вхождению элемента в исходной коллекции.
     */
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
            return !list.contains(el) || list.indexOf(el) == list.lastIndexOf(el) ?
                    new ArrayList<String>() : list.subList(list.indexOf(el), list.lastIndexOf(el));
    }


}
