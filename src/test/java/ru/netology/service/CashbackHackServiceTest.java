package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLess1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = 500;
        int expected = service.remain(500);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemain1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = 0;
        int expected = service.remain(1000);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = 500;
        int expected = service.remain(1500);
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainZero() {
        CashbackHackService service = new CashbackHackService();

        int actual = 1000;
        int expected = service.remain(0);
        Assert.assertEquals(actual, expected);

    }

}
