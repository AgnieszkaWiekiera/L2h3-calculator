package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddAndEvenTest {

    @Test
    void shouldAssume41Odd() {
        //given
        int number = 41;

        //when
        String getEvenOrOdd = AddAndEven.getEvenOrOdd(41);

        //then
        Assertions.assertEquals("nieparzysta", getEvenOrOdd);
    }

    @Test
    void shouldAssume506Even() {
        //given
        int number = 506;

        //when
        String getEvenOrOdd = AddAndEven.getEvenOrOdd(506);

        //then
        Assertions.assertEquals("parzysta", getEvenOrOdd);
    }

}