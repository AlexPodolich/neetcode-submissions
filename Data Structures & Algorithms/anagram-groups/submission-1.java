class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // loop through the strs
        // we sort the string
        // check if this sorted string is existis in our map
        // if it exists we add it to the list of str to the sorted str
        // map where all keys are sorted string and values are groups of anagrams
        // we will need to return the all values of the map

        Map<String, List<String>> strGroups = new HashMap<>();

        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            strGroups.putIfAbsent(sortedStr, new ArrayList<>());
            strGroups.get(sortedStr).add(s);
        }

        return new ArrayList<>(strGroups.values());
    }
}
