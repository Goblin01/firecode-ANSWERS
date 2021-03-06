// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int singleNumber(int[] A) {           
      Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
      int number = 0;
      //iterate through array and populate count for each array element
      for(int i=0; i<A.length; i++) {
          if(ht.containsKey(A[i])) {
              int val = ht.get(A[i]);
              ht.put(A[i], val+1);
          } else {
              ht.put(A[i], 1);    
          }
      }
      //iterate Hashtable and find one array element where count = 1;
      Set<Integer> keys = ht.keySet();
      for(Integer key: keys){
          if(ht.get(key) == 1) {
              number = (int)key;
          }
      }
      return number;
  }
