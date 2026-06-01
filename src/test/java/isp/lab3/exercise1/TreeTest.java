package isp.lab3.exercise1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    @Test
    public void testGrowAddsMeters() {
        Tree tree = new Tree();
        tree.grow(5);
        assertEquals("20", tree.toString());
    }

    @Test
    public void testGrowIgnoresNonPositiveMeters() {
        Tree tree = new Tree();
        tree.grow(0);
        tree.grow(-3);
        assertEquals("15", tree.toString());
    }

    @Test
    public void testToStringReturnsHeight() {
        Tree tree = new Tree();
        assertEquals("15", tree.toString());
    }
}
