package lesson20;

import java.util.*;

public class MultiMapImpt<K, V> extends HashMap<K, V> implements MultiMap<K, V> {
    private HashMap<K, ArrayList<V>> multiMap = new HashMap<>();
    private ArrayList<V> values = new ArrayList<>();

    public MultiMapImpt() {
    }



    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
    if (multiMap.containsKey(key)){
        values = multiMap.get(key);
        values.add(value);
        multiMap.put(key,values);
    }else{
        values = new ArrayList<>();
        values.add(value);
        multiMap.put(key,values);

    }
        return value;
    }
}
