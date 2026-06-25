class Solution {
    public int lengthOfLastWord(String s) {
        //Method 1...
        //s = s.trim();

        //int index = s.lastIndexOf(" ");
        //String s1 = s.substring(index + 1, s.length());

        //return s1.length();

        //Method 2...
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;

        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}