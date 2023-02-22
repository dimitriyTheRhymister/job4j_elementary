package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42to22then2() {
        double expected = 2;
        Point a = new Point(4, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when825to422then5() {
        double expected = 5;
        Point a = new Point(8, 25);
        Point b = new Point(4, 22);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}