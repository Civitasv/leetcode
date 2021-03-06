package main.structure;

public class BIT {
    private final int[] tree;
    private final int n;

    public BIT(int n) {
        this.n = n;
        this.tree = new int[n + 1];
    }

    // 从右往左，搜索到第一个为0的，暂停，返回值 计算机内部表示为补码
    private int lowbit(int x) {
        return x & -x;
    }

    public void update(int val, int i) {
        while (i < n + 1) {
            tree[i] += val;
            i += lowbit(i);
        }
    }

    public int query(int i) {
        int res = 0;
        while (i > 0) {
            res += tree[i];
            i -= lowbit(i);
        }
        return res;
    }
}
