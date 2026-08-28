class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        int[] counts = new int[totalElements + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counts[grid[i][j]]++;
            }
        }
        
        int repeated = -1;
        int missing = -1;
        for (int num = 1; num <= totalElements; num++) {
            if (counts[num] == 2) {
                repeated = num;
            } else if (counts[num] == 0) {
                missing = num;
            }
        }
        
        return new int[]{repeated, missing};
    }
}