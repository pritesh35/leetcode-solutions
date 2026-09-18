1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int start = 0;
4        int maxLen = 0;
5        Set<Character> set = new HashSet<>();
6
7        for(int end = 0; end < s.length(); end++){
8            char c = s.charAt(end);
9
10            while(set.contains(c)){
11                set.remove(s.charAt(start));
12                start++;
13            }
14            set.add(c);
15            maxLen = Math.max(maxLen, end - start + 1);
16        }
17        return maxLen;
18    }
19}