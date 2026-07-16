<h2><a href="https://leetcode.com/problems/binary-search">792. Binary Search</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code> which is sorted in ascending order, and an integer <code>target</code>, write a function to search <code>target</code> in <code>nums</code>. If <code>target</code> exists, then return its index. Otherwise, return <code>-1</code>.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 9
<strong>Output:</strong> 4
<strong>Explanation:</strong> 9 exists in nums and its index is 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,3,5,9,12], target = 2
<strong>Output:</strong> -1
<strong>Explanation:</strong> 2 does not exist in nums so return -1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt; nums[i], target &lt; 10<sup>4</sup></code></li>
	<li>All the integers in <code>nums</code> are <strong>unique</strong>.</li>
	<li><code>nums</code> is sorted in ascending order.</li>
</ul>
## Approach 1: Brute Force

- Traverse the array from left to right.
- Compare each element with the target.
- If the target is found, return its index.
- If the traversal completes without finding the target, return `-1`.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**

---

## Approach 2: Binary Search (Optimal)

- Since the array is sorted, use Binary Search instead of checking every element.
- Maintain two pointers: `low` and `high`.
- Find the middle element.
- If the middle element is the target, return its index.
- If the target is greater than the middle element, search in the right half.
- Otherwise, search in the left half.
- Repeat until the target is found or the search space becomes empty.

### Time Complexity
- **O(log n)**

### Space Complexity
- **O(1)**
