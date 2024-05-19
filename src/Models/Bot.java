package Models;

import Stratergies.BotPlayingStratergy.BotPlayingStratergy;

import javax.swing.*;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStratergy botPlayingStratergy;

    public Bot(Long id, String name, Symbol symbol, PlayerType playerType,
               BotDifficultyLevel botDifficultyLevel, BotPlayingStratergy botPlayingStratergy) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStratergy = botPlayingStratergy;
    }
}
