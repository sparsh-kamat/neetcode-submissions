class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            int nummid = matrix[mid][0];
            if (nummid == target)
                return true;
            else if (nummid > target) {
                j--;
            }

            else {
                i++;
            }
        }

        int midrow = (i + j) / 2;
        i = 0;
        j = matrix[0].length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            int nummid = matrix[midrow][mid];
            if (nummid == target)
                return true;
            else if (nummid > target) {
                j--;
            }

            else {
                i++;
            }
        }

        return false;
    }
}
