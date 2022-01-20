package yandexPraktikum;

import java.util.Scanner;

public class HelperBotMyVersion {

    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        HelperBotMyVersion bot = new HelperBotMyVersion();
        double count = 0.00;
        for (int hour = 0; hour <= 24; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println("Текущее время: " + hour + "ч." + min + "м.");
                bot.sayHelloByTime(hour, min);
            }
        }
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime(int hour, int min) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        //double currentHour = scanner.nextDouble();
        if (hour >= 6 && hour <= 11 && (min <= 59)){
            System.out.println("Доброе утро!");
        } else if (hour >= 12 && hour <= 17 && (min <= 59)) {
            System.out.println("Добрый день!");
        } else if (hour >= 18 && hour <= 21 && (min <= 59)) {
            System.out.println("Добрый вечер!");
        } else if ((hour >= 22) || (hour <= 5) && (min <= 59)) {
            System.out.println("Доброй ночи!");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
