<h2><a href="https://leetcode.com/problems/3sum">15. 3Sum</a></h2><h3>Medium</h3><hr><p>Given an integer array nums, return all the triplets <code>[nums[i], nums[j], nums[k]]</code> such that <code>i != j</code>, <code>i != k</code>, and <code>j != k</code>, and <code>nums[i] + nums[j] + nums[k] == 0</code>.</p>

<p>Notice that the solution set must not contain duplicate triplets.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,0,1,2,-1,-4]
<strong>Output:</strong> [[-1,-1,2],[-1,0,1]]
<strong>Explanation:</strong> 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,1]
<strong>Output:</strong> []
<strong>Explanation:</strong> The only possible triplet does not sum up to 0.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,0,0]
<strong>Output:</strong> [[0,0,0]]
<strong>Explanation:</strong> The only possible triplet sums up to 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>3 &lt;= nums.length &lt;= 3000</code></li>
	<li><code>-10<sup>5</sup> &lt;= nums[i] &lt;= 10<sup>5</sup></code></li>
</ul>
## Approach 1: Brute Force

- Use three nested loops to generate every possible triplet.
- If the sum of the three elements is `0`, store the triplet.
- Sort each triplet before storing it in a `HashSet` to avoid duplicate triplets.
- Convert the `HashSet` to a `List` and return the result.

### Time Complexity
- **O(n³)**

### Space Complexity
- **O(k)** (for storing unique triplets in the `HashSet`, where `k` is the number of unique triplets)

---

## Approach 2: Optimal (Sorting + Two Pointers)

- Sort the array.
- Fix one element at a time and use two pointers (`left` and `right`) to find the remaining two elements whose sum makes the total equal to `0`.
- If the current sum is less than `0`, move the `left` pointer to increase the sum.
- If the current sum is greater than `0`, move the `right` pointer to decrease the sum.
- If the sum is `0`, store the triplet and skip duplicate values for both pointers as well as the fixed element to avoid duplicate triplets.

### Time Complexity
- **O(n²)**

### Space Complexity
- **O(1)** (excluding the output list)
