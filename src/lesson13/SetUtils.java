package lesson13;

import java.util.*;

public class SetUtils implements ISetUtils{

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        SortedSet <String> sortOrderedSet = new TreeSet<>();

        for (Integer col:collection1){
            sortOrderedSet.add(String.valueOf(col));
        }

        sortOrderedSet.addAll(set2);
        System.out.println("1." + sortOrderedSet);

        NavigableSet<String> sortedSet = new TreeSet<>(sortOrderedSet);
        sortedSet = sortedSet.descendingSet();
        System.out.println("3." + sortedSet);

        return sortedSet;
    }



    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        LinkedHashSet<Integer> someValues= new LinkedHashSet<>();
        someValues.add(val1);
        someValues.add(val2);
        someValues.add(val3);
        someValues.add(val4);
        someValues.add(val5);
        return someValues;
    }
}

