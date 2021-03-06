import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DeckTest {

    private Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canCountDeck() {
        assertEquals(52, deck.countDeck());
    }


    @Test
    public void canDealCard(){
        assertNotNull(deck.dealCard());
        assertEquals(51, deck.countDeck());
    }

}
