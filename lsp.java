public interface Shape {
    int getArea();
}

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width  = width;
        this.height = height;
    }
    @Override
    public int getArea() {
        return width * height;
    }
}

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    @Override
    public int getArea() {
        return side * side;
    }
}

public class Main {
    public static void printArea(Shape s) {
        System.out.println("Площадь = " + s.getArea());
    }
    public static void main(String[] args) {
        Shape r = new Rectangle(5, 4);
        printArea(r);
        Shape s = new Square(5);
        printArea(s);
    }
}
