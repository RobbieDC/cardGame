import java.util.*;

public class Player {

  // private ArrayList<Card> hand;
  private Hand hand;
  private String name;
  private int score;

  public Player( String name, int score ) {
    // this.hand = new ArrayList<Card>();
    this.hand = new Hand();
    this.name = name;
    this.score = 0;
  }

  public String getName() {
    return this.name;
  }

  public String playTurn() {
    return "turn played";
  }

  public int cardCount() {
    return hand.size();
  }

  public void getCardFromDeck(Deck deck, int num) {
    deck.dealCards(hand.getHand(), num);
  }

}