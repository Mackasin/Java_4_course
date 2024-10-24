package java_ls.lr1.delegation;

public class CanonPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Canon Printer : " + message);
    }
}
