import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player;
  Card card;
  Deck deck;

  @Before
  public void before() {
    player = new Player( "Cardy McCardface", 0 );
    deck = new Deck();
  }

  @Test
  public void hasName() {
    assertEquals( "Cardy McCardface", player.getName() );
  }

  @Test
  public void startsWithNoCasrds() {
    assertEquals( 0, player.cardCount() );
  }

  @Test
  public void canHoldCard() {
    player.getCard(card);
    assertEquals( 1, player.cardCount() );
  }

  @Test
  public void canGetCardFromDeck() {
    player.getCardFromDeck(deck);
    assertEquals( 2, player.cardCount() );
  }

}