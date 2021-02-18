
public class Deck {
    
    Card[] deck = new Card[52];

    public Card[] makeDeck(){

        deck = new Card[52];
        int i=0;

        for( SUITE suite: SUITE.values() ) {
            for(int value = 1; value <13; value++){
                deck[i++] = new Card(suite, value);
                // static String out = Card.toString();
                // System.out.println(Card.toString());
            }
        }
        
        return deck;
    }
}
