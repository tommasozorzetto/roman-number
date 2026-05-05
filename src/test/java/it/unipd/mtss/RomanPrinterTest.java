/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {
	@Test
    public void print_ShouldCoverAllOtherLetters() {
        // Generiamo le stampe per gli altri simboli
        String asciiX = RomanPrinter.print(10);
        String asciiL = RomanPrinter.print(50);
        String asciiC = RomanPrinter.print(100);
        String asciiD = RomanPrinter.print(500);
        String asciiM = RomanPrinter.print(1000);

        // Usiamo assertEquals per verificare che le stringhe non siano vuote
        assertEquals(true, asciiX.length() > 0);
        assertEquals(true, asciiL.length() > 0);
        assertEquals(true, asciiC.length() > 0);
        assertEquals(true, asciiD.length() > 0);
        assertEquals(true, asciiM.length() > 0);
    }
}