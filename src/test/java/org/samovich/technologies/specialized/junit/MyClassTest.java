/**
 * @file MyClassTest.java
 * @author Valery Samovich
 * @version 2
 * @date 2015/02/03
 */

package org.samovich.technologies.specialized.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    
    @Test (expected  = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        MyClass tester = new MyClass();
        tester.myltiply(1000, 5);
    }
    
    @Test
    public void testMyltiply() {
        MyClass tester = new MyClass();
        assertEquals("10 x 5 must be 50", 50, tester.myltiply(10, 5));
    }
    
}
