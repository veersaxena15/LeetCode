class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i = n; i < n + 10; i++)
        {
            if(digitProduct(i) % t == 0)
                return i;
        }
        return -1;
    }
    public int digitProduct(int num)
    {
        int product = 1;

        while(num > 0)
        {
            product *= (num % 10);
            num /= 10;
        }
        return product;
    }
}