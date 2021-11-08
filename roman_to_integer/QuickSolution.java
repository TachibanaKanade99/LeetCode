import java.util.HashMap;

public class QuickSolution {
    QuickSolution(){}

    public int romanToInt(String s) {
        // This solution is from a discussion in LeetCode:
        HashMap<String, Integer> symbols = new HashMap<String, Integer>();
        symbols.put("I", 1);
        symbols.put("V", 5);
        symbols.put("X", 10);
        symbols.put("L", 50);
        symbols.put("C", 100);
        symbols.put("D", 500);
        symbols.put("M", 1000);

        // split a string into array of characters -> type is string:
        String[] s_arr = s.split("(?!^)");
        
        /*
        str = IV
        i = I; i + 1 = V; i < i + 1
        result = 0 - 1 + 5 = 4
         */

        int result = 0;
        for (int i = 0; i < s_arr.length - 1; i++) {
            if (symbols.get(s_arr[i]) < symbols.get(s_arr[i+1])) {
                result -= symbols.get(s_arr[i]);
            }
            else {
                result += symbols.get(s_arr[i]);
            }
        }

        int last_char = symbols.get(s_arr[s_arr.length-1]);

        return result + last_char;
    }

    public static void main(String args[]) {
        QuickSolution solution = new QuickSolution();
        String input = "VI";
        System.out.println("\nThe result is " + Integer.toString(solution.romanToInt(input)));
    }
}
