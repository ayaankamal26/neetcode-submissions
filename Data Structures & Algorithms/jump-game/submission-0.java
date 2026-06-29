class Solution {
    public boolean canJump(int[] nums) {
        int moreJumps = 0;
        for(int i = 0; i < nums.length; i++){
            if(moreJumps < nums[i]){
                moreJumps = nums[i];
            }
            if(moreJumps < 1 && i < nums.length-1){
                return false;
            }
            moreJumps--;
        }
        return true;
    }
}
