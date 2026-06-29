class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String result = "";
        for(int i = array.length-2; i >= 0; i--){
            result += array[i];
        }
        result += "1";
        return result;
    }
}