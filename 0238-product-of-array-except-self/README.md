<h2><a href="https://leetcode.com/problems/product-of-array-except-self">238. Product of Array Except Self</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, return <em>an array</em> <code>answer</code> <em>such that</em> <code>answer[i]</code> <em>is equal to the product of all the elements of</em> <code>nums</code> <em>except</em> <code>nums[i]</code>.</p>

<p>The product of any prefix or suffix of <code>nums</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</p>

<p>You must write an algorithm that runs in&nbsp;<code>O(n)</code>&nbsp;time and without using the division operation.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3,4]
<strong>Output:</strong> [24,12,8,6]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [-1,1,0,-3,3]
<strong>Output:</strong> [0,0,9,0,0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-30 &lt;= nums[i] &lt;= 30</code></li>
	<li>The input is generated such that <code>answer[i]</code> is <strong>guaranteed</strong> to fit in a <strong>32-bit</strong> integer.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong>&nbsp;Can you solve the problem in <code>O(1)</code>&nbsp;extra&nbsp;space complexity? (The output array <strong>does not</strong> count as extra space for space complexity analysis.)</p>
## 💡 My Approach

### Brute Force

- Traverse the array using an outer loop.
- For every index `i`, calculate the product of all elements except `nums[i]`.
- Use an inner loop to traverse the entire array.
- Skip the current index (`i == j`) and multiply all other elements.
- Store the final product in the result array.

**Time Complexity:** `O(n²)`
- The outer loop runs `n` times.
- For each index, the inner loop traverses the entire array.

**Space Complexity:** `O(1)` *(excluding the output array)*

---

### Optimized (Prefix & Suffix Product)

- Observe that the answer for every index is:
  - **Product of all elements to the left × Product of all elements to the right**
- In the first pass, store the **prefix product** directly in the result array.
  - `res[i]` contains the product of all elements before index `i`.
- In the second pass, traverse from right to left while maintaining a `suffixProduct` variable.
- Multiply `res[i]` (prefix product) with `suffixProduct` to get the final answer for each index.
- Update `suffixProduct` after processing each element.
- This avoids creating separate prefix and suffix arrays, making the solution space-efficient.

**Time Complexity:** `O(n)`
- One pass to compute prefix products.
- One pass to incorporate suffix products.

**Space Complexity:** `O(1)` *(excluding the output array)*
- Uses only one extra variable (`suffixProduct`).
