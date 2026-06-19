class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int currSum = 0;
        int maxSum = 0;

        for(int i=0;i<n;i++){
            currSum+= gain[i];
            if (currSum > maxSum){ 
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}