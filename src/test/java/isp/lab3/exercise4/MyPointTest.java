package isp.lab3.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyPointTest {
    @Test
    public void testDistanceToCoordinates() {
        MyPoint point = new MyPoint(1, 2, 3);
        assertEquals(Math.sqrt(27), point.distance(4, 5, 6), 0.0001);
    }

    @Test
    public void testDistanceToPoint() {
        MyPoint point1 = new MyPoint(1, 2, 3);
        MyPoint point2 = new MyPoint(1, 2, 6);
        assertEquals(3.0, point1.distance(point2), 0.0001);
    }
}
