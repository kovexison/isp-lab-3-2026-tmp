package isp.lab3.exercise2;

public class MainOfExercise2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3, "blue");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
