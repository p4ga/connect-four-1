package com.pairgood;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConnectFourTest {

    @Test
    public void place_WhenTokenPlacedInColumnB_ThenTokenShouldEndUpInRowOne(){
        ConnectFour game = new ConnectFour();
        String player = "Y";
        int column = 2;

        String expectedBefore =
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n";

        String expectedAfter =
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OOOOOOO\n" +
                "OYOOOOO\n";

        //Given
        assertEquals(expectedBefore, game.check());

        //When
        game.place(player, column);

        //Then
        assertEquals(expectedAfter, game.check());

    }
}
