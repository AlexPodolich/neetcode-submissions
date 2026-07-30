class Solution {
    public int maxScore(String s) {
        
        int oneSum = 0;

        for (Character c : s.toCharArray()){
            if (c == '1'){
                oneSum++;
            }
        }

        int maxSum = 0;
        int zeroSum = 0;

        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) == '0'){
                zeroSum++;
            } else{
                oneSum--;
            }
            maxSum = Math.max(maxSum, zeroSum + oneSum);
        }

        return maxSum;
    }
}