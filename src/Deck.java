import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    public Card deck[] = new Card[52];
    public String naipes[] = new String[]{"Clover","Diamond","Heart","Spades"};
    public Card top;

    public Deck(){
        for (int i = 0; i < 4; i++){
            for (int j = 1; j <= 13; j++){
                deck[i+j].setCard(j, naipes[i]);
            }
        }
    }

    public void shuffle(){
        List<Card> list = Arrays.asList(deck);
        Collections.shuffle(list);
        list.toArray(deck);
    }

    public Card buy(){
        top = deck[deck.length-1];
        deck = Arrays.copyOfRange(deck, 0, deck.length-2);
        return top;
    }
}
