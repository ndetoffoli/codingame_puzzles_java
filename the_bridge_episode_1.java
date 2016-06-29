// -----------------------------------------------------------------------------
// Author: Nicolas De Toffoli (https://github.com/ndetoffoli)
// Goal: a Java solution for "The Bridge - Episode 1" puzzle on CodinGame (https://www.codingame.com)
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
        int road = in.nextInt(); // the length of the road before the gap.
        // System.err.println("road = " + road);
        int gap = in.nextInt(); // the length of the gap.
        // System.err.println("gap = " + gap);
        int platform = in.nextInt(); // the length of the landing platform.

        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.
            // System.err.println("speed = " + speed);

            // Compute the command
            String command = "";
            if (coordX < road - 1) {
                if (speed < gap + 1) {
                    command = "SPEED";
                }
                else if (speed > gap + 1) {
                    command = "SLOW";
                }
                else {
                    command = "WAIT";
                }
            }
            else if (coordX < road + gap) {
                command = "JUMP";
            }
            else {
                command = "SLOW";
            }

            // Give the command
            System.out.println(command);
        }
    }
}
