class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int begRow = 0;
        int begCol = 0;
        int endRow = rows-1;
        int endCol = columns - 1;
        int checkRow = -1;
while (begRow <= endRow) {
            int midRow = begRow + (endRow - begRow) / 2;
            if (target >= matrix[midRow][0] && (midRow == rows - 1 || target < matrix[midRow + 1][0])) {
                checkRow = midRow;
                break;
            } else if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else {
                begRow = midRow + 1;
            }
        }

        // If no valid row is found, target is not in matrix
        if (begRow > endRow) {
            return false;
        }
        while(begCol<=endCol){
            int midCol = begCol + ((endCol-begCol)/2);
            if(target == matrix[checkRow][midCol]){
                return true;
            }
            else if(target>matrix[checkRow][midCol]){
                begCol = midCol+1;
            }
            else{
                endCol = midCol-1;
            }
        }
        return false;
    }
}
