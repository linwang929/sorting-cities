package org.launchcode.comparators;

import org.launchcode.City;

import java.util.*;

public class CompoundComparator implements Comparator<City> {
    List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> newComparator) {
        comparators.add(newComparator);
    }

    @Override
    public int compare(City o1, City o2) {
        int i = 0;
        int state;
        do {
            state = comparators.get(i).compare(o1, o2);
            i++;
        }
        while (state == 0 && i<= comparators.size());
        return state;
    }
}
