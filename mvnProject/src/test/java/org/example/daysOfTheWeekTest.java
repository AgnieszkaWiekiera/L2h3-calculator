package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class daysOfTheWeekTest {

    @Test
    void shouldName1Day() {
        //given
        int dayNumber = 1;

        //when
        String printDayOfWeek = daysOfTheWeek.printDayOfWeek(1);

        //then
        Assertions.assertEquals("Monday", printDayOfWeek);
    }

    @Test
    void shouldName11Day() {
        //given
        int dayNumber = 11;

        //when
        String printDayOfWeek = daysOfTheWeek.printDayOfWeek(11);

        //then
        Assertions.assertEquals("There is no such a day!", printDayOfWeek);
    }
}