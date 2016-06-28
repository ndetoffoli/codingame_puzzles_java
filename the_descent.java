// -----------------------------------------------------------------------------
// Author: Nicolas De Toffoli (https://github.com/ndetoffoli)
// Goal: a Java solution for "The Descent" puzzle on CodinGame (https://www.codingame.com)
// -----------------------------------------------------------------------------


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            // Get the heighest mountain
            int maxHeight = 0;
            int heighestMountainIndex = -1;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0.

                // Update the heighest mountain if needed
                if (mountainH > maxHeight) {
                    maxHeight = mountainH;
                    heighestMountainIndex = i;
                }
            }

            // Shoot the heighest mountain
            System.out.println(heighestMountainIndex);
        }
    }
}
