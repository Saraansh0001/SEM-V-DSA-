class Solution {
    public int countKdivPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int num : arr) {

            int rem = num % k;

            int need = (k - rem) % k;

            if (map.containsKey(need)) {
                ans += map.get(need);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}
