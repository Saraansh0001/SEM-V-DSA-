class Solution {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();

        for (int num : a) {
            mapA.put(num, mapA.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            mapB.put(num, mapB.getOrDefault(num, 0) + 1);
        }

        for (int num : mapB.keySet()) {

            if (!mapA.containsKey(num)) {
                return false;
            }

            if (mapB.get(num) > mapA.get(num)) {
                return false;
            }
        }

        return true;
    }
}