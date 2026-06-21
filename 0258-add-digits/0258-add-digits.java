class Solution {
    public int addDigits(int num) {
        //Method 1..
        if(num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;

        //Method 2..
        //int sum = 0;
        //while(sum > 9 || num != 0)
        //{
        //    if(num > 0)
        //    {
        //    int lastDigit = num % 10;
        //    sum = sum + lastDigit;
        //    num = num/10;
        //    }
        //    else{
        //        int lastDigit = sum % 10;
        //        sum = sum/10;
        //        sum = sum + lastDigit;
        //    }
        //}
        //return sum;

        //Method 3..
        //if(num == 0){
        //    return 0;
        //}
        //if(num % 9 == 0){
        //  return 9;
        //}
        //return num % 9;
    }
}