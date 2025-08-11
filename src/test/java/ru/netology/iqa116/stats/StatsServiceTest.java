package ru.netology.iqa116.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void CashSumm() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.GetTotalSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MidSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.MiddleSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.MaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowSumm() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.LowSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.MiddleMonthSalesLow(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void HighMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.MiddleMonthSalesHigh(sales);
        Assertions.assertEquals(expected, actual);
    }
}
