package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void testRemain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual,expected);

    }

    @Test
    public void remain1() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual,expected);

    }
    @Test
    public void remain999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual,expected);
    }

    @Test
    public void remain0() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected,actual);

    }


}