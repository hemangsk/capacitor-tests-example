package com.capexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomActionHandlerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void thisShallPass() {
        assertEquals(true, true);
    }

    @Test
    public void thisShallTooPass() {
        assertEquals(2+6, 8);
    }

    @Test
    public void thisWillFail() {
        assertFalse(false);
    }
}