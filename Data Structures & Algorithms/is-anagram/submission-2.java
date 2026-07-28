class Solution {
    public boolean isAnagram(String s, String t) {
        
        // Solution using sort
        // if (s.length() != t.length()){
        //     return false;
        // }

        // char[] charsOfS = s.toCharArray();
        // char[] charsOfT = t.toCharArray();

        // Arrays.sort(charsOfS);
        // Arrays.sort(charsOfT);

        // return Arrays.equals(charsOfS, charsOfT);
        
        // Solution using Maps

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        return countS.equals(countT);
    }
}
