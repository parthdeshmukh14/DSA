<h2><a href="https://leetcode.com/problems/reverse-string">344. Reverse String</a></h2><h3>Easy</h3><hr><p>Write a function that reverses a string. The input string is given as an array of characters <code>s</code>.</p>

<p>You must do this by modifying the input array <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> with <code>O(1)</code> extra memory.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = ["h","e","l","l","o"]
<strong>Output:</strong> ["o","l","l","e","h"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = ["H","a","n","n","a","h"]
<strong>Output:</strong> ["h","a","n","n","a","H"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is a <a href="https://en.wikipedia.org/wiki/ASCII#Printable_characters" target="_blank">printable ascii character</a>.</li>
</ul>
## 💡 My Approach (Optimal)

- Use the **Two Pointer** technique by placing one pointer at the beginning of the character array and the other at the end.
- Swap the characters at both pointers.
- Move the left pointer one step forward and the right pointer one step backward after every swap.
- Continue this process until both pointers meet or cross each other.
- Since the swaps are performed directly on the input array, the string is reversed **in-place** without using any extra array.

**Time Complexity:** `O(n)`
- Each character is visited at most once.

**Space Complexity:** `O(1)`
- No extra space is used; the reversal is performed in-place.

---

## 🧠 Pattern Learned

**Two Pointer Pattern**

- Place one pointer at the start and another at the end.
- Perform the required operation (comparison, swap, etc.) on both pointers.
- Move the pointers towards each other until they meet or cross.
- This pattern is commonly used for:
  - Reverse String
  - Valid Palindrome
  - Remove Duplicates from Sorted Array
  - Container With Most Water
  - Two Sum II (Sorted Array)
