package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    public void permute(List<List<Integer>> res, List<Integer> item, int[] nums, boolean[] read) {
        if (item.size() == nums.length) { // 结束条件
            res.add(new ArrayList<>(item));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (read[i])
                continue;
            read[i] = true;
            item.add(nums[i]);
            permute(res, item, nums, read);
            read[i] = false;
            item.remove(item.size() - 1);
        }
    }
}
