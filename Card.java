package lec05.cardgames;

import utils.NotPossibleException;

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(int i, int j) throws NotPossibleException{
        switch (i){
            case 0: this.suit = Suit.HEART;
                break;
            case 1: this.suit = Suit.DIAMOND;
                break;
            case 2: this.suit = Suit.CLUB;
                break;
            case 3: this.suit = Suit.SPADE;
                break;
        }
        switch (j){
            case 0: this.rank = Rank.ACE;
                break;
            case 1: this.rank = Rank.TWO;
                break;
            case 2: this.rank = Rank.THREE;
                break;
            case 3: this.rank = Rank.FOUR;
                break;
            case 4: this.rank = Rank.FIVE;
                break;
            case 5: this.rank = Rank.SIX;
                break;
            case 6: this.rank = Rank.SEVEN;
                break;
            case 7: this.rank = Rank.EIGHT;
                break;
            case 8: this.rank = Rank.NINE;
                break;
            case 9: this.rank = Rank.TEN;
                break;
            case 10: this.rank = Rank.JACK;
                break;
            case 11: this.rank = Rank.QUEEN;
                break;
            case 12: this.rank = Rank.KNIGHT;
                break;
            default: throw new NotPossibleException("Invalid RANK");
        }

    }

    @Override
    public String toString() {
        return "CARD["+ rank +" "+
                  suit +"]"
                ;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (! (obj instanceof Card)) return false;
        Card that = (Card) obj;
        return ( this.rank == that.rank && this.suit == that.suit);
    }
}
