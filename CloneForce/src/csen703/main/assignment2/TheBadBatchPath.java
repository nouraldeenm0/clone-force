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

public class TheBadBatchPath {

/*
After Tech managed to find out that they would be able to reach planet Naboo from
Tatooine, he realised that they needed to be as discrete as possible. To do that Tech
decided to minimize their landings as much as possible. You need to help Tech to:
    a) Design a Dynamic programming algorithm that outputs the minimum number of
planets the Bad Batch needs to land on and fuel to reach Naboo in O(n^2).
    b) Reconsruct a path that leads to Naboo with that minimum number of landings in O(n^2)
*/
    public static void main(String[] args) {
        int[] fuel = { 2, 3, 1, 1, 4 };
        System.out.println("Output DP: " + TatooineToNabooDP(fuel));
        System.out.println("Output Path: " + TatooineToNabooPath(fuel));
    }

    /*
    a dynamic programming approach to finding the minimum number of landings to
reach planet Naboo. Notice that you always land on Naboo anyway.
     */
    public static int TatooineToNabooDP(int[] fuel) {
        return 2;
    }

    /*
    returns an ordered minimum path of the planets indices the BadBatch should land
on to reach Naboo. Notice that Tatooine and Naboo are always the start and end
of this path. If there are multiple minimum paths, you only return one of them.
    */
    public static ArrayList<Integer> TatooineToNabooPath(int[] fuel) {
        return new ArrayList<>(Arrays.asList(0, 2, 4));
    }
}