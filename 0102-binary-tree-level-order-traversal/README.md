<h2><a href="https://leetcode.com/problems/binary-tree-level-order-traversal">102. Binary Tree Level Order Traversal</a></h2><h3>Medium</h3><hr><p>Given the <code>root</code> of a binary tree, return <em>the level order traversal of its nodes&#39; values</em>. (i.e., from left to right, level by level).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" />
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> [[3],[9,20],[15,7]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [[1]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 2000]</code>.</li>
	<li><code>-1000 &lt;= Node.val &lt;= 1000</code></li>
</ul>

# 💡 My Approach (Level Order Traversal - BFS)

- If the tree is empty, return an empty list.
- Create a `Queue<TreeNode>` and insert the root node.
- Traverse the tree level by level using the queue.
- Before processing each level, store the current queue size. This represents the total number of nodes present at that level.
- Create a new list to store the values of the current level.
- Process exactly `size` nodes:
  - Remove the front node from the queue.
  - Add its value to the current level list.
  - If the left child exists, add it to the queue.
  - If the right child exists, add it to the queue.
- After processing all nodes of the current level, add the level list to the final answer.
- Repeat until the queue becomes empty.

**Time Complexity:** `O(n)`
- Every node is visited exactly once.

**Space Complexity:** `O(n)`
- In the worst case, the queue may contain all nodes of the largest level of the tree.

---

# 🧠 Pattern Learned

## Breadth First Search (BFS) / Level Order Traversal

### Intuition

- Think **level by level**, not depth by depth.
- Start by putting the root node into the queue.
- Repeatedly:
  - Remove one node from the front of the queue.
  - Process the current node.
  - Ask:
    - **Do you have a left child?**
      - If yes, add it to the queue.
    - **Do you have a right child?**
      - If yes, add it to the queue.
- Continue until the queue becomes empty.

### Key Observation

- `queue.size()` before processing a level tells us **how many nodes belong to the current level**.
- Any children added while processing those nodes automatically belong to the **next level**.
- Therefore, after processing exactly `size` nodes, one complete level is finished.

### Data Structure Used

- **Queue (FIFO)**
  - Nodes are processed in the same order in which they are discovered.

### Pattern Applications

- Binary Tree Level Order Traversal
- Binary Tree Right Side View
- Binary Tree Zigzag Level Order Traversal
- Minimum Depth of Binary Tree
- Populating Next Right Pointers
- Graph BFS Traversal
