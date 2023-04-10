
package lec05.cardgames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
//import lec05.cardgames.Card;
//import lec05.cardgames.CardCollection;

import java.util.ArrayList;

public class Deck extends CardCollection {
    private final int RANK_SIZE = 13;
    private final int SUIT_SIZE = 4;
//    private ArrayList<Card> cards;
//    private String label;

    public Deck(String label) {
        super(label);
        for (int i = 0; i < SUIT_SIZE; i++){
            for (int j = 0; j < RANK_SIZE; j++){
                cards.add( new Card(i,j) );
            }
        }

    }


}

