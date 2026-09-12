class Solution {
    public char getMaxOccuringChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find answer
        char ans = 'z';
        int maxFreq = 0;

        for(char ch : map.keySet()) {

            int freq = map.get(ch);

            if(freq > maxFreq) {
                maxFreq = freq;
                ans = ch;
            }
            else if(freq == maxFreq && ch < ans) {
                ans = ch;
            }
        }

        return ans;
    }
}