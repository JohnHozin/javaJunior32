package lesson13;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {

        // ListUtils
        ListUtils listUtils = new ListUtils();
        List<String> listUtilsHelp1;
        listUtilsHelp1 = listUtils.asList("123","456","789","34", "qwe" ,"rty" , "a", "c" , "b");
        System.out.println(listUtilsHelp1);

        List<Double> listUtilsHelp2 = new ArrayList<>();
        listUtilsHelp2.add(2.5);
        listUtilsHelp2.add(4.6);
        listUtilsHelp2.add(6.66);
        listUtilsHelp2.add(3.4);
        List<Double> listUtilsHelp3;
        listUtilsHelp3 = listUtils.sortedList(listUtilsHelp2);
        System.out.println(listUtilsHelp3);

        // SetUtils
        SetUtils setUtils = new SetUtils();
        List<Integer> setUtilsHelp = new ArrayList<>();
        setUtilsHelp.add(2);
        setUtilsHelp.add(4);
        setUtilsHelp.add(6);
        setUtilsHelp.add(3);
        Collection collection = new ArrayList(setUtilsHelp);
        Set set = new HashSet<>(listUtilsHelp1);
        collection = setUtils.orderedSet(collection,set);
        System.out.println(collection);



        Set<Integer> setUtilsHelp1;
        setUtilsHelp1 = setUtils.customOrderSet(2,5,6,4,90);
        System.out.println(setUtilsHelp1);



        // CollectionUtils

        List<Integer> arrayListA = new ArrayList<>();
        List<Integer> arrayListB = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayListA.add(i, i);
            arrayListB.add(i, i + 5);
        }
        arrayListA.add(8);
        arrayListA.add(9);

        CollectionUtils c = new CollectionUtils();
        Collection<Integer> intC = c.union(arrayListA, arrayListB);
        System.out.println(arrayListA);
        System.out.println(arrayListB);

        System.out.println("Объединение двух коллекций с дубликатами: \n" + intC);

        intC = c.intersection(arrayListA, arrayListB);
        System.out.println("Пересечение двух коллекций с дубликатами: \n" + intC);

        intC = c.unionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println("Объединение двух коллекций без дубликатов: \n" + intC);

        intC = c.intersectionWithoutDuplicate(arrayListA, arrayListB);
        System.out.println("Пересечение двух коллекций без дубликатов: \n" + intC);

        intC = c.difference(arrayListA, arrayListB);
        System.out.println("Разность двух коллекций: \n" + intC);

    }
}
