package lesson20;

public class Main1 {
    public static void main(String[] args) {
        MultiMapImpt<String, String> phoneBook = new MultiMapImpt<>();

        phoneBook.put("Слава", "+79874838438");
        phoneBook.put("Слава", "89874838438");
        phoneBook.put("Слава", "+7333333");
        phoneBook.put("Петя", "+7-987-448-38-38");

        System.out.println();

    }
}
