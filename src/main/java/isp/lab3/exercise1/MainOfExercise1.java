package isp.lab3.exercise1;

public class MainOfExercise1 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        System.out.println("Initial height: " + tree);
        tree.grow(3);
        System.out.println("After growing: " + tree);
    }
}
