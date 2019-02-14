import org.junit.Before;

public class CardTest<ca> {

    private Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS);
    }
}
