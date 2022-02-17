package test.java;


import main.java.Question03;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;

public class Question03Test {

    @Test
    public void verifyAnagramsPairsTest (){
        assertEquals(3, new Question03(new Scanner(new ByteArrayInputStream(
                "ifailuhkqq\n".getBytes()))).verifyAnagramsPairs());
    }
}
