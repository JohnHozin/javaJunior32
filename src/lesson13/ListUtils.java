package lesson13;

import java.util.*;

public class ListUtils implements IListUtils{

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        return new ArrayList<>(Arrays.asList(strings));
    }

    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> sortList = new ArrayList<>(data);
        sortList.sort(Comparator.reverseOrder());
        return sortList;
    }
}
