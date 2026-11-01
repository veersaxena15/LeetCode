class Solution {
    public int jump(int[] nums) {
        
        int maxReach = 0;
        int currentend = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(i > currentend)
                return -1;

            if(maxReach < (nums[i] + i))
            {
                maxReach = nums[i] + i;
            }

            if(i == currentend && i < nums.length - 1)
            {
                count++;
                currentend = maxReach;
            }

        }
        return count;
    }
}