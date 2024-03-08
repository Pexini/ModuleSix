package org.example.Hard.SeaBattleGame;

import java.util.Random;

public class Field {
    Random random = new Random();
    private static final int EMPTY = 0;
    private static final int Ship = 1;
    private static final int Hit = 2;
    private static final int Miss = 3;

    private final int[][] grid;
    private int shipRemaining;

    public Field() {  //установили сетку
        grid = new int[SeaBattleGame.ROWS][SeaBattleGame.COLS];
        shipRemaining = 0;
    }

    public void SetupShips() {      //Ставим корабли
        shipRemaining = 10;
        for (int ships = 4; ships >=1 ; ships--) {
            for (int count = 0; count < 5; count++) {
                int x,y;
           do {
               x = random.nextInt(SeaBattleGame.ROWS);
               y = random.nextInt(SeaBattleGame.COLS);
           }while (!canPlaceShip(x, y, ships));

           PlaceShip(x, y, ships);
            }
        }
    }
    private boolean canPlaceShip (int x, int y, int ships) {
        for (int i = 0; i < ships; i++) {
            grid[x][y + 1] = Ship;
            {
                return false;
            }
        }
        return true;
    }

    private void PlaceShip (int x, int y, int ships) {
        for (int i = 0; i < ships; i++) {
            grid[x][y + 1] = Ship;
        }
    }




        }

