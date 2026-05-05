/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", 
                                 "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Scorriamo tutti i valori disponibili dal più grande al più piccolo
        for (int i = 0; i < values.length; i++) {
            // Finché il numero da convertire è maggiore o uguale al valore corrente
            while (number >= values[i]) {
                // aggiungi il simbolo romano al risultato
                result.append(romanSymbols[i]);
                // sottrai il valore dal numero di partenza
                number -= values[i];
            }
        }

        return result.toString();
    }
}
