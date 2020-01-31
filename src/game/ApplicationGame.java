package game;

import service.CheckWinConditionService;
import service.GameRoundService;
import service.GetNextPlayerService;
import entity.Player;


public class ApplicationGame {
    private static void run () {
        PrepareGame.prepareGame ( );
        Player current = PrepareGame.player1;
        while (true) {
            //            run game round
            boolean isDefended = GameRoundService.gameRound ( current );
            //            check if attackers win
            if ( CheckWinConditionService.checkWinCondition ( current ) ) {
                System.out.println ( current.getPlayerName ( ) + " WINS!!" );
                break;
            } else {
                current = GetNextPlayerService.nextPlayer ( current );
            }
            //            check if defender wins
            if ( CheckWinConditionService.checkWinCondition ( current ) ) {
                System.out.println ( current.getPlayerName ( ) + " WINS!!" );
                break;
            }
            //            check if defender was able to defeat
            if ( !isDefended ) {
                current = GetNextPlayerService.nextPlayer ( current );
            }
        }
        System.out.println ("final decks" );
        System.out.println (PrepareGame.player1.getPlayerName ()+" has " +PrepareGame.player1.getPlayerDeck () );
        System.out.println (PrepareGame.player2.getPlayerName ()+" has " +PrepareGame.player2.getPlayerDeck () );
        System.out.println (PrepareGame.player3.getPlayerName ()+" has " +PrepareGame.player3.getPlayerDeck () );
        System.out.println (PrepareGame.player4.getPlayerName ()+" has " +PrepareGame.player4.getPlayerDeck () );
    }

    public static void main ( String[] args ) {
        ApplicationGame.run ( );
    }
}

