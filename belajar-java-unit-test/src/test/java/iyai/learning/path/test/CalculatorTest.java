package iyai.learning.path.test;

import iyai.learning.path.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
//@DisplayName("Test Calculator class")
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    //@DisplayName("untuk test skenario sukses method add(Integer, Integer)")
    @Test
    public void testAddSuccess(){
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess(){
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    @Disabled
    public void testDivideError(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }
}
