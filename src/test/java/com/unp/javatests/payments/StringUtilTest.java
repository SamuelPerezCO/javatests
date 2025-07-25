package com.unp.javatests.payments;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void test_string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("marcos"));
    }

    @Test
    public void empty_quote_is_string_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_string_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_spaces_is_string_empty(){
        assertTrue(StringUtil.isEmpty(" "));
    }
}