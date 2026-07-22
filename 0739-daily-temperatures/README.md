<h2><a href="https://leetcode.com/problems/daily-temperatures">739. Daily Temperatures</a></h2><h3>Medium</h3><hr><p>Given an array of integers <code>temperatures</code> represents the daily temperatures, return <em>an array</em> <code>answer</code> <em>such that</em> <code>answer[i]</code> <em>is the number of days you have to wait after the</em> <code>i<sup>th</sup></code> <em>day to get a warmer temperature</em>. If there is no future day for which this is possible, keep <code>answer[i] == 0</code> instead.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> temperatures = [73,74,75,71,69,72,76,73]
<strong>Output:</strong> [1,1,4,2,1,1,0,0]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> temperatures = [30,40,50,60]
<strong>Output:</strong> [1,1,1,0]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> temperatures = [30,60,90]
<strong>Output:</strong> [1,1,0]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;=&nbsp;temperatures.length &lt;= 10<sup>5</sup></code></li>
	<li><code>30 &lt;=&nbsp;temperatures[i] &lt;= 100</code></li>
</ul>
## Approach 1: Brute Force

- For each day's temperature, check every following day until a warmer temperature is found.
- Maintain a counter to count the number of days waited.
- If a warmer temperature is found, store the count in the answer array.
- If no warmer temperature exists, the answer remains `0` (default value).
- Repeat this process for every index in the array.

### Time Complexity
- **O(n²)**
  - For every element, we may scan all remaining elements.

### Space Complexity
- **O(1)** (excluding the output array)

---

## Approach 2: Optimal (Monotonic Decreasing Stack)

- Use a stack to store the **indices** of temperatures whose next warmer day has not been found yet.
- Traverse the temperature array from left to right.
- For each current temperature:
  - While the stack is not empty and the current temperature is greater than the temperature at the index stored on the top of the stack:
    - Pop the previous index.
    - Calculate the number of days waited as:
      `currentIndex - previousIndex`
    - Store this value in the answer array.
- Push the current index onto the stack.
- Any indices left in the stack do not have a warmer future temperature, so their answers remain `0`.

### Time Complexity
- **O(n)**
  - Each index is pushed onto the stack once and popped at most once.

### Space Complexity
- **O(n)**
  - In the worst case (strictly decreasing temperatures), all indices are stored in the stack.
