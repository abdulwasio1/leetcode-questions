**392. Is Subsequence**
**Problem Description**
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence is formed by deleting some (or none) of the characters from the original string without changing the relative order of the remaining characters.
**Approach/Steps**
1. The solution uses a two-pointer technique:
2. Pointer i traverses string s (the subsequence to check)
3. Pointer j traverses string t (the main string)
4. We iterate through t, and whenever s.charAt(i) matches t.charAt(j), we increment i
5. Finally, if i equals the length of s, all characters were found in order
