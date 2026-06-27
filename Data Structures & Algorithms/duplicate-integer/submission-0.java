class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int i : nums){
            numSet.add(i);
        }
        if(numSet.size() != nums.length){
            return true;
        }
        return false;
    }
}