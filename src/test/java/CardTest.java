import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card1;
    private Card card2;

    @Before
    public void before(){
        card1 = new Card(SuitType.HEARTS, RankType.KING);
        card2 = new Card(SuitType.DIAMONDS, RankType.TWO);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card1.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, card1.getRank());
    }

    @Test
    public void canGetCardValueFaceCardKing(){
        assertEquals(10, card1.getValue());
    }

    @Test
    public void canGetCardValueNumberCardTwo(){
        assertEquals(2, card2.getValue());
    }

}


