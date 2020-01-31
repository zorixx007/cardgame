package entity;

import utils.SortByCost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
    String playerName;
    List<Card> playerDeck;

    public Player ( String playerName ) {
        this.playerName = playerName;
        this.playerDeck = new ArrayList<> ( );
    }

    public String getPlayerName () {
        return playerName;
    }

    public List<Card> getPlayerDeck () {
        return playerDeck;
    }

    public void addCardToPlayerDeck ( Card newCard ) {
        playerDeck.add ( newCard );
    }

    public void removeCardFromPlayerDeck ( Card newCard ) {
        playerDeck.remove ( newCard );
    }

    public void sortPlayerDeck () {
        Collections.sort ( playerDeck , new SortByCost ( ) );
    }
}
