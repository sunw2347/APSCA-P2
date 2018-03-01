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
	Card ace1 = new Card("ace", "spades", 1);
	Card ace2 = new Card("ace", "clubs", 1);
	Card ace3 = new Card("ace", "hearts", 1);
	
	System.out.printf("rank: %s\n", ace1.rank());
	System.out.printf("suit: %s\n", ace1.suit());
	System.out.printf("pointValue: %d\n", ace1.pointValue());
	
	System.out.printf("rank: %s\n", ace2.rank());
	System.out.printf("suit: %s\n", ace2.suit());
	System.out.printf("pointValue: %d\n", ace2.pointValue());
	
	System.out.printf("rank: %s\n", ace3.rank());
	System.out.printf("suit: %s\n", ace3.suit());
	System.out.printf("pointValue: %d\n", ace3.pointValue());
	}
}
