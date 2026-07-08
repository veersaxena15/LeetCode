class Solution {
    public boolean isAnagram(String s, String t) {

        String str3 = "", str4 = "";
        int s1 = 0, s2 = 0;
        int n1 = s.length();
        int n2 = t.length();
        if(n1 == n2)
        {
        for(int i = 65; i <= 90; i++)
        {
            String str1 = s.toUpperCase();
            String str2 = t.toUpperCase();

            for(int j = 0; j < n2; j++)
            {
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);

                int as1 = (int)ch1;
                int as2 = (int)ch2;

                if(as1 == i)
                {
                    str3 = str3 + ch1;
                    s1 += as1;
                }
                if(as2 == i)
                {
                    str4 = str4 + ch2;
                    s2 += as2;
                }
            }
        }
        return str3.equals(str4) && s1 == s2;
        }
        return false;
    }
}