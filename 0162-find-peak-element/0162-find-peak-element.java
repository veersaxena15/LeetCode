class Solution {
    public int findPeakElement(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left < right)
        {
            int mid = left + (right - left)/2;

            //downhill
            if(nums[mid] > nums[mid + 1])
                right = mid;

            //uphill
            else if(nums[mid] < nums[mid + 1])
                left = mid + 1;
        }
        return left;
    }
}