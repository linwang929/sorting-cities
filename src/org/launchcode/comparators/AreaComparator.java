package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

import static java.lang.Math.signum;


public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return (int) signum((o2.getArea() - o1.getArea()));
    }
}
