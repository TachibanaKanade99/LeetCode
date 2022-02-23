class Solution {
    public void removeConsecutiveDuplicatedCharacters(String[] strs) {
        // unsuccessfully bypass -> unsucesfuly bypas
        // aaaabbbbccc -> abc
        for (int i = 0; i < strs.length; i++) {
            char[] sub = strs[i].toCharArray();
            String result = "";
            for (int j = 0; j < sub.length-1; j++) {
                if (sub[j] != sub[j+1]) {
                    result += sub[j];    
                }
            }
            result += sub[sub.length-1];
            System.out.println(result);
        }
    }
    

    public static void main(String[] args) {
        String[] strs = { "unsuccessfully", "bypass", "aaaabbbbccc" };
        Solution solution = new Solution();
        solution.removeConsecutiveDuplicatedCharacters(strs);
    }
}