class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
         int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows * cols - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int row = mid / cols;
            int col = mid % cols;
            
            if (arr[row][col] == target)
                return true;
            else if (arr[row][col] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return false;
    }
}