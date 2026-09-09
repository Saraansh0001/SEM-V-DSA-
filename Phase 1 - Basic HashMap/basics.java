class basics {

  public static void main(String[] args) {
    // Create a HashMap
    HashMap<String, Integer> map = new HashMap<>();

    // stringis teh key and integer is the value , string-int = key-value pair 
    
    map.put("apple", 5);

    int value = map.get("apple");

    // id key dne , the o/p is null 

    map.containsKey("apple") ; // if we care abuot the key existing or not 

    map.remove("apple"); 

    map.size() // no of keys not values ka sum !!! 

    map.put('a', map.getOrDefault('a', 0) + 1); // if key exists then get the value and add 1 to it , if not then get 0 and add 1 to it
  }
}