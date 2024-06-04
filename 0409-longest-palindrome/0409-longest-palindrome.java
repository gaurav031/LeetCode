class Solution {
    public int longestPalindrome(String s) {
        Set<Character> list = new HashSet<>();
        int res =0;
        
        for(char c: s.toCharArray()){
            if(list.contains(c)){
                list.remove(c);
                res+=2;
            }else{
                list.add(c);
            }
        }
        
      if(!list.isEmpty()) res++;
        return res;
    }
}