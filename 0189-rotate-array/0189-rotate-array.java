class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
    }

    public void reverseArray(int[] num, int start, int end)
    {
        while(start < end)
        {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }
}