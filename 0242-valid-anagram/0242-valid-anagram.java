class Solution {
    public boolean isAnagram(String s, String t) {

        String str3 = "", str4 = "";
        if(s.length() == t.length())
        {
        for(int i = 65; i <= 90; i++)
        {
            String str1 = s.toUpperCase();
            String str2 = t.toUpperCase();

            for(int j = 0; j < t.length(); j++)
            {
                char ch1 = str1.charAt(j);
                char ch2 = str2.charAt(j);

                int as1 = (int)ch1;
                int as2 = (int)ch2;

                if(as1 == i)
                {
                    str3 = str3 + ch1;
                }
                if(as2 == i)
                {
                    str4 = str4 + ch2;
                }
            }
        }
        return str3.equals(str4);
        }
        return false;
    }
}