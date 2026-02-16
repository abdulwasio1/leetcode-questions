# 🟢**392. Is Subsequence**

   **Problem Description**

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence is formed by deleting some (or none) of the characters from the original string without changing the relative order of the remaining characters.

   **Approach/Steps**
1. The solution uses a two-pointer technique:
2. Pointer i traverses string s (the subsequence to check)
3. Pointer j traverses string t (the main string)
4. We iterate through t, and whenever s.charAt(i) matches t.charAt(j), we increment i
5. Finally, if i equals the length of s, all characters were found in order
   



 # 🔵**125. Valid Palindrome**
     
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

# ⚫**58. Length of Last Word**

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



# **🔵5. Longest Palindromic Substring**

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


# **🟢1910. Remove All Occurrences of a Substring**

This solution removes all occurrences of a given substring part from string s.

**Approach**
1. Find and Remove: Uses string::find() to locate the first occurrence of part in s
2. Iterative Removal: Continues finding and removing occurrences until none remain
3. In-Place Modification: Modifies the original string directly using erase()

**Complexity**
Time: O(n²) in worst case where part appears many times (due to repeated string shifting)
Space: O(1) - modifies the string in-place

**Example**
Solution sol;
string result = sol.removeOccurrences("daabcbaabcbc", "abc");



# ⚪**1929. Concatenation of Array Solution**


**Problem Description**

Given an integer array nums of length n, return a new array ans of length 2 * n where ans is the concatenation of two nums arrays.

**Solution Approach**

The solution creates a new vector ans with double the length of the input array, then copies the elements from nums twice to achieve concatenation.

**Key Features**

Time Complexity: O(n) - Single pass through the array

Space Complexity: O(n) - Creates a new array of size 2n

Simple Logic: Uses a single index variable to track position in the original array

**How It Works**

Calculate the size n of the input array

Create result array ans with size 2 * n

Iterate through ans while cycling through nums indices

Reset the index tracker when reaching the midpoint (n)

Copy elements from nums to corresponding positions in ans


# 📌 4. Median of Two Sorted Arrays
### 📖 Description

This solution finds the median of two sorted integer arrays by merging them into a single array and then computing the median.

It follows a straightforward approach:

Combine both arrays into one new array.

Sort the merged array.

Return the middle value (or average of two middle values if total length is even).

### ⚙️ How It Works
**Step 1: Merge Arrays**

A new array nums3 is created with size equal to the sum of both input arrays.

Elements from nums1 and nums2 are copied sequentially into nums3.

**Step 2: Sort**

The merged array is sorted using:

Arrays.sort(nums3);

**Step 3: Find Median**

If total length is odd → return middle element.

If total length is even → return average of two middle elements.

**🧮 Median Logic**

Odd length:

median = nums3[n / 2]


**Even length:**

median = (nums3[n/2] + nums3[n/2 - 1]) / 2.0

### ⏱ Time & Space Complexity

Time Complexity:
O((m + n) log(m + n))
(due to sorting)

Space Complexity:
O(m + n)
(extra array used for merging)

### 🚫 Limitation

Although correct, this is not the optimal solution for the classic
“Median of Two Sorted Arrays” problem from
LeetCode,
which expects a time complexity of O(log(min(m, n))).

This implementation prioritizes simplicity over optimal performance.



   
