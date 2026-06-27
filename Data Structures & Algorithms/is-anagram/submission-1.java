class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            smap.putIfAbsent(s.charAt(i),0);
            tmap.putIfAbsent(t.charAt(i),0);
            smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
            tmap.put(t.charAt(i), tmap.get(t.charAt(i))+1);
        }
        for(Character key : smap.keySet()){
            if(!smap.get(key).equals(tmap.get(key))){
                return false;
            }
        }
        return true;
    }
}
