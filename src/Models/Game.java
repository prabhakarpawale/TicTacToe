package Models;

import Stratergies.WinningStratergies.WinningStratergy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    List<Player> players;
    private GameStatus gameStatus;
    private Player winner;
    private int nextMovePlayerIndex;

    private List<Move> moves;

    private List<WinningStratergy> winningStratergies;

    public Game(int dimension , List<Player> players, List<WinningStratergy> winningStratergies) {
        this.board = new Board(dimension);
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.nextMovePlayerIndex =0;
        this.moves = new ArrayList<>();
        this.players = players;
        this.winningStratergies = winningStratergies;
    }

    public List<WinningStratergy> getWinningStratergies() {
        return winningStratergies;
    }

    public void setWinningStratergies(List<WinningStratergy> winningStratergies) {
        this.winningStratergies = winningStratergies;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    /* Action Methods */

    public  void printBoard(){
        board.displayBoard();
    }

    public void undo(){

    }

    public void makeMove(){

    }
}
