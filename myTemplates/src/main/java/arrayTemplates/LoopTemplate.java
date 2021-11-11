package arrayTemplates;

public class LoopTemplate {

    // Найдем слова начинающиеся с заглавной буквы и выделим их в аббревиатуру
    public static String collect(String s) {
        String isUp = "";
        int fraze = s.length();
        for (int y = 0; y < fraze; y++) {
            if (Character.isUpperCase(s.charAt(y))) {
                char w = s.charAt(y);
                isUp = isUp + w;
            }
        }
        System.out.println("The uppercase characters are " + isUp);
        return isUp;
    }

    public static void main(String[] args) {
        LoopTemplate string = new LoopTemplate();
        string.collect("Characters");
    }
}
