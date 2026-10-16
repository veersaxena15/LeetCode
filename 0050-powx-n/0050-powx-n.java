class Solution {
    public double myPow(double x, int n) {
        
        long N = n;

        return power(x, N);
    }

    public static double power(double x, long N)
    {

        if(N == 0)
            return 1.0;

        if(N < 0)
            return 1.0 / power(x, -N);

        double half = power(x, N / 2);

        if(N % 2 == 0)
            return half * half;

        return x * half * half;
    }
}