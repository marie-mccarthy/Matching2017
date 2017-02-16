
import java.util.ArrayList;

public class Card
{
	public String player;
	private String name;
	private int value;
	private String suit;
	static ArrayList <Card> cardDeck = new <Card>ArrayList();
	public Card(String n, int v, String s)
{
	name=n;
	value=v;
	suit=s;
}

public static void generateCards()
{
	addHearts();
	addClubs();	
}
	public static void addHearts()
	{
	cardDeck.add(new Card ("  Cat  ", 2, "Hearts"));
	cardDeck.add(new Card ("  Dog  ",3 , "Hearts"));
	cardDeck.add(new Card ("Giraffe", 4, "Hearts"));
	cardDeck.add(new Card (" Panda ", 5, "Hearts"));
	cardDeck.add(new Card (" fish  ", 6, "Hearts"));
	cardDeck.add(new Card (" snake ", 7, "Hearts"));
	cardDeck.add(new Card ("  pig  ", 8, "Hearts"));
	cardDeck.add(new Card ("  owl  ", 9, "Hearts"));
	cardDeck.add(new Card (" monkey", 10, "Hearts"));
	cardDeck.add(new Card ("rabbit ", 11, "Hearts"));
	cardDeck.add(new Card (" frog  ", 12, "Hearts"));
	cardDeck.add(new Card ("  lion ", 13, "Hearts"));
	}

public static void addClubs()
	{
	cardDeck.add(new Card ("  Cat  ", 2, "Hearts"));
	cardDeck.add(new Card ("  Dog  ",3 , "Hearts"));
	cardDeck.add(new Card ("Giraffe", 4, "Hearts"));
	cardDeck.add(new Card (" Panda ", 5, "Hearts"));
	cardDeck.add(new Card (" fish  ", 6, "Hearts"));
	cardDeck.add(new Card (" snake ", 7, "Hearts"));
	cardDeck.add(new Card ("  pig  ", 8, "Hearts"));
	cardDeck.add(new Card ("  owl  ", 9, "Hearts"));
	cardDeck.add(new Card (" monkey", 10, "Hearts"));
	cardDeck.add(new Card ("rabbit ", 11, "Hearts"));
	cardDeck.add(new Card (" frog  ", 12, "Hearts"));
	cardDeck.add(new Card ("  lion ", 13, "Hearts"));
}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public static ArrayList<Card> getCardDeck() {
		return cardDeck;
	}

	public static void setCardDeck(ArrayList<Card> cardDeck) {
		Card.cardDeck = cardDeck;
	}
	
}
