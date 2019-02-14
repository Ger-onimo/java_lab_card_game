import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deckOfCards;

    public Deck(){
        this.deckOfCards = new ArrayList<>();
        createDeckOfCards();
        shuffleDeck();
    }

    public int countDeck(){
        return this.deckOfCards.size();
    }

    public void createDeckOfCards() {
        for (SuitType eachSuit : SuitType.values()) {
            for (RankType eachRank : RankType.values()) {
                Card newCard = new Card(eachSuit, eachRank);
                deckOfCards.add(newCard);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deckOfCards);
    }


    public Card dealCard(){
        return this.deckOfCards.remove(0);
    }
}
