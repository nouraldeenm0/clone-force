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
    int[] fuel2 = { 9, 7, 7, 9, 8, 9, 9, 9, 9, 5, 5, 10, 7, 5, 8, 10, 7, 7, 10, 8, 5, 7, 5, 8, 8, 10, 6, 9, 5, 9, 7,
            7, 7, 7, 6, 6, 7, 8, 10, 10, 8, 7, 6, 8, 7, 10, 6, 5, 7, 7, 8, 5, 8, 9, 10, 5, 7, 8, 7, 6, 10, 6, 9, 9,
            7, 7, 5, 8, 8, 7, 8, 10, 9, 7, 9, 5, 9, 8, 5, 8, 5, 7, 8, 5, 8, 7, 7, 10, 7, 8, 9, 9, 8, 5, 6, 9, 8, 5,
            9, 5, 9, 5, 6, 6, 10, 8, 7, 9, 5, 5, 8, 7, 8, 10, 9, 5, 6, 5, 10, 5, 8, 5, 6, 5, 8, 8, 7, 10, 10, 5, 7,
            10, 10, 8, 5, 7, 6, 6, 10, 8, 10, 5, 8, 5, 5, 5, 10, 6, 9, 6, 5, 6, 6, 8, 8, 7, 7, 6, 6, 10, 7, 5, 8, 7,
            6, 8, 9, 7, 5, 7, 6, 9, 10, 8, 10, 8, 8, 5, 8, 6, 5, 6, 8, 10, 5, 10, 9, 6, 6, 5, 8, 8, 9, 9, 5, 8, 8,
            10, 10, 9, 5, 6, 8, 5, 10, 7, 7, 9, 5, 7, 5, 7, 9, 5, 7, 7, 6, 6, 6, 9, 10, 9, 5, 7, 8, 10, 9, 7, 6, 7,
            10, 10, 5, 6, 7, 9, 10, 10, 9, 8, 5, 10, 10, 7, 10, 9, 6, 9, 5, 10, 5, 5, 8, 9, 6, 5, 7, 7, 5, 9, 7, 6,
            5, 7, 8, 5, 9, 5, 7, 8, 5, 9, 8, 6, 5, 10, 8, 7, 6, 5, 8, 10, 10, 8, 7, 6, 5, 5, 10, 5, 9, 6, 9, 10, 7,
            7, 10, 8, 7, 9, 9, 5, 6, 10, 10, 6, 9, 5, 5, 7, 10, 6, 10, 5, 5, 8, 9, 7, 5, 5, 7, 5, 7, 10, 6, 5, 9, 9,
            7, 6, 10, 5, 8, 9, 8, 6, 8, 5, 8, 8, 9, 7, 5, 9, 9, 8, 10, 8, 9, 9, 5, 8, 5, 8, 9, 5, 9, 5, 7, 7, 6, 8,
            10, 7, 6, 5, 5, 6, 7, 5, 5, 6, 8, 6, 10, 10, 7, 6, 9, 10, 10, 8, 10, 6, 7, 8, 5, 7, 8, 5, 8, 7, 5, 10,
            7, 5, 8, 7, 5, 10, 7, 6, 10, 5, 7, 6, 8, 8, 7, 10, 5, 10, 10, 10, 6, 8, 8, 7, 5, 5, 10, 10, 6, 8, 9, 9,
            10, 9, 6, 8, 5, 8, 7, 8, 8, 10, 7, 6, 8, 9, 7, 8, 7, 9, 6, 5, 10, 8, 9, 10, 5, 8, 6, 10, 6, 10, 10, 10,
            7, 8, 10, 7, 8, 10, 5, 7, 9, 9, 5, 6, 8, 5, 10, 6, 7, 7, 6, 8, 5, 8, 9, 5, 10, 8, 8, 7, 10, 10, 9, 10,
            9, 8, 7, 6, 8, 10, 10, 8, 5, 7, 7, 10, 9, 8, 9, 10, 6, 7, 5, 5, 10, 6, 6, 10, 9, 5, 7, 5, 9, 6, 7, 5, 9,
            7, 10, 5, 6, 8, 7, 10, 5, 6, 7, 8, 7, 10, 8, 10, 6, 9, 6, 9, 6, 6, 5, 8, 8, 6, 9, 9, 6, 6, 6, 10, 6, 5,
            7, 5, 7, 5, 10, 9, 8, 9, 5, 7, 5, 8, 10, 7, 5, 10, 5, 10, 8, 5, 7, 10, 9, 8, 8, 8, 8, 7, 8, 6, 9, 6, 6,
            8, 9, 7, 6, 9, 8, 10, 5, 5, 10, 6, 9, 10, 10, 8, 5, 9, 10, 6, 10, 9, 5, 6, 5, 10, 9, 9, 7, 9, 6, 5, 7,
            6, 8, 7, 9, 7, 7, 6, 6, 7, 8, 5, 8, 10, 7, 5, 10, 6, 9, 5, 10, 8, 5, 9, 7, 10, 6, 6, 6, 8, 9, 9, 5, 8,
            5, 8, 8, 6, 7, 8, 7, 10, 9, 7, 8, 9, 9, 10, 8, 10, 10, 9, 5, 7, 5, 10, 9, 6, 8, 6, 9, 10, 9, 6, 9, 6, 6,
            8, 9, 8, 8, 8, 9, 7, 8, 6, 8, 6, 8, 5, 8, 9, 8, 6, 9, 9, 6, 7, 6, 7, 5, 8, 8, 10, 8, 8, 5, 6, 9, 9, 5,
            7, 7, 5, 5, 6, 9, 9, 10, 5, 10, 9, 7, 10, 7, 7, 5, 10, 5, 8, 9, 6, 8, 10, 8, 8, 6, 6, 9, 8, 10, 8, 9, 5,
            8, 5, 6, 5, 6, 10, 5, 5, 6, 10, 10, 10, 9, 8, 8, 5, 8, 5, 7, 7, 8, 9, 9, 10, 5, 6, 10, 7, 8, 10, 5, 9,
            10, 5, 5, 9, 7, 5, 9, 5, 10, 7, 6, 10, 9, 7, 9, 6, 8, 6, 7, 9, 7, 6, 10, 8, 6, 10, 9, 5, 6, 9, 6, 7, 7,
            10, 8, 8, 7, 9, 5, 8, 9, 7, 10, 10, 10, 5, 5, 6, 6, 10, 5, 5, 7, 10, 10, 10, 6, 10, 5, 7, 5, 9, 9, 6, 7,
            5, 10, 8, 10, 8, 8, 7, 6, 6, 7, 9, 6, 5, 5, 9, 6, 7, 6, 10, 5, 5, 9, 7, 9, 5, 7, 10, 6, 10, 5, 10, 7, 8,
            7, 6, 7, 10, 9, 6, 10, 8, 7, 6, 9, 6, 10, 6, 6, 7, 7, 9, 9, 8, 6, 6, 10, 5, 7, 7, 7, 10, 10, 5, 6, 8, 8,
            7, 6, 7, 8, 10, 10, 8, 5, 9, 5, 7, 7, 6, 7, 8, 7, 7, 8, 6, 7, 7, 10, 5, 9, 8, 6, 8, 8, 5, 7, 6, 8, 9,
            10, 5, 7, 10, 8, 6, 9, 8, 6, 7, 5, 8, 6, 6, 6, 6, 6, 10, 8, 8, 10, 7, 5, 8, 8, 10, 8, 6, 7, 9, 5, 9, 9,
            9, 7, 5, 9, 7, 10, 8, 7, 9, 6, 6, 7, 5, 9, 9, 5, 10 };
    HashMap<Integer, Integer> memo = new HashMap<>();
    static int hits = 0;

    public static void main(String[] args) {
        var obj = new TheBadBatchPath();

        // System.out.println("Output DP: " + obj.TatooineToNabooDP(obj.fuel));
        System.out.println("Output Path: " + obj.TatooineToNabooPath(obj.fuel2).size());
        // System.out.println("Hits: " + TheBadBatchPath.hits);
        // System.out.println("fuel2 length: " + obj.fuel2.length);
        // System.out.println("Output Path: " + TatooineToNabooPath(fuel));
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
    *                                                                     +1 /             / MIN \ +1
    *                                                                       /          +1 /       \
    *                                                                      2             2       2, 3
    *                                                                                         +1 /
    *                                                                                           /
    *                                                                                          2
    */
    public int TatooineToNabooDP(int[] fuel) {
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
                int[] subArray = Arrays.copyOfRange(fuel, 0, i + 1);
                min = Math.min(TatooineToNabooDP(subArray) + 1, min);
            }
        }
        this.memo.put(fuel.length, min);
        return min;
    }

    public ArrayList<Integer> TatooineToNabooPath(int[] fuel) {
        ArrayList<Integer> path = new ArrayList<>();

        if (fuel.length == 1) {
            ArrayList<Integer> base = new ArrayList<>();
            base.add(fuel[0]);
            return base;
        }

        int min = Integer.MAX_VALUE;
        int lastIndx = fuel.length - 1;

        for (int i = 0; i <= fuel.length - 2; ++i) {
            int distToEnd = lastIndx - i;
            int fuelInPlanet = fuel[i];
            boolean endIsReachable = fuelInPlanet >= distToEnd;

            if (endIsReachable) {
                int[] subArray = Arrays.copyOfRange(fuel, 0, i + 1);

                // we only want to add the path if it is the minimum costing path, AI has helped here
                int subArrayMin = TatooineToNabooDP(subArray) + 1;
                if (subArrayMin < min) {
                    min = subArrayMin;
                    path = TatooineToNabooPath(subArray);
                    path.add(i);
                }
            }
        }
        return path;
    }
}