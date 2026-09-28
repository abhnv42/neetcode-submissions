class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0, end = 0;
        int longestSubstring = 0;
        int highestFrequency = 0;

        if(s.length() == 1) return 1;
        
        int[] counts = new int[26];
        
        while(end < s.length()) {
            counts[s.charAt(end) - 'A']++;

            highestFrequency = Math.max(highestFrequency, counts[s.charAt(end) - 'A']);
            end++;

            if((end - start) - highestFrequency > k) {
                counts[s.charAt(start) - 'A']--;
                start++;
            }

            longestSubstring = Math.max(longestSubstring, end - start);
        }

        return longestSubstring;
    }
}
