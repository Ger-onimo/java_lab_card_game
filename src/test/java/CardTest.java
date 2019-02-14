import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class CardTest {

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

    @Test
    public void canAddSuitToList(){
        card.addSuitToList(SuitType.HEARTS);
        assertEquals(1, card.countSuitsInList());
    }

    @Test
    public void canAddAllSuitsToDeck(){
        card.addAllSuitsToList();
        assertEquals(4, card.countSuitsInList());
    }

//    @Test
//    public void canAddRankToList(){
//        card.addRankToList(RankType.KING);
//        assertEquals(1, card.countRanksInList());
//    }

    @Test
    public void canAddAllRankToDeck(){
        card.addAllRanksToList();
        assertEquals(13, card.countRanksInList());
    }

    @Test
    public void canCountDeckOfCards(){
        assertEquals(52, card.createDeckOfCards());
    }


}


