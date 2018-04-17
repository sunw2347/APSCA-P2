/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace","spades", 1);
		Card card2 = new Card("eight","diamonds", 8);
		Card card3 = new Card("ace","hearts", 1);
		
		//card x
		System.out.println(card1.suit());
		System.out.println(card1.rank());
		System.out.println(card1.pointValue());
		System.out.println(card1.matches(card3));
		System.out.println(card1);

		//card y
		System.out.println(card2.suit());
		System.out.println(card2.rank());
		System.out.println(card2.pointValue());
		System.out.println(card2.matches(card3));
		System.out.println(card2);

		//card z
		System.out.println(card3.suit());
		System.out.println(card3.rank());
		System.out.println(card3.pointValue());
		System.out.println(card3.matches(card1));
		System.out.println(card3);
	}
}
