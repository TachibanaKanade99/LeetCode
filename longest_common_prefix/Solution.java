public class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* 
        The algorithm will start with a common prefix is a first letter from the first string
        Then it will check the prefix with the others and update the prefix until it become wrong prefix
        The complexity is O( n(m - 1) ); n is the length of first string and m is length of the string array 
         */
        String common_prefix = null;
        for (int i = 0; i < strs[0].length()+1; i++) {
            common_prefix = strs[0].substring(0, i);
            // System.out.println(common_prefix);
        
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(common_prefix)) {
                    //  update common prefix at the previous value:
                    common_prefix = common_prefix.substring(0, common_prefix.length()-1);
                    return common_prefix;
                }
            }
        }
        return common_prefix;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        // String[] strs = {"flower", "flow", "flight"};
        // String[] strs = {"car","carrace","car"};
        String[] strs = {"a"};
        System.out.println("Longest common prefix is " + solution.longestCommonPrefix(strs));
    }
}
