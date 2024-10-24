package java_ls.lr1.abstact;

public class Main {
    public static void main(String [] args) {
        AbstractShape rect = new Rectangle(AbstractShape.Rectangle, 42.1, 13.7);
        AbstractShape circ = new Circle(AbstractShape.Circle, 12.5);

        rect.printArea();
        circ.printArea();
    }
}
