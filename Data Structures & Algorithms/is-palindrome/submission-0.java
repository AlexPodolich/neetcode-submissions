class Solution {
    public boolean isPalindrome(String s) {
        
        String normalizedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = normalizedString.length() - 1;

        while(l < r ){
            if(normalizedString.charAt(l) != normalizedString.charAt(r)){
                return false;
            }
            
            l++;
            r--;
        }

        return true;
    }
}
