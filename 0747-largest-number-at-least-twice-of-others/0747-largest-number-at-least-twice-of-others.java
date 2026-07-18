class Solution {
    public int dominantIndex(int[] nums) {
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(first < nums[i])
            {
                second = first;
                first = nums[i];
                index = i;
            }
            else if(second < nums[i])
            {
                second = nums[i];
            }
        }
        if(first >= 2*second)
            return index;
        
        else
            return -1;
    }
}