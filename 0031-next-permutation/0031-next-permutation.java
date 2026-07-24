class Solution {
    public void nextPermutation(int[] nums) {
        
        int pivot = -1;

        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] < nums[i + 1])
            {
                pivot = i;
                break;
            }
        }

        if(pivot == -1)
        {
            reverse(nums, 0);
            return;
        }

        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[pivot] < nums[i])
            {
                int temp = nums[pivot];
                nums[pivot] = nums[i];
                nums[i] = temp;

                break;
            }
        }
        reverse(nums, pivot + 1);
    }
    void reverse(int[] nums, int left)
    {
        int right = nums.length - 1;
        while(left < right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++; right--;
        }
    }
}