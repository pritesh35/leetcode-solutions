# [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/2144130013/)

### 🏷️ Difficulty: `Medium` | 🌐 Platform: `LeetCode` | ⚡ Language: `JAVA`

---

### 📝 Problem Description
Given the problem statement, implement the optimal solution passing all test cases.

---

### 💻 Solution (JAVA)
```java
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
```

---
*Auto-synced with ⚡ [SyncTool AI](https://github.com/pritesh35/leetcode-solutions)*
