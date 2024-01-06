package csen703.main.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class TheBadBatchPath {

    public static Integer TatooineToNabooDP(int[] fuel) {
        int n = fuel.length;

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n && j <= i + fuel[i]; j++) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }

        return dp[n - 1];
    }

    public static ArrayList<Integer> TatooineToNabooPath(int[] fuel) {
        int n = fuel.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n && j <= i + fuel[i]; j++) {
                if (dp[j] > dp[i] + 1) {
                    dp[j] = dp[i] + 1;
                    parent[j] = i;
                }
            }
        }

        ArrayList<Integer> path = new ArrayList<>();
        int current = n - 1;
        while (current != 0) {
            path.add(0, current);
            current = parent[current];
        }
        path.add(0, 0);

        return path;
    }
}