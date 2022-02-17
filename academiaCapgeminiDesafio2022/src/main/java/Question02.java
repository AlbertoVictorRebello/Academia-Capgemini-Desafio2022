package main.java;

import java.util.Scanner;

public class Question02 {
    private Scanner scanner;

    public Question02(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        System.out.println("Please, inform your password to be validated:");
        System.out.print(new Question02 (new Scanner(System.in)).verifyPasswordLength());

    }

    public static boolean verifyAllPasswordPolicies(String password) {
        final String REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-+]).{6,}$";
        final int   MIN_PASSWORD_LENGTH = 6;

        if (password.length() < 6) {
            return false;
        } else {
            return password.matches(REGEX);
        }

    }

    public int verifyPasswordLength() {
        // The minimum quantity of missing characters is checked and printed
        String password = inputPassword();
        if (password.length() < 6) {
             return (6 - password.length());
        } else {
            return 0;
        }
    }

    public String inputPassword() {
        // The password is received by the String variable password
        return scanner.nextLine();
    }

}
