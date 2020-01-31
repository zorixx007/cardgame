package entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
    public static void mixDeck ( List<Card> fullDeck ) {
        Map<Integer, String> cardFaces = new HashMap<> ( ) {{
            put ( 6 , "6" );
            put ( 7 , "7" );
            put ( 8 , "8" );
            put ( 9 , "9" );
            put ( 10 , "10" );
            put ( 11 , "JACK" );
            put ( 12 , "QUEEN" );
            put ( 13 , "KING" );
            put ( 14 , "ACE" );
        }};

        for (Map.Entry f : cardFaces.entrySet ()) {
            for (CardSuit s : CardSuit.values ( )) {
                fullDeck.add ( new Card ( (int)f.getKey() , (String) f.getValue ( ) , s , false ) );
            }
        }
        Collections.shuffle ( fullDeck );
    }
}
