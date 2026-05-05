/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @Test
    public void convert_ShouldReturnI_WhenInputIs1() {
        // Arrange
        int number = 1;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void convert_ShouldReturnXIV_WhenInputIs14() {
        // Arrange
        int number = 14;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("XIV", result);
    }

    @Test
    public void convert_ShouldReturnM_WhenInputIs1000() {
        // Arrange
        int number = 1000;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("M", result);
    }
    
    @Test
    public void convert_ShouldReturnDCCCLXXXVIII_WhenInputIs888() {
        int number = 888;
        String result = IntegerToRoman.convert(number);
        
        // Assert classico
        assertEquals("DCCCLXXXVIII", result);
    }

    @Test
    public void convert_ShouldThrowException_WhenInputIsZeroOrLess() {
        // Arrange
        int number = 0;
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(number);
        });
    }

    @Test
    public void convert_ShouldThrowException_WhenInputIsGreaterThan1000() {
        // Arrange
        int number = 1001;
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(number);
        });
    }
}