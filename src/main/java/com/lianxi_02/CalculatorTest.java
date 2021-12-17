package com.lianxi_02;

import org.junit.Test;

/**
 * @author wq
 * @since 2021-12-17 14:05
 */

public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int add = c.add(1, 2);
        System.out.println(add);
    }
}
