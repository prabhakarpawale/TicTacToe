package Stratergies.BotPlayingStratergy;

import Models.Board;
import Models.Move;

public interface BotPlayingStratergy {
    Move makeMove(Board board);
}
