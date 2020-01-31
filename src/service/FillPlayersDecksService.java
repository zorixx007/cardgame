package service;

import exception.NoCardInDeck;
import entity.Player;

public class FillPlayersDecksService {
    public static void fill ( Player current ) throws NoCardInDeck {
        for (int i = 0; i < 4; i++) {
            while (current.getPlayerDeck ( ).size ( ) < 6) {
                GetCardFromFullDeckService.addCardToPlayerDeck ( current );
            }
            current = GetNextPlayerService.nextPlayer ( current );
        }
    }

}
