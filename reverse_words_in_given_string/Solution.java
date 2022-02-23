import java.util.Stack;

class Solution {
    /* 
    "hello world" -> "world hello"
    "hello   world     Tuan" -> "Tuan     world   hello"
    */
    public void reverseStr(String str) {
        Stack<String> words = new Stack<>();
        String spaces = "";
        String sub = "";
        for (int i = 0; i < str.length(); i++) {    
            if (str.charAt(i) == ' ') {
                spaces += str.charAt(i);

                if (str.charAt(i+1) != ' ') {
                    words.push(spaces + sub);
                    spaces = "";
                    sub = "";
                }
            }
            else {
                sub += str.charAt(i);
            }
        }
        words.add(sub);
        
        while(!words.isEmpty()) {
            System.out.print(words.pop());
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.reverseStr("hello   world     Tuan");
        System.out.println();
        solution.reverseStr("I love u ! Yae Miko");
    }
}