package com.zhazhapan.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author pantao
 */
public class UtilsTest {

    private int[] test1 = {78, 56, 34, 23, 12, 1};

    private int[] test2 = {45, 33, 32, 23, 22, 13};

    private int[] test3 = {1, 2, 4, 6, 9};

    private int[] test4 = {3, 5, 7, 8};

    @Test
    public void testGetCurrentDate() {
        System.out.println(DateUtils.getCurrentMonth());
    }

    @Test
    public void testNumberExtract() {
        String s1 = "+.12   3";
        String s2 = "+ab12.c123  ";
        String s3 = "+0.c123";
        String s4 = "   +89h.7.123";
        String s5 = "afda.afaa";
        String s6 = "-.abca";
        String s7 = "-.1   2-3";
        String s8 = "-8afa232.123";
        String s9 = "-0.123";
        assertTrue(123 == Utils.extractInt(s1));
        assertTrue(12123 == Utils.extractInt(s2));
        assertTrue(0.123 == Utils.extractDouble(s3));
        assertTrue(897.123 == Utils.extractDouble(s4));
        assertTrue("".equals(Utils.extractDigit(s5)));
        assertTrue("".equals(Utils.extractDigit(s6)));
        assertTrue(-0.123 == Utils.extractDouble(s7));
        assertTrue(-8232123 == Utils.extractInt(s8));
        assertTrue(-0.123f == Utils.extractFloat(s9));
    }

    @Test
    public void testConcatArrays() {
        int[] nums = ArrayUtils.concatArrays(test1, test2, test4, test3);
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void testGetMaxValue() {
        int[] test1 = {1, 2, 3, 2, 123, 34};
        assertEquals(123, Utils.getMaxValue(test1));
    }

    @Test
    public void trim() {
    }

    @Test
    public void leftTrim() {
    }

    @Test
    public void rightTrim() {
    }

    @Test
    public void getCurrentOS() {
    }

    @Test
    public void extractDouble() {
    }

    @Test
    public void extractFloat() {
    }

    @Test
    public void extractShort() {
    }

    @Test
    public void extractLong() {
    }

    @Test
    public void extractInt() {
    }

    @Test
    public void extractDigit() {
    }

    @Test
    public void maxLengthString() {
    }

    @Test
    public void copyToClipboard() {
    }

    @Test
    public void openLink() {
    }

    @Test
    public void openFile() {
    }

    @Test
    public void openFile1() {
    }

    @Test
    public void run() {
    }

    @Test
    public void getCurrentWorkDir() {
        System.out.println(Utils.getCurrentWorkDir());
    }

    @Test
    public void getMaxValue() {
    }
}
