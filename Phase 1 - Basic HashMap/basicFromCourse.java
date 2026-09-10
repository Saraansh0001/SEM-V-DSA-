class basicFromCourse {

  public static void main ( String args[] ){

    // in hashset -> insert , delete , search has tc of o(1) and total space is o(n) where n is the number of elements in the hashset

    TreeSet <Integer> treeSet = new TreeSet<>(); // ordered set 

    HashSet <Integer> set = new HashSet<>(); // not ordered set
    set.add(1);
    set.add(2);
    set.add(3);

    System.out.println(set.contains(1)); // true
    System.out.println(set.contains(4)); // false

    set.remove(2);
    
    System.out.println(set.size()); // 2
    System.out.println(set.contains(2)); // false

    System.out.println(set);

    // set.clear();
    set.add(1) ; // set has unique elements so adding 1 again will not change the set or the size of the set

    

  }

}