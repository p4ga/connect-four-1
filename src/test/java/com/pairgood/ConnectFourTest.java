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


    @Test
    public void place_ScratchPad(){
        ConnectFour game = new ConnectFour();
        String playerOne = "Y";
        int column = 2;


        String expectedAfter =
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "OOOOOYO\n" +
                        "YOOOOYO\n" +
                        "YOOOOYO\n";

        //When
        game.place(playerOne, 1);
        game.place(playerOne, 1);

        game.place(playerOne, 6);
        game.place(playerOne, 6);
        game.place(playerOne, 6);

        //Then
        assertEquals(expectedAfter, game.check());

    }

    @Test
    public void check_forFourInHorizontalRow(){
        ConnectFour game = new ConnectFour();
        String playerOne = "Y";
        int column = 2;


        String expectedAfter =
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "YYYYOOO\n";

        //When
        game.place(playerOne, 1);
        game.place(playerOne, 2);
        game.place(playerOne, 3);
        game.place(playerOne, 4);

        //Then
        assertEquals(expectedAfter, game.check());

    }
    @Test
    public void check_forFourInVerticalRow(){
        ConnectFour game = new ConnectFour();
        String playerOne = "Y";
        int column = 2;


        String expectedAfter =
                        "OOOOOOO\n" +
                        "OOOOOOO\n" +
                        "YOOOOOO\n" +
                        "YOOOOOO\n" +
                        "YOOOOOO\n" +
                        "YOOOOOO\n";

        //When
        game.place(playerOne, 1);
        game.place(playerOne, 1);
        game.place(playerOne, 1);
        game.place(playerOne, 1);

        //Then
        assertEquals(expectedAfter, game.check());

    }
}