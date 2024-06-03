class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] fs1 = new int[26];
        int[] fs2 = new int[26];
        int k = s1.length();

        for (int i = 0; i < k; i++) {
            fs1[s1.charAt(i) - 'a']++;
            fs2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(fs1, fs2)) {
            return true;
        }
        for (int i = k; i < s2.length(); i++) {
            fs2[s2.charAt(i - k) - 'a']--;
            fs2[s2.charAt(i) - 'a']++;
            if (Arrays.equals(fs1, fs2)) {
                return true;
            }
        }
        return false;
    }
}