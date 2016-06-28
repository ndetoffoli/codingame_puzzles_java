// -----------------------------------------------------------------------------
// Author: Nicolas De Toffoli (https://github.com/ndetoffoli)
// Goal: a Java solution for "Power of Thor - Episode 1" puzzle on CodinGame (https://www.codingame.com)
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
        // Read input parameters
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position

        // Compute the distance to the light
        int DX = TX - LX;
        int DY = TY - LY;
        System.err.println("dX = " + DX);
        System.err.println("dY = " + DY);

        // Compute the common path for both X and Y
        Vector path = new Vector();
        int commonDelta = Math.min(Math.abs(DX), Math.abs(DY));
        for (int i = 0; i < commonDelta; i++) {
            String direction = "";

            // Check Y distance
            if (DY > 0) {
                direction += "N";
            }
            else if (DY < 0) {
                direction += "S";
            }

            // Check X distance
            if (DX > 0) {
                direction += "W";
            }
            else if (DX < 0) {
                direction += "E";
            }

            // Store the direction
             path.add(direction);
        }

        // Compute the specific path for Y
        for (int j = commonDelta; j < Math.abs(DY); j++) {
            String direction = "";

            // Check Y distance
            if (DY > 0) {
                direction += "N";
            }
            else if (DY < 0) {
                direction += "S";
            }

            // Store the direction
             path.add(direction);
        }

        // Compute the specific path for X
        for (int j = commonDelta; j < Math.abs(DX); j++) {
            String direction = "";

            // Check X distance
            if (DX > 0) {
                direction += "W";
            }
            else if (DX < 0) {
                direction += "E";
            }

            // Store the direction
             path.add(direction);
        }
        System.err.println("path = " + path);

        // Game loop
        int index = 0;
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.

            // Print the direction
            System.out.println((String) path.get(index)); // A single line providing the move to be made: N NE E SE S SW W or NW
            index++;
        }
    }
}
