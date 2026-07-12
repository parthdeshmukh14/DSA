<h2><a href="https://leetcode.com/problems/valid-palindrome-ii">680. Valid Palindrome II</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code>, return <code>true</code> <em>if the </em><code>s</code><em> can be palindrome after deleting <strong>at most one</strong> character from it</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;aba&quot;
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abca&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> You could delete the character &#39;c&#39;.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abc&quot;
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s</code> consists of lowercase English letters.</li>
</ul>

## Approach

- Use two pointers, `left` and `right`, to compare characters from both ends of the string.
- If the characters match, move both pointers inward.
- If a mismatch occurs, we get only one chance to remove a character.
- Instead of actually deleting a character, check both possibilities:
  - Skip the left character and verify if the remaining substring is a palindrome.
  - Skip the right character and verify if the remaining substring is a palindrome.
- If either substring is a palindrome, return `true`; otherwise, return `false`.

### Time Complexity
- **O(n)**

### Space Complexity
- **O(1)**
