package com.zerkov.leetcode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MainTest {

    @Test
    void testReverseString(){
        Main main = new Main();
        assertEquals("olleh", main.reverseString("hello"), "Should reverse 'hello' to 'olleh'");
        assertEquals("", main.reverseString(""), "Empty string should return empty");
        assertNull(main.reverseString(null), "Null input should return null");
    }

}
