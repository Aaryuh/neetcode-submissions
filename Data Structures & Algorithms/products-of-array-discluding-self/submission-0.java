class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixes = new int[nums.length];
        int[] suffixes = new int[nums.length];
        int suff = 1;
        int pref = 1;

        for(int i = 0; i < nums.length; i++){
            prefixes[i] = pref;
            pref *= nums[i];
        }

        for(int j = nums.length-1; j >= 0; j--){
            suffixes[j] = suff;
            suff *= nums[j];
        }

        for(int k = 0; k < nums.length; k++){
            result[k] = prefixes[k]*suffixes[k];
        }

        return result;
    }
}  
