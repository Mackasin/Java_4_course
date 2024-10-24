package java_ls.lr1.delegation;

public class Main {
    private static final String MESSAGE_TO_PRINT = "hello world";

    public static void main(String[] args) {
        var hpPrinterController = new PrinterController(new HpPrinter());
        var canonPrinterController = new PrinterController(new CanonPrinter());
        var epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }
}
