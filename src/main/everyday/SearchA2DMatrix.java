package main.everyday;

/**
 * 搜索二维矩阵
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lo = 0, hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            int[] mn = getMN(n, mid);
            int val = matrix[mn[0]][mn[1]];
            if (val == target) {
                return true;
            } else if (val < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }

    private int[] getMN(int n, int index) {
        return new int[]{index / n, index - index / n * n};
    }
}
