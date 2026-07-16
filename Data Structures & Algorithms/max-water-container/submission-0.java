class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max = Integer.MIN_VALUE;
        int height = 0;
        int width = 0;

        while(l < r){
            height = Math.min(heights[l], heights[r]);
            width = r - l;
            if(height*width > max){
                max = height*width;
            }
            if(height == heights[l]){
                l++;
            }else{
                r--;
            }
        } 
        
        return max;
    }
}
