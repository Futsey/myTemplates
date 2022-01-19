package arrayTemplates;

import java.util.Scanner;

public class HelperBot {

    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        HelperBot bot = new HelperBot();
        bot.sayHelloByTime();
    }

    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        double currentHour = scanner.nextDouble();
        if (currentHour >= 6.00 && currentHour <= 11.59){
            System.out.println("Доброе утро!");
        } else if (currentHour >= 12.00 && currentHour <= 17.59) {
            System.out.println("Добрый день!");
        } else if (currentHour >= 18.00 && currentHour <= 21.59) {
            System.out.println("Добрый вечер!");
        }else if ((currentHour >= 22.00) || (currentHour <= 5.59)) {
            System.out.println("Доброй ночи!");
        }
    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }
}
