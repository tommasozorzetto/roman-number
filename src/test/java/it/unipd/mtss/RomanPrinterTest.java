/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {

    @Test
    public void print_ShouldReturnAsciiArtForI_WhenInputIs1() {
        int number = 1;
        String expectedAscii = 
            " ___ \n" +
            "|_ _|\n" +
            " | | \n" +
            " | | \n" +
            "|___|";

        String result = RomanPrinter.print(number);

        // Rimuoviamo tutti gli spazi e a capo per un confronto infallibile sui caratteri
        assertEquals(
            expectedAscii.replaceAll("\\s+", ""), 
            result.replaceAll("\\s+", "")
        );
    }

    @Test
    public void print_ShouldReturnAsciiArtForV_WhenInputIs5() {
        int number = 5;
        String expectedAscii = 
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  | |  \n" +
            "  |_|  ";

        String result = RomanPrinter.print(number);

        assertEquals(
            expectedAscii.replaceAll("\\s+", ""), 
            result.replaceAll("\\s+", "")
        );
    }
}