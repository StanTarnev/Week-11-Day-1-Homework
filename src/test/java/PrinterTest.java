import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(30, 50);
    }

    @Test
    public void canPrintDocument__enoughPaper() {
        printer.printDocument(4, 5);
        assertEquals(10, printer.getSheetsLeft());
    }
    @Test
    public void canPrintDocument__notEnoughPaper() {
        printer.printDocument(8, 5);
        assertEquals(30, printer.getSheetsLeft());
    }
    @Test
    public void canReduceToner(){
        printer.printDocument(6, 5);
        assertEquals(20, printer.getToner());
    }
}
