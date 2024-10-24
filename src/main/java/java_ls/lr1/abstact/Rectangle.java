package java_ls.lr1.abstact;

public class Rectangle extends AbstractShape {
    private double length;
    private double breadth;

    public Rectangle(String name, double length, double breadth) {
        super(name);
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}
