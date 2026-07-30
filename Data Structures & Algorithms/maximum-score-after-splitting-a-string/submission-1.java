class Solution {
    public int maxScore(String s) {
        int res = 0;

        for (int i = 1; i < s.length(); i++){
            int leftZero = 0;
            int rightOne = 0;

            for (int j = 0; j < i; j++){
                if (s.charAt(j) == '0'){
                    leftZero++;
                }
            }

            for (int j = i; j < s.length(); j++){
                if (s.charAt(j) == '1'){
                    rightOne++;
                }
            }
            res = Math.max(res, leftZero + rightOne);
        }

        return res;
    }
}