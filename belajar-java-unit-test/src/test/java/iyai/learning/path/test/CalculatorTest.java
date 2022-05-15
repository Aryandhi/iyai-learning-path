package iyai.learning.path.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

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

    // untuk validasi apakah pesan error pada divide() yg terdapat di class Calculator berfungsi
    // bila throws error tidak muncul, maka test gagal walaupun hasil operasi perhitungan benar
    @Test
    public void testDivideError(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }
}
