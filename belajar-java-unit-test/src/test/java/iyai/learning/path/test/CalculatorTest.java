package iyai.learning.path.test;

import iyai.learning.path.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private Calculator calculator = new Calculator();
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each");
    }

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

    @Test
    void testAborted(){
        var profile = System.getenv("PROFILE");
        if(!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }

        /*
        * TestAborted hampir mirip dg @Disabled
        * bila @Disabled, kita otomatis skiped unit test tsb
        * tetapi pada TestAborted, akan dilakukan pengecekan terlebih dulu,
        * ketika kondisi false, maka unit test dibatalkan
        */
    }

}
