class Solution {
    public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
                    return false;
        }

        HashMap<Character , Integer> s1Map = new HashMap<>() ;
        HashMap<Character , Integer> s2Map = new HashMap<>() ;

        for ( char c : s1.toCharArray()){
            s1Map.put( c , s1Map.getOrDefault(c , 0) + 1 );
        }

        for ( char c : s2.toCharArray() ){
            s2Map.put( c , s2Map.getOrDefault(c , 0) + 1 );
        }

        for (char c : s2Map.keySet()) {

            if (!s1Map.containsKey(c)) {
                return false;
            }

            if (!s1Map.get(c).equals(s2Map.get(c))) {
                return false;
            }

        }

        return true  ;
    }
}