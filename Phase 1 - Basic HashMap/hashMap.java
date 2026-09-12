import java.util.* ;

class basicFromCourse {

  public static void main ( String args[] ){

    HashMap<Integer,Integer> map = new HashMap<>(); // key-value pair

    map.put(1,100);
    map.put(2,200);
    map.put(3,200); // multiple keys can have same value but not vice versa
    System.out.println(map);// gives {1=100, 2=200, 3=200}

    System.out.println(map.get(1)); // 100
    map.remove(2);
    System.out.println(map); // gives {1=100, 3=200}

    map.put(1,500); // if key already exists then value will be updated
    System.out.println(map); // gives {1=500, 3=200}

    System.out.println(map.size()); // 2
    System.out.println(map.isEmpty()); // false

    System.out.println(map.containsKey(1)); // true
    System.out.println(map.containsValue(200)); // true

    System.out.println(map.keySet()); // gives [1, 3]
    System.out.println(map.values()); // gives [500, 200]

    // we can traverse the map using for each loop

    for ( int ele : map.keySet() ){
      System.out.println(ele + " : " + map.get(ele));
    }

    System.out.println(map.getOrDefault(4, 400)); // used in calculating frequency of elements in an array

  }
}

// i got my eyes on you