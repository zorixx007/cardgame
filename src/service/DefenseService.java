package service;

import entity.Card;
import entity.Player;
import utils.SortByCost;

public class DefenseService {
    public static boolean defense ( Card attackCard , Player defensePlayer ) {
        boolean isDefended = false;
        defensePlayer.sortPlayerDeck ( );
        System.out.println ( defensePlayer.getPlayerDeck ( ) );
        Card defenseCard = null;
        SortByCost comparator = new SortByCost ( );
        for (Card card : defensePlayer.getPlayerDeck ( )) {
            if ( card.getSuit ( ) == attackCard.getSuit ( ) && comparator.compare ( card , attackCard ) > 0 ) {
                //                if ( card.getCost ( ) > attackCard.getCost ( ) & card.getSuit ( ) == attackCard.getSuit ( ) ) {
                defenseCard = card;
                break;
            }
        }
        if ( defenseCard != null ) {
            defensePlayer.removeCardFromPlayerDeck ( defenseCard );
            System.out.println ( defensePlayer.getPlayerName ( ) + " defended by " + defenseCard );
            isDefended = true;
        } else {
            System.out.println ( defensePlayer.getPlayerName ( ) + " cannot defense and take card '" + attackCard + "' to his deck" );
            defensePlayer.addCardToPlayerDeck ( attackCard );
            System.out.println ( defensePlayer.getPlayerDeck ( ) );
        }
        System.out.println ( "" );
        return isDefended;
    }
}
