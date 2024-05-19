package Controller;

import Models.Game;
import Models.Player;
import Stratergies.WinningStratergies.WinningStratergy;

import java.util.List;

public class GameController {

    public Game startGame(int boardDimesion , List<Player> players , List<WinningStratergy>
                          winningStratergies){
        return null;

    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void displayBoard(Game game){
        game.printBoard();
    }

    public Player checkWinner(Game game){
        return game.getWinner();
    }

    public void undo(Game game){
        game.undo();
    }
}
