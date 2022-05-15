package com.java.belajarmockingforunittest.mandatory;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
//import org.junit.Rule;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;

class MandatoryParameterHelperTest {
//    @Rule
//    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Mock
    public HttpServletRequest servletRequest;

    @Test
    void testValid() {
        MandatoryParameter parameter = MandatoryParameterHelper.getMandatoryParameter(servletRequest);

        // dari sisi tester
        assertEquals("Eko", parameter.getUsername());
        assertEquals("Id", parameter.getRequestId());
    }
}