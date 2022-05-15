package iyai.learning.path.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess(){
        var result = calculator.add(10, 10);

        if(result != 20){
            throw new RuntimeException("Test Gagal");
        }
    }
}
