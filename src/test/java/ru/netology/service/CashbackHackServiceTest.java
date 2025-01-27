package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {

        int actual = service.remain(1500);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain3() {

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain4() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}