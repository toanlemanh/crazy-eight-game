package lec05.cardgames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import utils.NotPossibleException;
public class CardCollection {
     protected ArrayList<Card> cards;
     private String label;

     public CardCollection(String label) {
          this.label = label;
          this.cards = new ArrayList<>();
     }

     public String getLabel() {
          return label;
     }

     public String toString (){
          return Arrays.toString( getCards().toArray() );
     }
     public ArrayList<Card> getCards() {
          ArrayList<Card> clone = new ArrayList<>();
          for (Card c : cards){
               clone.add(c);
          }
          return clone;
     }
     public int size (){
          return cards.size();
     }

     public boolean isEmpty (){
          return ( size() == 0);
     }
     public Card popCard () throws NotPossibleException{
          if (!isEmpty())
          return popCard( cards.size() - 1 );
          throw new NotPossibleException("Blank Card");
     }

     public Card popCard (int i) throws NotPossibleException{
          if ( !isEmpty() ) return cards.remove(i);
          throw new NotPossibleException("Blank Card");
     }


//     public void remove( Object obj ){
//          if (validate(obj) && getCards().contains(obj))
//               getCards().remove(obj);
//     }
     public void pushCard (Object obj){
       if (validate(obj) &&  !( getCards().contains(obj)) ){
            cards.add( (Card) obj ) ;
       }
     }
     public boolean validate (Object obj) throws NotPossibleException{
          if (obj == null) {
               throw new NotPossibleException("null object");
          }
          if (! (obj instanceof Card)) return false;
          return true;
     }
     public void deal (CardCollection that, int n){
          for (int i = 0; i < n; i++){
               Card card = this.popCard();
               that.pushCard( card );
          }
     }
     public void suffle (){
          int n = cards.size();
          for (int i = 0; i < n; i++){
               swapCards(i,randInt(n));
          }
     }
     public void swapCards (int i, int j){
          Card temp = cards.get(i);
          cards.set(i,cards.get(j));
          cards.set(j,temp);

     }
     public int randInt (int n){
          return (int) ( new Random().nextInt(n));
     }


}
