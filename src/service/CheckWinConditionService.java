package service;

import game.PrepareGame;
import entity.Player;

public class CheckWinConditionService {
    public static boolean checkWinCondition ( Player winPlayer ) {
        return PrepareGame.fullDeck.isEmpty ()  && winPlayer.getPlayerDeck ( ).isEmpty ();
    }
}
