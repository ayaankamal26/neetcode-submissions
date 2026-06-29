class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int curCount = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                curCount++;
            }
            else if(s.charAt(i) == ')'){
                curCount --;
            }
            if(curCount > max){
                max = curCount;
            }
        }
        return max;
    }
}