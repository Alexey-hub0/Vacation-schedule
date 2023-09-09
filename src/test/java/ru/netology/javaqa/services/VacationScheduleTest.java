package ru.netology.javaqa.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class VacationScheduleTest {

    @Test
    void calculateScheduleCase1() {
        VacationScheduleService service = new VacationScheduleService();


        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateScheduleCase2() {
        VacationScheduleService service = new VacationScheduleService();


        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }

}