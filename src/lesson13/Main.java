package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("hello");
        texts.add("flower");
        texts.add("rose");
        texts.add("sun");

        texts.add(1,"moon");


        System.out.println(texts);

    }
}
