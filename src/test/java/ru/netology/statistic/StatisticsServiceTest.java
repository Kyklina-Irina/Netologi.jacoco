package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtStart() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 4, 3, 2, 1};
        long expected = 5;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {100};
        long expected = 100;
        long actual = service.findMax(incomes);
        Assertions.assertEquals(expected, actual);
    }
}