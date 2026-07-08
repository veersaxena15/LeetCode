class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++)
        {
            if(count[i] != 0)
            return false;
        }
        
        return true;

        // String str3 = "", str4 = "";
        // if(s.length() == t.length())
        // {
        // for(int i = 97; i <= 122; i++)
        // {
        //     for(int j = 0; j < t.length(); j++)
        //     {
        //         char ch1 = s.charAt(j);
        //         char ch2 = t.charAt(j);

        //         int as1 = (int)ch1;
        //         int as2 = (int)ch2;

        //         if(as1 == i)
        //         {
        //             str3 = str3 + ch1;
        //         }
        //         if(as2 == i)
        //         {
        //             str4 = str4 + ch2;
        //         }
        //     }
        // }
        // return str3.equals(str4);
        // }
        // return false;
    }
}