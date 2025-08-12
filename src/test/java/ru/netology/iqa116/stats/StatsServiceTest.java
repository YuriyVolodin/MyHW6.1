package ru.netology.iqa116.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void cashsumm() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.GetTotalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void midsumm() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.MiddleSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxsumm() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long actual = service.MaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowsumm() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.LowSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowmiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.MiddleMonthSalesLow(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void highmiddle() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.MiddleMonthSalesHigh(sales);
        Assertions.assertEquals(expected, actual);
    }
}
