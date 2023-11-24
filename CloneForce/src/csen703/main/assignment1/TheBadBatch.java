/*
{
    "Omar Essameldin Mohamed 43-9989 T21",
    "Noureldin Mohamed 49-7269 T-20",
    "Youssef ibrahim 49-7819"
}
*/

package csen703.main.assignment1;

import java.util.Arrays;

public class TheBadBatch {

	public static boolean TatooineToNabooDivideAndConquer(int[] fuel) {

		if (fuel.length == 0)
			return false;
		if (fuel[0] == 0)
			return false;
		if ((fuel[0] >= fuel.length) || (fuel.length == 1))
			return true;

		int floorOfFuel = fuel.length / 2;

		int[] right;
		int[] left = Arrays.copyOfRange(fuel, 0, floorOfFuel);
		int max = Arrays.stream(left).max().getAsInt();

		if ((fuel[floorOfFuel] == 0) && (max < fuel.length)) {
			right = Arrays.copyOfRange(fuel, max, fuel.length);
		} else
			right = Arrays.copyOfRange(fuel, floorOfFuel, fuel.length);

		boolean divide1 = TatooineToNabooDivideAndConquer(left);
		boolean divide2 = TatooineToNabooDivideAndConquer(right);

		return divide1 && divide2;

	}

	public static boolean TatooineToNabooGreedy(int[] fuel) {
		int remainingFuel = fuel[0];
		// loop over the whole array and take the decision of landing or not
		// the heuristic would be to check if the planet has more fuel than what we have
		// already
		// if the planet has more fuel than us we choose to land
		// else we continue in our path and decrement our fuel
		// and the method would return false if our fuel ran out
		for (int i = 0; i < fuel.length; i++) {
			// landed on the planet
			if (fuel[i] > remainingFuel) {
				remainingFuel = fuel[i];
			}
			// continued in path
			else
				remainingFuel--;
			if (remainingFuel == 0)
				return false;
		}
		return true;
	}
}
