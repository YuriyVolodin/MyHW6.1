package ru.netology.iqa116.stats;

public class StatsService {
    public int GetTotalSales(long[] sales) {


        long total = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= 180);{
            total += sales[i];}
        }
        return (int) total;
    }

    public int MiddleSales(long[] sales) {
        long total1 = 0;
        long total = GetTotalSales(sales);
        total1 = total / (sales.length);
        return (int) total1;
    }

    public int MaxSales(long[] sales) {
        int HighMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[HighMonth]){
                HighMonth = i;}
        }
        return HighMonth + 1;
    }

    public int LowSales(long[] sales) {
        int LowMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[LowMonth]){
                LowMonth = i;}
        }
        return LowMonth + 1;
    }

    public long MiddleMonthSalesLow(long[] sales) {
        long total = GetTotalSales(sales);
        long total1 = total / sales.length;
        long count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < total1){
                count++;}
        }
        return (int) count;
    }

    public int MiddleMonthSalesHigh(long[] sales) {
        long total = GetTotalSales(sales);
        long total1 = total / sales.length;
        long count1 = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > total1){
                count1++;}
        }
        return (int) count1;
    }
}



