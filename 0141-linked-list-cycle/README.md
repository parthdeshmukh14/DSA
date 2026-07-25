<h2><a href="https://leetcode.com/problems/linked-list-cycle">141. Linked List Cycle</a></h2><h3>Easy</h3><hr><p>Given <code>head</code>, the head of a linked list, determine if the linked list has a cycle in it.</p>

<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the&nbsp;<code>next</code>&nbsp;pointer. Internally, <code>pos</code>&nbsp;is used to denote the index of the node that&nbsp;tail&#39;s&nbsp;<code>next</code>&nbsp;pointer is connected to.&nbsp;<strong>Note that&nbsp;<code>pos</code>&nbsp;is not passed as a parameter</strong>.</p>

<p>Return&nbsp;<code>true</code><em> if there is a cycle in the linked list</em>. Otherwise, return <code>false</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist.png" style="width: 300px; height: 97px; margin-top: 8px; margin-bottom: 8px;" />
<pre>
<strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test2.png" style="width: 141px; height: 74px;" />
<pre>
<strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> true
<strong>Explanation:</strong> There is a cycle in the linked list, where the tail connects to the 0th node.
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/07/circularlinkedlist_test3.png" style="width: 45px; height: 45px;" />
<pre>
<strong>Input:</strong> head = [1], pos = -1
<strong>Output:</strong> false
<strong>Explanation:</strong> There is no cycle in the linked list.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of the nodes in the list is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
	<li><code>pos</code> is <code>-1</code> or a <strong>valid index</strong> in the linked-list.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong> Can you solve it using <code>O(1)</code> (i.e. constant) memory?</p>


# Approach 1: HashSet (Brute Force)

- Traverse the linked list from the head.
- Store each visited node in a `HashSet<ListNode>`.
- Before adding a node to the HashSet, check if it already exists in the set.
- If the node is already present, it means we have visited the same node before, so a cycle exists.
- If we reach `null`, the linked list has no cycle.

### Time Complexity

- **O(n)**

Each node is visited at most once, and HashSet operations (`contains` and `add`) take **O(1)** on average.

### Space Complexity

- **O(n)**

In the worst case, all nodes are stored in the HashSet.

---

# Approach 2: Fast & Slow Pointer (Optimal)

- Initialize two pointers:
  - `slow` moves one node at a time.
  - `fast` moves two nodes at a time.
- Traverse the linked list while `fast` and `fast.next` are not `null`.
- In each iteration:
  - Move `slow` one step.
  - Move `fast` two steps.
- If at any point `slow == fast`, both pointers have met inside the cycle, so return `true`.
- If `fast` reaches `null` (or `fast.next` becomes `null`), the linked list has no cycle.

### Time Complexity

- **O(n)**

Each pointer traverses the linked list at most once.

### Space Complexity

- **O(1)**

Only two pointers are used, and no extra data structure is required.
