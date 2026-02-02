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

⚫**58. Length of Last Word**

**Problem Description**

Given a string s consisting of words and spaces, return the length of the last word in the string.

**Solution Approach**

**The solution follows a two-step process:**
  1. Trim trailing spaces by iterating from the end of the string and removing spaces until a non-space character is found.

  2. Count characters from the end of the trimmed string until a space is encountered or the beginning is reached.

**Algorithm Complexity**

Time Complexity: O(n) - where n is the length of the string

Space Complexity: O(n) - due to StringBuilder creation

**Example**

Input: s = "Hello World"

**Explanation:** The last word is "World" with length 5.

Input: s = "   fly me   to   the moon  "

Output: 4



**🔵5. Longest Palindromic Substring**

**Problem:** 
This solution finds the longest palindromic substring in a given string s.

**Approach**
Current Implementation: Brute Force
1. Uses nested loops to generate all possible substrings
2. For each substring, checks if it's a palindrome using the check() helper method
3. Tracks and returns the longest palindrome found

**Time Complexity**
O(n³) where n is the length of the string:
O(n²) for generating all substrings
O(n) for checking each substring

**Space Complexity**
O(1) additional space (excluding the output string)

**Note:**
This is a basic/naive approach that works but is inefficient for larger inputs. I plan to implement more optimized solutions (like dynamic programming or expand-around-center approaches) in the future to improve performance

   
