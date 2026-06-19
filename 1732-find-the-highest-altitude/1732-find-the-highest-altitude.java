class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int currSum = 0;
        int maxSum = 0;

        for(int i=0;i<n;i++){
            currSum+= gain[i];
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}