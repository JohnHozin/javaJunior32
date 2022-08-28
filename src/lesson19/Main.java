package lesson19;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("eee");
        strings.add("www");
        System.out.println(strings);
    }
}
