package test.java;


import main.java.Question02;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Question02Test {

    @Test
    public void verifyPasswordLengthTest (){
        assertEquals(0, new Question02(new Scanner(new ByteArrayInputStream(
                "123456\n".getBytes()))).verifyPasswordLength());

        assertEquals(6, new Question02(new Scanner(new ByteArrayInputStream(
                "\n".getBytes()))).verifyPasswordLength());

    }

    @Test
    public void verifyPoliciesForAnInvalidPassword (){

        assertEquals(false,  Question02.verifyAllPasswordPolicies("Aa@45"));

        assertEquals(false,  Question02.verifyAllPasswordPolicies("Aa-45"));

    }

    @Test
    public void verifyPoliciesForAValidPassword (){
        assertEquals(true,  Question02.verifyAllPasswordPolicies("Aa@456"));

        assertEquals(6, new Question02(new Scanner(new ByteArrayInputStream(
                "\n".getBytes()))).verifyPasswordLength());

    }
}
