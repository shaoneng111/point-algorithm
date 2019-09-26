/**
 * @author shao
 * @date 19-9-26
 * @time 上午11:10
 */

/**
 * 题目描述： 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 */

/**
 * 要求时间复杂度O(M+N), 空间复杂度为O(1). 其中M为行数，N为列数
 */

public class TwoDimensionArraySearch_topic_4 {
    public boolean find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols - 1;

        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c]) {
                return true;
            }
            else if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }

        return false;
    }
}
