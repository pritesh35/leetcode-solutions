class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();

        for(int end = 0; end < s.length(); end++){
            char c = s.charAt(end);

            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}