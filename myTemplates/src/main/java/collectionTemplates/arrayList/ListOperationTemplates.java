package collectionTemplates.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ListOperationTemplates {

    /* Необходимо реализовать метод, который будет возвращать первую строку из коллекции строк,
    * но прежде чем получить результат - необходимо проверить содержатся ли элементы в списке.
    * Если их нет - возвращаем пустую строку, иначе - первый элемент в коллекции
     */
    public static String checkerAhdGetter(List<String> list) {
        return !list.isEmpty() ? list.get(0) : "";
    }


    /* Необходимо реализовать метод, который добавляет элемент в список и сообщает нам удалось это или нет,
    * т.е. метод должен вернуть булево значение. Не используйте в методе то, что метод возвращает true или false.
    * Для этого на входе в метод мы копируем список в новый список, добавляем в тот список,
    * который пришел в методе и в конце сравниваем их размеры - если изменился, значит элемент добавился
     */
    public static boolean addNewElement(List<String> list, String str) {
        List<String> check = new ArrayList<>(list);
        check.addAll(list);
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
}
