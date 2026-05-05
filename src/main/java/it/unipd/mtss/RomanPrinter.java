/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder[] asciiRows = new StringBuilder[5];
        for (int i = 0; i < 5; i++) {
            asciiRows[i] = new StringBuilder();
        }

        for (char c : romanNumber.toCharArray()) {
            String[] asciiLetter = getAsciiLetter(c);
            for (int i = 0; i < 5; i++) {
                // Aggiunge la riga della lettera e due spazi di separazione
                asciiRows[i].append(asciiLetter[i]).append("  ");
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            result.append(asciiRows[i].toString());
            if (i < 4) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    private static String[] getAsciiLetter(char c) {
        switch (c) {
            case 'I':
                return new String[]{
                    " ___ ",
                    "|_ _|",
                    " | | ",
                    " | | ",
                    "|___|"
                };
            case 'V':
                return new String[]{
                    "__   __",
                    "\\ \\ / /",
                    " \\ V / ",
                    "  | |  ",
                    "  |_|  "
                };
            case 'X':
                return new String[]{
                    " __  __ ",
                    " \\ \\/ / ",
                    "  >  <  ",
                    " / /\\ \\ ",
                    "/_/  \\_\\"
                };
            case 'L':
                return new String[]{
                    " _     ",
                    "| |    ",
                    "| |    ",
                    "| |___ ",
                    "|_____|"
                };
            case 'C':
                return new String[]{
                    "  ____ ",
                    " / ___|",
                    "| |    ",
                    "| |___ ",
                    " \\____|"
                };
            case 'D':
                return new String[]{
                    " ____  ",
                    "|  _ \\ ",
                    "| | | |",
                    "| |_| |",
                    "|____/ "
                };
            case 'M':
                return new String[]{
                    " __  __ ",
                    "|  \\/  |",
                    "| |\\/| |",
                    "| |  | |",
                    "|_|  |_|"
                };
            default:
                return new String[]{"     ", "     ", "     ", "     ", "     "};
        }
    }
}