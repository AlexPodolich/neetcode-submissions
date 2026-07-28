class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Brute force
        // int res = 0;

        // for (int i = 0; i < s.length(); i++){
        //     Set<Character> usedChars = new HashSet<>();
        //     for (int j = i; j < s.length(); j++){
        //         if(usedChars.contains(s.charAt(j))){
        //             break;
        //         }
        //         usedChars.add(s.charAt(j));
        //     }
        //     res = Math.max(res, usedChars.size());
        // }
        
        // return res;

        // two pointers ( sliding window )

        Set<Character> usedChars = new HashSet<>();

        int l = 0;

        int res = 0;

        for (int r = 0; r < s.length(); r++){
            while (usedChars.contains(s.charAt(r))){
                usedChars.remove(s.charAt(l));
                l++;
            }
            usedChars.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
