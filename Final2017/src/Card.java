
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Card
{
	public String player;
	private String name;
	private int value;
	private String a;
	static ArrayList <Card> cardDeck = new <Card>ArrayList();
	public Card(String n, int v, String s)
{
	name=n;
	value=v;
	a=s;
}

public static void generateCards()
{
	System.out.println("Which cards would you like to use?");
	System.out.println("cards with fruits on them (a)");
	System.out.println("cards with animals on them (f)");
	System.out.println("or you can have cards with whatever you want on them (?)");
	Scanner userInput7 = new Scanner(System.in);
	String choice= userInput7.nextLine();
	if(choice.equals("a"))
		{
	addAnimals();
		}
	if(choice.equals("f"))
		{
	addClubs();	
		}
	if(choice.equals("?"))
		{
			addNewCards();
		}
}
	public static void addAnimals()
	{
	cardDeck.add(new Card ("  Cat  ", 2, "-------"));
	cardDeck.add(new Card ("  Dog  ",3 , "-------"));
	cardDeck.add(new Card ("Giraffe", 4, "-------"));
	cardDeck.add(new Card (" Panda ", 5, "-------"));
	cardDeck.add(new Card (" fish  ", 6, "-------"));
	cardDeck.add(new Card (" snake ", 7, "-------"));
	cardDeck.add(new Card ("  pig  ", 8, "-------"));
	cardDeck.add(new Card ("  owl  ", 9, "-------"));
	cardDeck.add(new Card (" monkey", 10,"-------"));
	cardDeck.add(new Card ("rabbit ", 11,"-------"));
	cardDeck.add(new Card (" frog  ", 12,"-------"));
	cardDeck.add(new Card (" lion  ", 13,"-------"));
	
	cardDeck.add(new Card ("  Cat  ", 2, "-------"));
	cardDeck.add(new Card ("  Dog  ",3 , "-------"));
	cardDeck.add(new Card ("Giraffe", 4, "-------"));
	cardDeck.add(new Card (" Panda ", 5, "-------"));
	cardDeck.add(new Card (" fish  ", 6, "-------"));
	cardDeck.add(new Card (" snake ", 7, "-------"));
	cardDeck.add(new Card ("  pig  ", 8, "-------"));
	cardDeck.add(new Card ("  owl  ", 9, "-------"));
	cardDeck.add(new Card (" monkey", 10,"-------"));
	cardDeck.add(new Card ("rabbit ", 11,"-------"));
	cardDeck.add(new Card (" frog  ", 12,"-------"));
	cardDeck.add(new Card (" lion  ", 13,"-------"));
	}

public static void addClubs()
	{
		cardDeck.add(new Card ("  apple ", 2, "-------"));
		cardDeck.add(new Card (" bananna",3 , "-------"));
		cardDeck.add(new Card ("  grapes", 4, "-------"));
		cardDeck.add(new Card (" tomatoes", 5, "-------"));
		cardDeck.add(new Card ("  peach  ", 6, "-------"));
		cardDeck.add(new Card ("blueberry", 7, "-------"));
		cardDeck.add(new Card ("pineapple", 8, "-------"));
		cardDeck.add(new Card (" orange  ", 9, "-------"));
		cardDeck.add(new Card ("cantalope", 10, "-------"));
		cardDeck.add(new Card ("blackberry", 11, "-------"));
		cardDeck.add(new Card ("   plum   ", 12, "-------"));
		cardDeck.add(new Card ("   lemon  ", 13, "-------"));
		
		cardDeck.add(new Card ("  apple   ", 2, "-------"));
		cardDeck.add(new Card (" bananna  ",3 , "-------"));
		cardDeck.add(new Card ("  grapes  ", 4, "-------"));
		cardDeck.add(new Card (" tomatoes ", 5, "-------"));
		cardDeck.add(new Card ("  peach   ", 6, "-------"));
		cardDeck.add(new Card ("blueberry ", 7, "-------"));
		cardDeck.add(new Card ("pineapple ", 8, "-------"));
		cardDeck.add(new Card (" orange   ", 9, "-------"));
		cardDeck.add(new Card ("cantalope ", 10, "-------"));
		cardDeck.add(new Card ("blackberry", 11, "-------"));
		cardDeck.add(new Card ("   plum   ", 12, "-------"));
		cardDeck.add(new Card ("   lemon  ", 13, "-------"));
}
public static void addNewCards()
{
	System.out.println("input 24 words and they will be made into cards");
	for(int i = 0; i<24; i++)
		{
			Scanner userInput7 = new Scanner(System.in);
			String userCard= userInput7.nextLine();
			cardDeck.add(new Card (userCard, 1, "-------"));

		}
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

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public static ArrayList<Card> getCardDeck() {
		return cardDeck;
	}

	public static void setCardDeck(ArrayList<Card> cardDeck) {
		Card.cardDeck = cardDeck;
	}
	
}
