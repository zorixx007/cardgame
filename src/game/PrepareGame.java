package game;

import service.FillPlayersDecksService;
import exception.NoCardInDeck;
import entity.Card;
import entity.Deck;
import entity.Player;

import java.util.ArrayList;
import java.util.List;

public class PrepareGame {
    public static List<Card> fullDeck = new ArrayList<> ( );
    public static Player player1 = new Player ( "Player1"  );
    public static Player player2 = new Player ( "Player2" );
    public static Player player3 = new Player ( "Player3"  );
    public static Player player4 = new Player ( "Player4"  );

    public static void prepareGame () {
        Deck.mixDeck ( fullDeck );
        try {
            FillPlayersDecksService.fill ( player1 );
        } catch (NoCardInDeck e) {
            e.getMessage ( );
        }
        player1.sortPlayerDeck ( );
        player2.sortPlayerDeck ( );
        player3.sortPlayerDeck ( );
        player4.sortPlayerDeck ( );
    }
}
