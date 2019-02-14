import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deckOfCards;



    public Deck(){
        this.deckOfCards = new ArrayList<>();
    }

    public int countDeck(){
        return this.deckOfCards.size();
    }


}
