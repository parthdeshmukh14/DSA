<h2><a href="https://leetcode.com/problems/move-zeroes">283. Move Zeroes</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code>, move all <code>0</code>&#39;s to the end of it while maintaining the relative order of the non-zero elements.</p>

<p><strong>Note</strong> that you must do this in-place without making a copy of the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [0,1,0,3,12]
<strong>Output:</strong> [1,3,12,0,0]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0]
<strong>Output:</strong> [0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you minimize the total number of operations done?


## 💡 My Approach (Brute Force)

- Traverse the array using two nested loops.
- For every index `i`, check if `nums[i]` is `0`.
- If it is `0`, search for the next non-zero element (`j > i`).
- Once a non-zero element is found, swap it with the zero.
- Continue this process until all zeros are shifted towards the end of the array while maintaining the relative order of non-zero elements.

### Time Complexity
- **O(n²)**
  - The outer loop runs `n` times.
  - For each zero, the inner loop may scan the remaining part of the array.

### Space Complexity
- **O(1)**
  - No extra data structure is used; all operations are performed in-place.
