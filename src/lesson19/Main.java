package lesson19;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("eee");
        strings.add("www");
        System.out.println(strings);
    }
}
