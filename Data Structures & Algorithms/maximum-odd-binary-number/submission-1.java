class Solution {
    public String maximumOddBinaryNumber(String s) {
        String ones = "";
        String zeros = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zeros += "0";
            }
            else{
                ones += "1";
            }
        }
        ones = ones.substring(0, ones.length()-1);
        return ones + zeros + "1";
    }
}