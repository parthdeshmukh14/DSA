<h2><a href="https://leetcode.com/problems/longest-common-prefix">14. Longest Common Prefix</a></h2><h3>Easy</h3><hr><p>Write a function to find the longest common prefix string amongst an array of strings.</p>

<p>If there is no common prefix, return an empty string <code>&quot;&quot;</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> strs = [&quot;flower&quot;,&quot;flow&quot;,&quot;flight&quot;]
<strong>Output:</strong> &quot;fl&quot;
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> strs = [&quot;dog&quot;,&quot;racecar&quot;,&quot;car&quot;]
<strong>Output:</strong> &quot;&quot;
<strong>Explanation:</strong> There is no common prefix among the input strings.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= strs.length &lt;= 200</code></li>
	<li><code>0 &lt;= strs[i].length &lt;= 200</code></li>
	<li><code>strs[i]</code> consists of only lowercase English letters if it is non-empty.</li>
</ul>




## 💡 My Approach (Vertical Scanning)

- Use the first string as the reference since the longest common prefix cannot be longer than it.
- Traverse the first string character by character.
- For each character position, compare the corresponding character with every other string.
- If any string ends (`i >= strs[j].length()`) or a character mismatch is found, return the prefix from index `0` to `i`.
- If all characters of the first string are successfully compared, the first string itself is the longest common prefix.

**Time Complexity:** `O(N × M)`

- `N` = Number of strings.
- `M` = Length of the shortest/common prefix limit.
- For each character position, every string is checked until a mismatch is found.

**Space Complexity:** `O(1)`

- Uses only a few extra variables and no additional data structures.
- The returned substring is the required output and is not counted as auxiliary space.
