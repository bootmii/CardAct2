/**
 * This class provides a convenient way to test shuffling methods.
 */
import java.util.Random;
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] valuesFirstHalf = new int[values.length/2];
		int[] valuesSecondHalf = new int[ //size of valuesSecondHalf follows
				(values.length%2==0?values.length/2:values.length/2+1)
		];
		for(int ii=0;ii<valuesFirstHalf.length;ii++)
			valuesFirstHalf[ii] = values[ii];
		for(int ii=values.length/2, jj=0; ii<values.length; ii++, jj++)
			valuesSecondHalf[jj] = values[ii];
		for(int ii=0; ii<values.length; ii++){
			values[ii] = valuesSecondHalf[ii/2];
			if(ii++==values.length) break; //postincrementation FTW
			values[ii] = valuesFirstHalf[ii/2];
		}
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		Random rr = new Random();
		for(int ii = values.length-1; ii>0; ii--){
			int jj = rr.nextInt(ii);
			int swap = values[jj];
			values[jj] = values[ii];
			values[ii] = swap;
		}
	}

	public static String flip() {
	  Random rr = new Random();
	  int ii = rr.nextInt(3);
	  switch(ii) {
	  case 0:; // FALL THRU
	  case 1: return "heads";
	  case 2: return "tails";
	  default: return "";
	  }
	}

	public static boolean arePermutations(int[] values1, int[] values2){
		if(hasDuplicates(values1)||hasDuplicates(values2)) return false;
		if(values1.length!=values2.length) return false;
		int len = values1.length;
		boolean[] matchFound = new boolean[len];
		for(int ii=0; ii<len; ii++) {
			for(int jj=0; jj<len; jj++)
				if(values1[ii]==values2[jj])
		}

	}
	private static boolean hasDuplicates(int[] values){
		for(int ii=0; ii<values.length; ii++)
			for(int jj=ii+1; jj<values.length; jj++)
				if(values[ii]==values[jj]) return true;
		return false;
	}
	private static boolean allTrue(boolean[] flags){
		for(boolean bb : flags) if(!bb) return false; return true;
	}
}
