<h2><a href="https://leetcode.com/problems/sort-colors">75. Sort Colors</a></h2><h3>Medium</h3><hr><p>Given an array <code>nums</code> with <code>n</code> objects colored red, white, or blue, sort them <strong><a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> </strong>so that objects of the same color are adjacent, with the colors in the order red, white, and blue.</p>

<p>We will use the integers <code>0</code>, <code>1</code>, and <code>2</code> to represent the color red, white, and blue, respectively.</p>

<p>You must solve this problem without using the library&#39;s sort function.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,0,2,1,1,0]
<strong>Output:</strong> [0,0,1,1,2,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,0,1]
<strong>Output:</strong> [0,1,2]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 300</code></li>
	<li><code>nums[i]</code> is either <code>0</code>, <code>1</code>, or <code>2</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong>&nbsp;Could you come up with a one-pass algorithm using only&nbsp;constant extra space?</p>
## Approach 1: Brute Force

- Use two nested loops to compare every pair of elements.
- If the current element is greater than the next element, swap them.
- Continue until the array is sorted in ascending order.

### Time Complexity
- **O(n²)**

### Space Complexity
- **O(1)**

---

## Approach 2: Dutch National Flag Algorithm (Optimal)

- Maintain three pointers:
  - `low` → Position where the next `0` should be placed.
  - `mid` → Current element being processed.
  - `high` → Position where the next `2` should be placed.
- Traverse the array while `mid <= high`:
  - If `nums[mid] == 0`, swap it with `nums[low]` and increment both `low` and `mid`.
  - If `nums[mid] == 1`, it is already in the correct position, so increment `mid`.
  - If `nums[mid] == 2`, swap it with `nums[high]` and decrement `high` (do not increment `mid` because the swapped element needs to be checked).

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**
