class Solution {
    public boolean isPalindrome(String s) {
        // using two pointers
        // String normalizedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // int l = 0;
        // int r = normalizedString.length() - 1;

        // while(l < r ){
        //     if(normalizedString.charAt(l) != normalizedString.charAt(r)){
        //         return false;
        //     }
            
        //     l++;
        //     r--;
        // }

        // return true;

        //using reverse the string and String Builder

        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }

        return newStr.toString().equals(newStr.reverse().toString());
    }
}
