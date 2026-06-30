class Solution {
    public boolean detectCapitalUse(String word) {
        int countCase = 0;

        for(int i=0; i<word.length(); i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            countCase++;
        }
        return countCase == word.length()
            || countCase == 0
            || (countCase == 1 && Character.isUpperCase(word.charAt(0)));
    }
}