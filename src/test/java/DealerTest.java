import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest{

    private Dealer dealer;
    private Deck deck;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
    }
    
    @Test
    public void dealerCanDealCardFromDeck(){
      Card card = dealer.deal(deck);
      assertNotNull(card);
      assertEquals(51, deck.countDeck());
    }
    

}
