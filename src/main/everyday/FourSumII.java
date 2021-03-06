package main.everyday;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l)，使得A[i] + B[j] + C[k] + D[l] = 0。
 * <p>
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度N，且 0 ≤ N ≤ 500 。所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过231 - 1 。
 */
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        Map<Integer, Integer> map = getAdd(A, B);
        for (int c : C) {
            for (int d : D) {
                if (map.containsKey(-c - d))
                    count += map.get(-c - d);
            }
        }
        return count;
    }

    public Map<Integer, Integer> getAdd(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                if (map.containsKey(sum)) {
                    int val = map.get(sum);
                    map.replace(sum, val, val + 1);
                } else map.put(sum, 1);
            }
        }
        return map;
    }
}
