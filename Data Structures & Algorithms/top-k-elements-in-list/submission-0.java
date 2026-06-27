class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap<Integer, ArrayList<Integer>> sortedCounts = new TreeMap<>();
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!counts.containsKey(nums[i])){
                counts.put(nums[i], 1);
            }
            else{
                counts.put(nums[i], counts.get(nums[i])+1);
            }
            int currCount = counts.get(nums[i]);
            int prevCount = currCount -1;

            if(sortedCounts.containsKey(Integer.valueOf(currCount))){
                sortedCounts.get(currCount).add(nums[i]);
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                sortedCounts.put(Integer.valueOf(currCount), temp);
            }
            if(currCount!=1){
                sortedCounts.get(prevCount).remove(Integer.valueOf(nums[i]));
            }
        }
        int numPuts = 0;
        int[] result = new int[k];
        while(numPuts < k){
            ArrayList<Integer> x = sortedCounts.pollLastEntry().getValue();
            for(int i = 0; i < x.size(); i++){
                result[numPuts] = x.get(i);
                numPuts++;
                if(result.length==numPuts){
                    break;
                }
            }
        }
        return result;
    }
}
