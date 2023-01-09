package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2H4ageconfirmTest {

    @Test
    void shoulDonateBlood() {
        //given
        int userAge = 20;

        //when
        String printPermission = L2H4ageconfirm.printPermission(20);

        //then
        Assertions.assertEquals("Pełnoletni", printPermission);
    }
}