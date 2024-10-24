package java_ls.lr1.delegation;

public class EpsonPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Epson Printer : " + message);
    }
}
