package isp.lab3.exercise3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("Dacia", "Logan", 150, 'B');
        assertEquals("Dacia (Logan) speed 150 fuel type B", vehicle.toString());
    }
}
