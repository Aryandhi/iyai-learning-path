package iyai.learning.path.test.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows(){
        // only running di Windows (atau OS yg ditetapkan)
    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testDisabledOnWindows(){
        // tidak bisa running di Windows (atau OS yg ditetapkan)
    }

    @Test
    @EnabledOnJre({JRE.JAVA_14})
    void onlyRunJava14(){
        // hanya bisa running di Java versi 14 (atau versi java yg dipilih)
    }

    @Test
    @DisabledOnJre({JRE.JAVA_14})
    void disabledRunJava14(){
        // tidak bisa running di Java versi 14 (atau versi java yg dipilih)
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    void onlyRunJava11To14(){
        // hanya bisa running di Java versi 11 sampai dengan 14 (atau versi java yg dipilih)
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    void disabledRunJava11To14(){
        // tidak bisa running di Java versi 11 sampai dengan 14 (atau versi java yg dipilih)
    }
}
