package com.pairgood;

import java.util.ArrayList;
import java.util.List;

public class ConnectFour{

    List<List<String>> board;

    public ConnectFour(){
        board = new ArrayList<>();

        List<String> rowOne = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowOne.add("O");
        }

        List<String> rowTwo = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowTwo.add("O");
        }

        List<String> rowThree = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowThree.add("O");
        }

        List<String> rowFour = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowFour.add("O");
        }

        List<String> rowFive = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowFive.add("O");
        }

        List<String> rowSix = new ArrayList<>();

        for(int i = 0 ; i < 7; i++){
            rowSix.add("O");
        }

        board.add(rowOne);
        board.add(rowTwo);
        board.add(rowThree);
        board.add(rowFour);
        board.add(rowFive);
        board.add(rowSix);
    }

    public void place(String player, String column) {
        for (List<String> row : board) {
            
        }
    }

    public String check() {
        String output = "";
        for (List<String> row : board) {
           for(String value : row){
               output += value;
           }
           output += "\n";
        }
        return output;
    }
}
