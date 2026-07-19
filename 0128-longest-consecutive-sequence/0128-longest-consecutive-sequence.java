class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
            set.add(num);

        int longest = 1;

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                int current = num;
                int count = 1;

                while(set.contains(current + 1))
                {
                    current += 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }

        //Intermediate Solution
        // Arrays.sort(nums);
        // int longest = 1;
        // int count = 0;
        // int lastSmall = Integer.MIN_VALUE;

        // if(nums.length == 0)
        //     return 0;
        // for(int i = 0; i < nums.length; i++)
        // {
        //     if(nums[i] - 1 == lastSmall)
        //     {
        //         count = count + 1;
        //         lastSmall = nums[i];
        //     }
        //     else if(nums[i] != lastSmall)
        //     {
        //         count = 1;
        //         lastSmall = nums[i];
        //     }
        //     longest = Math.max(longest, count);
        // }
        return longest;
    }
}