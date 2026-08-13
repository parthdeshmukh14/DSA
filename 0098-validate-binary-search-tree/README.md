<h2><a href="https://leetcode.com/problems/validate-binary-search-tree">98. Validate Binary Search Tree</a></h2><h3>Medium</h3><hr><p>Given the <code>root</code> of a binary tree, <em>determine if it is a valid binary search tree (BST)</em>.</p>

<p>A <strong>valid BST</strong> is defined as follows:</p>

<ul>
	<li>The left <span data-keyword="subtree">subtree</span> of a node contains only nodes with keys&nbsp;<strong>strictly less than</strong> the node&#39;s key.</li>
	<li>The right subtree of a node contains only nodes with keys <strong>strictly greater than</strong> the node&#39;s key.</li>
	<li>Both the left and right subtrees must also be binary search trees.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/01/tree1.jpg" style="width: 302px; height: 182px;" />
<pre>
<strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg" style="width: 422px; height: 292px;" />
<pre>
<strong>Input:</strong> root = [5,1,4,null,null,3,6]
<strong>Output:</strong> false
<strong>Explanation:</strong> The root node&#39;s value is 5 but its right child&#39;s value is 4.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.</li>
	<li><code>-2<sup>31</sup> &lt;= Node.val &lt;= 2<sup>31</sup> - 1</code></li>
</ul>
# 💡 My Approach (Validate Binary Search Tree)

- A valid BST cannot be verified by comparing a node only with its immediate left and right child.
- Every node must satisfy a **valid range** decided by all of its ancestors.
- Start from the root with the range `(-∞, +∞)`.
- If the current node's value is outside the allowed range, return `false`.
- Recursively validate:
  - Left subtree with the updated maximum as the current node's value.
  - Right subtree with the updated minimum as the current node's value.
- If all recursive calls satisfy their valid ranges, the tree is a valid BST.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(h)`
- Balanced BST: `O(log n)`
- Skewed BST: `O(n)`

---

# 🧠 Pattern Learned

## DFS + Recursion + Range Validation

### Intuition

The BST property is **not**:

- `root > root.left`
- `root < root.right`

Instead, it is:

- Every node in the **left subtree** must be **less than the current node**.
- Every node in the **right subtree** must be **greater than the current node**.

This means every recursive call must know the **minimum** and **maximum** values that the current node is allowed to have.

---

## Why Parent-Child Comparison Fails

Consider the tree:

```text
       10
      /  \
     5    15
         /
        6
```

Checking only parent and child:

- `10 > 5` ✅
- `10 < 15` ✅
- `15 > 6` ✅

Everything seems correct.

But `6` is in the **right subtree of 10**, so it should also satisfy:

```
6 > 10
```

which is false.

Therefore, this is **not** a valid BST.

---

## Range Concept

Initially,

```text
Root

Allowed Range:
(-∞, +∞)
```

Moving left:

```text
Left Subtree

(-∞, root.val)
```

Moving right:

```text
Right Subtree

(root.val, +∞)
```

Every recursive call receives its own valid range.

---

## Recursive Pattern

### Base Case

```java
if(root == null){
    return true;
}
```

An empty subtree is always a valid BST.

---

### Invalid Node

```java
if(root.val <= min || root.val >= max){
    return false;
}
```

If the current node violates its allowed range, the entire tree becomes invalid.

---

### Recursive Calls

```java
return validate(root.left, min, root.val) &&
       validate(root.right, root.val, max);
```

- Left subtree inherits the old minimum.
- Maximum becomes the current node.
- Right subtree inherits the old maximum.
- Minimum becomes the current node.

---

## Why We Pass `min` and `max`

Each recursive call carries the constraints created by all ancestor nodes.

Instead of checking only the parent, every node checks whether it lies inside its allowed range.

---

## Pattern Recognition

This problem introduces a new recursion pattern.

### Return Information

```java
return recursiveCall(...);
```

Examples:

- Search BST
- Maximum Depth
- Path Sum

---

### Modify the Tree

```java
root.left = recursiveCall(...);
return root;
```

Examples:

- Insert into BST
- Delete Node in BST

---

### Pass State in Recursion

```java
validate(root.left, min, root.val);

validate(root.right, root.val, max);
```

Examples:

- Validate BST
- Many advanced DFS problems
- Backtracking with constraints

---

## Complexity

### Time Complexity

- Every node is visited exactly once.

**Time:** `O(n)`

---

### Space Complexity

- Recursion uses the Call Stack.
- Maximum recursion depth equals the height of the tree.

Balanced Tree:

```
O(log n)
```

Skewed Tree:

```
O(n)
```

---

## ⭐ Key Takeaway

Whenever a recursive problem depends on information from ancestor nodes, **pass that information as parameters** instead of trying to recompute it.

For **Validate BST**, that information is the valid **minimum** and **maximum** range for every node.
