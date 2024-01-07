/*
 
{
    "Omar Essameldin Mohamed 43-9989",
    "Noureldin Mohamed 49-7269 T-20",
    "Youssef ibrahim 49-7819"
}

 * Write your info here
 * 
 * @Team
 * @name
 * @id 
 * @TutorialNumber

*/

package csen703.main.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TheBadBatchPath {
    int[] fuel = { 2, 3, 1, 1, 4 };
    HashMap<Integer, Integer> memo = new HashMap<>();

    public static int TatooineToNabooDP(int[] fuel) {
        TheBadBatchPath obj = new TheBadBatchPath();
        return obj.helperDP(fuel);
    }
    public static ArrayList<Integer> TatooineToNabooPath(int[] fuel) {
        TheBadBatchPath obj = new TheBadBatchPath();
        ArrayList<Integer> ret = obj.helperPath(fuel);
        ret.add(fuel.length - 1);
        return ret;
    }

/*
    * for example: lets look at the array [2, 3, 1, 1, 4], I am using a top down approach rather than a bottom up approach
    * so I start from the end and see how I could've reach it from the beginning,
    * We are looping through 2, 3, 1, 1 to see which one of these would reach us to 4
    * once we see that from index 1 we could reach the end
    * we recursively rerun the method with the array [2, 3] and add one to the return statement
    * a call for [2, 3, 1, 1] would also be made as we can always reach the last index from the one before it if its fuel is 1 or more
    * The base case is when an array has only element (only one planet) thus it returns 0, as I require no fuel to stay in my place
    * I look for the recursive call with the minimum cost, while debugging, I tried putting conditional breakpoints but figured I could do the following too instead,
    * I have put a breakpoint on the base case (when the input length is one) return statement to make sure that for the input [2, 3, 1, 1, 4], we would reach that breakpoint 4 times 
    * as the following tree shows.
    * 
    *                                               TREE SHOWING RECURSIVE CALLS FOR [2, 3, 1, 1, 4], PLEASE MAXIMIZE SCREEN
    * 
    *                                                            2, 3, 1, 1, 4
    *                                                         +1 /    MIN      \ +1
    *                                                           /               \
    *                                                         2, 3              2, 3, 1, 1
    *                                                      +1 /             +1 /   MIN    \ +1
    *                                                        /                /            \
    *                                                       2               2, 3           2, 3, 1
    *                                                                    +1 /              / MIN \ +1
    *                                                                      /           +1 /       \
    *                                                                     2              2       2, 3
    *                                                                                         +1 /
    *                                                                                           /
    *                                                                                          2
    */
    public int helperDP(int[] fuel) {
        if (this.memo.containsKey(fuel.length)) {
            return this.memo.get(fuel.length);
        }
        if (fuel.length == 1) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int lastIndx = fuel.length - 1;

        for (int i = 0; i <= fuel.length - 2; ++i) {
            int distToEnd = lastIndx - i;
            int fuelInPlanet = fuel[i];
            boolean endIsReachable = fuelInPlanet >= distToEnd;

            if (endIsReachable) {
                int[] branch = Arrays.copyOfRange(fuel, 0, i + 1);
                int branchCost = helperDP(branch) + 1;

                if (branchCost < min) {
                    min = branchCost;
                }
            }
        }
        this.memo.put(fuel.length, min);
        return min;
    }

    public ArrayList<Integer> helperPath(int[] fuel) {
        ArrayList<Integer> path = new ArrayList<>();

        if (fuel.length == 1) {
            return new ArrayList<>();
        }

        int minimalCostingPath = Integer.MAX_VALUE;
        int lastIndx = fuel.length - 1;

        for (int i = 0; i <= fuel.length - 2; ++i) {
            int distToEnd = lastIndx - i;
            int fuelInPlanet = fuel[i];
            boolean endIsReachable = fuelInPlanet >= distToEnd;

            if (endIsReachable) {
                int[] branch = Arrays.copyOfRange(fuel, 0, i + 1);
                int branchCost = helperDP(branch) + 1;

                if (branchCost < minimalCostingPath) {
                    minimalCostingPath = branchCost;
                    path = helperPath(branch);
                    path.add(i);
                }
            }
        }
        return path;
    }
}