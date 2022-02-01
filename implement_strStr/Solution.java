class Solution {
    public Solution(){}

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (i+needle.length() <= haystack.length()) {
                String sub = haystack.substring(i, i+needle.length());
                
                // if equals return index                 
                if (sub.equals(needle)) {
                    return i;
                }
            }
            else {
                break;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        // System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("", "a"));
    }
}