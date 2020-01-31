package service;

import game.PrepareGame;
import exception.NoCardInDeck;
import entity.Player;

public class GetCardFromFullDeckService {
    public static void addCardToPlayerDeck ( Player player ) throws NoCardInDeck {
        if ( PrepareGame.fullDeck.size ( ) > 0 ) {
            player.addCardToPlayerDeck ( PrepareGame.fullDeck.get ( 0 ));
            PrepareGame.fullDeck.remove ( 0 );
        } else {
            throw new NoCardInDeck ( "Deck is empty" );
        }
    }
}
