package lesson13;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main1 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.add("italy");
        hashSet.add("england");
        hashSet.add("france");
        hashSet.add("france");
        hashSet.add("german");

        //System.out.println(hashSet);

        for (Iterator<String> iterator = hashSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}

