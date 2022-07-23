package lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtils implements ICollectionUtils{

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        if (a.isEmpty()) {
            System.out.println(("Коллекция 'a' пуста"));
            return null;
        } else if (b.isEmpty()) {
            System.out.println(("Коллекция 'b' пуста"));
            return null;
        } else {
            ArrayList<Integer> arrUnion = new ArrayList<>();
            arrUnion.addAll(a);
            arrUnion.addAll(b);
            return arrUnion;
        }
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        if (a.isEmpty()) {
            System.out.println(("Коллекция 'a' пуста"));
            return null;
        } else if (b.isEmpty()) {
            System.out.println(("Коллекция 'b' пуста"));
            return null;
        } else {
            Collection<Integer> arrIntersection = new ArrayList<>(a);
            arrIntersection.retainAll(b);
            return arrIntersection;
        }
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        if (a.isEmpty()) {
            System.out.println(("Коллекция 'a' пуста"));
            return null;
        } else if (b.isEmpty()) {
            System.out.println(("Коллекция 'b' пуста"));
            return null;
        } else {
            HashSet<Integer> arrUnionWithout = new HashSet<>();
            arrUnionWithout.addAll(a);
            arrUnionWithout.addAll(b);
            return arrUnionWithout;
        }
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        if (a.isEmpty()) {
            System.out.println(("Коллекция 'a' пуста"));
            return null;
        } else if (b.isEmpty()) {
            System.out.println(("Коллекция 'b' пуста"));
            return null;
        } else {
            HashSet<Integer> arrIntersectionWithout = new HashSet<>(a);
            arrIntersectionWithout.retainAll(b);
            return arrIntersectionWithout;
        }
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        if (a.isEmpty()) {
            System.out.println(("Коллекция 'a' пуста"));
            return null;
        } else if (b.isEmpty()) {
            System.out.println(("Коллекция 'b' пуста"));
            return null;
        } else {
            Collection<Integer> arrDifference = new ArrayList<>(a);
            arrDifference.removeAll(b);
            return arrDifference;
        }
    }
}

