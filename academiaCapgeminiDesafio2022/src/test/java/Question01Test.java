package test.java;

import main.java.Question01;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class Question01Test {

    @Test
    public void scaleNumerInputValidInputTest (){
        assertEquals(6, new Question01(new Scanner(new ByteArrayInputStream(
                "6\n".getBytes()))).scaleNumberInput());
    }

    @Test
    public void scaleNumerInputInvalidInputTest (){
        assertEquals(-1, new Question01(new Scanner(new ByteArrayInputStream(
                "n = 6\n".getBytes()))).scaleNumberInput());

        assertEquals(-1, new Question01(new Scanner(new ByteArrayInputStream(
                "n = \n".getBytes()))).scaleNumberInput());

        assertEquals(-1, new Question01(new Scanner(new ByteArrayInputStream(
                "$ \n".getBytes()))).scaleNumberInput());
    }
}

