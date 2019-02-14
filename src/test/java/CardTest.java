import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest<ca> {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card.getRank());
    }


}


