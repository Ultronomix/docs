package com.revature.tictactoe;

public class Main {
    Solution solution = new Solution();
    public static void main(String[] args) {

        char[][] Board = {
                {'_','|','_','|','_'},
                {'_','|','_','|','_'},
                {' ','|',' ','|',' '}
        };

        printBoard(Board);
    }


    public static void printBoard(char [][] gameBoard){

        for(char[] row : gameBoard){
            for( char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

}

