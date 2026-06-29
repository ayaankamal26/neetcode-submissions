class Solution {
    public int maxSubArray(int[] nums) {
        int biggestSum = nums[0];
        int curSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (curSum + nums[i] < 0) {
                if(nums[i] > biggestSum){
                    biggestSum = nums[i];
                }
                if (nums[i] > 0) {
                    curSum = nums[i];
                } else {
                    curSum = 0;
                }
            } else {
                curSum += nums[i];
                if (curSum > biggestSum) {
                    biggestSum = curSum;
                }
            }

        }
        return biggestSum;
    }
}
