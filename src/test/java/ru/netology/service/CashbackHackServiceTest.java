package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLess1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(500);
        int actual = 500;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1000);
        int actual = 0;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(1500);
        int actual = 500;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(0);
        int actual = 1000;
        Assert.assertEquals(expected, actual);

    }

}
