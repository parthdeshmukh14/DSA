<h2><a href="https://leetcode.com/problems/two-sum">1. Two Sum</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code><font face="monospace">&nbsp;</font>time complexity?


---

# My Approach

## Brute Force

- Check every possible pair of elements in the array.
- For each element, compare it with all the remaining elements.
- If the sum of any pair equals the target, return their indices.
- Since every pair is checked, this approach is inefficient for large inputs.

## Optimized Approach

- Use a `HashMap` to store each number along with its index.
- Traverse the array once.
- For each element:
  - Calculate the required complement as `target - currentElement`.
  - Check if the complement already exists in the `HashMap`.
    - If it exists, return the indices of the complement and the current element.
    - Otherwise, store the current element and its index in the `HashMap`.
- This allows us to find the required pair in a single traversal.

## Complexity

### Brute Force
- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`

### Optimized
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

## Key Learning

- Whenever a problem involves finding a value quickly while traversing an array, consider using a `HashMap`.
- A `HashMap` provides average `O(1)` lookup time, reducing the overall complexity from **O(n²)** to **O(n)**.
