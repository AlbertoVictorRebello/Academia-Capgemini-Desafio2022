package main.java;

import java.util.Scanner;

public class Question03 {
    private Scanner scanner;

    public Question03(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        System.out.println(new Question03(new Scanner(System.in)).verifyAnagramsPairs());
    }

    public int verifyAnagramsPairs() {
        String input;
        StringBuilder substring1 = new StringBuilder();
        StringBuilder substring2 = new StringBuilder();
        StringBuilder crashableSubstring1 = new StringBuilder();
        int lastIndex;
        int pairs = 0;
        boolean fail = false;

        // Input variable receives the string to be checked
        input = scanner.nextLine();

        // Two nested for-loop structures to walk through over all possible the substrings lengths of the input
        for (int f = 1; f <=  input.length() ; f++) {
            for (int s = 0; s < input.length() && s + f <= input.length(); s++) {
                // Substring1 variable receives the first segment to be checked
                substring1 = new StringBuilder(input.substring(s, s + f));
                // As far the segment to be checked reaches the max length, the final check is applied over the whole input
                if (substring1.length() == input.length()) {
                    lastIndex = 0;
                    lastIndex =  input.indexOf(substring1.reverse().toString(), lastIndex);
                    if (lastIndex >= 0) {
                        pairs ++;
                    }
                } else {
                    // Preparing the lastIndex variable to start 1 position after the actual substring1
                    lastIndex = s + 1;
                    fail = false;
                    while (lastIndex > 0 && lastIndex + substring1.length() <= input.length() && fail == false) {
                        // The substring2 variable holds all afterward segments with the same actual length of substring1
                        substring2 = new StringBuilder (input.substring(lastIndex, lastIndex + substring1.length()));
                        // Substring1 and substring2 shall be different for segments that are greater than 2 characters
                        if (substring1.length() > 1 && substring1.equals(substring2)) {
                            fail = true;
                        } else {
                            // Both substring 1 and 2 shall have the same letters ordered differently
                            crashableSubstring1 = new StringBuilder(substring1);

                            for (int i = 0; i < substring2.length(); i++) {
                                int crashPosition = crashableSubstring1.toString().indexOf(substring2.charAt(i));
                                if (crashPosition < 0) {
                                    fail = true;
                                } else {
                                    crashableSubstring1.replace(crashPosition, crashPosition + 1, " ");
                                }
                            }
                            if (!fail) {
                                pairs ++;
                            }
                        }
                        lastIndex++;
                        fail = false;
                    }
                }
            }
        }
        return pairs;
    }
}