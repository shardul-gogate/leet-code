class Solution {
    /*
    runtime 5 ms
    faster than 74%
    submissions in Java
    */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        if(rows==0) {
            return false;
        }
        int cols=matrix[rows-1].length;
        if(cols==0) {
            return false;
        }
        if(target<matrix[0][0] || target>matrix[rows-1][cols-1]) {
            return false;
        }
        int flag=0;
        for(int i=rows-1;i>=0;i--) {
            if(target>=matrix[i][0]) {
                for(int j=0;j<cols;j++) {
                    if(target==matrix[i][j]) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}