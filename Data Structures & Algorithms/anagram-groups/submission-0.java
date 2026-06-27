class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<String> chars = new ArrayList();
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){

            char[] lettersInWord = strs[i].toCharArray();
            Arrays.sort(lettersInWord);
            String sorted = new String(lettersInWord);
            if(!chars.contains(sorted)){
                chars.add(sorted);
                ArrayList<String> groupOfAnagrams = new ArrayList();
                groupOfAnagrams.add(strs[i]);
                result.add(chars.size()-1, groupOfAnagrams);
            }
            else{
                result.get(chars.indexOf(sorted)).add(strs[i]);
            }
        }
        return result;
    }
}
