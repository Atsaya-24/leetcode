class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int SumOfn = (n*(n+1))/2;
        int SumOfNums =0;
        for(int i=0;i<nums.length; i++ ){
            SumOfNums+=nums[i];
        }
        return SumOfn - SumOfNums;

    }
}