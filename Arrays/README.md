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

Best Time to Buy and Sell Stock

LeetCode: 121
Difficulty: Easy
Language: Java
Topic: Array, Greedy

Intuition

Keep track of the lowest price seen so far and calculate the profit for each price. Update the maximum profit whenever a better profit is found.

Approach
Start minPrice with Integer.MAX_VALUE.
Traverse the array once.
Update minPrice when a lower price is found.
Calculate the current profit.
Update maxProfit.
Return maxProfit.
Complexity
Time: O(n)
Space: O(1)
