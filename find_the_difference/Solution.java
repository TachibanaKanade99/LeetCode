import java.util.Arrays;
import java.util.HashMap;

class Solution {
	public Solution(){}

	public static char findTheDifference(String s, String t) {
		// First solution using sort
		
		// sort both two string
        // char[] arrS = s.toCharArray();
        // char[] arrT = t.toCharArray();
        
        // Arrays.sort(arrS);
        // Arrays.sort(arrT);
        
        // for (int i = 0; i < arrS.length; i++) {
        //     if(arrS[i] != arrT[i]) {
        //         return arrT[i];
        //     }
        // }
        // return arrT[arrT.length-1];

        // Second solution: using HashMap
        
        HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			int val = 1;
			if (hashMap.get(t.charAt(i)) != null) {
				val = hashMap.get(t.charAt(i)) + 1;
			}
			hashMap.put(t.charAt(i), val);
		}
		for (int j = 0; j < s.length(); j++) {
			int val = hashMap.get(s.charAt(j)) - 1;
			hashMap.put(s.charAt(j), val);
		}

		for (Character i: hashMap.keySet()) {
			System.out.println(i + ": " + hashMap.get(i));
			if (hashMap.get(i) == 1) {
				return i;
			}
		}
		return Character.MIN_VALUE;
	}


	public static void main(String[] args) {
		String s = "a";
		String t = "aa";
		// solution: "e"
		System.out.println(Solution.findTheDifference(s, t));
	}
}