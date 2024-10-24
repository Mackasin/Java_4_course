package java_ls.lr1.abstact;

public abstract class AbstractShape {
    private String nameOfShape;

    public static final String Square = "Square";
    public static final String Rectangle = "Rectangle";
    public static final String Circle = "Circle";

    protected AbstractShape(String name) {
        nameOfShape = name;
    }

    abstract public double calculateArea();

    public void printArea(){
        double area = this.calculateArea(); // dynamic binding
        System.out.println("The area of the " + nameOfShape + " = " + area);
    }
}
