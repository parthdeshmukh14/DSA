class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                stack.pop();
            }

            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            }

            else if (op.equals("+")) {
                int last = stack.peek();
                int secondLast = stack.get(stack.size() - 2);
                stack.push(last + secondLast);
            }

            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}