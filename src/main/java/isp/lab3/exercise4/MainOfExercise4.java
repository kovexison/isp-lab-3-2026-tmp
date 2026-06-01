package isp.lab3.exercise4;

public class MainOfExercise4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2, 3);
        MyPoint point2 = new MyPoint(4, 5, 6);
        System.out.println("Distance: " + point1.distance(point2));
    }
}
