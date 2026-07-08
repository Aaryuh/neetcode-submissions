class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        PriorityQueue<FreqTracker> maxHeap = new PriorityQueue<>((a, b) -> b.fq - a.fq);
        HashMap<Integer, Integer> valToFreq = new HashMap();

        for(int i = 0; i<nums.length; i++){
            if(!valToFreq.containsKey(nums[i])){
                valToFreq.put(nums[i], 0);
            }

            valToFreq.put(nums[i], valToFreq.get(nums[i])+1);
        }

        for(int a : valToFreq.keySet()){
            FreqTracker cur = new FreqTracker(a, valToFreq.get(a));
            maxHeap.add(cur);
        }

        int[] result = new int[k];

        for(int j = 0; j < k; j++){
            result[j] = maxHeap.poll().value;
        }

        return result; 
    }
}

class FreqTracker{
    int value;
    int fq;

    FreqTracker(int val, int freq){
        this.value = val;
        this.fq = freq;
    }
}
