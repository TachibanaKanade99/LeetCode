import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> symbols = new HashMap<String, Integer>();
        symbols.put("I", 1);
        symbols.put("V", 5);
        symbols.put("X", 10);
        symbols.put("L", 50);
        symbols.put("C", 100);
        symbols.put("D", 500);
        symbols.put("M", 1000);
        
        ArrayList<Integer> converted_num_arr = new ArrayList<Integer>();

        // convert s into array of characters:
        String[] s_arr = s.split("(?!^)");
        
        int i = 0;
        while (i < s_arr.length) {
            System.out.println(i);
            String curr_symbol = s_arr[i];
            String next_symbol = null;
            
            if (i != s_arr.length-1) {
                next_symbol = s_arr[i+1];
            }

            System.out.println("Current Symbol: " + curr_symbol);
            System.out.println("Next Symbol: " + next_symbol);

            switch(curr_symbol) {
                case "I":
                    if (next_symbol!= null && (next_symbol.equals("V") || next_symbol.equals("X"))) {
                        converted_num_arr.add(symbols.get(next_symbol) - symbols.get(curr_symbol));
                        i = i + 2;
                    }
                    else {
                        converted_num_arr.add(symbols.get(curr_symbol));
                    i = i + 1;
                    }
                    break;
                case "X":
                    if (next_symbol != null && (next_symbol.equals("L") || next_symbol.equals("C"))) {
                        converted_num_arr.add(symbols.get(next_symbol) - symbols.get(curr_symbol));
                        i = i + 2;
                    }
                    else {
                        converted_num_arr.add(symbols.get(curr_symbol));
                        i = i + 1;
                    }
                    break;
                case "C":
                    if (next_symbol != null && (next_symbol.equals("D") || next_symbol.equals("M"))) {
                        converted_num_arr.add(symbols.get(next_symbol) - symbols.get(curr_symbol));
                        i = i + 2;
                    }
                    else {
                        converted_num_arr.add(symbols.get(curr_symbol));
                        i = i + 1;
                    }
                    break;
                default:
                    converted_num_arr.add(symbols.get(curr_symbol));
                    i = i + 1;
                    break;
            }
        }
        
        // sum all value from converted number list:
        int sum = 0;
        for (int j = 0; j < converted_num_arr.size(); j++) {
            System.out.print(converted_num_arr.get(j) + " ");
            sum += converted_num_arr.get(j);
        }
        
        return sum;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        String input = "MCMXCIV";
        System.out.println("\nThe result is " + Integer.toString(solution.romanToInt(input)));
    }

}