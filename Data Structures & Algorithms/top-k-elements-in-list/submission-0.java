class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        //hashmap to store the freq. of each number
        HashMap<Integer, Integer> freqCounter = new HashMap();

        //arraylist of int array, each storing the numbers at an index which
        //represents its occurance frequency

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];

        for(int i = 0; i < nums.length; i++){
            if(!freqCounter.containsKey(nums[i])){
                freqCounter.put(nums[i], 0);
            }
            freqCounter.put(nums[i], freqCounter.get(nums[i]) + 1);
        }

        for(int a: freqCounter.keySet()){
            int freq = freqCounter.get(a);
            if (buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(a);
        }

        int[] result = new int[k];
        int index = 0;
        for(int j = buckets.length-1; j >= 0; j--){
            
            if(buckets[j] != null){
                for(int i: buckets[j]){
                    result[index] = i;
                    index++;
                    if(index == k){
                        return result;
                    }
                }

            }   
            
        }
        return result;
    }
}
