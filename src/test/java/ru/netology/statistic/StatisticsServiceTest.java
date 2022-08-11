package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMa() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 11, 11, 12, 156, 235235, 999999};
        long expected = 999999;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
//    @Test
//    void findM() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {18, 9, 80, 13, 5, 7, 0, 63, 35, 8};
//        long expected = 80;
//
//        long actual = service.findMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }
}
