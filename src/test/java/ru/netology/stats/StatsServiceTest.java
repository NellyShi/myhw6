package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long[] salesSecondVariant = {12, 14, 21, 25, 18, 6, 33, 30, 11, 8, 10, 16};

    @Test
    public void sumSalesTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.sumSales(sales);
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.averageSales(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSalesTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.maxMonthSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSalesTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.minMonthSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthLessAverageTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.numberMonthLessAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthMoreAverageTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.numberMonthMoreAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sumSalesSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.sumSales(salesSecondVariant);
        long expected = 204;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.averageSales(salesSecondVariant);
        long expected = 17;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxMonthSalesSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.maxMonthSales(salesSecondVariant);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMonthSalesSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.minMonthSales(salesSecondVariant);
        long expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthLessAverageSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.numberMonthLessAverage(salesSecondVariant);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthMoreAverageSecondVariantTest() {
        StatsService statsService = new StatsService();
        long actual = statsService.numberMonthMoreAverage(salesSecondVariant);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
