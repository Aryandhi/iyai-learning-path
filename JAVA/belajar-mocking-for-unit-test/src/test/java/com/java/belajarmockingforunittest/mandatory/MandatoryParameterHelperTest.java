package com.java.belajarmockingforunittest.mandatory;
/* Step By Step membuat mock for unit test
* Mocking
* Stubing
* Verification
* Capturing
* */
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.junit.Rule;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import javax.servlet.http.HttpServletRequest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MandatoryParameterHelperTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Mock
    public HttpServletRequest servletRequest;

    @Test
    void testValid() {

        when(servletRequest.getParameter("username")).thenReturn("Eko");
        when(servletRequest.getParameter("requestId")).thenReturn("Id");

        // object mock
        MandatoryParameter parameter = MandatoryParameterHelper.getMandatoryParameter(servletRequest);

        // dari sisi tester
        assertEquals("Eko", parameter.getUsername());
        assertEquals("Id", parameter.getRequestId());
    }
}