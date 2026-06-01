package isp.lab3.exercise6;

public class MainOfExercise6 {
    public static void main(String[] args) {
        VendingMachine machine1 = VendingMachine.getInstance();
        VendingMachine machine2 = VendingMachine.getInstance();
        System.out.println("Single instance? " + (machine1 == machine2));
    }
}
