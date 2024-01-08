package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSales(long[] sales){
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int maxMonthSales(long[] sales){
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int numberMonthLessAverage(long[] sales){
        int result = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                result = result + 1;
            }
        }
        return result;
    }

    public int numberMonthMoreAverage(long[] sales){
        int result = 0;
        long averageSales = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                result = result + 1;
            }
        }
        return result;
    }
}
