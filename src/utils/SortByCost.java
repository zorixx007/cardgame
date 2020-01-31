package utils;

import entity.Card;

import java.util.Comparator;

public class SortByCost implements Comparator<Card> {
    public int compare ( Card a , Card b ) {
        return a.getCost ( ) - b.getCost ( );
    }
}
