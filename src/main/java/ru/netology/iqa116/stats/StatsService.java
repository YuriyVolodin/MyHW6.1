package ru.netology.iqa116.stats;

public class StatsService {
    public int GetTotalSales(int[] sales) {


        int allmoney = 0;
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= 180) ;
            total += sales[i];
        }
        return total;
    }

    public int MiddleSales(int[] sales) {
        int total1 = 0;
        int total = GetTotalSales(sales);
        total1 = total / (sales.length);
        return (int) total1;
    }

    public int MaxSales(int[] sales) {
        int HighMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[HighMonth])
                HighMonth = i;
        }
        return HighMonth + 1;
    }
    public int LowSales(int[] sales) {
        int LowMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[LowMonth])
                LowMonth = i;
        }
        return LowMonth + 1;
    }
    public int MiddleMonthSalesLow (int[] sales) {
        int total = GetTotalSales(sales);
        int total1 = total / sales.length;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < total1)
                count++;
        }
        return count;
    }
    public int MiddleMonthSalesHigh (int[] sales) {
        int total = GetTotalSales(sales);
        int total1 = total / sales.length;
        int count1 = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > total1)
                count1++;
        }
        return count1;
    }
}



