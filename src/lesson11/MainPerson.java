package lesson11;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan",25);
        Person person2 = new Person("Elena",25);
        System.out.println(person1.equals(person2));

        System.out.println(person1);
        System.out.println(person2);

//        String s = "hello";
//        String s1 = "hello";
//        String s2 = new String("hello");
//        System.out.println(s == s2);

        // a = b  b = c  c = a
        // a = b  b = a
        //

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
