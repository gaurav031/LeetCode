class Solution {
    public int appendCharacters(String s, String t) {
      int sIndex =0 ,tIndex =0;
      int slen = s.length(), tlen = t.length();

      while(sIndex < slen && tIndex < tlen){
        if(s.charAt(sIndex) == t.charAt(tIndex)){
            tIndex++;
        }
        sIndex++;
      }
      return tlen-tIndex;
    }
}