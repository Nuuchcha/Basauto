package ru.netology.service;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void checkingLimitValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void checkingBoudaryValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void checkingForeignValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

}