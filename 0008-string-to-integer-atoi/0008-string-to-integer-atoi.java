class Solution {
    public int myAtoi(String s) {
        
        int i = 0;
        int sign = 1;
        long num = 0;

        //skip white space
        while(i < s.length() && s.charAt(i) == ' ')
        {
            i++;
        }

        //check sign
        if(i < s.length() && s.charAt(i) == '-')
        {
            sign = -1;
            i++;
        }
        else if(i < s.length() && s.charAt(i) == '+')
            i++;

        //Builing a number
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')
        {
            num = num * 10 + (s.charAt(i) - '0');

            //Overflow condition
            if(sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }
        return (int)(sign * num);
    }
}