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
        // Arrange
        int number = 1;
        String expectedAscii = 
            " ___ \n" +
            "|_ _|\n" +
            " | | \n" +
            " | | \n" +
            "|___|";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        // Aggiungiamo un trim() per ignorare eventuali spazi vuoti finali che non rovinano il disegno
        assertEquals(expectedAscii.trim(), result.trim());
    }

    @Test
    public void print_ShouldReturnAsciiArtForV_WhenInputIs5() {
        // Arrange
        int number = 5;
        String expectedAscii = 
            "__   __\n" +
            "\\ \\ / /\n" +
            " \\ V / \n" +
            "  | |  \n" +
            "  |_|  ";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expectedAscii.trim(), result.trim());
    }
}