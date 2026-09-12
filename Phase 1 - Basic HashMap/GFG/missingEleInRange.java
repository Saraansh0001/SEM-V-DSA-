class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> nums = new HashSet<>();

        for (int num : arr) {
            nums.add(num);
        }

        while (low <= high) {

            if (!nums.contains(low)) {
                ans.add(low);
            }

            low++;
        }

        return ans;
    }
}