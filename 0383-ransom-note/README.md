<h2><a href="https://leetcode.com/problems/ransom-note">383. Ransom Note</a></h2><h3>Easy</h3><hr><p>Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code><em> if </em><code>ransomNote</code><em> can be constructed by using the letters from </em><code>magazine</code><em> and </em><code>false</code><em> otherwise</em>.</p>

<p>Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> ransomNote = "a", magazine = "b"
<strong>Output:</strong> false
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "ab"
<strong>Output:</strong> false
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> ransomNote = "aa", magazine = "aab"
<strong>Output:</strong> true
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= ransomNote.length, magazine.length &lt;= 10<sup>5</sup></code></li>
	<li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters.</li>
</ul>
## Approach

- Create a `HashMap<Character, Integer>` to store the frequency of each character in `magazine`.
- Traverse the `magazine` string and count the occurrences of every character.
- Traverse the `ransomNote` string:
  - If the character is not present in the map or its frequency is `0`, return `false`.
  - Otherwise, decrement its frequency by `1` since that character has been used.
- If all characters are successfully matched, return `true`.

### Time Complexity
- **O(m + n)**
  - `m` = length of `magazine`
  - `n` = length of `ransomNote`

### Space Complexity
- **O(1)** (At most 26 lowercase English letters are stored in the HashMap.)
