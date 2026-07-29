<h2><a href="https://leetcode.com/problems/powx-n">50. Pow(x, n)</a></h2><h3>Medium</h3><hr><p>Implement <a href="http://www.cplusplus.com/reference/valarray/pow/" target="_blank">pow(x, n)</a>, which calculates <code>x</code> raised to the power <code>n</code> (i.e., <code>x<sup>n</sup></code>).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> x = 2.00000, n = 10
<strong>Output:</strong> 1024.00000
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> x = 2.10000, n = 3
<strong>Output:</strong> 9.26100
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> x = 2.00000, n = -2
<strong>Output:</strong> 0.25000
<strong>Explanation:</strong> 2<sup>-2</sup> = 1/2<sup>2</sup> = 1/4 = 0.25
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-100.0 &lt; x &lt; 100.0</code></li>
	<li><code>-2<sup>31</sup> &lt;= n &lt;= 2<sup>31</sup>-1</code></li>
	<li><code>n</code> is an integer.</li>
	<li>Either <code>x</code> is not zero or <code>n &gt; 0</code>.</li>
	<li><code>-10<sup>4</sup> &lt;= x<sup>n</sup> &lt;= 10<sup>4</sup></code></li>
</ul>
## Approach 1: Brute Force

- Initialize the answer as `1`.
- If the exponent is negative:
  - Convert the base to its reciprocal (`1 / x`).
  - Convert the exponent to a positive value.
- Multiply the answer by `x` exactly `n` times using a loop.
- Return the final answer.
- This approach is simple and easy to understand, but it becomes inefficient for very large exponents because it performs one multiplication for every power.

### Time Complexity
- **O(n)**
  - The loop runs `n` times.

### Space Complexity
- **O(1)**
  - Only a few variables are used.

---

## Approach 2: Binary Exponentiation (Optimal)

- Observe that repeatedly multiplying the number is unnecessary.
- If the exponent is **even**, square the base and halve the exponent.
- If the exponent is **odd**, multiply the current base into the answer, then continue by squaring the base and halving the exponent.
- If the exponent is negative:
  - Convert the base to `1 / x`.
  - Convert the exponent to a positive value.
- Continue until the exponent becomes `0`.
- This significantly reduces the number of multiplications required.

### Time Complexity
- **O(log n)**
  - The exponent is divided by `2` in every iteration.

### Space Complexity
- **O(1)**
  - Only constant extra space is used.
