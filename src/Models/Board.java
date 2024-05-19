package Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int size) {
        this.dimension = size;
        board = new ArrayList<>();

        for(int i=0;i<size;++i){
            board.add(new ArrayList<>());

            for(int j=0;j<size;++j){
                board.get(i).add(new Cell(i,j));
            }
        }

    }

    public void displayBoard() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                Cell cell = board.get(i).get(j);
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("|" + cell.getPlayer().getSymbol().getSymbol() + "|");
                }
            }
            System.out.println();
        }
    }
}
