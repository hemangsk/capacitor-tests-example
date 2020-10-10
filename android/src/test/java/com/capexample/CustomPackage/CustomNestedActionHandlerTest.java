package com.capexample.CustomPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomNestedActionHandlerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void nullDoesNotEqualNull() {
        assertNotNull(null);
    }

    @Test
    public void emptyStringEqualsNull() {
        assertNull("");
    }
}