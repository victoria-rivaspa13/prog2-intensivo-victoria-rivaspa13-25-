package Intensivo.Interfaces;

import Intensivo.Introduction.Interval1;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriteriaTest {
    @Test
    public void testFindFirstPairCriteria() {
        Interval1 interval = new Interval1(1, 5, 1);
        Criteria isEven = new PairCriteria();
        assertEquals(2.0, interval.findFirst(isEven));
    }

    @Test
    public void testFindFirstOddCriteria() {
        Interval1 interval = new Interval1(1, 5, 1);
        Criteria isOdd = new OddCriteria();
        assertEquals(1.0, interval.findFirst(isOdd));
    }

    @Test
    public void testFindAllPairCriteria() {
        Interval1 interval = new Interval1(1, 5, 1);
        Criteria isEven = new PairCriteria();
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(2.0);
        expected.add(4.0);
        assertEquals(expected, interval.findAll(isEven));
    }

    @Test
    public void testFindAllOddCriteria() {
        Interval1 interval = new Interval1(1, 5, 1);
        Criteria isOdd = new OddCriteria();
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(1.0);
        expected.add(3.0);
        expected.add(5.0);
        assertEquals(expected, interval.findAll(isOdd));
    }
    }



