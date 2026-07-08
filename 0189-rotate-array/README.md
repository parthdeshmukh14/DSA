<h2><a href="https://leetcode.com/problems/rotate-array">189. Rotate Array</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<ul>
	<li>Try to come up with as many solutions as you can. There are at least <strong>three</strong> different ways to solve this problem.</li>
	<li>Could you do it in-place with <code>O(1)</code> extra space?</li>
</ul>
## 💡 My Approach

### Better Approach (Using Temporary Array)

- Store the last `k` elements of the array in a temporary array.
- Shift the remaining `n-k` elements to the right by `k` positions.
- Copy the elements from the temporary array back to the first `k` positions.
- This successfully rotates the array to the right while preserving the order of all elements.

**Time Complexity:** `O(n)`
- Copy last `k` elements → `O(k)`
- Shift remaining `n-k` elements → `O(n-k)`
- Copy back `k` elements → `O(k)`
- Overall: `O(n)`

**Space Complexity:** `O(k)`
- An extra array of size `k` is used.

---

### Optimal Approach (Reverse Array Pattern)

- Observe that rotating the array can be achieved using three reversals.
- First, reverse the entire array.
- Then, reverse the first `k` elements.
- Finally, reverse the remaining `n-k` elements.
- The three reversals place every element in its correct rotated position without using any extra array.

**Time Complexity:** `O(n)`
- The array is traversed a constant number of times.

**Space Complexity:** `O(1)`
- Rotation is performed in-place using only a few variables.
