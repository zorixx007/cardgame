package entity;


enum CardSuit {CLUBS, DIAMONDS, HEARTS, SPADES}

public class Card {


    private int cost;
    private String face;
    private CardSuit suit;
    boolean isTrump = false;


    public Card ( int cost, String cardFace , CardSuit cardSuit , boolean isTrump) {
        this.cost = cost;
        this.face = cardFace;
        this.suit = cardSuit;
        this.isTrump = isTrump;
    }

    public Card () {
    }

    public int getCost () {
        return cost;
    }

    public CardSuit getSuit () {
        return suit;
    }

    public String getFace () {
        return face;
    }

    public boolean isTrump () {
        return isTrump;
    }

    public void setTrump ( boolean trump ) {
        isTrump = trump;
    }

    @Override
    public String toString () {
        String ret = face + " of " + suit;
        return ret;
    }

}
