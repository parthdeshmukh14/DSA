<h2><a href="https://leetcode.com/problems/invert-binary-tree">226. Invert Binary Tree</a></h2><h3>Easy</h3><hr><p>Given the <code>root</code> of a binary tree, invert the tree, and return <em>its root</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg" style="width: 500px; height: 165px;" />
<pre>
<strong>Input:</strong> root = [4,2,7,1,3,6,9]
<strong>Output:</strong> [4,7,2,9,6,3,1]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg" style="width: 500px; height: 120px;" />
<pre>
<strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> [2,3,1]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

## Approach

1. If the current node is `null`, return `null`.
2. Swap the left and right child of the current node.
3. Recursively invert the left subtree.
4. Recursively invert the right subtree.
5. Return the root.

### Time Complexity
- **O(n)** — Every node is visited exactly once.

### Space Complexity
- **O(h)** — Recursive call stack, where `h` is the height of the tree.
  - Worst case: **O(n)** (skewed tree)
  - Balanced tree: **O(log n)**
```
