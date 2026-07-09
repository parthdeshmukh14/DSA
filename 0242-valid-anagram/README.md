<h2><a href="https://leetcode.com/problems/valid-anagram">242. Valid Anagram</a></h2><h3>Easy</h3><hr><p>Given two strings <code>s</code> and <code>t</code>, return <code>true</code> if <code>t</code> is an <span data-keyword="anagram">anagram</span> of <code>s</code>, and <code>false</code> otherwise.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;anagram&quot;, t = &quot;nagaram&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;rat&quot;, t = &quot;car&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length, t.length &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>s</code> and <code>t</code> consist of lowercase English letters.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> What if the inputs contain Unicode characters? How would you adapt your solution to such a case?</p>
## 💡 My Approach

### Better Approach (HashMap - Frequency Counting)

- First, check if the lengths of both strings are equal. If not, they cannot be anagrams.
- Use a `HashMap<Character, Integer>` to store the frequency of each character in the first string.
- Traverse the first string and increment the frequency of every character.
- Traverse the second string:
  - If the character is not present in the map, return `false`.
  - Otherwise, decrement its frequency.
  - If the frequency becomes `0`, remove that character from the map.
- After processing both strings, if the map is empty, both strings contain the same characters with the same frequencies.

**Time Complexity:** `O(n)`

- Build frequency map → `O(n)`
- Traverse second string → `O(n)`
- Overall → `O(n)`

**Space Complexity:** `O(n)`

- In the worst case, the HashMap stores all unique characters of the string.

---

### Optimal Approach (Frequency Array)

- Observe that the problem contains only lowercase English letters (`a-z`), so instead of a `HashMap`, use an integer array of size `26` to store character frequencies.
- Traverse the first string and increment the frequency of each character using:
  ```java
  freq[s.charAt(i) - 'a']++;
  ```
- Traverse the second string and decrement the frequency of each character using:
  ```java
  freq[t.charAt(i) - 'a']--;
  ```
- Finally, iterate through the frequency array. If every frequency is `0`, both strings contain exactly the same characters with the same frequencies and are anagrams; otherwise, they are not.

**Time Complexity:** `O(n)`

- Count frequencies from the first string → `O(n)`
- Decrease frequencies using the second string → `O(n)`
- Verify the 26-element frequency array → `O(1)`
- Overall → `O(n)`

**Space Complexity:** `O(1)`

- Uses a fixed-size frequency array of length `26`, independent of the input size.
