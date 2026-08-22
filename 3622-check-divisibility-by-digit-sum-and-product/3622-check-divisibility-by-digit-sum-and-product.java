class Solution {
    public boolean checkDivisibility(int n) {
        
        int temp = n;
        int sum = 0, product = 1;
        while(temp > 0)
        {
            int a = temp % 10;
            sum = sum + a;
            product = product * a;
            temp = temp / 10;
        }
        return (n % (sum + product) == 0);
    }
}