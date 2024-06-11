class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      HashMap<Integer , Integer> set = new HashMap<>();

      for(int j : arr1){
        if(set.containsKey(j)){
            set.put(j,set.get(j) + 1);

        }else {
            set.put(j,1);
        }
      }
      int[] ans = new int[arr1.length];
      int count =0;
      for(int j:arr2) {
        while(set.get(j) > 0){
            ans[count] =j;
            count++;
            set.put(j,set.get(j)-1);
        }
        set.remove(j);
      }
      int[] remaining = new int[arr1.length-count];
      int index =0;

      for(int j : arr1){
        if(set.containsKey(j)) {
            while(set.get(j) > 0){
                remaining[index] =j;
                index++;

                set.put(j,set.get(j) - 1);

            }
            set.remove(j);
        }

      }
      Arrays.sort(remaining);
      for(int j : remaining){
        ans[count] = j;
        count++;
      }
      return ans;
 
    }
}