import java.util.ArrayList;

public class Card {

    private SuitType suit;
    private RankType rank;
    public ArrayList<SuitType> suitList;
    public ArrayList<RankType> rankList;
    public ArrayList<Card> cardsArray;


    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
        this.suitList = new ArrayList<>();
        this.rankList = new ArrayList<>();
        this.cardsArray = new ArrayList<>();
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public void addSuitToList(SuitType suit){
        this.suitList.add(suit);
    }

    public void addAllSuitsToList(){
        this.suitList.add(this.suit.HEARTS);
        this.suitList.add(this.suit.DIAMONDS);
        this.suitList.add(this.suit.SPADES);
        this.suitList.add(this.suit.CLUBS);
    }

    public int countSuitsInList(){
        return this.suitList.size();
    }

    public void addAllRanksToList(){
        this.rankList.add(this.rank.ACE);
        this.rankList.add(this.rank.TWO);
        this.rankList.add(this.rank.THREE);
        this.rankList.add(this.rank.FOUR);
        this.rankList.add(this.rank.FIVE);
        this.rankList.add(this.rank.SIX);
        this.rankList.add(this.rank.SEVEN);
        this.rankList.add(this.rank.EIGHT);
        this.rankList.add(this.rank.NINE);
        this.rankList.add(this.rank.TEN);
        this.rankList.add(this.rank.JACK);
        this.rankList.add(this.rank.QUEEN);
        this.rankList.add(this.rank.KING);
    }

    public int countRanksInList(){
        return this.rankList.size();
    }

    public int createDeckOfCards(){
        for (SuitType eachSuit : this.suitList) {
            for (RankType eachRank : this.rankList){

            Card newCard = new Card(eachSuit, eachRank);
            this.cardsArray.add(newCard);
        }
        }
        return this.cardsArray.size();

    }



}
