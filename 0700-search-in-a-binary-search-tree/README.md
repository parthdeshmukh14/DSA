<h2><a href="https://leetcode.com/problems/search-in-a-binary-search-tree">783. Search in a Binary Search Tree</a></h2><h3>Easy</h3><hr><p>You are given the <code>root</code> of a binary search tree (BST) and an integer <code>val</code>.</p>

<p>Find the node in the BST that the node&#39;s value equals <code>val</code> and return the subtree rooted with that node. If such a node does not exist, return <code>null</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/12/tree1.jpg" style="width: 422px; height: 302px;" />
<pre>
<strong>Input:</strong> root = [4,2,7,1,3], val = 2
<strong>Output:</strong> [2,1,3]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/12/tree2.jpg" style="width: 422px; height: 302px;" />
<pre>
<strong>Input:</strong> root = [4,2,7,1,3], val = 5
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 5000]</code>.</li>
	<li><code>1 &lt;= Node.val &lt;= 10<sup>7</sup></code></li>
	<li><code>root</code> is a binary search tree.</li>
	<li><code>1 &lt;= val &lt;= 10<sup>7</sup></code></li>
</ul>
# 💡 My Approach (BST Property + Recursion)

- Since the given tree is a **Binary Search Tree (BST)**, we do not need to traverse every node.
- Start from the root and compare the target value with the current node.
- If the current node's value is equal to the target, return the current node.
- If the target is smaller than the current node's value, recursively search the left subtree.
- If the target is greater than the current node's value, recursively search the right subtree.
- If we reach a `null` node, the value is not present in the tree, so return `null`.

**Time Complexity:** `O(log n)` (Balanced BST), `O(n)` (Skewed BST)

**Space Complexity:** `O(log n)` (Balanced BST), `O(n)` (Skewed BST) due to recursion stack.

---

# 🧠 Pattern Learned

## Binary Search Tree (BST) + Recursion

### Intuition

- A BST follows one important property:
  - Every value in the left subtree is smaller than the current node.
  - Every value in the right subtree is greater than the current node.
- Because of this property, we can eliminate half of the tree at every step, just like Binary Search on an array.
- At each recursive call:
  - If `root.val == val`, return the current node.
  - If `val < root.val`, search only in the left subtree.
  - If `val > root.val`, search only in the right subtree.

### Key Observation

- We return a **TreeNode**, not an integer or a list.
- Returning the current node automatically returns its entire subtree because the node already contains references to its `left` and `right` children.
- There is no need to manually add child nodes to the answer.

### Recursive Flow

1. Base Case:
   - If `root == null`, return `null`.

2. Value Found:
   - If `root.val == val`, return `root`.

3. Recursive Step:
   - If `val < root.val`, search the left subtree.
   - Otherwise, search the right subtree.

### Pattern Applications

- Search in a Binary Search Tree
- Insert into a BST
- Delete Node in a BST
- Lowest Common Ancestor in BST
- Validate Binary Search Tree
- Trim a Binary Search Tree
