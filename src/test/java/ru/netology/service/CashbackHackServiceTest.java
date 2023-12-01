package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void checkingLimitValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void checkingBoudaryValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void checkingForeignValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}