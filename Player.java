
public class Player {

  // private ArrayList<Card> hand;
  private Hand hand;
  private String name;
  private int score;

  public Player( String name) {
    // this.hand = new ArrayList<Card>();
    this.hand = new Hand();
    this.name = name;
  }

  public String getName() {
    return this.name;
  }


  //To be abstracted
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