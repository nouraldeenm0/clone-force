/*
 
{
    "Omar Essameldin Mohamed 43-9989 T21",
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

package csen703.main.assignment1;

import java.util.Arrays;

public class TheBadBatch {

    public static void main(String[] args) {
        int[] fuelArray7 = { 3, 2, 1, 0, 4 };
        TatooineToNabooDivideAndConquer(fuelArray7);
        System.out.println("Divide and Conquer: " + TatooineToNabooDivideAndConquer(fuelArray7));
    }

    public static boolean TatooineToNabooDivideAndConquer(int[] fuel) {
        if (fuel[0] >= fuel.length)
            return true;
        System.out.println("Array: " + Arrays.toString(fuel) + " Length: " + fuel.length);
        boolean answer = false;
        boolean divide1 = false;
        boolean divide2 = false;
        if (fuel[0] != 0) {
            // divide from the last planet i can reach
            int[] divideFuel1 = Arrays.copyOfRange(fuel, fuel[0], fuel.length);
            // divide from the first planet i can reach
            int[] divideFuel2 = Arrays.copyOfRange(fuel, 1, fuel.length);
            System.out.println("First Array: " + Arrays.toString(divideFuel1));
            System.out.println("Second Array: " + Arrays.toString(divideFuel2));
            divide1 = TatooineToNabooDivideAndConquer(divideFuel1);
            divide2 = TatooineToNabooDivideAndConquer(divideFuel2);
        }
        if (divide1 || divide2)
            answer = true;
        return answer;
    }

    public static boolean TatooineToNabooGreedy(int[] fuel) {
        return false;
    }

}
