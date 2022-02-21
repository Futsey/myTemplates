package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTemplates {

    /*
    * Метод predicateCheckPositive должен проверить, что число положительное
     */
    public static boolean predicateCheckPositive(int num) {
        return predicateCheckPositive(n -> num > 0, num);
    }

    private static boolean predicateCheckPositive(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    /*
     * Метод predicateCheckEven должен проверить, что число четное
     */
    public static boolean predicateCheckEven(int num) {
        return predicateCheckEven(n -> n % 2 == 0, num);
    }

    private static boolean predicateCheckEven(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    /*
     * Метод predicateCheckEvenAndPositive должен проверить, что число четное и положительное
     */
    public static boolean predicateCheckEvenAndPositive(int num) {
        return predicateCheckEvenAndPositive(n -> n % 2 == 0 && n > 0, num);
    }

    private static boolean predicateCheckEvenAndPositive(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    /*
     * Метод functionPow должен возвести переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
     * TODO rewrite at Math.pow method
     */
    public static double functionPow(double x) {
        return functionPow(n -> x * x, x);
    }

    public static double functionPow(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
