package main.everyday;

/**
 * 比特位计数
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0)
                dp[i] = dp[i / 2];
            else dp[i] = dp[i / 2] + 1;
        }
        return dp;
    }
}
