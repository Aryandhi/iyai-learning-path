package iyai.learning.path.test.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

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
}
