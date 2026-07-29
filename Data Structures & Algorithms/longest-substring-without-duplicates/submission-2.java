class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute Force
        // Set<Character> seen = new HashSet<>();
        // int maxLen = 0;

        // for (int i = 0; i < s.length(); i++){
        //     int curLen = 0;
        //     for(int j = i; j < s.length(); j++){
        //         if(seen.contains(s.charAt(j))){
        //             seen.clear();
        //             break;
        //         }
        //         curLen++;
        //         maxLen = Math.max(maxLen, curLen);
        //         seen.add(s.charAt(j));
        //     }
        // }

        // return maxLen;

        // Sliding window with O(N)

        // Set<Character> seen = new HashSet<>();
        // int l = 0;
        // int res = 0;

        // for (int r = 0; r < s.length(); r++){
        //     while(seen.contains(s.charAt(r))){
        //         seen.remove(s.charAt(l));
        //         l++;
        //     }
        //     seen.add(s.charAt(r));
        //     res = Math.max(res, r - l + 1);
        // }

        // return res;

        // Optimal sliding window

        Map<Character, Integer> seen = new HashMap<>();

        int l = 0;

        int res = 0;

        for (int r = 0; r < s.length(); r++){
            if(seen.containsKey (s.charAt(r))){
                l = Math.max(seen.get(s.charAt(r)) + 1, l);
            }
            seen.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
