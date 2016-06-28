// -----------------------------------------------------------------------------
// Author: Nicolas De Toffoli (https://github.com/ndetoffoli)
// Goal: a Java solution for "ASCII Art" puzzle on CodinGame (https://www.codingame.com)
// -----------------------------------------------------------------------------


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    public static void main(String args[]) {
        // Read input parameters
        Scanner in = new Scanner(System.in);
        final int L = in.nextInt();
        // System.err.println("L = " + L);

        in.nextLine();
        final int H = in.nextInt();
        // System.err.println("H = " + H);

        in.nextLine();
        final String T = in.nextLine().toLowerCase();
        // System.err.println("T = " + T);

        // Build the map of ASCII letters
        TreeMap map = new TreeMap();

        // Parse the input to build the map of ASCII letters
        final char[] allChars = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ?").toLowerCase().toCharArray();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            for (int j = 0; j < allChars.length; j++) {
                // Get current char
                String currentChar = "" + allChars[j];
                // System.err.println("Parsing letter  " + currentChar + " - #" + i);

                // Get current line
                String line = ROW.substring(j * L, j * L + L);
                // System.err.println("line =  " + line);

                // Store current line in the ASCII letter
                Vector asciiLetter = (Vector) map.get(currentChar);
                if (asciiLetter == null) {
                    asciiLetter = new Vector(H);
                    asciiLetter.add(line);
                    map.put(currentChar, asciiLetter);
                }
                else {
                    asciiLetter.add(line);
                    // System.err.println("asciiLetter = " + asciiLetter);
                }
            }
        }

        // Display the text in ASCII art, first by line, then by character
        for (int lineIndex = 0; lineIndex < H; lineIndex++) {
            for (int letterIndex = 0; letterIndex < T.length(); letterIndex++) {
                // Get current letter
                String currentLetter = T.substring(letterIndex, letterIndex+1);

                // Check the current letter is known and get its ASCII letter
                Vector asciiLetter = (Vector) map.get(currentLetter);
                if (asciiLetter == null) {
                    asciiLetter = (Vector) map.get("?");
                }

                // Display the current line of current ASCII letter
                // System.err.println("asciiLetter = " + asciiLetter);
                System.out.print(asciiLetter.get(lineIndex));

                // Insert a carriage return if this is last letter
                if (letterIndex == T.length() - 1) {
                    System.out.println("");
                }
            }
        }
    }
}
