<h2><a href="https://leetcode.com/problems/insert-into-a-binary-search-tree">784. Insert into a Binary Search Tree</a></h2><h3>Medium</h3><hr><p>You are given the <code>root</code> node of a binary search tree (BST) and a <code>value</code> to insert into the tree. Return <em>the root node of the BST after the insertion</em>. It is <strong>guaranteed</strong> that the new value does not exist in the original BST.</p>

<p><strong>Notice</strong>&nbsp;that there may exist&nbsp;multiple valid ways for the&nbsp;insertion, as long as the tree remains a BST after insertion. You can return <strong>any of them</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/insertbst.jpg" style="width: 752px; height: 221px;" />
<pre>
<strong>Input:</strong> root = [4,2,7,1,3], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
<strong>Explanation:</strong> Another accepted tree is:
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/05/bst.jpg" style="width: 352px; height: 301px;" />
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [40,20,60,10,30,50,70], val = 25
<strong>Output:</strong> [40,20,60,10,30,50,70,null,null,25]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [4,2,7,1,3,null,null,null,null,null,null], val = 5
<strong>Output:</strong> [4,2,7,1,3,5]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in&nbsp;the tree will be in the range <code>[0,&nbsp;10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>8</sup> &lt;= Node.val &lt;= 10<sup>8</sup></code></li>
	<li>All the values <code>Node.val</code> are <strong>unique</strong>.</li>
	<li><code>-10<sup>8</sup> &lt;= val &lt;= 10<sup>8</sup></code></li>
	<li>It&#39;s <strong>guaranteed</strong> that <code>val</code> does not exist in the original BST.</li>
</ul>

# 💡 My Approach (BST Insertion + Recursion)

- Since the given tree is a **Binary Search Tree (BST)**, compare the value to be inserted with the current node.
- If the current node is `null`, create a new node and return it.
- If the value is smaller than the current node, recursively insert it into the left subtree.
- If the value is greater than the current node, recursively insert it into the right subtree.
- After the recursive call, reconnect the updated subtree to the current node.
- Finally, return the current node so that its parent can reconnect the updated subtree.

**Time Complexity:** `O(log n)` (Balanced BST), `O(n)` (Skewed BST)

**Space Complexity:** `O(log n)` (Balanced BST), `O(n)` (Skewed BST) due to the recursion (call stack).

---

# 🧠 Pattern Learned

## BST Modification using Recursion

### Intuition

- In BST problems, first compare the value with the current node.
- If the value is smaller, move to the left subtree.
- If the value is greater, move to the right subtree.
- When a `null` position is reached, create a new node there.

### Why do we write `root.left = recursiveCall()`?

When we recursively insert into the left subtree, the recursive function returns the **updated left subtree**.

So the parent reconnects it using:

```java
root.left = insertIntoBST(root.left, val);
```

Similarly,

```java
root.right = insertIntoBST(root.right, val);
```

This ensures that any changes made inside the subtree are attached back to the parent.

### Why do we `return root`?

Each recursive call returns the **root of the updated subtree**.

The parent node receives this updated subtree and reconnects it to its left or right child.

### Key Difference

#### Searching / Calculating

If the tree is **not modified**, simply return the recursive result.

```java
return searchBST(root.left, val);
```

Examples:
- Search in BST
- Maximum Depth
- Path Sum
- Diameter of Binary Tree

#### Modifying the Tree

If the tree **changes**, reconnect the updated subtree.

```java
root.left = insertIntoBST(root.left, val);
return root;
```

Examples:
- Insert into BST
- Delete Node in BST
- Trim BST
- Invert Binary Tree

### Pattern to Remember

- **Need an answer?**
  ```java
  return recursiveCall(...);
  ```

- **Need an updated tree?**
  ```java
  root.left = recursiveCall(...);
  // or
  root.right = recursiveCall(...);

  return root;
  ```

### Complexity

- **Time Complexity:** Number of nodes visited.
- **Space Complexity:** Height of the tree (Recursion uses the Call Stack).

> **Recursion internally uses the Call Stack (Stack Data Structure).** Every recursive function call is pushed onto the stack and popped when it finishes. Therefore, the recursion depth determines the extra space used.****
