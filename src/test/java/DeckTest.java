import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DeckTest {

    private Deck deck;
    private Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void canCountDeck() {
        assertEquals(0, deck.countDeck());
    }



}
