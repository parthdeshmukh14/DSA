<h2><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock">121. Best Time to Buy and Sell Stock</a></h2><h3>Easy</h3><hr><p>You are given an array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>

<p>You want to maximize your profit by choosing a <strong>single day</strong> to buy one stock and choosing a <strong>different day in the future</strong> to sell that stock.</p>

<p>Return <em>the maximum profit you can achieve from this transaction</em>. If you cannot achieve any profit, return <code>0</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,1,5,3,6,4]
<strong>Output:</strong> 5
<strong>Explanation:</strong> Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> prices = [7,6,4,3,1]
<strong>Output:</strong> 0
<strong>Explanation:</strong> In this case, no transactions are done and the max profit = 0.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= prices.length &lt;= 10<sup>5</sup></code></li>
	<li><code>0 &lt;= prices[i] &lt;= 10<sup>4</sup></code></li>
</ul>

---

# My Approach

## Brute Force

- Consider every possible day as the buying day.
- For each buying day, iterate through all the remaining days as possible selling days.
- Calculate the profit for every valid buy-sell pair.
- Keep track of the maximum profit obtained.
- Since every pair is checked, this approach results in **Time Limit Exceeded (TLE)** for large inputs.

## Optimized Approach

- Traverse the array only once.
- Maintain a variable `buy` to store the minimum stock price encountered so far.
- For every price:
  - If the current price is less than `buy`, update `buy`.
  - Otherwise, calculate the profit as `currentPrice - buy`.
  - Update the maximum profit if the current profit is greater.
- This ensures we always buy at the lowest price before selling.

## Complexity

### Brute Force
- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`

### Optimized
- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

## Key Learning

- Instead of checking every possible buy-sell pair, keep track of the minimum buying price seen so far while traversing the array.
- This reduces the time complexity from **O(n²)** to **O(n)**.
