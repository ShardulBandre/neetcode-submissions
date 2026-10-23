class Solution {
    public String customSortString(String order, String s) {
        // Step 1: Count the frequency of each character in string s
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        StringBuilder result = new StringBuilder();
        
        // Step 2: Append characters in the order specified by 'order'
        for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if (countMap.containsKey(c)) {
                int frequency = countMap.get(c);
                for (int j = 0; j < frequency; j++) {
                    result.append(c);
                }
                // Remove the character so we know it's been processed
                countMap.remove(c);
            }
        }
        
        // Step 3: Append any remaining characters that were not in 'order'
        for (char c : countMap.keySet()) {
            int frequency = countMap.get(c);
            for (int j = 0; j < frequency; j++) {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}