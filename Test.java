package lec05.cardgames;


public class Test {
    public static void main(String[] args) {
//        Card card = new Card(Rank.ACE,Suit.CLUB);
//        System.out.println(card);
//        Card card1 = new Card(Rank.KNIGHT, Suit.CLUB);
//        System.out.println(card.equals(card1));

        Deck deck = new Deck("Deck");
//        System.out.println(deck.toString());
        deck.suffle();
        Hand player01 = new Hand("Player01");
        deck.deal(player01,8);
        player01.showHand();


    }
}
