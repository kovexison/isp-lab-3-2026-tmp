package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VehicleTest {
    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("Dacia", "Logan", 150, 'B');
        assertEquals("Dacia (Logan) speed 150 fuel type B", vehicle.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle3 = new Vehicle("Toyota", "Corolla", 120, 'D');
        assertEquals(vehicle1, vehicle2);
        assertEquals(vehicle1.hashCode(), vehicle2.hashCode());
        assertNotEquals(vehicle1, vehicle3);
    }
}
