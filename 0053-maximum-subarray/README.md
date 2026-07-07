<h2><a href="https://leetcode.com/problems/maximum-subarray">53. Maximum Subarray</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, find the <span data-keyword="subarray-nonempty">subarray</span> with the largest sum, and return <em>its sum</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-2,1,-3,4,-1,2,1,-5,4]
<strong>Output:</strong> 6
<strong>Explanation:</strong> The subarray [4,-1,2,1] has the largest sum 6.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The subarray [1] has the largest sum 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [5,4,-1,7,8]
<strong>Output:</strong> 23
<strong>Explanation:</strong> The subarray [5,4,-1,7,8] has the largest sum 23.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> If you have figured out the <code>O(n)</code> solution, try coding another solution using the <strong>divide and conquer</strong> approach, which is more subtle.</p>
## 💡 My Approach

### Brute Force

- Consider every possible subarray using two nested loops.
- For each starting index, keep adding elements to calculate the sum of every possible ending index.
- Update the maximum subarray sum whenever a larger sum is found.

**Time Complexity:** `O(n²)`
- The outer loop selects the starting index.
- The inner loop extends the subarray while maintaining its sum.

**Space Complexity:** `O(1)`

---

### Optimized (Kadane's Algorithm)

- Traverse the array while maintaining a **running sum**.
- Add the current element to the running sum.
- Update the maximum subarray sum with the current running sum.
- If the running sum becomes negative, reset it to `0` because a negative sum will only decrease the sum of any future subarray.
- Continue until the end of the array.

**Time Complexity:** `O(n)`
- The array is traversed only once.

**Space Complexity:** `O(1)`
- Only two variables (`sum` and `maxSum`) are used.
