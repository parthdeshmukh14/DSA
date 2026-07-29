class Solution {
    public int clumsy(int n) {

        Stack<Integer> stack = new Stack<>();

        // Push the first number
        stack.push(n);

        // 0 -> *
        // 1 -> /
        // 2 -> +
        // 3 -> -
        int operation = 0;

        // Process remaining numbers from n-1 to 1
        for (int i = n - 1; i >= 1; i--) {

            if (operation == 0) {

                // Multiplication
                stack.push(stack.pop() * i);
            }

            else if (operation == 1) {

                // Division (integer division)
                stack.push(stack.pop() / i);
            }

            else if (operation == 2) {

                // Addition
                stack.push(i);
            }

            else {

                // Subtraction
                stack.push(-i);
            }

            // Move to the next operation
            operation = (operation + 1) % 4;
        }

        // Sum all elements in the stack
        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}