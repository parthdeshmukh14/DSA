<h2><a href="https://leetcode.com/problems/reverse-linked-list">206. Reverse Linked List</a></h2><h3>Easy</h3><hr><p>Given the <code>head</code> of a singly linked list, reverse the list, and return <em>the reversed list</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex1.jpg" style="width: 542px; height: 222px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,4,5]
<strong>Output:</strong> [5,4,3,2,1]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev1ex2.jpg" style="width: 182px; height: 222px;" />
<pre>
<strong>Input:</strong> head = [1,2]
<strong>Output:</strong> [2,1]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> head = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is the range <code>[0, 5000]</code>.</li>
	<li><code>-5000 &lt;= Node.val &lt;= 5000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> A linked list can be reversed either iteratively or recursively. Could you implement both?</p>



# Approach

We reverse the linked list by changing the direction of the `next` pointers instead of modifying the node values.

- Initialize three pointers:
  - `prev` → points to the previous node (initially `null`).
  - `current` → points to the current node (initially `head`).
  - `next` → temporarily stores the next node before changing the link.
- Traverse the linked list until `current` becomes `null`.
- For each node:
  - Store the next node in `next`.
  - Reverse the link by pointing `current.next` to `prev`.
  - Move `prev` to the current node.
  - Move `current` to the saved `next` node.
- After the traversal, `prev` points to the new head of the reversed linked list.

## Time Complexity

- **O(n)**

We traverse the linked list only once.

## Space Complexity

- **O(1)**

Only three pointers (`prev`, `current`, and `next`) are used, regardless of the size of the linked list.
