Remove Duplicates from Sorted Array

LeetCode: 26
Difficulty: Easy
Language: Java
Topic: Array, Two Pointers

Intuition

Since the array is sorted, duplicate elements are next to each other. Use two pointers: j to scan the array and k to place unique elements.

Approach
Start k = 1.
Compare nums[j] with nums[j-1].
If different, store nums[j] at nums[k].
Increment k.
Return k.
Complexity
Time: O(n)
Space: O(1)
