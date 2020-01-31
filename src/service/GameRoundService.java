package service;

import exception.NoCardInDeck;
import entity.Card;
import entity.Player;

public class GameRoundService {
    public static boolean gameRound ( Player attackPlayer ) {
        Card attackCard = AttackService.attackCard ( attackPlayer );
        Player defensePlayer = GetNextPlayerService.nextPlayer ( attackPlayer );
       boolean isDefended = DefenseService.defense ( attackCard , defensePlayer );
        try {
            FillPlayersDecksService.fill ( attackPlayer );
        } catch (NoCardInDeck e) {
            e.getMessage ( );
        }
        return isDefended;
    }
}

