class Solution {
    public boolean containsDuplicate(int[] nums) {

      HashMap<Integrer, Integer> map = new HashMap<>(); ;

      for ( int nums : nums ){
        if (map.containsKey(nums)){
          return true ;
        }
        map.put(nums,1) ;
      }

      return false ;
        
    }
}