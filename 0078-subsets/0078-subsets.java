class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(0, nums, current, ans);

        return ans;
    }

    public void solve(int index, int[] nums,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        // Base case: processed every element
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Take the current element
        current.add(nums[index]);
        solve(index + 1, nums, current, ans);

        // Undo the previous choice (Backtracking)
        current.remove(current.size() - 1);

        // Choice 2: Skip the current element
        solve(index + 1, nums, current, ans);
    }
}