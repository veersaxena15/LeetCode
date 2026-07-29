class Solution {
    public boolean isPowerOfThree(int n) {

        //If n is a power of 3, then it must divide 1162261467
        //If n is not a power of 3 (e.g., 6, 12, 45), it cannot divide 3^19 exactly
        return n > 0 && 1162261467 % n == 0;
        


        // if(n  <= 0)
        //     return false;

        // while(n % 3 == 0)
        //     n = n / 3;

        // return n == 1;
    }
}