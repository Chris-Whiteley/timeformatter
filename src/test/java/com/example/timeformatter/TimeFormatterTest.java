package com.example.timeformatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimeFormatterTest {

    @Test
    public void givenH6M24ReturnsInWords() {
        int h = 6;
        int m = 24;

        TimeFormatter timeFormatter = new TimeFormatter();

        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("twenty four minutes past six", result);
    }

    @Test
    public void givenH6M50ReturnsInWords() {
        int h = 6;
        int m = 50;

        TimeFormatter timeFormatter = new TimeFormatter();

        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("ten minutes to seven", result);
    }

    @Test
    public void givenH6M00returnsInWords() {
        int h = 6;
        int m = 0;

        TimeFormatter timeFormatter = new TimeFormatter();

        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("six o'clock", result);
    }

    @Test
    public void givenH10M30returnsInWords() {
        int h = 10;
        int m = 30;

        TimeFormatter timeFormatter = new TimeFormatter();

        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("half past ten", result);
    }

    @Test
    public void givenH9M15returnsInWords() {
        int h = 9;
        int m = 15;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("quarter past nine", result);
    }

    @Test
    public void givenH6M45returnsInWords() {
        int h = 6;
        int m = 45;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("quarter to seven", result);
    }

    @Test
    public void givenH12M00returnsInWords() {
        int h = 12;
        int m = 0;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("twelve noon", result);
    }

    @Test
    public void givenH11M45returnsInWords() {
        int h = 11;
        int m = 45;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("quarter to noon", result);
    }

    @Test
    public void givenH12M15returnsInWords() {
        int h = 12;
        int m = 15;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("quarter past noon", result);
    }

    @Test
    public void givenH9M01returnsInWords() {
        int h = 9;
        int m = 1;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("one minute past nine", result);
    }

    @Test
    public void givenH9M59returnsInWords() {
        int h = 9;
        int m = 59;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h,m);
        assertEquals("one minute to ten", result);
    }

    // Additional Test Cases

    // 0:00 midnight
    @Test
    public void givenH0M00returnsInWords() {
        int h = 0;
        int m = 0;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h, m);
        assertEquals("midnight", result);
    }

    // 23:59 one minute to midnight
    @Test
    public void givenH23M59returnsInWords() {
        int h = 23;
        int m = 59;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h, m);
        assertEquals("one minute to midnight", result);
    }

    // 0:15 quarter past midnight
    @Test
    public void givenH0M15returnsInWords() {
        int h = 0;
        int m = 15;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h, m);
        assertEquals("quarter past midnight", result);
    }

    // 23:45 quarter to midnight
    @Test
    public void givenH23M45returnsInWords() {
        int h = 23;
        int m = 45;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h, m);
        assertEquals("quarter to midnight", result);
    }

    // 12:01 one minute past noon
    @Test
    public void givenH12M01returnsInWords() {
        int h = 12;
        int m = 1;

        TimeFormatter timeFormatter = new TimeFormatter();
        String result = timeFormatter.convertIntoWords(h, m);
        assertEquals("one minute past noon", result);
    }
}
