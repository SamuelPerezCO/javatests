package com.unp.javatests;

import com.unp.javatests.util.PasswordUtil;
import org.junit.Test;

import static org.junit.Assert.*;
import static com.unp.javatests.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {


    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK , PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK , PasswordUtil.assessPassword("abcdefghjk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUM , PasswordUtil.assessPassword("abcd12345"));
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_symbols(){
        assertEquals(STRONG , PasswordUtil.assessPassword("abcd123!"));
    }

}