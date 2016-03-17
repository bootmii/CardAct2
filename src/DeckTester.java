/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"i","ro","ha"};
		String[] suits1= {"ki","hi","tsuchi","kane","mizu"};
		int[] values1 = {1,2,5};
		Deck testDeck1 = new Deck(ranks1, suits1, values1);
		testDeck1.size();
		testDeck1.isEmpty();
		testDeck1.deal();
		testDeck1.toString();
		testDeck1.size();
		testDeck1.deal();
		testDeck1.size();
		String[] ranks2 = {"Nine","Ten","Jack","Queen","King","Ace"};
		String[] suits2 = {"Spades", "Hearts", "Diamonds", "Clubs"};
		int[] values2 = {9,10,11,12,13,14};
		Deck euchre = new Deck(ranks2, suits2, values2);
		euchre.size();
		euchre.toString();
		euchre.deal();
		euchre.isEmpty();
		euchre.deal();
		euchre.size();
		String[] ranks3 = {"Two", "Three", "Four", "Five", "Six","Seven",
				"Eight","Nine","Ten","Jack","Queen","King","Ace"};
		int[] values3 = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		Deck poker = new Deck(ranks3,suits2,values3);
		poker.toString();
		poker.isEmpty();
		poker.deal();
		poker.size();
	}
}