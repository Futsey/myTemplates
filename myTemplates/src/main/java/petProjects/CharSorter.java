package petProjects;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSorter {
    static Map<String, Integer> data = new HashMap<>();
    static List<String> charArray = new ArrayList<>();

    public void read(File file, Charset encoding) throws IOException {
        try (InputStream in = new FileInputStream(file);
             Reader bookReader = new InputStreamReader(in, encoding);
             Reader buffer = new BufferedReader(bookReader)) {
            handleCharacters(buffer);
        }
    }

    private static void handleCharacters(Reader reader) throws IOException {
        int count = 0;
        int rdr;
        while ((rdr = reader.read()) != -1) {
            char ch = (char) rdr;
            String str = Character.toString(ch);
            data.put(str, !data.containsKey(str) ? 1 : data.get(str) + 1);
        }
    }

    //TODO implement filter
    public static void filter() {
        String patternStr = "\\D";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(patternStr);
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (matcher.find()) {
                data.remove(entry);
            }
//            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {
        CharSorter charSorter = new CharSorter();
        File file = new File("C:/Users/Fut/IdeaProjects/vadim-tsk/data/voyna-i-mir-tom-1.txt");
        charSorter.read(file, Charset.defaultCharset());
        System.out.println("Unsorted: " + data);
        data.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(System.out::println);
        System.out.println("Sorted with chars: " + data);
        filter();
        System.out.println("Sorted only letters: " + data);
    }
}
