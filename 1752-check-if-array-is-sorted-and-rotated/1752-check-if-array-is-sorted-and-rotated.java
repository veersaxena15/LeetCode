class Solution {
    public boolean check(int[] nums) {
        int dip = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])
            dip++;
        }
        //if(nums[nums.length-1]>nums[0])
        //dip++;

        if(dip <= 1)
        return true;
        
        else
        return false;
    }
}