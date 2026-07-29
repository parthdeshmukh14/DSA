<h2><a href="https://leetcode.com/problems/fibonacci-number">1013. Fibonacci Number</a></h2><h3>Easy</h3><hr><p>The <b>Fibonacci numbers</b>, commonly denoted <code>F(n)</code> form a sequence, called the <b>Fibonacci sequence</b>, such that each number is the sum of the two preceding ones, starting from <code>0</code> and <code>1</code>. That is,</p>

<pre>
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n &gt; 1.
</pre>

<p>Given <code>n</code>, calculate <code>F(n)</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> n = 2
<strong>Output:</strong> 1
<strong>Explanation:</strong> F(2) = F(1) + F(0) = 1 + 0 = 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> n = 3
<strong>Output:</strong> 2
<strong>Explanation:</strong> F(3) = F(2) + F(1) = 1 + 1 = 2.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> n = 4
<strong>Output:</strong> 3
<strong>Explanation:</strong> F(4) = F(3) + F(2) = 2 + 1 = 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= n &lt;= 30</code></li>
</ul>
## Approach 1: Recursion

- Use the Fibonacci recurrence relation:
  - `fib(n) = fib(n - 1) + fib(n - 2)`
- Define the base cases:
  - If `n == 0`, return `0`.
  - If `n == 1`, return `1`.
- For every other value of `n`, recursively calculate the previous two Fibonacci numbers and return their sum.
- This approach is simple and closely follows the mathematical definition of the Fibonacci sequence, but it recalculates the same subproblems multiple times, making it inefficient.

### Time Complexity
- **O(2ⁿ)**
  - Many recursive calls compute the same Fibonacci numbers repeatedly.

### Space Complexity
- **O(n)**
  - Due to the recursion call stack.

---

## Approach 2: Optimized Iterative Solution

- Observe that each Fibonacci number depends only on the previous two numbers.
- Initialize:
  - `left = 0` (Fibonacci of 0)
  - `right = 1` (Fibonacci of 1)
- Iterate from `2` to `n`:
  - Calculate the current Fibonacci number as `left + right`.
  - Update `left` to `right`.
  - Update `right` to the newly calculated Fibonacci number.
- After the loop, return the final Fibonacci number.
- This approach avoids recursion and computes each Fibonacci number only once.

### Time Complexity
- **O(n)**
  - The loop runs exactly `n - 1` times.

### Space Complexity
- **O(1)**
  - Only three variables are used regardless of the input size.

---

## Optimization

- The recursive solution repeatedly calculates the same Fibonacci numbers, leading to exponential time complexity.
- The optimized iterative solution stores only the last two Fibonacci numbers and computes the next one in constant time.
- This reduces:
  - **Time Complexity:** `O(2ⁿ)` → `O(n)`
  - **Space Complexity:** `O(n)` → `O(1)`
