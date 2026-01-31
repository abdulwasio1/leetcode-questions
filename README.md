🟢**392. Is Subsequence**

   **Problem Description**

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence is formed by deleting some (or none) of the characters from the original string without changing the relative order of the remaining characters.

   **Approach/Steps**
1. The solution uses a two-pointer technique:
2. Pointer i traverses string s (the subsequence to check)
3. Pointer j traverses string t (the main string)
4. We iterate through t, and whenever s.charAt(i) matches t.charAt(j), we increment i
5. Finally, if i equals the length of s, all characters were found in order
   



🔵**125. Valid Palindrome**
     
  **Problem Description**

Given a string s, return true if it is a palindrome after converting all uppercase letters to lowercase and removing all non-alphanumeric characters.
A phrase is a palindrome if, after the above processing, it reads the same forward and backward.

  **Solution Approach**

The solution uses a two-pointer technique with string preprocessing:
Convert the entire string to lowercase
Filter out non-alphanumeric characters using ASCII values
Use two pointers (start and end) to compare characters from both ends

**Algorithm Steps**

1. Preprocessing: Convert string to lowercase
2. Filtering: Build a new string containing only alphanumeric characters (a-z, 0-9)
3. Validation: Use two pointers to compare characters:
4. Move start forward and end backward
5. Return false immediately if characters don't match
6 .Return true if all comparisons pass
