package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackerServiceTest {

    @Test
    public void remain() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    public void remain1() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void remain999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void remain0() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }


    }