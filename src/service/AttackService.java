package service;

import entity.Card;
import entity.Player;

public class AttackService {
    public static Card attackCard ( Player player ) {
        System.out.println ( player.getPlayerDeck ( ) );
        Card attackCard = player.getPlayerDeck ( ).get ( 0 );
        player.removeCardFromPlayerDeck ( attackCard );
        System.out.println ( player.getPlayerName ( ) + " attacks with " + attackCard + "\n" );
        return attackCard;
    }
}
