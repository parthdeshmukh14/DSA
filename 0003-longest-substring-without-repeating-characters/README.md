<h2><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">3. Longest Substring Without Repeating Characters</a></h2><h3>Medium</h3><hr><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without duplicate characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3. Note that <code>&quot;bca&quot;</code> and <code>&quot;cab&quot;</code> are also correct answers.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= s.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
</ul>
## Approach 1: Brute Force (HashSet)

- Start a substring from every index of the string.
- Use a `HashSet` to store the characters of the current substring.
- Keep extending the substring until a duplicate character is found.
- Update the maximum length of the substring containing unique characters.

### Time Complexity
- **O(n²)**

### Space Complexity
- **O(n)**

---

## Approach 2: Sliding Window (Optimal)

- Use two pointers (`left` and `right`) to maintain a window of unique characters.
- Store the current window's characters in a `HashSet`.
- If the current character is not present in the set, add it, update the maximum length, and move `right`.
- If a duplicate character is found, remove characters from the left side of the window until the duplicate is removed, then continue expanding the window.
- This ensures every character is processed at most twice.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(n)**
