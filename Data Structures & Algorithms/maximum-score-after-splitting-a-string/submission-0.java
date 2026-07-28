class Solution {
    public int maxScore(String s) {
        
        int sufix_sum = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                sufix_sum++;
            }
        }

        int max_sum = 0;
        int pref_sum = 0;

        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) =='0'){
                pref_sum++;
            }else{
                sufix_sum--;
            }
            max_sum = Math.max(max_sum, sufix_sum + pref_sum);
        }

        return max_sum;
    }
}