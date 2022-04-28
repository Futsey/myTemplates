package arrayTemplates;

public class Cinema {

    /*Массив имитирует рассадку посетителей в кинотеатре.
     * При этом если значение равно null - значит место свободно, иначе - место зарезервировано.
     * При этом рассадить посетителей нужно так, чтобы рядом значения null могли быть только по диагонали.
     * Метод должен вернуть клетку в которую можно разместить нового посетителя,
     * при этом если таких клеток будет несколько - нужно вернуть первую из них.
     * Метод должен работать с любым набором исходных данных.
     */
    public static Place checkEmptyPlace(Place[][] places) {
        for(int row = 0; row < places.length; row++) {
            for(int cell = 0; cell < places[row].length; cell++) {
                if (row == cell && places[row][cell] == null) {
                    return new Place(row, cell);
                }
            }
        }
        return null;
    }
}
