<h2><a href="https://leetcode.com/problems/middle-of-the-linked-list">908. Middle of the Linked List</a></h2><h3>Easy</h3><hr><p>Given the <code>head</code> of a singly linked list, return <em>the middle node of the linked list</em>.</p>

<p>If there are two middle nodes, return <strong>the second middle</strong> node.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist1.jpg" style="width: 544px; height: 65px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,4,5]
<strong>Output:</strong> [3,4,5]
<strong>Explanation:</strong> The middle node of the list is node 3.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-midlist2.jpg" style="width: 664px; height: 65px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,4,5,6]
<strong>Output:</strong> [4,5,6]
<strong>Explanation:</strong> Since the list has two middle nodes with values 3 and 4, we return the second one.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[1, 100]</code>.</li>
	<li><code>1 &lt;= Node.val &lt;= 100</code></li>
</ul>

# Approach 1: Better Solution (Two Traversals)

- Traverse the linked list once to count the total number of nodes.
- Calculate the middle position using `mid = nodeCount / 2`.
- Reset the pointer to the head of the linked list.
- Traverse the list again by moving `mid` steps from the head.
- Return the current node, which will be the middle node.
- For an even-length linked list, this naturally returns the **second middle node**, as required.

### Time Complexity

- **O(n)**

Two traversals of the linked list are performed.

### Space Complexity

- **O(1)**

Only a few pointer variables are used.

---

# Approach 2: Optimal (Fast & Slow Pointer)

- Initialize two pointers:
  - `slow` moves one node at a time.
  - `fast` moves two nodes at a time.
- Traverse the linked list while `fast` and `fast.next` are not `null`.
- In each iteration:
  - Move `slow` one step.
  - Move `fast` two steps.
- When the `fast` pointer reaches the end of the list, the `slow` pointer will be at the middle node.
- Return the `slow` pointer.

### Time Complexity

- **O(n)**

The linked list is traversed only once.

### Space Complexity

- **O(1)**

Only two pointers are used, regardless of the size of the linked list.
