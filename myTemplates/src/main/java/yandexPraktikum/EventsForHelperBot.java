package yandexPraktikum;

import java.util.*;
import java.util.Scanner;

public class EventsForHelperBot {

    public static void events(EventsForHelperBot bot, int hour, int minutes) {
        /*
        System.out.println("What hour is it?");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        System.out.println("And what minute is it?");
        int minutes = scanner.nextInt();
         */
        if (hour < 0 || hour > 24) {
            System.out.println("Don`t mess Jarvis. Only 24 hours in a day");
        } else if (hour < 0 || hour > 60) {
            System.out.println("Are you kidding me? Give from 0 to 60 or i just erase you!");
        } else if (hour >= 6 && hour <= 11 && (minutes <= 59)) {
            System.out.println(bot.eventsMorning());
        } else if (hour >= 12 && hour <= 17 && (minutes <= 59)) {
            System.out.println(bot.eventsDay());
        } else if (hour >= 18 && hour <= 21 && (minutes <= 59)) {
            System.out.println(bot.eventsEvening());
        } else if ((hour >= 22) || (hour <= 5) && (minutes <= 59)) {
            System.out.println("Still haven't figured out what to say to you at night");
        }
    }

    public static String eventsMorning() {
        Random random = new Random();
        List<String> morningGreetings = new ArrayList<>();
            morningGreetings.add("It`s time to wake up! You already overslept all good offers");
            morningGreetings.add("It`s time to wake up lazy mthfcker");
            morningGreetings.add("I`m Jarvis. I order you to get up and go");
            morningGreetings.add("Ok, it`s morning. And it's a polite invitation to wake up");
        int randomItem = random.nextInt(morningGreetings.size());
        String randomElement = morningGreetings.get(randomItem);
        return randomElement;
    }

    public static String eventsDay() {
        Random random = new Random();
        List<String> morningGreetings = new ArrayList<>();
        morningGreetings.add("It`s a good time to shitcode!");
        morningGreetings.add("Don`t dare open cat`s on youtube!");
        morningGreetings.add("Don`t you want to eat smth?");
        morningGreetings.add("Give me some good code. At least once a year...");
        int randomitem = random.nextInt(morningGreetings.size());
        String randomElement = morningGreetings.get(randomitem);
        return randomElement;
    }

    public static String eventsEvening() {
        Random random = new Random();
        List<String> morningGreetings = new ArrayList<>();
        morningGreetings.add("Get up from the bed! It`s evening already!");
        morningGreetings.add("Are you working? I`m watching you, write a good code");
        morningGreetings.add("Ok. Two cookies and back to the work");
        morningGreetings.add("Do you remember that you have a son in kindergarten?");
        int randomitem = random.nextInt(morningGreetings.size());
        String randomElement = morningGreetings.get(randomitem);
        return randomElement;
    }

    public static void testPerMinute(EventsForHelperBot bot) {
        for (int hour = 1; hour <= 24; hour++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println("Текущее время: " + hour + "ч." + min + "м.");
                events(bot, 0, 0);
            }
        }
    }
}
