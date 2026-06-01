package isp.lab3.exercise3;

public class MainOfExercise3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Dacia", "Logan", 150, 'B');
        Vehicle vehicle2 = new Vehicle("Toyota", "Corolla", 130, 'D');

        System.out.println("Model: " + vehicle1.getModel());
        vehicle1.setSpeed(160);
        System.out.println("Speed updated: " + vehicle1.getSpeed());

        System.out.println("Vehicles equal: " + vehicle1.equals(vehicle2));
        Vehicle.displayNumberOfVehicles();
    }
}
