package service;

import game.PrepareGame;
import entity.Player;

public class GetNextPlayerService {
    public static Player nextPlayer ( Player currentPlayer ) {
        Player next = currentPlayer;
        switch (currentPlayer.getPlayerName ( )) {
            case "Player1":
                next = PrepareGame.player2;
                break;
            case "Player2":
                next = PrepareGame.player3;
                break;
            case "Player3":
                next = PrepareGame.player4;
                break;
            case "Player4":
                next = PrepareGame.player1;
                break;
        }
        return next;
    }
}
