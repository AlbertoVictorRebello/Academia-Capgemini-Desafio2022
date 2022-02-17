package main.java;

import java.util.Arrays;
import java.util.Scanner;

/*
Scale definition sample:
Input: n = 6
Output:
     *
    **
   ***
  ****
 *****
******
Process finished with exit code 0
 */
public class Question01 {
    private final Scanner scanner;

    public Question01(Scanner scanner){
        this.scanner = scanner;
    }

    public static void main(String[] args) {

        int n = new Question01(new Scanner(System.in)).scaleNumberInput();

        if (n < 0) {
            throw new NumberFormatException("No valid integer detected. The application will be finished.");
        }

        // A line representation filled with n spaces
        char[] line = new char[n];
        Arrays.fill(line, ' ');

        // Each line is printed in accordance with the scale definition.
        for (int i = line.length - 1; i >= 0 ;i-- ) {
            line[i] = '*';
            System.out.print(line);
            if (i > 0) System.out.println();
        }
    }

    public int scaleNumberInput() {
        // n receives the scale dimension.
        System.out.println("Please, inform the scale number:");
        try {
            return scanner.nextInt();

        } catch (Exception e) {
            return -1;
        }
    }
}